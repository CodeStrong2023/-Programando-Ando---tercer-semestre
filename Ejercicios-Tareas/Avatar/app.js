let ataqueJugador;
let ataqueEnemigo;
let vidasJugador = 3;
let vidasEnemigo = 3;

function iniciarJuego() {
    // Escondemos la sección de selección de ataques
    let seccionSeleccionarAtaque = document.getElementById("seleccionar-ataque");
    seccionSeleccionarAtaque.style.display = "none";

    // Añadimos el escuchador de eventos al botón de seleccionar personaje
    let botonPersonajeJugador = document.getElementById('boton-personaje');
    botonPersonajeJugador.addEventListener('click', seleccionarPersonajeJugador);

    // Añadimos escuchadores de eventos a los botones de ataques
    let botonPunio = document.getElementById('boton-punio');
    botonPunio.addEventListener('click', ataquePunio);
    let botonPatada = document.getElementById('boton-patada');
    botonPatada.addEventListener('click', ataquePatada);
    let botonBarrida = document.getElementById('boton-barrida');
    botonBarrida.addEventListener('click', ataqueBarrida);

    // Añadimos el escuchador de eventos al botón de reiniciar
    let botonReiniciar = document.getElementById('boton-reiniciar');
    botonReiniciar.addEventListener('click', reiniciarJuego);

    // Escondemos el botón de reiniciar al inicio del juego
    let seccionReiniciar = document.getElementById("reiniciar");
    seccionReiniciar.style.display = "none";
}

// Función para seleccionar el personaje del jugador
function seleccionarPersonajeJugador() {
    // Escondemos la sección de selección de personaje
    let seccionSeleccionarPersonaje = document.getElementById("seleccionar-personaje");
    seccionSeleccionarPersonaje.style.display = "none";

    // Mostramos la sección de selección de ataque
    let seccionSeleccionarAtaque = document.getElementById("seleccionar-ataque");
    seccionSeleccionarAtaque.style.display = "block";

    // Obtenemos los inputs de los personajes
    let inputZuko = document.getElementById('zuko');
    let inputKatara = document.getElementById('katara');
    let inputAang = document.getElementById('aang');
    let inputToph = document.getElementById('toph');
    let spanPersonajeJugador = document.getElementById('personaje-jugador');

    // Verificamos cuál personaje ha sido seleccionado
    if (inputZuko.checked) {
        spanPersonajeJugador.innerHTML = 'Zuko';
    } else if (inputKatara.checked) {
        spanPersonajeJugador.innerHTML = 'Katara';
    } else if (inputAang.checked) {
        spanPersonajeJugador.innerHTML = 'Aang';
    } else if (inputToph.checked) {
        spanPersonajeJugador.innerHTML = 'Toph';
    } else {
        alert('Selecciona un personaje');
        return;
    }

    // Seleccionamos un personaje enemigo al azar
    seleccionarPersonajeEnemigo();
}

// Función para seleccionar el personaje enemigo al azar
function seleccionarPersonajeEnemigo() {
    let personajeAleatorio = aleatorio(1, 4);
    let spanPersonajeEnemigo = document.getElementById('personaje-enemigo');

    // Asignamos el personaje enemigo basado en el número aleatorio generado
    if (personajeAleatorio == 1) {
        spanPersonajeEnemigo.innerHTML = 'Zuko';
    } else if (personajeAleatorio == 2) {
        spanPersonajeEnemigo.innerHTML = 'Katara';
    } else if (personajeAleatorio == 3) {
        spanPersonajeEnemigo.innerHTML = 'Aang';
    } else {
        spanPersonajeEnemigo.innerHTML = 'Toph';
    }
}

// Funciones para los ataques del jugador
function ataquePunio() {
    ataqueJugador = 'Punio';
    ataqueAleatorioEnemigo();
}

function ataquePatada() {
    ataqueJugador = 'Patada';
    ataqueAleatorioEnemigo();
}

function ataqueBarrida() {
    ataqueJugador = 'Barrida';
    ataqueAleatorioEnemigo();
}

// Función para determinar el ataque aleatorio del enemigo
function ataqueAleatorioEnemigo() {
    let ataqueAleatorio = aleatorio(1, 3);

    if (ataqueAleatorio == 1) {
        ataqueEnemigo = 'Punio';
    } else if (ataqueAleatorio == 2) {
        ataqueEnemigo = 'Patada';
    } else {
        ataqueEnemigo = 'Barrida';
    }

    // Iniciamos el combate después de seleccionar los ataques
    combate();
}

// Función para reiniciar el juego
function reiniciarJuego() {
    location.reload();
}

// Función para manejar el combate
function combate() {
    let spanVidasJugador = document.getElementById("vidas-jugador");
    let spanVidasEnemigo = document.getElementById("vidas-enemigo");

    // Determinamos el resultado del combate basado en los ataques
    if (ataqueEnemigo == ataqueJugador) {
        crearMensaje("EMPATE");
    } else if (
        (ataqueJugador == "Punio" && ataqueEnemigo == "Barrida") ||
        (ataqueJugador == "Patada" && ataqueEnemigo == "Punio") ||
        (ataqueJugador == "Barrida" && ataqueEnemigo == "Patada")
    ) {
        crearMensaje("GANASTE");
        vidasEnemigo--;
        spanVidasEnemigo.innerHTML = vidasEnemigo;
    } else {
        crearMensaje("PERDISTE");
        vidasJugador--;
        spanVidasJugador.innerHTML = vidasJugador;
    }

    // Revisamos si alguna de las vidas ha llegado a cero
    revisarVidas();
}

// Función para revisar las vidas de los jugadores
function revisarVidas() {
    if (vidasEnemigo == 0) {
        // Si el enemigo se queda sin vidas, mostramos mensaje de victoria
        crearMensajeFinal("FELICITACIONES GANASTE 🏆");
    } else if (vidasJugador == 0) {
        // Si el jugador se queda sin vidas, mostramos mensaje de derrota
        crearMensajeFinal("PERDISTE, NO TE RINDAS 😭");
    }
}

// Función para crear el mensaje final del juego
function crearMensajeFinal(resultadoFinal) {
    let sectionMensaje = document.getElementById("mensajes");
    let parrafo = document.createElement("p");

    parrafo.innerHTML = resultadoFinal;
    sectionMensaje.appendChild(parrafo);

    // Deshabilitamos los botones de ataques después de finalizar el juego
    document.getElementById('boton-punio').disabled = true;
    document.getElementById('boton-patada').disabled = true;
    document.getElementById('boton-barrida').disabled = true;

    // Mostramos el botón de reinicio
    let seccionReiniciar = document.getElementById("reiniciar");
    seccionReiniciar.style.display = "block";
}

// Función para crear mensajes durante el combate
function crearMensaje(resultado) {
    let sectionMensaje = document.getElementById("mensajes");
    let parrafo = document.createElement("p");

    parrafo.innerHTML = "Tu personaje atacó con " + ataqueJugador + ", el personaje del enemigo atacó con " + ataqueEnemigo + " - " + resultado;
    sectionMensaje.appendChild(parrafo);
}

// Función para generar un número aleatorio entre un mínimo y un máximo
function aleatorio(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min);
}

// Iniciamos el juego cuando la página ha cargado completamente
window.addEventListener('load', iniciarJuego);