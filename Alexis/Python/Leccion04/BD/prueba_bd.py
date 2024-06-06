import psycopg2  # esto es para poder conectanos a potgre

conexion = psycopg2.connect(
    user ='postgres',
    password='admin',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)

cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
conexion.execute(sentencia)  # de esta manera ejecutamos la sentencia
registros = cursos.fetchall()  # recuperamos todos los registros que seran una lista
print(registros)

cursor.close()
conexion.close()





