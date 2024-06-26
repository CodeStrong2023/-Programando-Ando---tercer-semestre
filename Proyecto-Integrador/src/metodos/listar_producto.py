from tabulate import tabulate # Modulo para mejorar la impresión de las tablas en consola
from database.conexion import conectar_db

# Método para listar productos usando el paquete "tabulate"
def listar_productos():
    conexion = conectar_db()
    cursor = conexion.cursor()
    try:
        headers = ["ID", "Nombre", "Cantidad", "Precio Compra", "Precio Venta"] # Necesario para tabulate
        sql = 'SELECT * FROM productos'
        cursor.execute(sql)
        registro = cursor.fetchall()
        print(tabulate(registro, headers, tablefmt="grid"))
    except Exception as e:
        print(f'Ocurrió un error: {e}')
    finally:
        cursor.close()
        conexion.close()