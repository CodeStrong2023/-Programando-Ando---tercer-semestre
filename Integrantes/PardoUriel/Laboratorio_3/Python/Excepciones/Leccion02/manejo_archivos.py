# Declararmos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8') # La "w" es de write (escribir)
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('Como por ejemplo: acción, ejecución y produción\n')
    archivo.write('Las letras son: \nr = read(leer), \na = append(anexa), \nw = write(escribir), \nx = crea un archivo')
    archivo.write('\nt = text(texto), \nb = binary(binarios), \nw+ = read+write(leé y escribe), \nr = igual que w+\n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: # Siempre se ejecuta
    archivo.close() # Con esto se debe cerrar el archivo
# archivo.write('Esto quedo perfecto') #Error por que se ejecuta despues del close del archivo     self.nombre.close()  # Cerramos el archivo