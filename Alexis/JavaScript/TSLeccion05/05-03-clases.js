// let persona3 = new Persona('carla', 'ponce'); esto no se debe hacer: Persona is not defined

class Persona{ //clase padre

    static contadorPersonas = 0 //atributo estatico
    //email = 'valor default email' //atributo no estatico

    static get MAX_OBJ(){ //este metodo simula una constante
        return 5
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas
        }
        else{
            console.log('se ha superado el maximo de objetos permitidos')
        }
        //console.log('se incrementa el contador: '+ Persona.contadorObjetosPersona)
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

    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }

    //sobreescritura 
    nombreCompleto(){
        return super.nombreCompleto()+', '+this._departamento;
    }
    //sobreescribiendo el metodo de la clase padre(object)
    toString(){ //regresa un String
        //se aplica el polimorfismo que significa = multiples formas en tiempo de ejecucion
        //el metodo que se ejecuta depende si es una referncia de tipo padre o hija
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('saludos desde este metodo static')
    }

    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido)
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
console.log(empleado1.nombreCompleto());

//Object.prototype.toString   Esta es la manera de acceder a atriutos y metodos de mandera dinamica
console.log(empleado1.toString());
console.log(persona1.toString());

// persona1.saludar() no se utiliza desde el objeto
Persona.saludar()
Persona.saludar2(persona1)

Empleado.saludar()
Empleado.saludar2(empleado1)

//console.log(persona1.contadorObjetosPersona)
console.log(Persona.contadorObjetosPersona)
console.log(Empleado.contadorObjetosPersona)

console.log(persona1.email)
console.log(empleado1.email)
//console.log(Persona.email) no puede acceder desde la clase
console.log(persona1.toString())
console.log(persona2.toString())
console.log(empleado1.toString())
console.log(Persona.contadorPersonas)
let persona3 = new Persona('carla', 'pertosi')
console.log(persona3.toString())
console.log(Persona.contadorPersonas)

console.log(Persona.MAX_OBJ)
//Persona.MAX_OBJ = 10 no se puede modificar, ni alterar
console.log(Persona.MAX_OBJ)

let persona4 = new Persona('franco', 'diaz')
console.log(persona4.toString())
let persona5 = new Persona('liliana', 'paz')
console.log(persona5.toString())


