

class Orden:
    
    contador_ordenes = 0
    def __init__(self, computadoras):
        Orden.contador_ordenes += 1
        self._id_orden = Orden.contador_ordenes
        self._computadoras = computadoras
        
    def agregar_computadora(self, computadoras):
        self.computadoras.append(computadoras)
        
    def __str__(self):
        computadoras_str = ""
        for computadora in sel._computadoras:
            computadoras_str += computadora.__str__()
        return f"""
            Orden: {self._id_orden}
            Computadoras: {computadoras_str}
        """