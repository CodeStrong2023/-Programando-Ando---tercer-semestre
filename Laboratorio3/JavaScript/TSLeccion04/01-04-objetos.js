let x = 10; // Variable de tipo primitiva
console.log(x.length);

// Creación de un objeto (forma 1)
let persona = {
  nombre: "Carlos",
  apellido: "Gonzalez",
  email: "carlosg@gmail.com",
  edad: 28,
  idioma: "ES",
  get lang() {
    return this.idioma.toUpperCase(); // Convierte las minúsculas a mayúsculas
  },
  set lang(lang) {
    this.idioma = lang.toUpperCase();
  },
  nombreCompleto: function () {
    // Metodo o función
    return this.nombre + " " + this.apellido;
  },
  get nombreEdad() {
    return "El nombre es: " + this.nombre + ", Edad: " + this.edad;
  },
};

console.log(persona);
console.log(persona.nombreCompleto());

// Creación de un objeto (forma 2)
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = "Juan";
persona2.direccion = "Salada 13";
persona2.telefono = "23424234";
console.log(persona2.telefono);

console.log(persona["apellido"]); // Accedemos como si fuera un array

// Ciclo For-In y accedemos al objeto como si fuera un array
for (propiedad in persona) {
  console.log(propiedad);
  console.log(persona[propiedad]);
}

persona.apellida = "Betancud"; // Cambiamos dinamicamente un valor del objeto
delete persona.apellida; // Eliminamos el error
console.log(persona);

// Distintas formas de imprimir un objeto

// N°1: concatenar cada valor de cada propiedad
console.log(persona.nombre + ", " + persona.apellido);

// N°2: a travéz del ciclo for in
for (nombreProp in persona) {
  console.log(persona[nombreProp]);
}

// N°3: la función Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

// N°4: utiliazaremos el método JSON.stringify
let personaString = JSON.stringify(persona);
console.log(personaString);

// Método 'Get'
console.log(persona.nombreEdad);

// Método 'Get y Set' para idiomas
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email) {
  // Constructor
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  this.nombreCompleto = function () {
    return this.nombre + " " + this.apellido;
  };
}

let padre = new Persona3("Leo", "Lopez", "lopezl@gmail.com");
padre.nombre = "Luis"; // Modificamos el nombre
padre.telefono = "2323234"; // Una propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto()); // Utilizamos la función

let madre = new Persona3("Laura", "Contrera", "contreral@gmail.com");
console.log(madre);
console.log(madre.telefono); // La propieadad no esta definida
console.log(madre.nombreCompleto());

// Diferentes formas de crear objetos
// Caso N°1
let miObjeto = new Object(); // Esta es una opción formal
// Caso N°2
let miObjeto2 = {}; // Esta es breve y recomendada

// Caso String N°1
let miCadena1 = new String("Hola"); // Sintaxis formal
// Caso String N°2
let miCadena2 = "Hola"; // Es es la sintaxis simplificada y recomendada

// Caso con números N°1
let miNumero = new Number(1); // Es formal, no recomendable
// Caso con números N°2
let miNumero2 = 1; // Sintaxis recomendada

// Caso Boolean N°1
let miBoolean1 = new Boolean(false); // Formal
// Caso Boolean N°2
let miBoolean2 = false; // Sintaxis Recomendada

// Caso Arreglos N°1
let miArreglo1 = new Array(); // Formal
// Caso Arreglos N°2
let miArreglo2 = []; // Sintaxis Recomendada

// Caso Function N°1
let miFuncion1 = new (function () {})(); // Todo despues de new es considerado objeto
// Caso Function N°2
let miFuncion2 = function () {}; // Notación simplificada y recomendada

// Uso de "prototype"
Persona3.prototype.telefono = "2604552255";
console.log(padre);
console.log(madre.telefono);
madre.telefono = "542604221144";
console.log(madre.telefono);

// Uso de "call"
let persona4 = {
  nombre: "Juan",
  apellido: "Sanchez",
  nombreCompleto2: function (titulo, telefono) {
    return titulo + ": " + this.nombre + " " + this.apellido + " " + telefono;
    //return this.nombre + " " + this.apellido;
  },
};

let persona5 = {
  nombre: "Carlos",
  apellido: "Lara",
};

console.log(persona4.nombreCompleto2("Lic.", "224242334"));
console.log(persona4.nombreCompleto2.call(persona5, "Ing.", "54223422234"));

// Método Apply
let arreglo = ["Ing.", "123123555"];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
