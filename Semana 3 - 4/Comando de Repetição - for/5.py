# Crie um programa que permita que o usuário crie sua lista de compras. 
# Primeiramente, solicite que ele informe quantos produtos serão adicionados na lista. 
# Depois disto, peça para que o usuário digite os produtos que ele vai comprar, e armazene em uma lista. 
# Ao final, imprima a lista de compras do usuário.

qtd_itens = int(input("Digite a quantidade de itens que deseja adicionar: "))
carrinho = []

print(".:Inserir Itens:.")
for i in range(qtd_itens):
	inserir_itens = input("Item: ")
	carrinho.append(inserir_itens)

print("\n.:Carrinho:.")
for itens in carrinho:
	print (itens)