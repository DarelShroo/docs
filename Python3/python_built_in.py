import sys, time
import tools
import tools.time

def separateBlock(n_guiones: int = 0, name: str = '') -> None:
    guiones = '-' * n_guiones
    print('------------------------------------', name, guiones, '------------------------------------', sep='')

# Funciones relacionadas con el manejo de datos
# -----------------------------------------------------------

# print()
separateBlock(0, 'print()')
print('Hello World')
separateBlock(len("print()"))

# type()
separateBlock(0, 'type()')
num: int = 50
print(type(num)) # Devuelve <class 'int'>

class MyObject:
    def obj(self):
        return 'obj'

myObj = MyObject()
print(type(myObj)) # Devuelve <class '__main__.miObjeto'>
separateBlock(len("type()"))

# id()
separateBlock(0, 'id()')
print(id(myObj)) # Devuelve 2046374491344 -> Si lo ejecutas seguramente no sea el mismo resultado.
separateBlock(len('id()'))

# Funciones relacionadas con operaciones matemáticas y de datos
# -----------------------------------------------------------

# abs()
separateBlock(0, 'abs()')
print(abs(-5))  # Devuelve 5
print(abs(3.14))  # Devuelve 3.14
separateBlock(len('abs()'))

# delattr()
separateBlock(0, 'delattr()')
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
separateBlock(len('delattr()'))

# hash()
separateBlock(0, 'hash()')
texto = 'Hola mundo'
valor_hash = hash(texto)
print(valor_hash)  # Muestra el valor hash del texto
separateBlock(len('hash()'))

#sorted
separateBlock(0, 'sorted()')
palabras = ['manzana', 'BANANA', 'cereza', 'DÁTIL']
print(sorted(palabras, key=len))  # Ordenar por longitud de palabra
print(sorted(palabras, key=str.lower))  # Ordenar ignorando diferencias de mayúsculas y minúsculas

palabras_con_numero = ['manzana5', 'banana10', 'cereza1', 'dátil7']

print(sorted(
    palabras_con_numero, 
    key = lambda x: (
        print(f"Valor de x: {x}"),
        int(''.join(filter(str.isdigit, x))) 
    )
))
separateBlock(len('sorted()'))

# Funciones relacionadas con iterables y datos
# -----------------------------------------------------------

#enumerate()
separateBlock(0, 'enumerate()')
lista_animales = ['perro', 'gato', 'gallina', 'conejo', 'hamster']
lista_animales_enumerada = enumerate(lista_animales, start=0)
for animal in lista_animales_enumerada:
    print(animal)
separateBlock(len('enumerate()'))

#int()
separateBlock(0, 'int()')
x = "10"
print(int(x, base=8))
separateBlock(len('int()'))

#open()
separateBlock(0, 'open()')
file =  open('file.txt', 'r', encoding='UTF-8')
if(file):
    with file as f:
        contenido = f.read()
        print(contenido)
separateBlock(len('open()'))

# Funciones relacionadas con ejecución y manipulación de código
# -----------------------------------------------------------

#exec()
separateBlock(0, 'exec()')
codigo = '''
x = 10
y = 20
print(x + y)
'''
exec(codigo) # CUIDADO CON ESTO!
separateBlock(len('exec()'))

#isinstance()
separateBlock(0, 'isinstance()')
print(isinstance(newCar, Car))
separateBlock(len('isinstance()'))

#sum()
separateBlock(0, 'sum()')
print(sum([1,2,3,4,5], start=10))
separateBlock(len('sum()'))

#bytearray()
separateBlock(0, 'bytearray()')
hello_world = "Hello World"
hello_world_bad = "Hölå münðø"

print(bytearray(hello_world, encoding="utf-8").decode('utf-8'))
print(bytearray(hello_world_bad, encoding="ascii", errors="ignore"))
print(bytearray(hello_world_bad, encoding="ascii", errors="replace"))

separateBlock(len('bytearray()'))

#filter()
separateBlock(0, 'filter()')
lista_personas = ['juan', 'pedro', 'maria', 'julieta']
def endInLetterA(name: str) -> bool:
    print(name)
    return name.endswith('a')
resultado = filter(lambda x: endInLetterA(x), lista_personas)
#filter es un lazy iterable
list(resultado)
separateBlock(len('filter()'))


#super()
separateBlock(0, 'super()')
class Animal:
    def __init__(self, species):
        self.species = species

class Dog(Animal):
    def __init__(self, breed, age):
        super().__init__("Canine")
        self.breed = breed
        self.age = age

dog = Dog("Labrador", 3)
print(dog.species)
separateBlock(len('super()'))

#iter()
separateBlock(0, 'iter()')
class numberGenerator:
    def __init__(self) -> None:
        self.start = 0
    def __iter__(self) -> object:
        return self
    def __next__(self) -> int:
        self.start+=1
        return self.start
    __call__ = __next__
iterator = iter(numberGenerator(), 5)
print(list(iterator))
separateBlock(len('iter()'))

#format()
separateBlock(0, 'format()')
s = 'abc'
print(format(s, '*^'+str(20-len(s))))
print("Hello", "{}".format("World"), sep=" ")
separateBlock(len('format()'))

#property()
class Person:
    def __init__(self, name):
        self._name = name

    @property
    def name(self):
        print("Name: ", end="")
        return self._name

    @name.setter
    def name(self, value):
        print('Setting name to:', value)
        self._name = value

    @name.deleter
    def name(self):
        print('Deleting name...')
        del self._name

p = Person('David')
print(p.name)
p.name = 'Rocky'
del p.name
