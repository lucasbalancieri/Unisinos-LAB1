#Crie um programa que exibe um menu de calculadora na tela. O menu exibido deve ser o seguinte:
#• Digite 1 para somar dois valores
#• Digite 2 para subtrair dois valores
#• Digite 3 para multiplicar dois valores
#• Digite 4 para dividir dois valores
#• Digite 5 para realizar uma potência entre dois valores
#• Digite 6 para realizar uma radiciação entre dois valores
#• Digite qualquer outro número para sair
#De acordo com a opção informada pelo usuário, 
#solicite os valores necessários para o usuário e imprima na tela o resultado da operação realizada.

print("1 - Soma\n2 - Subtração\n3 - Mutiplicação")
print("4 - Divisão\n5 - Potenciação\n6-Radiciação")
op = int(input("Insira a opção: "))

if op == 1:
	primeiro_numero = int(input("Primero Número"))
	segundo_numero = int(input("Segundo Número"))
	print(primeiro_numero + segundo_numero)
elif op == 2:
	primeiro_numero = int(input("Primero Número"))
	segundo_numero = int(input("Segundo Número"))
	print(primeiro_numero - segundo_numero)
elif op == 3:
	primeiro_numero = int(input("Primero Número"))
	segundo_numero = int(input("Segundo Número"))
	print(primeiro_numero * segundo_numero)
elif op == 4:
	primeiro_numero = int(input("Primero Número"))
	segundo_numero = int(input("Segundo Número"))
	print(primeiro_numero / segundo_numero)
elif op == 5:
	primeiro_numero = int(input("Primero Número"))
	segundo_numero = int(input("Segundo Número"))
	print(primeiro_numero ** segundo_numero)
elif op == 6:
	primeiro_numero = int(input("Primero Número"))
	segundo_numero = int(input("Segundo Número"))
	print(primeiro_numero ** (1/segundo_numero))
else: 
	print("Opção inválida")
