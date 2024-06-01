let x = 10; //variable tipo primitiva

// Objeto
let persona = {
    nombre:"Carlos",
    apellido:"Alonso",
    edad: 30,
    idioma: "es",  
    nombreCompleto: function(){// Metodo o funcion
        return this.nombre+"  "+this.apellido;
    },
    get nombreEdad(){//Este es el metodo get
        return this.nombre+" edad: "+this.edad;
    },
    get lang(){
        return this.idioma.toUpperCase();//convierte las minúsculas en mayúsculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.nombre);
console.log(persona.nombreCompleto());

let persona2 = new Object();//Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Sala 13";
console.log(persona2.direccion);

console.log(persona["apellido"]); //Accedemos como si fuera un arreglo

//for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);//como acceder a una propiedad y luego a su valor
}

persona.apellido = "Ramos"; //cambiamos dinamicamente un valor del objeto
delete persona.apellido; // eliminamos el error

//Distintas formas de imprimir un objeto
// Numero 1: la mas sencilla, concatenar un velor de cada propiedad
console.log("Distintas formas de imprimir un objeto forma 1");
console.log(persona.nombre+" "+persona.apellido);

//Numero 2: a travez del ciclo for in
console.log("Distintas formas de imprimir un objeto forma 2");
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Numero 3: la funcion Object.values()
console.log("Distintas formas de imprimir un objeto forma 3");
let personaArray = Object.values(persona);
console.log(personaArray);

//Numero 4: utilizaremos el metodo JSON.stringify
console.log("Distintas formas de imprimir un objeto forma 4");
let personaString = JSON.stringify(persona);
console.log(personaString);

console.log("Comenzamos a utilizar el metodo get");
console.log(persona.nombreEdad);

console.log("Comenzamos el metodo get y set para idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email){//contructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre+" "+this.apellido;
    }
}
let padre = new Persona3("Leo","Lopez","lopez@gmail.com");
padre.nombre = "Luis";//modificamos el nombre
padre.telefono = "123456778";//una propiedadexclusiva del objeto padre
console.log(padre); 
console.log(padre.nombreCompleto());
let madre = new Persona3("Laura","Amtanio","lauAm@gmail.com");
console.log(madre); 
console.log(madre.telefono);//la propiedad no esta definida
console.log(madre.nombreCompleto());


//formas de crear objetos
// forma 1
let miObjeto = new Object();//Esta es una opcion formal
//forma 2
let miObjeto2 = {}; 

//caso String 1
let miCadena = new String("hola");//sintaxis formal
//caso String 2
let miCadena2 = new "hola";

//caso con numeros 1
let miNum = new Number(1);//formal no recomendada
//caso con numeros 2
let miNum2 = 1;//formal recomendada

//caso Boolean 1 
let miBool1 = new Boolean(false);//Formal
//caso Boolean 2
let miBool2 = false;//Recomendada

//caso Arreglos 1
let miArreglo1 = new Array();//Formal
//caso Arreglos 2
let miArreglo2 = [];//Recomendada

//caso funcion 1
let miFuncion1 = new function(){}; //todo despues del new es considerado objeto
//caso funcion 2
let miFuncion2 = function(){}; //simplificada y recomendada

//Uso de prototype
Persona3.prototype.telefono = "24002988";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "63839290";
console.log(madre.telefono);

//Uso de call
let Persona4 = {
    nombre: "Juan",
    apellido: "Gomez",
    nombreCompleto2: function(titulo, telefono){
        return titulo+" "+this.nombre+" "+this.apellido+" "+telefono;
        //return this.nombre+" "+this.apellido;
    }
}

let Persona5 = {
    nombre: "Juana",
    apellido: "Gomez"
}

console.log(Persona4.nombreCompleto2("Lic.", "2613688976"));
console.log(Persona4.nombreCompleto2.call(Persona5, "Ing.", "855389009"));

//metodo Apply
let arreglo = ["Ing", "2348892887"]
console.log(Persona4.nombreCompleto2.apply(Persona5, arreglo));
