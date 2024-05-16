from mundo_pc.Monitor import Monitor
from mundo_pc.Raton import Raton
from mundo_pc.Teclado import Teclado


class Computadora:

    contador_computadoras = 0

    def __init__(self, nombre, monitor, teclado, raton):
        Computadora.contador_computadoras += 1
        self._id_computadora = Computadora.contador_computadoras
        self._nombre = nombre
        self._monitor = monitor
        self._teclado = teclado
        self._raton = raton

    def __str__(self):
        return f'''
            {self._nombre}: {self._id_computadora}
            monitor: {self._monitor}
            teclado: {self._teclado}
            raton: {self._raton}
        '''

if __name__ == '__main__':
    teclado1 = Teclado('hp', 'usb')
    monitor1 = Monitor('hp', '15 pulgadas')
    raton1 = Raton('hp', 'usb')
    computadora1 = Computadora('hp', monitor1, teclado1, raton1)
    print(computadora1)

    teclado2 = Teclado('acer', 'bluetooth')
    monitor2 = Monitor('acer', '27 pulgadas')
    raton2 = Raton('acer', 'bluetooth')
    computadora2 = Computadora('acer', monitor2, teclado2, raton2)
    print(computadora2)





