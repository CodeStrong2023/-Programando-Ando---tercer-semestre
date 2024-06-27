from tabulate import tabulate
from src.database.conexion import conectar_db

def listar_productos():
    with conectar_db() as conexion:
        with conexion.cursor() as cursor:
            try:
                headers = ["ID", "Nombre", "Cantidad", "Precio Compra", "Precio Venta"]
                sql = 'SELECT * FROM productos'
                cursor.execute(sql)
                registro = cursor.fetchall()
                print(tabulate(registro, headers, tablefmt="grid"))
            except Exception as e:
                print(f'Ocurrió un error: {e}')
