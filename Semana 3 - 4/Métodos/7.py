# Crie um método que recebe dois parâmetros, que serão um inteiro N e uma string S (nesta ordem). 
# O método deve imprimir na tela N vezes a string S.

def imprimir_string(n, s):
	for i in range(0, n):
		print(s)


n = 4
s = 'Corinthians'
imprimir_string(n, s)
