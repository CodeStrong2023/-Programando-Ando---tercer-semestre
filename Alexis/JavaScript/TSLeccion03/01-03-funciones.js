miFuncion(8, 2) //esto se le conoce como hosting

function miFuncion(a, b){
    //console.log('sumamos: '+ (a + b))
    return a + b
}

// llamando a la funcion
miFuncion(5, 4)

let resultado = miFuncion(6, 7);
console.log(resultado);

//declaramos una funcion de tipo expresion o anonima
let x = function(a, b){return a + b}; //necesita cierra con punto y coma
resultado = x(5, 6); //al llamarla se pone la variable y parentesis
console.log(resultado);


//fnciones de tipo self e invoking
(function(a, b){
    console.log('ejecutando la funcion: '+ (a + b));
})(9, 6);


console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length);
}

miFuncionDos(5, 7, 3, 6)

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

// funciones flecha
const sumarFuncionFlecha = (a, b) =>a + b; // asignamos el valor a una variable
resultado = sumarFuncionFlecha(3, 7)

let sumar = function(a, b){
    console.log(arguments[0]) //muestra el parametro de: a
    console.log(arguments[1]) //muestra el parametro de: b
    return a + b + arguments[2];
}
resultado = sumar(3, 5, 9)
console.log(resultado);

//sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 10 , 9);
console.log(respuesta)
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i< arguments.length; i++){
        suma += arguments[i]; //arguments es para arreglos
    }
    return suma;
}

//tipos primitivos
let k = 10
function cambiarValor(a){ //paso por valor
    a = 20
}

cambiarValor(k);
console.log(k)

//paso por referencia
const persona = {
    nombre: 'juan',
    apellido: 'lepez'
}
console.log(persona)
function cambiarValorObjeto(p1){
    p1.nombre = 'ignacio';
    p1.apellido = 'perez'
}

cambiarValorObjeto(persona)
console.log(persona)





