from capa_datos_persona.Persona import Persona
from capa_datos_persona.conexion import Conexion
from capa_datos_persona.cursor_del_pool import CursorDelPool
from logger_base import log


class PersonaDAO:
    '''
    DAO signifaca: Data Access Object
    CRUD significa:
        Create -> Insertar
        Read -> Seleccionar
        Update ->Actualizar
        Delete -> Eliminar
    '''

    _SELECCIONAR = 'SELECT + FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona( nombre, apellido, email) VALUES(%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona id_persona=%s'

    #  definimos los metodos
    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            personas = []
            for registro in registros:
                persona = Persona(registro[0], registro[1], registro[3])
                personas.append(persona)
            return personas

    @classmethod
    def insertar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._INSERTAR, valores)
            return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._ACTUALIZAR, valores)
            log.debug(f'persona actualizada: {persona}')
            return cursor.rowcount

    @classmethod
    def eliminar(cls):
        with CursorDelPool() as cursor:
            valores = (persona.id_persona,)
            cursor.execute(cls._ELIMINAR, valores)
            log.debug(f'los objetos eliminados son: {persona}')
            return cursor.rowcount


if __name__ == "__main__":

    # eliminar un registro
    # persona1 = Persona(id_persona=13)
    # personas_eliminadas = PersonaDAO.eliminar(persona1)
    # log.debug(f'personas eliminadas: {personas_eliminadas}')

    #  actualizar un registro
    # persona1 = Persona(1, 'juan jose', 'pena', 'jjpena@mail.com')
    # persona_actualizadas = PersonaDAO.actualizar(persona1)
    # log.debug(f'personas actualizadas: {persona_actualizadas}')

    #  insertar un registro
    # persona1 = Persona(nombre='pedro', apellido='romero', email='promero@mail.com')
    # personas_insertadas = PersonaDAO.insertar(persona1)
    # log.debug(f'personas insertadas: {personas_insertadas}')

    #  seleccionar objetos
    personas = PersonaDAO.seleccionar()
    for persona in personas:
        log.debug(persona)