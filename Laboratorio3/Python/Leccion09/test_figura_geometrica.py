from Cuadrado import Cuadrado
from Rectangulo import Rectangulo
from FiguraGeometrica import FiguraGeometrica

print("Creacion de objeto clase cuadrado".center(50, "_"))
cuadrado1 = Cuadrado(5, "Azul")
cuadrado1.alto = -10
cuadrado1.ancho = -10
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f"Calculo del area del cuadrado: {cuadrado1.calcular_area()}")


# MRO = Method Resolution Order
print(Cuadrado.mro())

print(cuadrado1)
print("Creacion de objeto clase cuadrado".center(50, "_"))
rectangulo1 = Rectangulo(3, 8, "Verde")
rectangulo1.ancho = -10
print(f"Calculo del area del rectangulo: {rectangulo1.calcular_area()}")
print(rectangulo1)  

# figura1 = FiguraGeometrica() No se puede instanciar, es abstracta