# Crie um método que recebe uma lista por parâmetro (assuma que será uma lista de string) 
# e retorna a menor string da lista (com menos caracteres).

def menor_string(lista):
	menor = ' '
	
	for i in lista:
		if menor == ' ':
			menor = i
		elif len(i) < len(menor):
			menor = i

	return menor


lista = ['Independiente del Valle', 'Corinthians', 'Argentinos Jrs', 'Liverpool(URU)']
print(menor_string(lista))
