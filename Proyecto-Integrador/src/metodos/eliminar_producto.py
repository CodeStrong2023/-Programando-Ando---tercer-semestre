from database.conexion import conectar_db

# Método general para eliminar producto (selección)
def eliminar_producto():
    conexion = conectar_db()
    cursor = conexion.cursor()

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

# Método para eliminar solo por ID
def eliminar_por_id(cursor):
    sql = 'DELETE FROM productos WHERE id=%s'
    id = input('Ingrese el ID del producto a eliminar: ')
    cursor.execute(sql, (id,))
    return cursor.rowcount

# Método para eliminar solo por Nombre
def eliminar_por_nombre(cursor):
    sql = 'DELETE FROM productos WHERE nombre=%s'
    nombre = input('Ingrese el nombre del producto a eliminar: ')
    cursor.execute(sql, (nombre,))
    return cursor.rowcount