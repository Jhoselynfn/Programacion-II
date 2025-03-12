class Rectangulo:
    def __init__(self, a,  b):
        self.__base=a       
        self.__altura=b
    def setBase(self,a):
        self.__base=a
    def setAltura(self,b):
        self.__altura=b
    def area(self):
        return self.__base * self.__altura
    def __str__(self):
        return "{} {}".format(self.__base, self.__altura)
r1=Rectangulo(2,3)
r1.setBase (9)
r1.setAltura (4)
print(r1)
print("Area =", r1.area())
    
