# Crie um programa que pede para o usuário digitar números positivos via Teclado. 
# Quando o usuário digitar um número negativo, informe a média de todos os
# números que ele informou.

numeros_digitados = 0
numero = 0
soma = 0

while numero >= 0:
	numero = int(input("Numero: "))
	if numero >= 0:
		soma = soma + numero
		numeros_digitados += 1

media = soma/numeros_digitados
print("Média:", media)