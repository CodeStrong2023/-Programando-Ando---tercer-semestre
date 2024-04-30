let x = 10; //variable de tipo primitiva
console.log(x.length);

//objeto
let persona = {
    nombre: 'carlos',
    apellido: 'gil',
    email: 'cgil@gmail.com',
    edad: 30
    nombreCompleto: function(){ //metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido
    }
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




