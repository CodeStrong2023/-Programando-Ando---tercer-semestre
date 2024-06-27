from mundo_pc.teclado import Teclado
from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.computadora import Computadora
from mundo_pc.orden import Orden


teclado1 = Teclado("HP", "USB")
monitor1 = Monitor("HP", "15 pulgadas")
raton1 = Raton("HP", "USB")
computadora1 = Computadora("HP", monitor1, teclado1, raton1)


teclado2 = Teclado("HP", "USB")
monitor2 = Monitor("HP", "25 pulgadas")
raton2 = Raton("HP", "USB")
computadora2 = Computadora("HP", monitor2, teclado2, raton2)

computadora1 = [computadora1, computadora2]
orden1 = Orden(computadora1)
print(orden1)

teclado3 = Teclado("HP", "USB")
monitor3 = Monitor("HP", "25 pulgadas")
raton3 = Raton("HP", "USB")
computadora3 = Computadora("HP", monitor3, teclado3, raton3)

tecleado4 = Teclado("HP", "USB")
monitor4 = Monitor("HP", "25 pulgadas")
raton4 = Raton("HP", "USB")
computadora4 = Computadora("HP", monitor4, tecleado4, raton4)

computadora1 = [computadora3, computadora2]
orden1 = Orden(computadora1)
print(orden1)

computadora2 = [computadora4, computadora1]
orden2 = Orden(computadora2)
print(orden2)




