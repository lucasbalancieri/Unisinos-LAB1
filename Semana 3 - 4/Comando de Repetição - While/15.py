# Crie um programa que imprime os números primos entre 0 e 200,
# imprimindo ao final a soma destes números.

i = 0
soma = 0

while i < 200:
	if i%2 == 0: # aplicar a formula do numero primo
		print(i)
		soma = soma + i
		i+=2
print(soma)

