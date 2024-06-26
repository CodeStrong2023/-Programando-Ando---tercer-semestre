import psycopg2

conexion = psycopg2.connect(
    user= "postgres",
    password= "admin",
    host= "127.0.0.1",
    port= "5432",
    database= "test_bd"
)
try:
    with conexion:
        with conexion.cursor() as cursor:
        sentencia = "SELECT * FROM persona WHERE id_persona = %s"#Placeholder
        id_persona = input("Coloque un numero para el id_persona: ")
        cursor.execute(sentencia, (id_persona,))#De esta manera ejecutamos la sentencia
        registros = cursor.fetchone()#Recuperamos los registros que seran una lista
        print(registros)
except Exception as e:
    print(f"ocurrio un error: {e}")
finally:
    conexion.close()