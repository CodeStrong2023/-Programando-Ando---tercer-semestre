from ManejoArchivos import ManejoArchivos

# Manejor de contexto "With" = sintaxis simplificada, abre y cierra el archivo.
#with open('prueba.txt', 'r', encoding='utf8') as archivo:
    #print(archivo.read())

# No hace falta ni el try, ni el finally.
# En el contexto de with lo que se ejecuta de manera automática.
# Ultiliza diferente métodos: __enter__ (Este abre el archivo)
#                             __exit__ (Este cierra el archivo)

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())