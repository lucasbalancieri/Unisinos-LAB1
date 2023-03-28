# Crie um programa que solicita para o usuário que ele digite 10 valores inteiros. 
# Ao final, imprima a soma de todos os valores digitados.

i = 0
soma = 0

while i < 10:
	numero = int(input("{}º número: ".format(i+1)))
	soma = soma + numero
	i += 1

print('Soma de todo os valores:', soma)