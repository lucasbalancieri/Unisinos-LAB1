# Sabendo que uma string é uma lista de letras, 
# peça para o usuário digitar um texto e imprima na tela a quantidade de vogais que existem no texto.

texto = input("Digite um texto: ")

vogais = ["a", "e", "i", "o", "u"]
count = 0

for i in texto.lower():
	if i in vogais:
		count += 1
		
print("O texto contem {} vogais".format(count))