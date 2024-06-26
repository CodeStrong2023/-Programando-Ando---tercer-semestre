from database.conexion import conectar_db

# Método para registrar productos
def registrar_producto(nombre, cantidad, precio_compra, precio_venta):
    conexion = conectar_db()
    cursor = conexion.cursor()
    try:
        sql = 'INSERT INTO productos(nombre, cantidad, precio_compra, precio_venta) VALUES(%s,%s,%s,%s)'
        datos = (nombre, cantidad, precio_compra, precio_venta)
        cursor.execute(sql, datos)
        conexion.commit()
        registros = cursor.rowcount
        print(f'Productos insertados: {registros}\n')
    except Exception as e:
        print(f'Ocurrió un error: {e}')
    finally:
        cursor.close()
        conexion.close()