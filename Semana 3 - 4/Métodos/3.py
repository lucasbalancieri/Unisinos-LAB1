# Crie um método que recebe um valor por parâmetro (assuma que será inteiro)
# e retorna a soma de todos os valores entre 0 e o valor recebido. 
# Caso o valor seja negativo, o método deve retornar -1.

def somar_valores(valor):
	soma = 0

	for i in range(0, valor+1):
		soma = soma + i

	return soma

	
valor = 5
print(somar_valores(valor))



