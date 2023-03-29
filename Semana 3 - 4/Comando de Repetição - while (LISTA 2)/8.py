# O usuário e a senha de um cliente são,respectivamente, USER10 e PASSWORD1234. 
# Sabendo disso, faça um programa que solicita ao usuário que ele digite seu usuário e senha. 
# O programa termina quando ele acertar o usuário e a senha ou quando ele exceder o máximo
# de 3 tentativas. Quando ele acertar, o programa deve informar a mensagem: LOGIN EFETUADO COM SUCESSO. 
# Caso ele exceda a quantidade de tentativas, o programa deve informar a mensagem: NÚMERO MÁXIMO DE TENTATIVAS EXCEDIDO!

user = 'USER10'
pswd = 'PASSWORD1234'
insert_user = ''
insert_pswd = ''
tentativas = 0

while insert_pswd != pswd or insert_user != user:
	 insert_user = input("Usuário: ")
	 insert_pswd = input("Senha: ")

	 if insert_pswd != pswd or insert_user != pswd:
	 	print("Dados de login incorretos")
	 	tentativas += 1

	 if tentativas == 3:
	 	raise Exception("NÚMERO MÁXIMO DE TENTATIVAS EXCEDIDO!")

print("LOGIN EFETUADO COM SUCESSO")