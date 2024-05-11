class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad
        
    def __add__(self, other): #OTHER SIGNIFICA OTRO
        return f"{self.nombre} | {other.nombre}"
    
    def __sub__(self, otro):#SUB SIGNIFICA SUBSTRACTION (RESTA)
        return self.edad - otro.edad
persona1 = Persona("Amaro", 10)
persona2 = Persona("Rodriguez", 6)
#   persona1.__add__(persona2) sintaxis interna y automatica
print(persona1 + persona2)
print(persona1 - persona2)