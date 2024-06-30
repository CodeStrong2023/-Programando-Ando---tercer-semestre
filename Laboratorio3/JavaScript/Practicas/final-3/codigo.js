document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('.form form');
    
    form.addEventListener('submit', (e) => {
        e.preventDefault(); // Evita el envío del formulario
        
        const username = form.querySelector('input[type="text"]').value;
        const password = form.querySelector('input[type="password"]').value;
        
        // Validación simple de los campos de entrada
        if (username === "" || password === "") {
            alert("Please fill in both fields.");
            return;
        }
        
        // Mostrar mensaje de acceso exitoso
        alert("¡Accediste!");
    });
});
