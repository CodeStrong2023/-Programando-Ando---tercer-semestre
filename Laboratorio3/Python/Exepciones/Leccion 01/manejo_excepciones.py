from NumerosIgualesException import NumerosIgualesException
resultado = None

try:
    a = int(input('Digite el primer número: '))
    b = int(input('Digite el segundo número: '))
    if a == b:
        raise NumerosIgualesException('Son números iguales')
    resultado = a / b # Modificamos
except TypeError as e:
    print(f'TypeError - Ocurrió un error! {e}')
except ZeroDivisionError as e:
    print(f'ZeroDivisionError - Ocurrió un error! {e}')
except Exception as e:
    print(f'Exception - Ocurrió un error! {e}')
else:
    print('No se arrojo ninguna execpción')
finally: # Siempre se va a ejecutar
    print('Ejecución de este bloque finally')

print(f'El resultado es: {resultado}')
print('seguimos..')