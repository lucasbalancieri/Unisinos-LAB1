# Faça um programa que solicita ao usuário que ele digite números que sejam
# positivos e pares. Quando o usuário digitar um número que não seja o solicitado, 
# imprima na tela a soma dos valores positivos e pares digitados.

numero = 0
soma = 0

while numero >= 0:
	numero = int(input("Número positivo e par: "))
	if numero % 2 == 0:
		soma = soma + numero
	else:
		break

print("A soma dos valores positivos e pares digitados é: ", soma)