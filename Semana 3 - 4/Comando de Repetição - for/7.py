# Crie um programa que solicita ao usuário que ele defina sua senha. 
# A senha deve ser um texto (string) composto apenas por dígitos e deve ter entre 5 e 10 valores. 
# O usuário tem apenas 6 chances de definir corretamente a senha. 
# Caso ele defina corretamente a senha nas tentativas que ele tem, imprima uma mensagem de sucesso. 
# Caso ele não defina a senha corretamente, imprima uma mensagem de insucesso. 
# Dica: na aula aprendemos a ver se uma string é formada apenas por dígitos e aprendemos a 
# descobrir o tamanho do texto digitado.

pswd_ok = False

for i in range(6):
	pswd = input("Nova senha: ")
	if pswd.isdigit() and len(pswd) >= 5 and len(pswd) <= 10:
		pswd_ok = True
		print("Senha cadastrada")
		break
	else:
		print("\nSenha inválida\nrestam {} tentativas\n".format(abs((i+1)-6)))

if pswd_ok is False:
	print("Fim das tentativas")