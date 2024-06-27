import psycopg2
from src.database.conexion import conectar_db

# Método para crear la tabla al iniciar el main
def crear_tablas():
    conexion = conectar_db()
    cursor = conexion.cursor()
    with open('sql/db_productos.sql', 'r') as archivo:
        sql = archivo.read()
    try:
        cursor.execute(sql)
        conexion.commit()
        print("Tablas creadas exitosamente")
    except Exception as e:
        print(f'Error al crear las tablas: {e}')
    finally:
        cursor.close()
        conexion.close()