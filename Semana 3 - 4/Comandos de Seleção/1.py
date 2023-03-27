# Crie um programa que recebe um inteiro pelo teclado e imprime se ele é par ou ímpar.

numero = int(input("Número: "))

if numero % 2 == 0:
	print("{} é Par".format(numero))
else:
	print("{} é Impar".format(numero))