a = float(input("Digite A: "))
b = float(input("Digite B: "))
c = float(input("Digite C: "))

delta = ((b**2) - (4*(a*c)))
raiz_delta = delta ** (1/2)
x1 = ((b * (-1)) + raiz_delta) / (2 * a)
x2 = ((b * (-1)) - raiz_delta) / (2 * a)

print("X1:", x1)
print("X2:", x2)