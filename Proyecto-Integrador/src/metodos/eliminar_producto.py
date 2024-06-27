from src.database.conexion import conectar_db

def eliminar_producto():
    with conectar_db() as conexion:
        with conexion.cursor() as cursor:
            print("Eliminar Producto".center(30, "="))
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
