class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def __add__(self, other): # other significa otro
        return self.nombre + other.nombre

    def __sub__(self, otro):
        return self.edad - otro.edad

persona1 = Persona('ariel', 40)
persona2 = Persona('betancud', 5)

# persona1.__add__(persona2) sintaxis interna y automatica

print(persona1 + persona2)
print(persona1 - persona2)

