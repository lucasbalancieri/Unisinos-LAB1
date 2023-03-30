# Crie um método que recebe um inteiro por parâmetro e retorna verdadeiro 
# caso seja um valor primo e falso caso contrário. 
# Caso o parâmetro seja negativo o método deve retornar falso.

def verificar_numero_primo(numero):
	count = 1
	if numero < 0:
		return False
	else:
		for i in range(1, numero):
			if numero % i == 0:
				count += 1
		if count == 2:
			return True
		else:
			return False

numero = 11

print(verificar_numero_primo(numero))