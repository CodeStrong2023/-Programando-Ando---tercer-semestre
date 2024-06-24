import psycopg2
from tabulate import tabulate

def conectar_db():
    return psycopg2.connect(user='postgres',
                            password='admin',
                            host='127.0.0.1',
                            port='5432',
                            database='db_productos')

def mostrar_menu():
    conexion = conectar_db()
    cursor = conexion.cursor()
    
    while True:
        print("Menu")
        print("===================\n")
        print("1-Ingresar un nuevo Producto")
        print("2-Listar registro de Productos")
        print("3-Buscar Producto")
        print("4-Eliminar Producto")
        print("5-Modificar datos de Producto")
        print("6-Salir")
        opcion = int(input("\nIngresar una opcion\n"))

        if opcion == 1:
            registrar_producto(cursor, conexion)
        elif opcion == 2:
            listar_productos(cursor)
        elif opcion == 3:
            buscar_producto(cursor)
        elif opcion == 4:
            eliminar_producto(cursor, conexion)
        elif opcion == 5:
            modificar_producto(cursor, conexion)
        elif opcion == 6:
            print("Saliendo del programa\n")
            break
        else:
            print("Opcion invalida\n")
    
    cursor.close()
    conexion.close()

def registrar_producto(cursor, conexion):
    try:
        sql= 'INSERT INTO productos(nombre, cantidad, precio_compra, precio_venta) VALUES(%s,%s,%s,%s)'
        nombre=input('Ingrese el nombre: ')
        cantidad=input('Ingrese la cantidad: ')
        precio_compra=input('Ingrese el precio de compra: ')
        precio_venta=input('Ingrese el precio de venta: ')
        datos=(nombre,cantidad,precio_compra,precio_venta)
        cursor.execute(sql, datos)
        conexion.commit()
        registros=cursor.rowcount
        print(f'Productos insertados: {registros}')
    except Exception as e:
        print(f'Ocurrió un error: {e}')

def listar_productos(cursor):
    try:
        headers = ["ID", "Nombre", "Cantidad", "Precio Compra", "Precio Venta"]
        sql='SELECT * FROM productos'
        cursor.execute(sql)
        registro=cursor.fetchall()
        print(tabulate(registro, headers, tablefmt="grid"))
    except Exception as e:
        print(f'Ocurrió un error: {e}')

def buscar_producto(cursor):   
    try:
        headers = ["ID", "Nombre", "Cantidad", "Precio Compra", "Precio Venta"]
        sql = 'SELECT * FROM productos WHERE id=%s'
        id = input('Ingrese ID del producto: ')

        cursor.execute(sql, (id,))
        registro = cursor.fetchone()

        if registro:
            print(tabulate([registro], headers, tablefmt="grid"))
        else:
            print(f"No se encontró ningún producto con ID: {id}")
    except Exception as e:
        print(f"Error al buscar el producto: {e}")

def eliminar_por_id(cursor):
    sql = 'DELETE FROM productos WHERE id=%s'
    id = input('Ingrese el ID del producto a eliminar: ')
    cursor.execute(sql, (id,))
    return cursor.rowcount

def eliminar_por_nombre(cursor):
    sql = 'DELETE FROM productos WHERE nombre=%s'
    nombre = input('Ingrese el nombre del producto a eliminar: ')
    cursor.execute(sql, (nombre,))
    return cursor.rowcount

def eliminar_producto(cursor, conexion):
    print("Eliminar Producto")
    print("================\n")
    print("Eliminar por:")
    print("1. Id")
    print("2. Nombre")
    print("3. Salir/Cancelar")

    try:
        eliminar = int(input())
    except ValueError:
        print("Opción inválida\n")
        return

    if eliminar not in [1, 2, 3]:
        print("Opción inválida\n")
        return

    if eliminar == 3:
        print("\nOperación cancelada\n")
        return

    try:
        if eliminar == 1:
            eliminado = eliminar_por_id(cursor)
        elif eliminar == 2:
            eliminado = eliminar_por_nombre(cursor)

        conexion.commit()
        print(f'Productos eliminados: {eliminado}')
    except Exception as e:
        print(f"Error al eliminar producto: {e}")

def obtener_datos_a_modificar():
    campos = {
        '1': 'nombre',
        '2': 'cantidad',
        '3': 'precio_compra',
        '4': 'precio_venta'
    }
    
    print("Campos disponibles para modificar:")
    print("1. Nombre")
    print("2. Cantidad")
    print("3. Precio de Compra")
    print("4. Precio de Venta")
    print("5. Salir/Cancelar")
    
    campos_a_modificar = []
    while True:
        opcion = input("Ingrese el número del campo que desea modificar (o '5' para finalizar): ")
        if opcion == '5':
            break
        if opcion in campos:
            nuevo_valor = input(f"Ingrese el nuevo valor para {campos[opcion]}: ")
            campos_a_modificar.append((campos[opcion], nuevo_valor))
        else:
            print("Opción inválida. Intente nuevamente.")

    return campos_a_modificar

def actualizar_producto(cursor, conexion, id, campos_a_modificar):
    if not campos_a_modificar:
        print("No se han seleccionado campos para modificar.")
        return

    set_clause = ', '.join([f"{campo} = %s" for campo, _ in campos_a_modificar])
    sql = f"UPDATE productos SET {set_clause} WHERE id = %s"
    valores = [valor for _, valor in campos_a_modificar] + [id]
    
    try:
        cursor.execute(sql, valores)
        conexion.commit()
        actualizacion = cursor.rowcount
        print(f'Productos actualizados: {actualizacion}')
    except Exception as e:
        print(f"Error al actualizar el producto: {e}")

def modificar_producto(cursor, conexion):
    id = input('Ingrese el ID del producto: ')
    campos_a_modificar = obtener_datos_a_modificar()
    actualizar_producto(cursor, conexion, id, campos_a_modificar)

if __name__ == "__main__":
    mostrar_menu()
