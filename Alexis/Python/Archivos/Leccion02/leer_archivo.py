archivo = open('prueba.txt', 'a', encoding='utf8')  # las letras son: 'r' read, 'a' append, 'w' write, 'x'
# print(archivo.read())
# print(archivo.read(16))
# print(archivo.read(10)) # continuamos desde la linea anterior
# print(archivo.readline())
# print(archivo.readline())

# vamos a iterar el archivo, cada una de las linea
# for linea in archivo:
# print(linea) iteramos todos los elementos del archivo
print(archivo.readline())  # accedemos al archivo como si fuera una lista

# anexamos informacion, copiaos a otro
archivo2 = open('copia.txt', 'w', encoding='utf8')
archivo2.write(archivo.read())
archivo.close() # cerramos el primer archivo
archivo2.close() # cerramos el segundo archivo

print('se ha terminado el proceso de leer y copiar archivos')





