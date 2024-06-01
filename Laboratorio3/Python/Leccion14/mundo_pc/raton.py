from mundo_pc.dispositivo_entrada import Dispositivoentrada

class Raton(Dispositivoentrada):
    contador_ratones = 0
    def __init__(self, marca, tipo_entrada):
        Raton.contador_ratones += 1
        self._id_raton = Raton.contador_ratones
        super().__init__(marca, tipo_entrada)
        
    def __str__(self):
        return f"Id {self._id_raton}, Marca: {self.marca}, Tpo entrada: {self.tipo_entrada}"
    
    
#Hacemos pruebas
if __name__ == " __name__ ":
    raton1 = Raton("HP", "USB")
    print(raton1)
    raton2 = Raton("Acer", "USB")
    print(raton2)
