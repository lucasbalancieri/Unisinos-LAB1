# Faça um programa que escreva na tela todos os valores inteiros entre dois valores
# digitados pelo usuário (num1 e num2). Caso num1 seja maior do que num2, seu programa
# deve imprimir os valores entre num1 e num2 da mesma forma.

num1 = int(input("1º Número: "))
num2 = int(input("2º Número: "))

maior = max(num1, num2) # max() retorna o maior valor entre num1 e num2
menor = min(num1, num2) # min() retorna o menor valor entre num1 e num2
intervalo = maior - menor 
i = 1

if num2 > num1:
	while i < intervalo:
		numero_entre = num1+i
		print(numero_entre)
		i += 1
elif num1 > num2:
	while i < intervalo:
		numero_entre = num2+i
		print(numero_entre)
		i += 1
else:
	raise ValueError("Números iguais")
