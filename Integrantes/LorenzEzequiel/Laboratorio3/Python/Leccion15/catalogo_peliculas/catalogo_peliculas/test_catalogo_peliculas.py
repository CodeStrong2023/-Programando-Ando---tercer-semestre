from leccion03.catalogo_peliculas.dominio.Pelicula import Pelicula
from servicio.catalogo_peliculas import CatalogoPeliculas as cp


opcion = None

while opcion != 4:
    try:
        print('Opciones: ')
        print('1 - Agregar una pelicula')
        print('2 - Listar peliculas')
        print('3 - Eliminar peliculas')
        print('4 - Salir')
        opcion = int(input('Digite una opción de Menú(1 - 4): '))
        if opcion == 1:
            nombre_pelicula = input('Introduzca el nombre de la película: ')
            pelicula = Pelicula(nombre_pelicula)
            cp.agregar_pelicula(pelicula)
        elif opcion == 2:
            cp.listar_peliculas()
        elif opcion == 3:
            cp.eliminar_peliculas()
    except Exception as e:
        print(f'Ha ocurrido un error {e}')
        opcion = None
    else:
        print('Salimos del programa...')