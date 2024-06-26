class Pelicula:
    def __init__(self, nombre):
        self._nombre = nombre

    def __str__(self):
        return f'Pelucula: {self._nombre}'


    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        nombre = self._nombre

    
