from Empleado import Empleado
from Gerente import Gerente

def imprimir_detalles(objeto):
    #print(objeto) #De manera indirecta llama el str de la clase Empleado o Gerente
    print(type(objeto)) #Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)
empleado = Empleado("Emi", 100000)
imprimir_detalles(empleado)

gerente = Gerente("Nati", 500000, "Sistemas")
imprimir_detalles(gerente)