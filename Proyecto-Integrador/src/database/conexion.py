import psycopg2

def conectar_db():
    return psycopg2.connect(user='postgres',
                            password='admin',
                            host='127.0.0.1',
                            port='5432',
                            database='db_productos')
