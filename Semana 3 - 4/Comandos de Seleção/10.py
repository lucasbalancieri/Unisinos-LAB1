#Crie um programa que solicita que o usuário digite uma letra e imprime na tela se a letra é uma vogal ou uma consoante.

letra = input("Digite uma letra: ")

vogais = ['a', 'e', 'i', 'o', 'u']

if letra.lower() in vogais: # .lower() trata a entrada em caso de letra maiúscula 
	print("{} é vogal".format(letra))
else:
	print("{} é consoante".format(letra))