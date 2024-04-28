import sys

# print()
print('Hello World')

with open('file.txt', 'w') as f:
    print("Hello", "World", sep=' ', end='\n', file=f, flush=False)
    #file es la salida del print
    #flush en False no vacia el buffer al imprimir, si es True si lo hará

# type()
num: int = 50
print(type(num)) # Devuelve <class 'int'>

class MyObject:
    def obj(self):
        return 'obj'

myObj = MyObject()
print(type(myObj)) # Devuelve <class '__main__.miObjeto'>

# id()
print(id(myObj)) # Devuelve 2046374491344 -> Si lo ejecutas seguramente no sea el mismo resultado.

# abs()
print(abs(-5))  # Devuelve 5
print(abs(3.14))  # Devuelve 3.14


# delattr()
class Car:
    def __init__(self, model, color):
        self.model = model
        self.color = color

    def __str__(self):
        if hasattr(self, 'color'):
            return f"Car: {self.model} ({self.color})"
        else:
            return f"Car: {self.model}"

newCar = Car('BMW', 'red') # Car: BMW (red)
print(newCar)
delattr(newCar, 'color') #Car: BMW
print(newCar)
print(hasattr(newCar, 'color')) # Devuelve False

# hash()
texto = 'Hola mundo'
valor_hash = hash(texto)
print(valor_hash)  # Muestra el valor hash del texto
