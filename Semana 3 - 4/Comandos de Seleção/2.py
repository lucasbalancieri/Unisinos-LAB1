# Crie um programa que recebe dois valores inteiros pelo teclado e imprime qual dos dois é maior.

primero_numero = int(input("Primeiro Número: "))
segundo_numero = int(input("Segundo Número: "))

if primero_numero > segundo_numero:
	print("{} é maior que {}".format(primero_numero, segundo_numero))
elif primero_numero < segundo_numero:
	print("{} é maior que {}".format(segundo_numero, primero_numero))
else:
	print("Números iguais")