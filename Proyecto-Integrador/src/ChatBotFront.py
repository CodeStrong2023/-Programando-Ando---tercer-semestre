import streamlit as st
from ChatBotBack import predict_class, get_response, intents

# Configuración de la página
st.set_page_config(page_title="ChatBot ProgramandoAndo", page_icon=":robot_face:", layout="wide")

# Título y subencabezado
st.title("🤖 ChatBot ProgramandoAndo")
st.subheader("Tu asistente virtual para la distribuidora de productos")

# Mensaje por defecto
default_response = "Lo siento, no entiendo tu pregunta."

# Inicialización del estado de la sesión
if "messages" not in st.session_state:
    st.session_state.messages = []
if "first_message" not in st.session_state:
    st.session_state.first_message = True

# Mostrar mensajes previos
for message in st.session_state.messages:
    if message["role"] == "user":
        with st.chat_message("user"):
            st.markdown(f"**Usuario:** {message['content']}")
    else:
        with st.chat_message("assistant"):
            st.markdown(f"**ChatBot:** {message['content']}")

# Mensaje de bienvenida
if st.session_state.first_message:
    with st.chat_message("assistant"):
        st.markdown("Hola, ¿cómo puedo ayudarte?")

    st.session_state.messages.append({"role": "assistant", "content": "Hola, ¿cómo puedo ayudarte?"})
    st.session_state.first_message = False

# Entrada de usuario
if prompt := st.chat_input("Escribe tu mensaje aquí..."):
    with st.chat_message("user"):
        st.markdown(f"**Usuario:** {prompt}")
    st.session_state.messages.append({"role": "user", "content": prompt})

    # Obtener respuesta del chatbot (implementa tus funciones predict_class y get_response aquí)
    insts, max_prob = predict_class(prompt)
    res = get_response(insts, intents)
    st.session_state.messages.append({"role": "assistant", "content": res})
    with st.chat_message("assistant"):
        st.markdown(f"**ChatBot:** {res}")