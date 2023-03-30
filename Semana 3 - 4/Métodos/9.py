# Crie um método que recebe 3 notas por parâmetro e retorna o conceito atingido pela média aritmética das notas. 
# Os conceitos são:
# - entre 0.0 e 4.0 (inclusive): conceito "D" 
# - entre 4.0 (não incluído) e 7.0 (inclusive): conceito "C"
# - entre 7.0 (não incluído) e 9.0 (inclusive): conceito "B"
# - entre 9.0 (não incluído) e 10.0 (inclusive): conceito "A"
# Caso alguma das notas digitadas seja negativa, retorne o texto "ERRO".

def media_artimetica_notas(n1, n2, n3):
	media = (n1 + n2 + n3) / 3

	if n1 < 0 or n2 < 0 or n3 < 0:
		return print("ERRO")
	else:
		if media <= 4.0:
			return "D"
		elif media > 4.0 and media <= 7.0:
			return "C"
		elif media > 7.0 and media <= 9.0:
			return "B"
		elif media > 9.0 and media <= 10:
			return "A"
		else:
			print("Nenhuma das notas deve ser superior a 10.0")


n1 = 10
n2 = 10
n3 = 10

print(media_artimetica_notas(n1, n2, n3))
