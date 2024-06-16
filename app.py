import gradio as gr
from transformers import pipeline

# Load the pre-trained sentiment-analysis pipeline
classifier = pipeline('sentiment-analysis')

# Function to classify sentiment
def classify_text(text):
    result = classifier(text)[0]
    return f"{result['label']} with score {result['score']}"

# Set up the Gradio interface
iface = gr.Interface(fn=classify_text, inputs="text", outputs="text")
iface.launch()
