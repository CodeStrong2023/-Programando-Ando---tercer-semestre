<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://github.com/CodeStrong2023/-Programando-Ando---tercer-semestre/assets/131505719/3381f17b-006c-4e8f-8e80-06cd5e06369a" alt="Project logo"></a>
</p>

<h3 align="center">🐍 Proyecto ChatBot E-commerce 🐍</h3>



<p>Este repositorio contiene el código fuente de un chatbot de atención al cliente desarrollado para una tienda en línea. El chatbot está diseñado para interactuar con los usuarios y proporcionar respuestas automáticas a preguntas frecuentes sobre productos, envíos, pagos, y más. Está construido utilizando Python, TensorFlow, Keras, y Streamlit.</p>

    <h2>Características</h2>
    <ul>
        <li><strong>Procesamiento de Lenguaje Natural (NLP)</strong>: Utiliza técnicas de NLP para comprender y responder a las preguntas de los usuarios.</li>
        <li><strong>Modelo de Clasificación de Intenciones</strong>: Entrena un modelo de red neuronal para clasificar las intenciones de los usuarios y proporcionar respuestas adecuadas.</li>
        <li><strong>Respuestas Predeterminadas</strong>: Proporciona respuestas predeterminadas si la intención del usuario no se puede determinar con alta probabilidad.</li>
        <li><strong>Interfaz de Usuario Interactiva</strong>: Implementado con Streamlit para una interfaz de usuario simple y efectiva.</li>
    </ul>

    <h2>Estructura del Proyecto</h2>
    <ul>
        <li><code>TrainingChatBot.py</code>: Script para entrenar el modelo del chatbot utilizando un conjunto de datos de intenciones y patrones.</li>
        <li><code>ChatBotBack.py</code>: Backend del chatbot que maneja la predicción de intenciones y la generación de respuestas.</li>
        <li><code>possible_answers.json</code>: Archivo JSON que contiene las posibles intenciones y respuestas del chatbot.</li>
        <li><code>words.pkl</code> y <code>classes.pkl</code>: Archivos pickle que almacenan las palabras y clases procesadas durante el entrenamiento.</li>
        <li><code>chatbot_model.h5</code>: Archivo del modelo entrenado guardado.</li>
        <li><code>ChatBotFront.py</code>: Frontend de Streamlit que proporciona la interfaz de chat para interactuar con el chatbot.</li>
    </ul>

    <h2>Instalación</h2>
    <ol>
        <li>Clona este repositorio
        </li>
        <li>Crea y activa un entorno virtual:
            <pre><code>python -m venv venv
source venv/bin/activate  <!-- En Windows: venv\Scripts\activate --></code></pre>
        </li>
        <li>Instala las dependencias
        </li>
        <li>Entrena el modelo (opcional):
            <pre><code>python TrainingChatBot.py</code></pre>
        </li>
        <li>Ejecuta la aplicación:
            <pre><code>streamlit run ChatBotFront.py</code></pre>
        </li>
    </ol>

    <h2>Uso</h2>
    <ul>
        <li>Una vez que la aplicación esté en funcionamiento, puedes interactuar con el chatbot a través de la interfaz de usuario de Streamlit.</li>
        <li>El chatbot responderá a las preguntas de los usuarios basándose en las intenciones entrenadas.</li>
        <li>Si la probabilidad de la intención detectada es menor a 0.8, el chatbot responderá con un mensaje predeterminado indicando que no entendió la pregunta.</li>
    </ul>

## Documentación sobre herramientas utilizadas

- [Streamlit](https://docs.streamlit.io)

- [Keras](https://keras.io/api/)

- [Tensorflow](https://www.tensorflow.org/learn?hl=es)

- [Nltk](https://www.nltk.org)

- [Numpy](https://numpy.org/doc/stable/)

- [Pickle](https://docs.python.org/3/library/pickle.html)

- [Random](https://www.w3schools.com/python/module_random.asp)



