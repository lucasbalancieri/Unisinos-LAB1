#Crie um programa que recebe três valores inteiros pelo teclado e imprime
#qual dos três é menor.

primero_numero = int(input("Primeiro Número: "))
segundo_numero = int(input("Segundo Número: "))
terceiro_numero = int(input("Terceiro Número: "))

if primero_numero < segundo_numero and primero_numero < terceiro_numero:
	print (primero_numero)
elif segundo_numero < primero_numero and segundo_numero < terceiro_numero:
	print(segundo_numero)
elif terceiro_numero < primero_numero and terceiro_numero < segundo_numero:
	print(terceiro_numero)
else:
	print("Números iguais")