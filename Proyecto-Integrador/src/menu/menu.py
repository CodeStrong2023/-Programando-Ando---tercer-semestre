from src.metodos.registrar_producto import registrar_producto
from src.metodos.listar_producto import listar_productos
from src.metodos.buscar_producto import buscar_producto
from src.metodos.eliminar_producto import eliminar_producto
from src.metodos.modificar_producto import modificar_producto


def mostrar_menu():
    while True:
        
        print("Menu".center(30, "="))
        print("1-Ingresar un nuevo Producto")
        print("2-Listar registro de Productos")
        print("3-Buscar Producto")
        print("4-Eliminar Producto")
        print("5-Modificar datos de Producto")
        print("6-Salir")
        print("".center(30, "="))
        opcion = int(input("Ingrese una opcion: "))

        if opcion == 1:
            nombre = input('Ingrese el nombre: ')
            cantidad = input('Ingrese la cantidad: ')
            precio_compra = input('Ingrese el precio de compra: ')
            precio_venta = input('Ingrese el precio de venta: ')
            registrar_producto(nombre, cantidad, precio_compra, precio_venta)
        elif opcion == 2:
            listar_productos()
            print("")
        elif opcion == 3:
            buscar_producto()
        elif opcion == 4:
            eliminar_producto()
        elif opcion == 5:
            modificar_producto()
        elif opcion == 6:
            print("\n Hasta pronto...")
            break
        else:
            print("Opcion invalida\n")
