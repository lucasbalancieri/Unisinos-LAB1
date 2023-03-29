# O usuário e a senha de um cliente são, respectivamente, USER10 e PASSWORD1234. 
# Sabendo disso, faça um programa que solicita ao usuário que ele digite
# seu usuário e senha. O programa só termina quando ele acertar o usuário e a senha. Quando
# ele acertar, você deve informar a mensagem: LOGIN EFETUADO COM SUCESSO.

user = 'USER10'
pswd = 'PASSWORD1234'
insert_user = ''
insert_pswd = ''

while insert_pswd != pswd or insert_user != user:
	 insert_user = input("Usuário: ")
	 insert_pswd = input("Senha: ")

	 if insert_pswd != pswd or insert_user != pswd:
	 	print("Dados de login incorretos")

print("LOGIN EFETUADO COM SUCESSO")