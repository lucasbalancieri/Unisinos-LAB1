#Crie um programa que pede para o usuário digitar o nome de 13 pessoas pelo teclado.

i = 0
nome_pessoas = ""

while i < 5:
	nome = input("Digite o nome da {}ª pessoa: ".format(i+1))
	nome_pessoas = nome_pessoas + nome + "\n"
	i += 1

print("Nomes digitados:\n",nome_pessoas)