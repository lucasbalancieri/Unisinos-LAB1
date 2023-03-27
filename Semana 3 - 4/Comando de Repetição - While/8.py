# Crie um programa que pergunta para o usuário (via Teclado) quantos números ele irá digitar e 
# armazena em uma variável chamada quant. Logo após, faça com que o usuário digite quant números inteiros, 
# e para cada número digitado imprima na tela se o número é negativo, positivo ou zero.

quant = int(input("Digite a quantidade de números: "))
i = 0
while i < quant:
	numero = int(input('{}º número: '.format(i+1)))
	if numero > 0:
		print("{} é positivo".format(numero))
	elif numero < 0:
		print("{} é negativo".format(numero))
	else:
		print('O numero é {}'.format(numero))
	i += 1
