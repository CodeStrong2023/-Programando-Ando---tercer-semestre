class Persona{

    static contadorPersona = 0

    constructor(nombre, apellido, edad){
        this._idPersona = ++Persona.contadorPersona
        this._nombre = nombre
        this._apellido = apellido
        this._edad = edad
    }

    get idPersona(){
        return this._idPersona
    }

    get nombre(){
        this._nombre
    }

    set nombre(nombre){
        this._nombre = nombre
    }

    get apellido(){
        this._apellido
    }

    set apellido(apellido){
        this._apellido = apellido
    }

    get edad(){
        this.edad
    }

    set edad(edad){
        this._edad = edad
    }

    toString(){
        return this._idPersona+' '+this._nombre+' '+this._apellido+' '+this._edad
    }
}

class Empleado extends Persona{
    static contadorEmpleados = 0

    constructor(nombre, apellido,edad, sueldo){
        super(nombre, apellido, edad)
        this._idEmpleado = ++Empleado.contadorEmpleados
        this._sueldo = sueldo
    }

    get idEmpleado(){
        return this._idEmpleado
    }

    get sueldo(){
        return this._sueldo
    }

    set sueldo(sueldo){
        this._sueldo = sueldo
    }

    toString(){
        return super.toString()+' '+this._idEmpleado+' '+this._sueldo
    }
}

class Cliente extends Persona{

    static contadorClientes = 0

    constructor(nombre, apellido, edad, fechaRegistro){
        super(nombre, apellido, edad)
        this._idCliente = ++Cliente.contadorClientes
        this._fechaRegistro = fechaRegistro
    }

    get idCliente(){
        return this._idCliente
    }

    get fechaRegistro(){
        return this._fechaRegistro
    }

    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro    

    }

    toString(){
        return super.toString()+' '+this._idCliente+' '+this._fechaRegistro
    }
}

//prueba clase persona
let persona1 = new Persona('juan', 'perez', 32)
console.log(persona1.toString())

let persona2 = new Persona('carla', 'ortega', 22)
console.log(persona2.toString())

//prueba clase empleado
let empleado1 = new Empleado('pedro', 'roman', 18, 5000)
console.log(empleado1.toString())

let empleado2 = new Empleado('jonas', 'torres', 30, 7000)
console.log(empleado2.toString())

//prueba clase cliente
let cliente1 = new Cliente('miguel', 'zala', 29, new Date())
console.log(cliente1.toString())

let cliente2 = new Cliente('natalia', 'ortega', 22, new Date())
console.log(cliente2.toString())