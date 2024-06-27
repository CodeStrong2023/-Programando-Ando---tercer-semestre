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
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = (
                ('juan ', 'perez', 'jperez@mail.com', 4),
                ('romina', 'ayala', 'ayalar@mail.com', 5)
            )  # es una tupla
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.executemany(sentencia, valores)  # de esta manera ejecutamos la sentencia
            registros_actualizados = cursos.rowcount
            print(f'los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()



