// Sintaxis vieja: let autos = new Array('Ferrari', 'Renault', 'BMW');
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);


// Recorremos los elementos de un arreglo
console.log(autos[0]);

for(let i = 0; i < autos.length; i++){
    console.log(i +': ' + autos[i]);
}


// Modificar los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1])


// Agregar nuevos valores al arreglo
autos.push('Audi');
console.log(autos);


// Otras forma de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

autos[6] = 'Renault';
console.log(autos);


// Como pregutnar si es un arreglo
console.log(Array.isArray(autos));

console.log(autos instanceof Array); //Preguntamos si la variable es una istancia de la clase Array