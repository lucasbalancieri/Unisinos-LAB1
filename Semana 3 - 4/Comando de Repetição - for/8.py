# Crie um programa que separa o joio do trigo. Seu programa deve ler a lista
# abaixo e criar duas listas diferentes: uma com todas as ocorrências da palavra "joio" e
# outra com todas as ocorrências da palavra "trigo". Ao final, imprima as listas separadas.
# Copie e cole a linha abaixo no seu código e complete o programa:
joioETrigo = ["joio", "trigo", "trigo", "joio", "trigo",
"joio", "joio", "joio", "joio", "trigo", "trigo", "joio",
"joio", "joio", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"joio", "joio", "joio", "joio", "joio", "joio", "joio",
"joio", "trigo", "trigo", "joio", "joio", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "trigo", "joio", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "joio", "joio",
"trigo", "trigo", "trigo", "trigo", "trigo", "trigo",
"trigo", "trigo", "trigo", "joio", "joio", "joio", "joio",
"joio", "joio", "trigo", "joio", "joio", "joio", "joio",
"joio", "trigo", "trigo", "trigo", "trigo", "joio", "joio",
"joio", "joio", "joio", "joio", "joio", "trigo", "trigo",
"trigo", "joio", "trigo", "joio", "joio", "joio"]

joio = []
trigo = []

for i in joioETrigo:
	if i == "joio":
		joio.append(i)
	else:
		trigo.append(i)

print("Lista de Joio:\n" , joio)
print("Lista de Trigo:\n", trigo)