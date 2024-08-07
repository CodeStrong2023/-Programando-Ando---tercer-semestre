from tabulate import tabulate
from src.database.conexion import conectar_db

def buscar_producto():
    with conectar_db() as conexion:
        with conexion.cursor() as cursor:
            print("Buscar Producto".center(30, "="))
            print("Buscar por:")
            print("1. Id")
            print("2. Nombre")
            print("3. Salir/Cancelar")

            try:
                buscar = int(input())
            except ValueError:
                print("Opción inválida\n")
                return

            if buscar not in [1, 2, 3]:
                print("Opción inválida\n")
                return

            if buscar == 3:
                print("\nOperación cancelada\n")
                return

            try:
                if buscar == 1:
                    buscar_por_id(cursor)
                elif buscar == 2:
                    buscar_por_nombre(cursor)

            except Exception as e:
                print(f"Error al buscar el producto: {e}")

def buscar_por_id(cursor):
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

def buscar_por_nombre(cursor):
    try:
        headers = ["ID", "Nombre", "Cantidad", "Precio Compra", "Precio Venta"]
        sql = 'SELECT * FROM productos WHERE nombre=%s'
        nombre = input('Ingrese el nombre del producto: ')

        cursor.execute(sql, (nombre,))
        registro = cursor.fetchone()

        if registro:
            print(tabulate([registro], headers, tablefmt="grid"))
        else:
            print(f"No se encontró ningún producto con el nombre: {nombre}")
    except Exception as e:
        print(f"Error al buscar el producto: {e}")
