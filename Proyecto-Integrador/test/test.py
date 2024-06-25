import sys

def mostrar_proveedor():
    # Implementación de la función para mostrar proveedores
    print("*====*====*====*====*\n")
    # Aquí llamas a la lógica para mostrar proveedores
    print("Mostrando proveedores...")
    print("*====*====*====*====*\n")

def mostrar_menu():
    # Implementación de la función para mostrar el menú
    try:
        # Aquí llamas a la lógica para mostrar el menú
        print("Mostrando menú...")
    except IOError:
        print("Ocurrio un error de entrada/salida al ejecutar la funcion debido a un problema con el archivo de datos:")

def main():
    opcion = 0
    contraseña = ""

    print("Bienvenido a programando Ando Stock")

    # Pedir la contraseña
    while True:
        contraseña = input("Por favor, ingrese la clave: ")
        if contraseña != "4444":
            print("Clave incorrecta. Intente de nuevo.")
        else:
            break

    while opcion != 3:
        print("Seleccione una opcion")
        print("\t1-Ingresar a proveedores")
        print("\t2-Ingresar a Menu")
        print("\t3-Salir")

        try:
            opcion = int(input())
        except ValueError:
            print("Opcion invalida")
            continue

        if opcion == 1:
            mostrar_proveedor()
        elif opcion == 2:
            mostrar_menu()
        elif opcion == 3:
            print("Gracias")
        else:
            print("Opcion invalida")

if __name__ == "__main__":
    main()
