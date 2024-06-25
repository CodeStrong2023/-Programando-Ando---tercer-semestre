class Proveedor:
    def __init__(self, producto="", descripcion="", marca="", cantidad="", unidad="", proveedor="", categoria=""):
        # Inicialización de los atributos con valores predeterminados vacíos
        self._producto = producto
        self._descripcion = descripcion
        self._marca = marca
        self._cantidad = cantidad
        self._unidad = unidad
        self._proveedor = proveedor
        self._categoria = categoria

    # Propiedad para el atributo 'producto'
    @property
    def producto(self):
        return self._producto

    @producto.setter
    def producto(self, value):
        self._producto = value

    # Propiedad para el atributo 'descripcion'
    @property
    def descripcion(self):
        return self._descripcion

    @descripcion.setter
    def descripcion(self, value):
        self._descripcion = value

    # Propiedad para el atributo 'marca'
    @property
    def marca(self):
        return self._marca

    @marca.setter
    def marca(self, value):
        self._marca = value

    # Propiedad para el atributo 'cantidad'
    @property
    def cantidad(self):
        return self._cantidad

    @cantidad.setter
    def cantidad(self, value):
        self._cantidad = value

    # Propiedad para el atributo 'unidad'
    @property
    def unidad(self):
        return self._unidad

    @unidad.setter
    def unidad(self, value):
        self._unidad = value

    # Propiedad para el atributo 'proveedor'
    @property
    def proveedor(self):
        return self._proveedor

    @proveedor.setter
    def proveedor(self, value):
        self._proveedor = value

    # Propiedad para el atributo 'categoria'
    @property
    def categoria(self):
        return self._categoria

    @categoria.setter
    def categoria(self, value):
        self._categoria = value

    # Método para obtener una representación en cadena del objeto
    def __str__(self):
        return (f"producto: {self.producto}, Descripcion: {self.descripcion}, Marca: {self.marca}, "
                f"Cantidad: {self.cantidad}, Unidad: {self.unidad}, Proveedor: {self.proveedor}, "
                f"Categoria: {self.categoria}")
