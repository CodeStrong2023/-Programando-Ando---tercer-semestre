from Orden import Orden
from Producto import Producto

producto1 = Producto('camiseta', 100.00)
producto2 = Producto('pantalon', 150.00)
producto3 = Producto('medias', 45.00)
producto4 = Producto('campera', 250.00)
producto5 = Producto('sweter', 95.00)
producto6 = Producto('blusa', 75.00)

productos1 = [producto1, producto2] # lista de productos
orden1 = Orden(productos1) # primer objeto orden pasando la listade productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f'total de la orden 1: {orden1.calcular_total()}')
productos2 = [producto3, producto4]
orden2 = Orden(productos2)
print(orden2)
print(f'total de la orden 2: {orden2.calcular_total()}')






