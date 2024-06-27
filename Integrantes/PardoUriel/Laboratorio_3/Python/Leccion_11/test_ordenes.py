from Orden import Orden
from Producto import Producto



producto1 = Producto("Camiseta", 100.00)
producto2 = Producto("Pantalon", 150.00)
producto3 = Producto("Zapatillas", 200.00)
producto4 = Producto("Gorra", 80.00)
productos1= [producto1, producto2] #Lista de productos
orden1 = Orden(productos1) #Primer objeto orden pasado la lista de productos
orden1.agregar_producto(producto4) #Agregamos producto a la lista 1
print(orden1)
print(f"Total de la orden1: {orden1.calcular_total()}")
productos2 = [producto4,producto3, producto1]
orden2 = Orden(productos2)
orden2.agregar_producto(producto2)
print(orden2)
print(f"Total de la orden2: {orden2.calcular_total()}")
