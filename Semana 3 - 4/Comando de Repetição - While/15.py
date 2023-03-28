# Crie um programa que imprime os números primos entre 0 e 200,
# imprimindo ao final a soma destes números.

numero = 2
soma_primo = 0

while numero < 200:
	divisor = 2
	primo = True

	while divisor < numero:
		if numero % divisor == 0:
			primo = False
			break
		divisor += 1

	if primo:
		print(numero)
		soma_primo += numero

	numero += 1

print(soma_primo)




