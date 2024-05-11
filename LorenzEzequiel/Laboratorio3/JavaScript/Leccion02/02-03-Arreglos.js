//let autos = new Array(BMW) sintaxis vieja
const auto = ["BMW","Toyota"]

//Recorrelos los elementos de los arreglos
console.log(auto[0]);//nos muestra BMW
for(let i = 0; i < auto.length; i++){
    console.log(i+" : "+auto[i]);
}

//modificamos los elementos del arreglo
auto[1] = "Ferrari"

//agregamos elementos del arreglo
auto.push("Audi")//se agrega al final

//agregamos elementos del arreglo forma 2
auto[auto.length] = "Toyota"

//como pregintar si es un array o arreglo
console.log(Array.isArray(auto));

//como pregintar si es un array o arreglo forma 2
console.log(auto instanceof Array);

