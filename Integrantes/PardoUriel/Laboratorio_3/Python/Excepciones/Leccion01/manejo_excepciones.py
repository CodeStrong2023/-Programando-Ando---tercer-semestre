from numerosIgualesExcepcion import numerosIgualesExcepcion

resultado = None

try:
    a = int(input("Coloque un numero: "))
    b = int(input("Coloque otro numero: "))
    if a == b:
        raise numerosIgualesExcepcion("Son numeros iguales")
    resultado = a / b  # modificamos
except TypeError as e:
    print(f'TypeError - ocurrio un error: {type(e)}')
except TimeoutError as e:
    print(f'TimeoutError - Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e:
    print(f'Exception - Ocurrio un error: {type(e)}')
else:
    print("No se arrojo ninguna excepcion")
finally:  # siempre se va a ejecutar
    print("Ejecucion del finally")
print(f'El resultado es: {resultado}')
print("seguimos...")
