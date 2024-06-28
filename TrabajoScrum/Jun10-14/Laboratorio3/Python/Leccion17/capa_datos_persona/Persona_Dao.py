class PersonaDAO:
    """
    DAO = Data Acces Object
    CRUD = 
            Create -> Insertar
            Read -> Seleccionar
            Update -> Actualizar
            Delete -> Eliminar
    """
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INT persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DETELE FROM persona WHERE id_persona=%s'

    