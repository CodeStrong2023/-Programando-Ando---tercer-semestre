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
            sentencia = 'INSERT INTO persona (nombre, apellido, email)VALUE (%s, %s, %s)'
            valores = (
                ('carlos', 'lara', 'clara@mail.com'),
                ('marcos', 'canto', 'mcanto@mail.com'),
                ('marcelo', 'cuenca', 'cuencaM@mail.com')
            )  # es una tupla de tuplas
            llaves_primarias = (tuple(entrada.split(', ')),)
            cursor.executemany(sentencia, valores)  # de esta manera ejecutamos la sentencia
            # conexion.commit() esto se utiliza para guardar los cambios en la base de datos
            registros_insertados = cursos.rowcount
            print(f'los registros insertados son: {registros_insertados}')

except Exception as e:
    print(f'ocurrio un error: {e}')
finally:
    conexion.close()



