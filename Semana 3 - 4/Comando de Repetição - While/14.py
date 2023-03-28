# Crie um programa que diga se o número informado pelo usuário é primo ou não.

numero = int(input("Digite um número inteiro: "))

divisor = 1
qtd_divisores = 0

if numero < 0:
    raise ValueError('Número negativo')

while divisor <= numero: # nenhum número é divisivel por um número maior do que ele próprio ∴ while itera até o número
	if numero % divisor == 0:
		qtd_divisores += 1

	if qtd_divisores > 2:
		break
	divisor += 1

if qtd_divisores == 2:
	print("O {} é um número primo".format(numero))
else:
	print("O {} não é um número primo".format(numero))

