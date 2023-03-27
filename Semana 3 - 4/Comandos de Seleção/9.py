# Crie um programa que recebe a nota do Grau A e a nota do Grau B pelo teclado e 
#imprime na tela se será necessário ou não realizar o Grau C (considere o sistema de avaliação da Unisinos). 
#Caso algum valor informado seja negativo, informe uma mensagem de erro e não realize o cálculo.

grau_a = float(input("Grau A: "))
grau_b = float(input("Grau B: "))

if grau_a < 0 or grau_b < 0:
	raise ValueError("Nota inválida")
else:
	nota_grau_a = grau_a * 0.30
	nota_grau_b = grau_b * 0.70
	nota_final = nota_grau_a + nota_grau_b

if nota_final >= 6.0:
	print ("Nota: {:.2f}\nNão é necessário realizar o Grau C".format(nota_final))
else:
	print("Nota: {:.2f}\nÉ necessário realizar o Grau C.".format(nota_final))