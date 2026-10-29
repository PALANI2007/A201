import re
import string
from bs4 import BeautifulSoup

def clean_text(text):
    text = text.lower()
    text = BeautifulSoup(text, "html.parser").get_text()
    text = re.sub(r'http\S+|www\S+', '', text)
    text = re.sub(r'\d+', '', text)
    text = text.translate(str.maketrans('', '', string.punctuation))
    text = re.sub(r'\W+', ' ', text)
    text = re.sub(r'\s+', ' ', text).strip()
    return text

corpus = [
    "I can't wait for the new season of my favorite show! 😍",
    "The COVID-19 pandemic has affected millions of people worldwide.",
    "U.S. stocks fell on Friday after news of rising inflation.",
    "<html><body>Welcome to the website!</body></html>",
    "Python is a great programming language!!! ??",
    "Check out https://www.example.com for more info!",
    "He won 1st prize in the comp3tition!!!",
    "I luvv this movie sooo much!!!"
]
cleaned_corpus = [clean_text(doc) for doc in corpus]
print("Cleaned Corpus:\n", cleaned_corpus)