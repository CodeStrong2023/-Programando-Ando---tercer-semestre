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
            sentencia = 'DELETE FROM persona WHERE id_personaIN %s'
            entrada = input('digite los numeros de registros a eliminar(separados por coma): ')
            valores = (tuple(entrada.split(',')),)  # tupla de tuplas
            cursor.execute(sentencia, valores)  # de esta manera ejecutamos la sentencia
            registros_eliminados = cursos.rowcount
            print(f'los registros eliminados son: {registros_eliminados}')

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()



