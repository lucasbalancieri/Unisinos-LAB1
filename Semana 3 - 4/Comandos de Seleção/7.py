#Crie um programa que recebe um valor inteiro referente a um
#determinado ano. Imprima na tela se o ano informado é bissexto ou não.

ano = int(input("Digite um ano: "))

if ano % 4 == 0 and (ano % 100 != 0 or ano % 400 == 0): 
	print("{} é bissexto.".format(ano)) 
else: 
	print("{} não é bissexto.".format(ano))

