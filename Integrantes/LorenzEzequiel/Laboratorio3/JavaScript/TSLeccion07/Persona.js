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













