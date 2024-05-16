// let persona3 = new Persona('carla', 'ponce'); esto no se debe hacer: Persona is not defined

class Persona{ //clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre
    }

    set nombre(nombre){
        this._nombre = nombre
    }

    get apellido(){
        return this._apellido
    }

    set apellido(apellido){
        this._apellido = apellido
    }
}

class Empleado extends Persona{ //clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido)
        this._departamento = departamento
    }
    get departamento(){
        return this._departamento = departamento
    }
    set departamento(departamento){
        this._departamento = departamento
    }
}

let persona1 = new Persona('martin', 'perez')
console.log(persona1.nombre)
persona1.nombre = 'juan carlos'
console.log(persona1.nombre)
//console.log(Persona1)
let persona2 = new Persona('carlos', 'lara')
console.log(persona2.nombre)
persona2.nombre = 'maria laura'
console.log(persona2.nombre)
//console.log(persona2)

let empleado1 = new Empleado('maria', 'gimenez', 'sistemas')
console.log(empleado1)
console.log(empleado1.nombre)







