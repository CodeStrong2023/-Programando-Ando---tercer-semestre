import random
import json
import pickle
import numpy as np
import nltk
from nltk.stem import WordNetLemmatizer
from keras._tf_keras.keras.models import load_model

# Cargar datos necesarios
lemmatizer = WordNetLemmatizer()
intents = json.loads(open('src/possible_answers.json', 'r', encoding='utf-8').read())
words = pickle.load(open('src/words.pkl', 'rb'))
classes = pickle.load(open('src/classes.pkl', 'rb'))
model = load_model('src/chatbot_model.h5')

def clean_up_sentence(sentence):
    sentence_words = nltk.word_tokenize(sentence)
    sentence_words = [lemmatizer.lemmatize(word.lower()) for word in sentence_words]
    return sentence_words

def bag_of_words(sentence):
    sentence_words = clean_up_sentence(sentence)
    bag = [0] * len(words)
    for w in sentence_words:
        for i, word in enumerate(words):
            if word == w:
                bag[i] = 1
    return np.array(bag)


def predict_class(sentence, threshold=0.8):
    bow = bag_of_words(sentence)
    res = model.predict(np.array([bow]))[0]
    results = [[i, r] for i, r in enumerate(res) if r > threshold]
    results.sort(key=lambda x: x[1], reverse=True)

    return_list = [{'intent': classes[r[0]], 'probability': str(r[1])} for r in results]
    max_probability = max([r[1] for r in results]) if results else 0
    return return_list, max_probability


def get_response(intents_list, intents_json):
    if not intents_list or not isinstance(intents_list, list) or len(intents_list) == 0:
        return "No entendí tu pregunta. ¿Podrías ser más específico?"

    # Selecciona la intención con la mayor probabilidad
    top_intent = intents_list[0]  # Tomamos la primera intención con mayor probabilidad
    tag = top_intent['intent']  # Accedemos al tag de la intención

    # Buscamos la intención correspondiente en intents_json
    list_of_intents = intents_json['intents']
    for intent in list_of_intents:
        if intent['tag'] == tag:
            return random.choice(intent['responses'])  # Devolvemos una respuesta aleatoria de las respuestas de esa intención

    return "Lo siento, no tengo información sobre eso en este momento."