#Crie um programa que pede para o usuário digitar o nome de 13 pessoas pelo teclado.

nome_pessoas = []
i = 1

while i <= 13:
nome = input("Digite o nome da {}ª pessoa: ".format(i))
nome_pessoas.append(nome)
i += 1

print(nome_pessoas)