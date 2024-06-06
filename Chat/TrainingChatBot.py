import nltk
from nltk.stem import WordNetLemmatizer
import json
import pickle
import numpy as np
from keras._tf_keras.keras.models import Sequential
from keras._tf_keras.keras.layers import Dense, Dropout
from keras._tf_keras.keras.optimizers import SGD
from keras._tf_keras.keras.optimizers.schedules import ExponentialDecay
import random

data_file = open('possible_answers.json', 'r', encoding='utf-8').read()
intents = json.loads(data_file)

lematizer = WordNetLemmatizer()

words = []
classes = []
documents = []
ignore_words = ['?', '!']

# Recorre cada respuesta con sus patrones en el JSON
for intent in intents['intents']:
    for pattern in intents['patterns']
        w = nltk.word_tokenize(pattern) #se tokeniza la palabra y se la agrega  a la lista de palabras
        words.extend(w)
        documents.append((w, intent['tag']))
        if intent['tag'] not in classes
            classes.append(intent['tag'])

words = [lematizer.lemmatize(w.lower()) for w in words if w not in ignore_words]
words = sorted(list(set(words)))
classes = sorted(list(set(classes)))

pickle.dump(words,open('words.pkl','wb'))
pickle.dump(classes,open('classes.pkl','wb'))




