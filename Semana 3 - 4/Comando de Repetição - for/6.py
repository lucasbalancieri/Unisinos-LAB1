# Crie um programa que solicita o nome e o estado civil de 20 pessoas pelo teclado. 
# Ao final, imprima apenas o nome das pessoas separadas por estado civil: 
# solteiras, casadas, divorciadas e viúvas (nesta ordem!)

solteiras = []
casadas = []
divorciadas = []
viuvas = []

for i in range(20):
	nome = input("{}ª pessoa - Nome: ".format(i+1))
	estado_civil = input("{}ª pessoa - Estado civil: ".format(i+1))
	if estado_civil == "solteira" or estado_civil == "solteiro":
		solteiras.append(nome)
	elif estado_civil == "casada" or estado_civil == "casado":
		casadas.append(nome)
	elif estado_civil == "divorciada" or estado_civil == "divorciado":
		divorciadas.append(nome)
	elif estado_civil == "viúva" or estado_civil == "viúvo":
		viuvas.append(nome)
	else:
		raise Exception("Estado civil inválido")

print("Pessoas solteiras: ")
for pessoa in solteiras:
	print(pessoa)

print("Pessoas casadas: ")
for pessoa in casadas:
	print(pessoa)

print("Pessoas divorciadas: ")
for pessoa in divorciadas:
	print(pessoa)

print("Pessoas viúvas: ")
for pessoa in viuvas:
	print(pessoa)
