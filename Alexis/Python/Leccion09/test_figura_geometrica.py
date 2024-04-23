from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print('creacion de objeto clase cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado(5, "azul")
cuadrado1.alto = -10
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"Calculo del area del cuadrado: {cuadrado1.calcular_area()}")

# MRO = Method Resulution Order
print(Cuadrado.mro())

print(cuadrado1)

print('creacion de objeto clase rectangulo'.center(50, '_'))
rectangulo1 = Rectangulo(3, 8, "verde")
rectangulo1.ancho = 15
print(f"calculo del area del rectangulo: {rectangulo1.calcular_area()}")
print(rectangulo1)

# figura1 = FiguraGeometrica() no se puede instanciar, es abstracta
print(Cuadrado.mro())



