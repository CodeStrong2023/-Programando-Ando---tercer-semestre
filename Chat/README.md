<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://github.com/CodeStrong2023/-Programando-Ando---tercer-semestre/assets/131505719/3381f17b-006c-4e8f-8e80-06cd5e06369a" alt="Project logo"></a>
</p>

<h3 align="center">🐍 Proyecto ChatBot E-commerce 🐍</h3>



<p>Este repositorio contiene el código fuente de un chatbot de atención al cliente desarrollado para una tienda en línea. El chatbot está diseñado para interactuar con los usuarios y proporcionar respuestas automáticas a preguntas frecuentes sobre productos, envíos, pagos, y más. Está construido utilizando Python, TensorFlow, Keras, y Streamlit.</p>

   ## Características

- **Procesamiento de Lenguaje Natural (NLP)**: Utiliza técnicas de NLP para comprender y responder a las preguntas de los usuarios.
- **Modelo de Clasificación de Intenciones**: Entrena un modelo de red neuronal para clasificar las intenciones de los usuarios y proporcionar respuestas adecuadas.
- **Respuestas Predeterminadas**: Proporciona respuestas predeterminadas si la intención del usuario no se puede determinar con alta probabilidad.
- **Interfaz de Usuario Interactiva**: Implementado con Streamlit para una interfaz de usuario simple y efectiva.

## Estructura del Proyecto

- `TrainingChatBot.py`: Script para entrenar el modelo del chatbot utilizando un conjunto de datos de intenciones y patrones.
- `ChatBotBack.py`: Backend del chatbot que maneja la predicción de intenciones y la generación de respuestas.
- `possible_answers.json`: Archivo JSON que contiene las posibles intenciones y respuestas del chatbot.
- `words.pkl` y `classes.pkl`: Archivos pickle que almacenan las palabras y clases procesadas durante el entrenamiento.
- `chatbot_model.h5`: Archivo del modelo entrenado guardado.
- `ChatBotFront.py`: Frontend de Streamlit que proporciona la interfaz de chat para interactuar con el chatbot.

## Documentación sobre herramientas utilizadas

- [Streamlit](https://docs.streamlit.io)

- [Keras](https://keras.io/api/)

- [Tensorflow](https://www.tensorflow.org/learn?hl=es)

- [Nltk](https://www.nltk.org)

- [Numpy](https://numpy.org/doc/stable/)

- [Pickle](https://docs.python.org/3/library/pickle.html)

- [Random](https://www.w3schools.com/python/module_random.asp)



