from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
    print(objeto) #De manera indirecta llama el str de la clase Empleado o Gerente
    print(type(objeto)) #Esto es para saber el tipo de dato que recibe
    print(object.mostrar_detalle())
    if(isinstance(objeto, Gerente)):
        print(objeto.departamento)
empleado = empleado("Emi", 100.000)
imprimir_detalles(empleado)

gerente = Gerente("Nati", 5000, "Sistemas")
imprimir_detalles(gerente)