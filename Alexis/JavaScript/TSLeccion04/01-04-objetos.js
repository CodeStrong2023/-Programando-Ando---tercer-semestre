let x = 10; //variable de tipo primitiva
console.log(x.length);

//objeto
let persona = {
    nombre: 'carlos',
    apellido: 'gil',
    email: 'cgil@gmail.com',
    edad: 28,
    idioma: 'ES',
    get lang(){
        return this.idioma.toUpperCase() //convierte las minusculas a mayusculas
    },
    set lang(Lang){
        this.idioma = lang.toUpperCase()
    },
    nombreCompleto: function(){ //metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido
    },
    get nombreEdad(){ //este es el metodo get
        return 'el nombre es '+this.nombre+' edad_ '+this.edad
    },
    
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

let persona2 = new Object(); //debe crear un nuevo objeto en memoria
persona2.nombre = 'juan';
persona2.direccion = 'salda 14'
persona2.telefono = '123456789'
console.log(persona2.telefono)
console.log('creamos un nuevo objeto')
console.log(persona['apellido']); //accedaos como si fuera un arreglo
console.log('usamos el ciclo for in')
//for in y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad)
    console.log(persona[propiedad])
}
console.log('cambiamos y eliminamos un error')
persona.apellido = 'betancud'; //cambiamos dinamicamente un valor del objeto
delete persona.apellido; //eliminamos el error
console.log(persona);

//distintas formas de imprimir un objeto
//numero 1: la mas sencilla: concatenar cada valor de cada propiedad
console.log('distintas formas de imprimir un objeto: forma 1')
console.log(persona.nombre+' '+persona.apellido)

//numero 2: a traves del ciclo for in
console.log('distintas formas de imprimir un objeto: forma 2')
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad])
}
//numero 3: la funcion Object.values()
console.log('distintas formas de imprimir un objeto: forma 3')
let personaArray = Object.values(persona)
console.log(personaArray)

//numero 4: utilizaremos el metodo JSON.stringify
console.log('distintas formas de imprimir un objeto: forma 4')
let personaString = JSON.stringify(persona)
console.log(personaString)

console.log('comenzamos a utilizar el metodo get')
console.log(persona.nombreEdad)

console.log('comenzamos con el metodo get y set para idiomas')
persona.lang = 'en'
console.log(persona.lang)

function Persona3(nombre, apellido, email){ //constructor
    this.nombre = nombre
    this.apellido = apellido
    this.email = email
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido
    }
}
let padre = new Persona3('leo', 'lopez', 'lopezl@gmail.com')
padre.nombre = 'luis'//modificamos el nombre
console.log(padre)
padre.telefono = '8765432' //una propiedad exclusiva del objeto padre
console.log(padre.nombreCompleto()) //utilizamos la funcion
let madre = new Persona3('laura', 'contrera', 'contreral@gmail.com')
console.log(madre)
console.log(madre.telefono) //la propiedad no esta definida
console.log(madre.nombreCompleto())

//diferentes formas de crear objetos
//caso numero 1
let miObjeto = new Object() //esta es una opcion formal
//caso numero 2
let miObjeto2 = {} //esta opcion es breve y recomendada

//caso string
let miCadena = new String('hola') //sintaxis formal
//caso string 2
let miCadena2 = 'hola' //esta es la sintaxis simplificada y recomendada

//caso con numeros 1
let miNumero = new Number(1) //es formal no recomendable
//caso con numeros 2
let miNumero2 = 1 //sintaxis recomedada

//caso boolean 1
let miBoolean1 = new Boolean(false) //formal
//caso boolean 2
let miBoolean2 = false //recomendable

//caso arreglos 1
let miArreglo1 = new Array() //formal
//caso arreglos 2
let miArreglo2 = [] //recomendada

//caso function 1
let miFuncion1 = new function(){} //todo despues de new es considerado objeto
//caso function 2
let miFuncion2 = function(){} //notacion simplificada

//uso de prototype
Persona3.prototype.telefono = '72585743'
console.log(padre);
console.log(madre.telefono)
madre.telefono = '59856256256'
console.log(madre.telefono)

// uso de call
let persona4 = {
    nombre: 'juan',
    apellido: 'perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+' '+telefono
        //return this.nombre+' '+this.apellido
    }
}

let persona5 = {
    nombre: 'carlos',
    apellido: 'lara'
}

console.log(persona4.nombreCompleto2('lic.', '65832842'))
console.log(persona4.nombreCompleto2.call(persona5, 'ing.', '28734628'))

//metodo apply
let arreglo = ['ing.', '847625894']
console.log(persona4.nombreCompleto2.apply(persona5, arreglo))













