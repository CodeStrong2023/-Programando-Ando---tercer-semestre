from mundo_pc.dispositivoEntrada import DispositivoEntrada


class Teclado(DispositivoEntrada):
    contador_teclados = 0

    def __init__(self, marca, tipoEntrada):
        Teclado.contador_teclados += 1
        self._id_teclados = Teclado.contador_teclados
        super().__init__(marca, tipoEntrada)

    def __str__(self):
        return f'id: {self._id_teclados}, marca: {self._marca}, tipo entrada{self._tipoEntrada}'


if __name__ == '__main__':
    teclado1 = Teclado('hp', 'usb')
    print(teclado1)
