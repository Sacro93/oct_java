"""
Hay muchos proyectos iniciales prácticos que puedes realizar con Python, dependiendo de tus intereses y nivel de habilidad. Aquí hay algunos ejemplos:

#Calculadora: Puedes crear una calculadora básica que realice operaciones aritméticas simples, como suma, resta, multiplicación y división. Puedes mejorarla agregando características adicionales, como operaciones con decimales o exponentes.

#Aplicación de lista de tareas: Crea una aplicación que permita a los usuarios agregar, eliminar y marcar tareas como completadas. Puedes implementarla usando estructuras de datos como listas o diccionarios.

#Conversor de unidades: Desarrolla un programa que convierta unidades de medida comunes, como temperatura, longitud, peso o volumen. Por ejemplo, puedes convertir grados Celsius a Fahrenheit, millas a kilómetros o libras a kilogramos.

#Web scraping: Utiliza librerías como BeautifulSoup o Scrapy para extraer información de sitios web. Puedes crear un programa que recopile los titulares de noticias de un sitio o extraiga datos de productos de un sitio de comercio electrónico.

#Generador de contraseñas: Crea un programa que genere contraseñas seguras con diferentes criterios, como longitud, inclusión de números, letras mayúsculas, símbolos, etc.

#Analizador de texto: Desarrolla una herramienta que analice un texto y proporcione información como el recuento de palabras, la frecuencia de palabras, el recuento de caracteres, el recuento de oraciones, etc. Puedes utilizar expresiones regulares y estructuras de datos para implementarlo.

#Juego de ahorcado: Implementa el clásico juego de ahorcado en el que el jugador debe adivinar una palabra desconocida antes de agotar todos sus intentos. Puedes utilizar listas de palabras predefinidas o incluso implementar la funcionalidad de obtener palabras aleatorias de un archivo de texto.
"""
import random as rd
words=["Ferrari","Caballo","Payaso","Celular","Cafe","Moto","Viaje","Television"]
word=rd.choice(words).upper()
index=rd.randint(0,len(words)-1)
letter=word[index]
first_letter=len(word[:index])
last_letter=len(word[index+1:])
a_clue=(first_letter*" _ ") +letter+ (last_letter*" _ ")
print(a_clue)
word_user= input("Adivine la palabra: ").upper()
condition=word_user == word
print("Gano?", condition)