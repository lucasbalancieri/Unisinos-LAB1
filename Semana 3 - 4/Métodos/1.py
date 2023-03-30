# Crie um método que recebe dois valores val1 e val2 (assuma que serão inteiros). 
# O método deve retornar verdadeiro se val1 for divisível por val2 e falso caso contrário.

def verificar_divisao(val1, val2):
	if val1 % val2 == 0:
		return True
	else:
		return False

		
n1 = 10
n2 = 2

print(verificar_divisao(n1, n2))