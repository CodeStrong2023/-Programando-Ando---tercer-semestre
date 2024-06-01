miFuncion(9, 2);//Esto se lo conoce como hosting

function miFuncion(a, b){
    //console.log("Sumamos: "+ (a+b));
    return a + b;
}
//llamamos la funcion
miFuncion(5, 4);

let resultado = miFuncion(5, 6);
console.log(resultado);

//declaramos una funcion de tipo expresion
let x = function(a, b){return a + b};
resultado = x(3,4);
console.log(resultado);


//funciones de tipo self y invoking
(function(a, b){
    console.log("Ejecutamos la funcion: "+ (a + b));
})(9, 5);


console.log(typeof miFuncion);
function miFuncionDos(a, b){
    console.log(arguments.length);
}
miFuncionDos(4, 8, 4);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto)

//funcion Flecha
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 5);
console.log(sumarFuncionFlecha);

let sumar = function(a = 4, b = 8){
    console.log(arguments[0]);//muestra el parametro de a
    console.log(arguments[1]);//muestra el parametro de b
    return a + b + arguments[2];
}
resultado = sumar(3,7,9,2);
console.log(resultado);


//sumar todos los argumentos
let respuesta = sumarTodo(4,5,7,2,4,8);
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

//tipos primitivos
let k = 10;
function cambiarValor(a){//paso por valor
    a = 20;
}
cambiarValor(k);
console.log(k);

const persona = {
    nombre: "Juan",
    apellido:"Delo"
}

//paso por referencia
function cambiarValorObjeto(p1){
    p1.nombre = "Ariel";
    p1.apellido = "Ramos";
}

cambiarValorObjeto(persona);
console.log(persona);