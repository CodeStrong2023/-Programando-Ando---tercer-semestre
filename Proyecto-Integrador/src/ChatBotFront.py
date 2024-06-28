import streamlit as st
from ChatBotBack import predict_class, get_response, intents

st.title("Bienvenido a DistribuyAndo.")
default_response = "Lo siento, no entiendo tu pregunta."

if "messages" not in st.session_state:
    st.session_state.messages = []
if "first_message" not in st.session_state:
    st.session_state.first_message = True

for message in st.session_state.messages:
    with st.chat_message(message["role"]):
        st.markdown(message["content"])

if st.session_state.first_message:
    with st.chat_message("assistant"):
        st.markdown("Hola, ¿cómo puedo ayudarte?")

    st.session_state.messages.append({"role": "assistant", "content": "Hola, ¿cómo puedo ayudarte?"})
    st.session_state.first_message = False

if prompt := st.chat_input("¿Cómo puedo ayudarte?"):
    with st.chat_message("user"):
        st.markdown(prompt)
    st.session_state.messages.append({"role": "user", "content": prompt})

    insts, max_prob = predict_class(prompt)
    res = get_response(insts, intents)
    st.session_state.messages.append({"role": "assistant", "content": res})
    with st.chat_message("assistant"):
        st.markdown(res)
