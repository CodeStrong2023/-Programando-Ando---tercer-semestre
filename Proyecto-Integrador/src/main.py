import sys # Para el bug
import os # Para el bug

# Añadir el directorio raíz al PYTHONPATH (es para un bug desde visual studio code)
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))

from src.menu.menu import mostrar_menu
from database.iniciar_tablas import crear_tablas

if __name__ == "__main__":
    crear_tablas()
    print("\nBienvenido al sistema de gestión de productos!\n")
    mostrar_menu()