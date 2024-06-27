//let autos = new Array('Ferrari', 'Renault', 'BMW'); Sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW'];

//Recorremos los elementos del arreglo
/*console.log(autos[0]);
console.log(autos[2]);
*/
for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i])
}

//Modificamos los elementos del arreglo
autos[1] = 'Volvo'
for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i])
}

//Agregamos valores al arreglo
autos.push('Audi')//Agregamos un elemento al final
console.log(autos);
//Otras formas de agregar
autos[autos.length] = 'Porche';
console.log(autos);
//Tercera forma
autos[6] = 'Fiat'
console.log(autos);

//Como preguntar si es un array o arreglo
console.log(Array.isArray(autos)); //Devuelve un booleano

console.log(autos instanceof Array); //Preguntamos si la variable es una instancia de la clase Array
