# Crie um programa que calcule o fatorial de um número informado pelo
# usuário (não permita números negativos).

numero = int(input("Número: "))

fat = 1 # fat é inicializada com 1, já que o fatorial de 0 e 1 é sempre igual a 1.
i = numero # i é igual ao número fornecido pelo usuário, e itera até que i seja igual a zero. A cada iteração, o valor atual de i é multiplicado por fat.

if numero < 0:
	raise ValueError('Número negativo')

while i > 0:
	fat = fat * i
	i -= 1

print("{}! é: {}".format(numero, fat))		

