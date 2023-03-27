print(".:Grau A:.")
grau_a_n1 = float(input("Nota Atividade Prática: ")) 
grau_a_n2 = float(input("Nota Atividade Teórica: ")) 

print(".:Grau B:.")
grau_b_n1= float(input("Nota Prova em Laboratório: ")) 
grau_b_n2= float(input("Nota Teste Teórico: ")) 
grau_b_n3= float(input("Nota Trabalho Extraclasse: ")) 
 
nota_grau_a = (grau_a_n1 * 0.45) + (grau_a_n2 * 0.55)
nota_grau_b = (grau_b_n1 * 0.60) + (grau_b_n2 * 0.20) + (grau_b_n3 * 0.20)
nota_final = (nota_grau_a * 0.33) + (nota_grau_b * 0.67)

print("Nota Final: {:.2f}".format(nota_final))