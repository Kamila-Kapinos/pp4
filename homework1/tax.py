def countNetPrice(grossPrice, tax):
    return round((grossPrice/(1+tax/100)),2)