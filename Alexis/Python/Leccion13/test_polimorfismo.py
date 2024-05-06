from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto):
    # print(objeto)  # de manera indirecta llama al str de la clase o Gerente
    print(type(objeto))  # Esto es para saber el tipo de dato que recibe
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)


empleado = Empleado('ariel', 50000.00)
imprimir_detalles(empleado)

gerente = Gerente('natalia', 60000, 'sistemas')
imprimir_detalles(gerente)
