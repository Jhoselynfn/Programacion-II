import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def coord_polares(self):
        radio = math.sqrt(self.x ** 2 + self.y ** 2)
        angulo = math.atan2(self.y, self.x)  # atan2 evita división por cero
        angulo = math.degrees(angulo)
        return radio, angulo

    def __str__(self):
        return "({:.2f}, {:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return "Linea: {} -> {}".format(self.p1, self.p2)

    def dibujaLinea(self):
        print("Dibujando línea desde {} hasta {}".format(self.p1, self.p2))

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return "Círculo: centro en {} con radio {:.2f}".format(self.centro, self.radio)

    def dibujaCirculo(self):
        print("Dibujando círculo con centro en {} y radio {:.2f}".format(self.centro, self.radio))

# Ejemplo de uso
p1 = Punto(0, 3)
p2 = Punto(4, 0)
linea = Linea(p1, p2)
circulo = Circulo(p1, 5)

print(linea)
linea.dibujaLinea()

print(circulo)
circulo.dibujaCirculo()
