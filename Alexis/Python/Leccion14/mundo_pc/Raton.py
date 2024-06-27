from mundo_pc.dispositivoEntrada import DispositivoEntrada


class Raton(DispositivoEntrada):
    contador_ratones = 0

    def __init__(self, marca, tipoEntrada):
        Raton.contador_ratones += 1
        self._idRaton = Raton.contador_ratones
        super().__init__(marca, tipoEntrada)

    def __str__(self):
        return f'id: {self._idRaton}, marca: {self._marca}, tipo entrada: {self._tipoEntrada}'


# hacemos pruebas
if __name__ == '__main__':
    raton1 = Raton('hp', 'usb')
    print(raton1)
