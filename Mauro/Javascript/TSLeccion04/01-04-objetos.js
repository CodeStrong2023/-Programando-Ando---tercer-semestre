let x = 10; // Variable de tipo primitiva
console.log(x.length);

// Creación de un objeto (forma 1)
let persona = {
    nombre: 'Carlos',
    apellido: 'Gonzalez',
    email: 'carlosg@gmail.com',
    edad: 30,
    nombreCompleto: function(){ // Metodo o función
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona);
console.log(persona.nombreCompleto());

// Creación de un objeto (forma 2)
let persona2 = new Object(); // Debe crear un nuevo objeto en memoria
persona2.nombre = 'Juan';
persona2.direccion = 'Salada 13';
persona2.telefono = '23424234';
console.log(persona2.telefono);

console.log(persona['apellido']); // Accedemos como si fuera un array

// Ciclo For-In y accedemos al objeto como si fuera un array
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}

persona.apellida = 'Betancud'; // Cambiamos dinamicamente un valor del objeto
delete persona.apellida; // Eliminamos el error
console.log(persona);


// Distintas formas de imprimir un objeto

// N°1: concatenar cada valor de cada propiedad
console.log(persona.nombre+', '+persona.apellido);

// N°2: a travéz del ciclo for in
for(nombreProp in persona){
    console.log(persona[nombreProp]);
}

// N°3: la función Object.values()
let personaArray = Object.values(persona);
console.log(personaArray);

// N°4: utiliazaremos el método JSON.stringify
let personaString = JSON.stringify(persona);
console.log(personaString);