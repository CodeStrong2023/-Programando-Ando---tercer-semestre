archivo = open("bd.txt", "r", encoding="utf8")
lineas = archivo.readlines()
archivo.close()

personas = []

for linea in lineas:
    campos = linea.replace("\n", "").split(";")
    persona = {"id": campos[0], "nombre": campos[1], "apellido": campos[2], "nacimiento": campos[3]}
    personas.append(persona)

for persona in personas:
    print(f"{persona['id']} {persona['nombre']} {persona['apellido']} {persona['nacimiento']}")