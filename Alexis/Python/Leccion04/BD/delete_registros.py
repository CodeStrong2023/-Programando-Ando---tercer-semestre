import psycopg2  # esto es para poder conectanos a potgre

conexion = psycopg2.connect(
    user='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'DELETE FROM persona WHERE id_persona=%s'
            entrada = input('digite el numeros de registro a eliminar: ')
            valores = (7,)  # es una tupla de valores
            cursor.execute(sentencia, valores)  # de esta manera ejecutamos la sentencia
            registros_eliminados = cursos.rowcount
            print(f'los registros eliminados son: {registros_eliminados}')

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()



