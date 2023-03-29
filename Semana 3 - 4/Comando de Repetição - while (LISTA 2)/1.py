i = 0

while i < 10:
	numero = int(input("Digite um número aleatório: "))
	if numero < 0:
		print("Número negativo")
	elif numero == 0:
		print("Zero")
	else:
		print("Número positivo")
	i += 1