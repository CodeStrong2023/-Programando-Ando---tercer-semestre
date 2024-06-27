from mundo_pc.Computadora import Computadora
from mundo_pc.Monitor import Monitor
from mundo_pc.Orden import Orden
from mundo_pc.Raton import Raton
from mundo_pc.Teclado import Teclado

teclado1 = Teclado('hp', 'usb')
monitor1 = Monitor('hp', '15 pulgadas')
raton1 = Raton('hp', 'usb')
computadora1 = Computadora('hp', monitor1, teclado1, raton1)

teclado2 = Teclado('acer', 'bluetooth')
monitor2 = Monitor('acer', '27 pulgadas')
raton2 = Raton('acer', 'bluetooth')
computadora2 = Computadora('acer', monitor2, teclado2, raton2)

teclado3 = Teclado('gamer', 'bluetooth')
monitor3 = Monitor('gamer', '32 pulgadas')
raton3 = Raton('gamer', 'bluetooth')
computadora3 = Computadora('gamer', monitor3, teclado3, raton3)

teclado4 = Teclado('aplle', 'bluetooth')
monitor4 = Monitor('aplle', '27 pulgadas')
raton4 = Raton('aplle', 'bluetooth')
computadora4 = Computadora('aplle', monitor4, teclado4, raton4)

teclado5 = Teclado('samsung', 'bluetooth')
monitor5 = Monitor('samsung', '27 pulgadas')
raton5 = Raton('samsung', 'bluetooth')
computadora5 = Computadora('samsung', monitor5, teclado5, raton5)

computadora6 = Computadora('samsung', monitor1, teclado2, raton4)
computadora7 = Computadora('gamer', monitor2, teclado3, raton5)

computadoras1 = [computadora1, computadora2, computadora7, computadora4]
orden1 = Orden(computadoras1)
orden1.agregar_computadoras(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora5, computadora6]
orden2 = Orden(computadoras2)
orden2.agregar_computadoras(computadora1)
print(orden2)
