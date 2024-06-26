miFuncion(8,2); // Esto se lo conoce como hosting

function miFuncion(a, b){
    //console.log('Sumamos: ' + (a + b));
    return a + b;
}

// Llamando la función
miFuncion(5, 4);

let resultado = miFuncion(6,7);
console.log(resultado);


// Declaramos una funcion de tipo "expresión"
let x = function(a,b){return a + b}; 
resultado = x(5, 6);
console.log(resultado);


// Funciones self y invoking
(function(a,b){
    console.log('Ejecutando la función: '+(a + b));
})(9,6);


// Metodo "typeof & arguments"
console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length);
}
miFuncionDos(5, 7);


// toString
var miFuncionTexto = miFuncionDos.toString(); // Convierte la función a texto
console.log(miFuncionTexto);


// Funciones "flecha"
const sumarFuncionFlecha = (a,b) => a + b;
resultado = sumarFuncionFlecha(3,7); // Asignamos el valor a una variable
console.log(resultado);


// arguments es un array
let sumar = function(a,b){
    console.log(arguments[0]); // Muestra el argumento de: a
}
resultado = sumar(3);


// Sumar todos los argumentos
let respuesta = sumarTodo(5,4,13,10,9);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i]; // arguments es para arreglos
    }
    return suma;
}


// Tipos 'Primitivos'
let k = 10;
function cambiarValor(a){ // Paso por valor
    a = 20;
}
cambiarValor(k);
console.log(k);

// Paso por referencia
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona)
function cambiarValorObjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez'
}

cambiarValorObjeto(persona);
console.log(persona);