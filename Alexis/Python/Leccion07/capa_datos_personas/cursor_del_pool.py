from logger_base import log
from conexion import Conexion


class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None

    def __enter__(self):
        log.debug('inicio del metodo with y __enter__')
        self._conexion = Conexion.obetenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor

    def __exit__(self, tipo_exception, valor_exception, detalle_exception):
        log.debug('se ejecuta el metodo exit')
        if valor_exception:
            self._conexion.roolback()
            log.debug(f'ocurio un excepcion: {valor_exception}')
        else:
            self._conexion.commit()
            log.debug('commit de la transaccion')
        self._cursor.close()
        Conexion.liberarConexion(self._conexion)


if __name__ == '__main__':
    with CursorDelPool() as cursor:
        log.debug('dentro del bloque with')
        cursor.execute('SELECT * FROM persona')
        log.debug(cursor.fetchall())
