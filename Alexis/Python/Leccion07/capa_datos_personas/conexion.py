from psycopg2 import pool
#  psycopg2 as db otra manera de importar el psycopg2
from logger_base import log
import sys


class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def obetenerConexion(cls):
        conexion = cls.obtenerPool().getconn()
        log.debug(f'conexion obtenida del pool: {conexion}')
        return conexion

    @classmethod
    def obtenerCursor(cls):
        pass

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'creacion del pool exitosa: {cls._pool}')
            except Exception as e:
                log.error(f'ocurrio un error al obtener al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool

    @classmethod
    def liberarConexion(cls, conexion):
        cls.obtenerPool().putconn(conexion)
        log.debug(f'regresamos la conexion del pool: {conexion}')

    @classmethod
    def cerrarConexiones(cls):
        cls.obtenerPool().closeall()


if __name__ == '__main__':
    conexion1 = Conexion.obetenerConexion()
    Conexion.liberarConexion(conexion1)
    conexion2 = Conexion.obetenerConexion()
    Conexion.liberarConexion(conexion2)
    conexion3 = Conexion.obetenerConexion()
    Conexion.liberarConexion(conexion3)
    conexion4 = Conexion.obetenerConexion()
    conexion5 = Conexion.obetenerConexion()
    conexion6 = Conexion.obetenerConexion()







