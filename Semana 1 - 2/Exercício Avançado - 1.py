a = float(input("N1: "))
b = int(input("N2: "))

mult = (a*b)
div = (a/b)
soma = (a+b)
dif = (a-b)
elev = (a**b)

print("{} multiplicado por {} é {}".format(a, b, mult))
print("{} divido por {} é {}".format(a, b, div))
print("{} mais {} é {} e {} menos {} é {}".format(a, b, soma, a, b, dif))
print("{} elevado a {} é {}".format(a, b, elev))