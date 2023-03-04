def addText(text):
    with open ("test.txt", "a") as file:
        file.write("\n" + text)


addText("Hello!")
addText("How you're doing?")