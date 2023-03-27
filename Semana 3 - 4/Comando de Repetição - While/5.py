# Crie um programa que solicita o time de 10 usuários pelo teclado. Ao final, imprima quantos torcedores torcem para o Grêmio.

torcedores = 0
i = 0

while i < 10:
	time = input("Time: ")
	if time.lower() == 'gremio' or time.lower() == 'grêmio':
		torcedores += 1
	i += 1
	
print("{} pessoas torcem para o Grêmio.".format(torcedores))