from mundo_pc.teclado import Teclado
from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton
from mundo_pc.computadora import Computadora
from mundo_pc.orden import Orden


tecleado1 = Tecleado("HP", "USB")
monitor1 = Monitor("HP", "15 pulgadas")
raton1 = Raton("HP", "USB")
computadora1 = Computadora("HP", monitor1, tecleado1, raton1)


tecleado2 = Tecleado("HP", "USB")
monitor2 = Monitor("HP", "25 pulgadas")
raton2 = Raton("HP", "USB")
computadora2 = Computadora("HP", monitor2, tecleado2, raton2)

computadoras1 = [computadora1, computadora2]
orden1 = Orden(computadora1)
print(orden1)

tecleado3 = Tecleado("HP", "USB")
monitor3 = Monitor("HP", "25 pulgadas")
raton3 = Raton("HP", "USB")
computadora3 = Computadora("HP", monitor3, tecleado3, raton3)

tecleado4 = Tecleado("HP", "USB")
monitor4 = Monitor("HP", "25 pulgadas")
raton4 = Raton("HP", "USB")
computadora4 = Computadora("HP", monitor4, tecleado4, raton4)

computadoras1 = [computadora3, computadora2]
orden1 = Orden(computadora1)
print(orden1)

computadoras2 = [computadora4, computadora1]
orden2 = Orden(computadora2)
print(orden2)




