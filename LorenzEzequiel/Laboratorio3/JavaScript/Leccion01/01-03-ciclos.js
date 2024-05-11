//While
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("fin del ciclo");


// Do While

//Primero se va a ejecutar el codigo y luego revisa la condicion
let conteo = 0;
do{
    console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("fin del ciclo");

// For
for( let contando = 0; contando < 3; contando++){
    console.log(contando);
}
console.log("fin del ciclo");

// Palabra reservada Break
for( let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break
    }
}
console.log("Fin del ciclo de pares");

// Palabra Continue
for( let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue; // ir a la siguente iteracion
    }
    console.log(contando);
}
console.log("fin del ciclo");

// Etiquetas Labels
inicio: //indicamos que rompa el ciclo for
for( let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        break inicio; // ir a la siguente iteracion
    }
    console.log(contando);
}
console.log("fin del ciclo");