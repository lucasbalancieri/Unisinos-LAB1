# Faça um programa que escreva na tela todos os valores inteiros que estão entre dois
# valores digitados pelo usuário (num1 e num2). Caso num1 seja maior do que num2, imprima uma
# mensagem de erro e não imprima.

num1 = int(input("1º Número: "))
num2 = int(input("2º Número: "))

i = 1

if num1 > num2:
	raise ValueError(" O 1º número não pode ser maior do que o 2º número")
else:
	intervalo = num2 - num1
	while i < intervalo:
		numero_entre = num1+i
		print(numero_entre)
		i += 1