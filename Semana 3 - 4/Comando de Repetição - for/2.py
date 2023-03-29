# Crie um programa que imprime na tela todos os valores entre dois valores digitados pelo teclado.
num1 = int(input("1º Número: "))
num2 = int(input("2º Número: "))

if num1 < num2:
	for i in range(num1+1, num2):
		print(i)
else:
	raise ValueError("1º número maior do que o 2º número")

