from mundo_pc.dispositivo_entrada import Dispositivoentrada

class Teclado(Dispositivoentrada):
    contador_tecleado = 0
    def __init__(self, marca, tipoentrada):
        Tecleado.contador_tecleado += 1
        self._id_tecleado = Teclado.contador_tecleado
        super().__init__(marca, tipoentrada)
        
    def __str__(self):
        return f"Id: {self._id_tecleado}, Marca: {self._marca}, Tipo Entrada: {self._tipo_entrada}"

if __name__ == "__main__":
    teclado1 = Teclado("HP","USB")
    print(teclado1)
    teclado2 = Teclado("Gamer","USB")
    print(teclado2)