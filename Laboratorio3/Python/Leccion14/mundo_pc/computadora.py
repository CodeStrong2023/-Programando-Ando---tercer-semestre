from mundo_pc.teclado import Teclado
from mundo_pc.monitor import Monitor
from mundo_pc.raton import Raton

class Computadora:
    
    contador_computadora = 0
    def __init__(self, nombre, monitor, tecleado, raton):
        Computadora.contador_computadora += 1
        self._id_computadora = Computadora.contador_computadora
        self._nombre = nombre
        self._monitor = monitor
        self._tecleado = tecleado
        self._raton = raton
        
    def __str__(self):
        return f"""
            {self._nombre}: {self._id_computadora}
            Monitor: {self._monitor}
            Tecleado: {self._tecleado}
            Raton: {self._raton}
        """
        
if __name__ == "__main__":
    tecleado1 = Tecleado("HP", "USB")
    monitor1 = Monitor("HP", "15 pulgadas")
    raton1 = Raton("HP", "USB")
    computadora1 = Computadora("HP", monitor1, tecleado1, raton1)
    print(computadora1)
    tecleado2 = Tecleado("HP", "USB")
    monitor2 = Monitor("HP", "25 pulgadas")
    raton2 = Raton("HP", "USB")
    computadora2 = Computadora("HP", monitor2, tecleado2, raton2)
    print(computadora2)