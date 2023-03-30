# Crie um método que recebe um valor por parâmetro (assuma que será uma string) 
# e retorna a quantidade de letras ou outros caracteres que não sejam espaço que existem neste texto.

def contar_caracteres(texto):
	count = 0

	for i in texto:
		if i == ' ':
			count - 1
		else:
			count += 1

	return count


texto = 'teste teste teste'
print(contar_caracteres(texto))
