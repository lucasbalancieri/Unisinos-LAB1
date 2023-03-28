# Crie um programa que pede para o usuário digitar 2 valores inteiros via Teclado (val1 e val2). 
# Se nenhum dos valores for negativo, escreva os números pares entre o menor e o maior valor.

i = 0

val_1 = int(input("Primeiro valor: "))
val_2 = int(input("Segundo valor: "))

maior = max(val_1, val_2) # max() retorna o maior valor entre val_1 e val_2
menor = min(val_1, val_2) # min() retorna o menor valor entre val_1 e val_2
intervalo = maior - menor 
par = False

if val_1 < 0 or val_2 < 0:
	raise ValueError('Número negativo')
else:
	while i < intervalo:
		if menor % 2 == 0:
			print(menor)
			par = True
		menor += 1
		i += 1
	if not par:
		print('Nenhum par entre {} e {}'.format(val_1, val_2))
