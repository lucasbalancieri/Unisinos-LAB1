a = int(input("1º numero: "))
b = int(input("2º numero: "))
c = int(input("3º numero: "))
d = int(input("4º numero: "))
e = int(input("5º numero: "))

pi = 3.14

area_triangulo = (b*c)/2
perimetro_retangulo = (a+b+c+d)
area_circunferencia = pi*(e*e)

print("Área do Triângulo = {}\nPerímetro do Retângulo = {}\nÁrea da Circunferência = {:.2f}".format(area_triangulo, perimetro_retangulo,area_circunferencia))