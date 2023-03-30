# Crie um método chamado maiorValor que recebe 3 valores por parâmetro (assuma que serão inteiros) 
# e retorna o maior dos três valores.

def maiorValor(val1, val2, val3):
	return max(val1, val2, val3)
	'''
	if val1 > val2 and val1 > val3:
		return val1
	elif val2 > val1 and val2 > val3:
		return val2
	elif val3 > val1 and val3 > val2:
		return val3
	else:
		raise ValueError('Valores Iguais')
	'''


n1 = 5
n2 = 5
n3 = 5

print(maiorValor(n1, n2, n3))