# Crie um programa que imprima a soma dos valores pares e a soma dos
# valores ímpares entre dois números quaisquer digitados pelo usuário.

n1 = int(input("Primeiro valor: "))
n2 = int(input("Segundo valor: "))

i = 0
maior = max(n1, n2)
menor = min(n1, n2)
intervalo = maior - menor
soma_par = 0
soma_impar = 0

while i <= intervalo:
	if menor % 2 == 0:
		soma_par = soma_par + menor
	else:
		soma_impar = soma_impar + menor
	menor += 1
	i += 1
print("Soma dos valores pares entre {} e {}: {}".format(n1, n2, soma_par))
print("Soma dos valores impares entre {} e {}: {}".format(n1, n2, soma_impar))
