# Crie um programa que pede para o usuário digitar 20 números com ponto flutuante pelo teclado. 
# Ao final, seu programa deve imprimir todos os números digitados. 
#Dica: armazene-os em uma string e concatene os valores digitados. No final, imprima a string.

numeros = ""
i = 0

while i < 20:
	numero = input("{}º numéro com ponto flutuante: ".format(i+1))
	numeros += numero + "\n"
	i += 1

print("Números digitados:\n", numeros)	