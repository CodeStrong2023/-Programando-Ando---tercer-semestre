class Producto:
    contador_productos = 0 # variable de clase

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1 #aumento para la variablbe
        self._id_producto = Producto.contador_productos # asignacion desde la variable de clase
        self._nombre = nombre
        self._precio = precio

    # metodos getter and setter
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio
    
    @precio.setter
    def precio(self, precio):
        self._precio = precio
    # sobreescribimos el metodo str
    def __str__(self) -> str:
        return f'id producto: {self._id_producto}, nombre: {self._nombre}, precio: {self._precio}'


if  __name__ == '__main__': # solo sera visible si se la prueba desde aqui
    producto1 = Producto('camiseta', 100.00)
    producto2 = Producto('pantalon', 150.00)

