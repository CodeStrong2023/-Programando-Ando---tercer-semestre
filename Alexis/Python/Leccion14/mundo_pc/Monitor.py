class Monitor:
    contador_monitores = 0

    def __init__(self, marca, tamaño):
        Monitor.contador_monitores += 1
        self._id_monitor = Monitor.contador_monitores
        self._marca = marca
        self._tamaño = tamaño

    def __str__(self):
        return f'id: {self._id_monitor}, marca: {self._marca}, tamaño: {self._tamaño}'

if __name__ == '__main__':
    monitor1 = Monitor('hp', '15 pulgadas')
    print(monitor1)
    monitor2 = Monitor('acer', '27 pulgadas')
    print(monitor2)




