// while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("fin del ciclo while");

//do while
let conteo = 0;
do{
    console.log(conteo)
    conteo++
}while(conteo < 3)
console.log("fin del ciclo do while");

//for
for(let contando = 0; contando < 3; contando++){
    console.log(contando)//muestra todos los pares
}
console.log("fin del ciclo for")

//palabra reservada break
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 == 0){
        console.log(contando);
        break
    }
}
console.log("termina el ciclo al encontrar el primer numero par")

//la palabra continue y etiqueta labels
inicio:
for(let contando = 0; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue inicio; //ir a la siguiente iteracion
    }
    console.log(contando)
}
console.log("termina el ciclo")









