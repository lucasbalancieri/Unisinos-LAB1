# Crie um programa que imprime a tabuada de um número qualquer digitado pelo usuário.
numero = int(input("Número: "))

for i in range(0,11):
	print("{} x {} = {}".format(numero, i, numero * i))