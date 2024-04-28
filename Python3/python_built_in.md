
## Funciones Integradas

Python proporciona una serie de funciones integradas que pueden utilizarse sin necesidad de importar ningún módulo adicional. 

### `print()`

La función `print()` se utiliza para mostrar texto en la consola o terminal.

#### Sintaxis:
```python
print(valor1, valor2, ..., sep=' ', end='\n', file=sys.stdout, flush=False)
```

La función `print()` puede tomar uno o más argumentos separados por comas y los mostrará en la salida estándar. Puedes especificar el separador entre los valores utilizando el argumento `sep`, y puedes especificar el carácter de final de línea utilizando el argumento `end`.

Ejemplo:
```python
print('Hola', 'mundo')  # Muestra 'Hola mundo'
print('Hola', 'mundo', sep='-', end='!\n')  # Muestra 'Hola-mundo!' en una línea nueva
```

### `type()`

La función `type()` se utiliza para obtener el tipo de un objeto dado.

#### Sintaxis:
```python
type(objeto)
```

La función `type()` toma un único argumento `objeto` y devuelve el tipo de dato de ese objeto. Este tipo de dato puede ser cualquiera de los tipos incorporados en Python, como `int`, `float`, `str`, `list`, `tuple`, `dict`, entre otros, o incluso tipos personalizados definidos por el usuario.

Ejemplo:
```python
type(5)  # Devuelve <class 'int'>
type(3.14)  # Devuelve <class 'float'>
type('Hola')  # Devuelve <class 'str'>
type([1, 2, 3])  # Devuelve <class 'list'>
type((1, 2, 3))  # Devuelve <class 'tuple'>
type({'a': 1, 'b': 2})  # Devuelve <class 'dict'>
```

### `id()`

La función `id()` se utiliza para obtener la identificación única de un objeto en Python almacenado en memoria.

#### Sintaxis:
```python
id(objeto)
```

La función `id()` toma un único argumento `objeto` y devuelve un entero que representa la identificación única de ese objeto. Cada objeto en Python tiene un identificador único que lo distingue de otros objetos en la memoria.

Ejemplo:
```python
x = 5
y = 'Hola'
z = [1, 2, 3]

print(id(x))  # Devuelve un identificador único para el entero 5
print(id(y))  # Devuelve un identificador único para la cadena 'Hola'
print(id(z))  # Devuelve un identificador único para la lista [1, 2, 3]
```


### `abs()`

La función `abs()` se utiliza para obtener el valor absoluto de un número dado.

#### Sintaxis:
```python
abs(numero)
```

La función `abs()` toma un único argumento `numero` y devuelve su valor absoluto. El valor absoluto de un número es su distancia respecto al cero en la recta numérica, sin tener en cuenta su signo. Por lo tanto, el resultado siempre es un número no negativo.

Ejemplo:
```python
abs(-5)  # Devuelve 5
abs(3.14)  # Devuelve 3.14
abs(0)  # Devuelve 0
```

### `delattr()`

La función `delattr()` se utiliza para eliminar un atributo de un objeto en Python.

#### Sintaxis:
```python
delattr(objeto, atributo)
```

La función `delattr()` toma dos argumentos: `objeto`, que es el objeto del cual se eliminará el atributo, y `atributo`, que es el nombre del atributo que se eliminará.

Ejemplo:
```python
class MiClase:
    def __init__(self):
        self.atributo = 10

objeto = MiClase()

print(objeto.atributo)  # Muestra 10

delattr(objeto, 'atributo')

print(hasattr(objeto, 'atributo'))  # Devuelve False ya que el atributo ha sido eliminado
```

### `hash()`

La función `hash()` se utiliza para obtener el valor hash de un objeto. El valor hash es un número entero que representa de forma única el contenido del objeto, y es utilizado principalmente en estructuras de datos como diccionarios y conjuntos para la indexación rápida de elementos.

#### Sintaxis:
```python
hash(objeto)
```

La función `hash()` toma un solo argumento, `objeto`, que es el objeto del cual se calculará el valor hash.

Es importante destacar que no todos los objetos de Python son hasheables. Los objetos mutables, como las listas y los diccionarios, no pueden ser hasheados, ya que su contenido puede cambiar a lo largo del tiempo y esto podría romper la unicidad del valor hash.

Ejemplo:
```python
texto = 'Hola mundo'
valor_hash = hash(texto)
print(valor_hash)  # Muestra el valor hash del texto
```
### `memoryview()`

La función `memoryview()` se utiliza para crear un objeto de vista de memoria que permite acceder y manipular los datos de un objeto de secuencia sin copiarlos.

#### Sintaxis:
```python
memoryview(objeto)
```

La función `memoryview()` toma un solo argumento, `objeto`, que es el objeto de secuencia del cual se creará la vista de memoria.

Ejemplo:
```python
bytes_objeto = b'Hola'
vista_memoria = memoryview(bytes_objeto)
print(vista_memoria[0])  # Muestra el primer byte del objeto de bytes
```

### `set()`

La función `set()` se utiliza para crear un objeto de conjunto en Python. Un conjunto es una colección desordenada y sin elementos duplicados.

#### Sintaxis:
```python
set(iterable)
```

La función `set()` puede tomar un argumento opcional `iterable`, que puede ser cualquier objeto iterable (por ejemplo, una lista, una tupla, un conjunto, etc.). Si se proporciona, los elementos únicos del iterable se agregarán al conjunto resultante. Si no se proporciona ningún argumento, se crea un conjunto vacío.

Ejemplos:
```python
conjunto_vacio = set()
print(conjunto_vacio)  # Muestra un conjunto vacío: set()

lista = [1, 2, 3, 2, 1]
conjunto = set(lista)
print(conjunto)  # Muestra un conjunto con elementos únicos: {1, 2, 3}
```

### `all()`

La función `all()` se utiliza para verificar si todos los elementos de un iterable son evaluados como verdaderos.

#### Sintaxis:
```python
all(iterable)
```

La función `all()` toma un argumento `iterable`, que puede ser cualquier objeto iterable (por ejemplo, una lista, una tupla, un conjunto, etc.). Devuelve `True` si todos los elementos del iterable son evaluados como verdaderos, y `False` de lo contrario. Si el iterable está vacío, la función también devuelve `True`.

Ejemplos:
```python
lista1 = [True, True, False]
print(all(lista1))  # Devuelve False, ya que hay un elemento False en la lista

tupla = (10, 20, 30)
print(all(tupla))  # Devuelve True, ya que todos los elementos son distintos de cero

conjunto = {1, 2, 3}
print(all(conjunto))  # Devuelve True, ya que todos los elementos son evaluados como verdaderos

diccionario = {'a': True, 'b': True, 'c': False}
print(all(diccionario.values()))  # Devuelve False, ya que hay un valor False en el diccionario
```

### `dict()`

La función `dict()` se utiliza para crear un nuevo diccionario o convertir otro tipo de datos en un diccionario.

#### Sintaxis:
```python
dict(**kwargs)
dict(mapping, **kwargs)
dict(iterable, **kwargs)
```

La función `dict()` puede ser llamada de varias formas:

- `dict()`: Devuelve un nuevo diccionario vacío.
- `dict(mapping)`: Crea un nuevo diccionario a partir de un objeto mapeable (como otro diccionario).
- `dict(iterable)`: Crea un nuevo diccionario a partir de pares clave-valor en un iterable (por ejemplo, una lista de tuplas).
- `dict(**kwargs)`: Crea un nuevo diccionario con los argumentos de palabra clave proporcionados.

Ejemplos:

```python
# Crear un nuevo diccionario vacío
diccionario_vacio = dict()
print(diccionario_vacio)  # Devuelve {}

# Crear un nuevo diccionario a partir de un objeto mapeable
otro_diccionario = {'a': 1, 'b': 2, 'c': 3}
nuevo_diccionario = dict(otro_diccionario)
print(nuevo_diccionario)  # Devuelve {'a': 1, 'b': 2, 'c': 3}

# Crear un nuevo diccionario a partir de pares clave-valor en un iterable
lista_de_pares = [('a', 1), ('b', 2), ('c', 3)]
otro_nuevo_diccionario = dict(lista_de_pares)
print(otro_nuevo_diccionario)  # Devuelve {'a': 1, 'b': 2, 'c': 3}

# Crear un nuevo diccionario con argumentos de palabra clave
nuevo_diccionario_con_kwargs = dict(a=1, b=2, c=3)
print(nuevo_diccionario_con_kwargs)  # Devuelve {'a': 1, 'b': 2, 'c': 3}
```

### `help()`

La función `help()` se utiliza para obtener ayuda sobre un objeto, módulo, función, clase, método, palabra clave, etc., en Python.

#### Sintaxis:
```python
help(objeto)
```

La función `help()` muestra la documentación integrada de Python (también conocida como docstrings) para el objeto especificado. Puede ser utilizada de varias maneras:

- `help()`: Muestra un mensaje de ayuda interactivo.
- `help(objeto)`: Muestra la documentación del objeto especificado.

Ejemplos:

```python
# Mostrar la ayuda interactiva
help()

# Mostrar la documentación para la función print()
help(print)

# Mostrar la documentación para la clase str
help(str)

# Mostrar la documentación para un objeto específico
mi_lista = [1, 2, 3]
help(mi_lista)
```

### `min()`

La función `min()` se utiliza para encontrar el valor mínimo de un iterable, como una lista, tupla, conjunto o incluso una cadena.

#### Sintaxis:
```python
min(iterable, *iterables, key=None, default=object())
```

- `iterable`: El iterable del cual se desea encontrar el valor mínimo.
- `*iterables` (opcional): Otros iterables que se pueden proporcionar si se desean comparar varios conjuntos de valores.
- `key` (opcional): Una función que se utilizará para calcular el valor para cada elemento del iterable.
- `default` (opcional): El valor que se devuelve si el iterable está vacío.

La función `min()` devuelve el elemento más pequeño del iterable.

Ejemplos:

```python
# Encontrar el valor mínimo en una lista
numeros = [5, 2, 8, 1, 9]
minimo = min(numeros)
print(minimo)  # Salida: 1

# Encontrar el valor mínimo en un conjunto
conjunto = {10, 20, 5, 30}
minimo = min(conjunto)
print(minimo)  # Salida: 5

# Encontrar el valor mínimo en una cadena
cadena = 'python'
minimo = min(cadena)
print(minimo)  # Salida: 'h'
```

### `any()`

La función `any()` se utiliza para verificar si al menos uno de los elementos de un iterable es verdadero.

#### Sintaxis:
```python
any(iterable)
```

- `iterable`: El iterable que se desea verificar.

La función `any()` devuelve `True` si al menos uno de los elementos del iterable es verdadero. Si el iterable está vacío, devuelve `False`.

Ejemplo:

```python
# Verificar si al menos un número es positivo
numeros = [-2, 0, 4, -5]
resultado = any(numero > 0 for numero in numeros)
print(resultado)  # Salida: True

# Verificar si al menos un elemento de una lista no está vacío
lista = ['', 'apple', 'banana', '']
resultado = any(lista)
print(resultado)  # Salida: True

# Verificar si al menos un carácter es una vocal en una cadena
cadena = 'hello'
resultado = any(caracter in 'aeiou' for caracter in cadena)
print(resultado)  # Salida: True
```

### `hex()`

La función `hex()` se utiliza para convertir un número entero en una cadena que representa su valor en hexadecimal.

#### Sintaxis:
```python
hex(numero)
```

- `numero`: El número entero que se desea convertir a hexadecimal.

La función `hex()` devuelve una cadena que representa el valor hexadecimal del número entero dado.

Ejemplo:

```python
# Convertir un número entero a hexadecimal
numero = 255
hexadecimal = hex(numero)
print(hexadecimal)  # Salida: '0xff'
```
### `next()`

La función `next()` se utiliza para obtener el próximo elemento de un iterador en Python.

#### Sintaxis:
```python
next(iterador[, valor_predeterminado])
```

- `iterador`: El objeto iterador del cual obtener el próximo elemento.
- `valor_predeterminado` (opcional): Un valor predeterminado que se devuelve si el iterador está vacío (por defecto, genera una excepción `StopIteration`).

La función `next()` devuelve el próximo elemento del iterador. Si el iterador está vacío y se proporciona un valor predeterminado, devuelve el valor predeterminado en lugar de generar una excepción.

Ejemplo:

```python
# Crear un iterador
iterador = iter([1, 2, 3])

# Obtener el próximo elemento del iterador
elemento = next(iterador)
print(elemento)  # Salida: 1

# Obtener el siguiente elemento del iterador
elemento = next(iterador)
print(elemento)  # Salida: 2

# Obtener el siguiente elemento del iterador
elemento = next(iterador)
print(elemento)  # Salida: 3

# El iterador está vacío, devolver un valor predeterminado
elemento = next(iterador, 'Fin')
print(elemento)  # Salida: 'Fin'
```

### `slice()`

La función `slice()` se utiliza para crear un objeto de corte que puede ser utilizado para extraer un rango de elementos de una secuencia (como una lista, tupla o cadena) en Python.

#### Sintaxis:
```python
slice(inicio, fin, paso)
```

- `inicio` (opcional): Índice de inicio del corte. Por defecto, es `None`, lo que significa que comenzará desde el principio de la secuencia.
- `fin` (opcional): Índice de fin del corte. El corte se detendrá antes de este índice. Por defecto, es `None`, lo que significa que llegará hasta el final de la secuencia.
- `paso` (opcional): Tamaño del paso del corte. Por defecto, es `None`, lo que significa que tomará todos los elementos en secuencia.

La función `slice()` devuelve un objeto de corte que puede ser pasado a una secuencia para extraer un rango de elementos.

Ejemplo:

```python
# Crear una lista
mi_lista = [1, 2, 3, 4, 5]

# Crear un objeto de corte para obtener los elementos del índice 1 al 3 (sin incluir el 3)
mi_corte = slice(1, 3)

# Usar el objeto de corte para obtener los elementos del índice 1 al 3
resultado = mi_lista[mi_corte]
print(resultado)  # Salida: [2, 3]
```

### `ascii()`

La función `ascii()` devuelve una representación de cadena de un objeto utilizando solo caracteres ASCII legibles.

#### Sintaxis:
```python
ascii(objeto)
```

- `objeto`: El objeto del cual se desea obtener la representación en formato ASCII.

La función `ascii()` devuelve una cadena que contiene una versión imprimible de `objeto`, donde cualquier carácter no ASCII es escapado usando secuencias de escape `\x`, `\u` o `\U`, según corresponda.

Ejemplo:

```python
# Cadena con caracteres no ASCII
cadena = "Höla, ¿cómo estás?"

# Convertir la cadena a una representación ASCII
representacion_ascii = ascii(cadena)

print(representacion_ascii)
# Salida: 'H\xf6la, \xbfco\xbfmo est\xe1s?'
```

### `divmod()`

La función `divmod()` toma dos números y devuelve un par de números, consistente en su cociente y su residuo cuando se divide el primer número entre el segundo.

#### Sintaxis:
```python
divmod(x, y)
```

- `x`: El dividendo.
- `y`: El divisor.

La función `divmod()` devuelve una tupla de dos elementos `(a, b)` donde `a` es el cociente de la división entera de `x` por `y`, y `b` es el residuo de la división entera de `x` por `y`.

Ejemplo:

```python
# Uso de divmod()
resultado = divmod(10, 3)

print(resultado)
# Salida: (3, 1)

# La división entera de 10 entre 3 es 3, con un residuo de 1
```

### `object()`

La función `object()` es la clase base de todas las clases en Python. Se puede utilizar para crear instancias de una clase sin ningún comportamiento adicional.

#### Sintaxis:
```python
object()
```

La función `object()` no toma ningún argumento y devuelve una nueva instancia de la clase base.

Ejemplo:

```python
# Creación de una instancia de object()
obj = object()
print(obj)
# Salida: <object object at 0x0000025F5C9B4E90>

```


### `sorted()`

La función `sorted()` se utiliza para ordenar elementos de un iterable, ya sea una lista, tupla, conjunto, etc. Devuelve una nueva lista ordenada.

#### Sintaxis:
```python
sorted(iterable, key=None, reverse=False)
```

- `iterable`: El iterable que se va a ordenar.
- `key` (opcional): Una función opcional que se utiliza para personalizar el ordenamiento.
- `reverse` (opcional): Un booleano que indica si se debe ordenar en orden descendente.

La función `sorted()` no modifica el iterable original; en su lugar, devuelve una nueva lista ordenada.

Ejemplo:

```python
# Ordenando una lista de números
numeros = [3, 1, 4, 1, 5, 9, 2, 6, 5]
numeros_ordenados = sorted(numeros)
print(numeros_ordenados)
# Salida: [1, 1, 2, 3, 4, 5, 5, 6, 9]

# Ordenando una lista de cadenas
palabras = ['manzana', 'banana', 'cereza', 'dátil']
palabras_ordenadas = sorted(palabras)
print(palabras_ordenadas)
# Salida: ['banana', 'cereza', 'dátil', 'manzana']
```

### `bin()`

La función `bin()` se utiliza para convertir un número entero en una cadena binaria prefijada con "0b".

#### Sintaxis:
```python
bin(numero)
```

- `numero`: El número entero que se desea convertir a binario.

La función `bin()` devuelve una cadena que representa la forma binaria del número entero dado.

Ejemplo:

```python
# Convertir el número entero 10 a binario
binario = bin(10)
print(binario)
# Salida: '0b1010'

# Convertir el número entero 42 a binario
binario = bin(42)
print(binario)
# Salida: '0b101010'
```

### `enumerate()`

La función `enumerate()` se utiliza para agregar un contador a un iterable y devolverlo como un objeto enumerado.

#### Sintaxis:
```python
enumerate(iterable, start=0)
```

- `iterable`: El iterable que se desea enumerar.
- `start` (opcional): El número desde el cual comenzar la enumeración. Por defecto es 0.

La función `enumerate()` devuelve un objeto enumerado que genera tuplas de la forma `(indice, valor)` para cada elemento del iterable.

Ejemplo:

```python
# Enumerar una lista
frutas = ['manzana', 'banana', 'cereza']
enumeracion = enumerate(frutas)
print(list(enumeracion))
# Salida: [(0, 'manzana'), (1, 'banana'), (2, 'cereza')]

# Enumerar una lista comenzando desde 1
colores = ['rojo', 'verde', 'azul']
enumeracion = enumerate(colores, start=1)
print(list(enumeracion))
# Salida: [(1, 'rojo'), (2, 'verde'), (3, 'azul')]
```

### `input()`

La función `input()` se utiliza para obtener datos de entrada del usuario a través de la consola.

#### Sintaxis:
```python
input(prompt='')
```

- `prompt` (opcional): Es un mensaje opcional que se muestra al usuario para solicitar la entrada.

La función `input()` espera a que el usuario ingrese datos seguidos de un retorno de carro (Enter). Luego, devuelve una cadena con los datos ingresados por el usuario.

Ejemplo:

```python
nombre = input("Por favor, introduce tu nombre: ")
print("¡Hola,", nombre, "! Bienvenido.")
```

### `oct()`

La función `oct()` se utiliza para convertir un número entero en su representación octal (base 8) como una cadena.

#### Sintaxis:
```python
oct(numero)
```

- `numero`: El número entero que se desea convertir a octal.

La función `oct()` devuelve una cadena que representa el número entero en su forma octal.

Ejemplo:

```python
numero_entero = 10
numero_octal = oct(numero_entero)
print("La representación octal de", numero_entero, "es:", numero_octal)
```

Este ejemplo imprimirá: `La representación octal de 10 es: 0o12`.

### `bool()`

La función `bool()` se utiliza para convertir un valor a un tipo booleano.

#### Sintaxis:
```python
bool(valor)
```

- `valor`: El valor que se desea convertir a booleano.

La función `bool()` devuelve `True` si el valor es verdadero, y `False` si el valor es falso.

Ejemplo:

```python
valor1 = 10
valor2 = 0
valor3 = "Hola"
valor4 = ""

print(bool(valor1))  # Salida: True
print(bool(valor2))  # Salida: False
print(bool(valor3))  # Salida: True
print(bool(valor4))  # Salida: False
```

### `eval()`

La función `eval()` se utiliza para evaluar una expresión o una cadena de código como si fuera código Python.

#### Sintaxis:
```python
eval(expresion, globals=None, locals=None)
```

- `expresion`: La expresión o cadena de código a evaluar.
- `globals` (Opcional): Un diccionario que representa el espacio de nombres global. Por defecto, se utiliza el espacio de nombres global actual.
- `locals` (Opcional): Un diccionario que representa el espacio de nombres local. Por defecto, se utiliza el espacio de nombres local actual.

La función `eval()` devuelve el resultado de la expresión evaluada.

Ejemplo:

```python
x = 10
y = 20
expresion = 'x + y'
resultado = eval(expresion)
print(resultado)  # Salida: 30
```

### `int()`

La función `int()` se utiliza para convertir un valor en un entero.

#### Sintaxis:
```python
int(x, base=10)
```

- `x`: El valor que se desea convertir a entero.
- `base` (Opcional): La base en la que se encuentra el número. Por defecto, es 10.

La función `int()` devuelve el valor convertido a entero.

Ejemplos:

```python
# Convertir una cadena a un entero
cadena = "123"
entero = int(cadena)
print(entero)  # Salida: 123

# Convertir un número hexadecimal a un entero
hexadecimal = "0x10"
entero_hex = int(hexadecimal, 16)
print(entero_hex)  # Salida: 16
```

### `open()`

La función `open()` se utiliza para abrir un archivo en Python.

#### Sintaxis:
```python
open(nombre_archivo, modo, encoding=None)
```

- `nombre_archivo`: El nombre del archivo que se desea abrir.
- `modo`: El modo en el que se abrirá el archivo (lectura, escritura, etc.).
- `encoding` (Opcional): La codificación de caracteres a utilizar.

La función `open()` devuelve un objeto de archivo que se puede utilizar para realizar operaciones de lectura, escritura o ambas, dependiendo del modo especificado.

Ejemplos:

```python
# Abrir un archivo en modo lectura
with open('archivo.txt', 'r') as f:
    contenido = f.read()
    print(contenido)

# Abrir un archivo en modo escritura
with open('nuevo_archivo.txt', 'w') as f:
    f.write('Este es un nuevo archivo.')
```

### `str()`

La función `str()` se utiliza para convertir un objeto en su representación de cadena.

#### Sintaxis:
```python
str(objeto)
```

- `objeto`: El objeto que se desea convertir a una cadena.

La función `str()` devuelve una representación de cadena del objeto especificado. Si el objeto ya es una cadena, devuelve el mismo objeto sin cambios.

Ejemplo:

```python
numero = 42
cadena = str(numero)
print(cadena)  # Output: '42'
```

### `breakpoint()`

La función `breakpoint()` se utiliza para insertar un punto de interrupción en el código para depurar.

#### Sintaxis:
```python
breakpoint(*args, **kws)
```

- `*args` y `**kws`: Argumentos opcionales que se pueden pasar al depurador.

Cuando se llama a `breakpoint()`, el programa se detiene y entra en el modo de depuración interactivo. Esto permite inspeccionar el estado del programa, evaluar expresiones y ejecutar comandos de depuración.

Ejemplo:

```python
def funcion():
    x = 10
    y = 20
    breakpoint()
    z = x + y
    print(z)

funcion()
```

### `exec()`

La función `exec()` se utiliza para ejecutar dinámicamente código Python almacenado en una cadena o archivo.

#### Sintaxis:
```python
exec(codigo, globals=None, locals=None)
```

- `codigo`: La cadena de texto que contiene el código Python a ejecutar.
- `globals` (opcional): Un diccionario que especifica el espacio de nombres global en el que se ejecutará el código.
- `locals` (opcional): Un diccionario que especifica el espacio de nombres local en el que se ejecutará el código.

La función `exec()` ejecuta el código Python especificado en la cadena `codigo`. Puede afectar al entorno de nombres globales y locales, dependiendo de los argumentos proporcionados.

Ejemplo:

```python
codigo = '''
x = 10
y = 20
print(x + y)
```

### `isinstance()`

La función `isinstance()` se utiliza para comprobar si un objeto dado es una instancia de una clase o de una clase derivada de ella.

#### Sintaxis:
```python
isinstance(objeto, clase)
```

- `objeto`: El objeto que se va a comprobar.
- `clase`: La clase o tipo de datos con la que se va a comprobar la instancia.

La función `isinstance()` devuelve `True` si el objeto es una instancia de la clase especificada o de una subclase de ella, y `False` en caso contrario.

Ejemplo:

```python
x = 5
resultado = isinstance(x, int)
print(resultado)  # Devuelve True
```

### `ord()`

La función `ord()` se utiliza para obtener el valor entero Unicode de un carácter.

#### Sintaxis:
```python
ord(caracter)
```

- `caracter`: El carácter del cual se desea obtener el valor entero Unicode.

La función `ord()` devuelve el valor entero Unicode correspondiente al carácter especificado.

Ejemplo:

```python
valor_unicode = ord('A')
print(valor_unicode)  # Devuelve 65
```

### `sum()`

La función `sum()` se utiliza para sumar los elementos de un iterable, como una lista, tupla o conjunto.

#### Sintaxis:
```python
sum(iterable, start=0)
```

- `iterable`: El iterable cuyos elementos se sumarán.
- `start` (opcional): El valor inicial de la suma.

La función `sum()` devuelve la suma de los elementos en el iterable, más el valor inicial especificado (si se proporciona).

Ejemplo:

```python
lista = [1, 2, 3, 4, 5]
resultado = sum(lista)
print(resultado)  # Devuelve 15
```

### `bytearray()`

La función `bytearray()` devuelve un nuevo objeto de matriz de bytes que contiene una secuencia de bytes modificables.

#### Sintaxis:
```python
bytearray(source, encoding, errors)
```

- `source` (opcional): Una secuencia de bytes o un objeto que pueda convertirse en una secuencia de bytes.
- `encoding` (opcional): La codificación utilizada para decodificar la secuencia de bytes.
- `errors` (opcional): La política a seguir cuando ocurran errores durante la decodificación.

La función `bytearray()` crea y devuelve una nueva matriz de bytes basada en la secuencia de bytes proporcionada. Si no se proporciona una secuencia de bytes, se crea una matriz de bytes vacía.

Ejemplo:

```python
datos = b'Hola mundo'
byte_array = bytearray(datos)
print(byte_array)  # Devuelve bytearray(b'Hola mundo')
```

### `filter()`

La función `filter()` se utiliza para filtrar elementos de una secuencia utilizando una función de filtrado.

#### Sintaxis:
```python
filter(func, iterable)
```

- `func`: La función de filtrado que se aplicará a cada elemento del iterable.
- `iterable`: El iterable del que se filtrarán los elementos.

La función `filter()` devuelve un iterador que produce los elementos del iterable para los que la función `func` devuelve `True`.

Ejemplo:

```python
def es_par(numero):
    return numero % 2 == 0

numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
pares = list(filter(es_par, numeros))
print(pares)  # Devuelve [2, 4, 6, 8, 10]
```

### `issubclass()`

La función `issubclass()` se utiliza para determinar si una clase es subclase de otra.

#### Sintaxis:
```python
issubclass(clase, clase_base)
```

- `clase`: La clase que se va a comprobar si es subclase.
- `clase_base`: La clase base con la que se va a comparar.

La función `issubclass()` devuelve `True` si `clase` es una subclase de `clase_base`, o si `clase` es igual a `clase_base`.

Ejemplo:

```python
class Vehiculo:
    pass

class Coche(Vehiculo):
    pass

resultado = issubclass(Coche, Vehiculo)
print(resultado)  # Devuelve True
```

### `pow()`

La función `pow()` se utiliza para calcular una potencia.

#### Sintaxis:
```python
pow(base, exponente, modulo=None)
```

- `base`: El número base.
- `exponente`: El exponente al que elevar la base.
- `modulo` (opcional): Un valor opcional que especifica el módulo en el que realizar el cálculo.

La función `pow()` devuelve `base` elevado a la potencia `exponente`, opcionalmente calculada en el módulo especificado.

Ejemplo:

```python
resultado = pow(2, 3)
print(resultado)  # Devuelve 8
```

### `super()`

La función `super()` devuelve un objeto proxy que delega llamadas a métodos de una clase padre o hermana.

#### Sintaxis:
```python
super([tipo[, objeto]])
```

- `tipo` (opcional): La clase cuyos métodos se buscarán en la cadena de herencia.
- `objeto` (opcional): Un objeto sobre el que se invocará el método.

La función `super()` se utiliza comúnmente en clases derivadas para invocar métodos de la clase base.

Ejemplo:

```python
class Padre:
    def metodo(self):
        print("Método de la clase padre")

class Hijo(Padre):
    def metodo(self):
        super().metodo()

hijo = Hijo()
hijo.metodo()  # Devuelve "Método de la clase padre"
```

### `bytes()`

La función `bytes()` devuelve un nuevo objeto de bytes que es una secuencia inmutable de bytes.

#### Sintaxis:
```python
bytes([fuente[, codificación[, errores]]])
```

- `fuente` (opcional): Un iterable que contiene los valores iniciales para el objeto de bytes.
- `codificación` (opcional): La codificación utilizada para decodificar los elementos en bytes.
- `errores` (opcional): La política a seguir cuando ocurran errores durante la decodificación.

La función `bytes()` crea y devuelve un nuevo objeto de bytes basado en la fuente y la codificación proporcionadas.

Ejemplo:

```python
datos = [65, 66, 67, 68, 69]
bytes_obj = bytes(datos)
print(bytes_obj)  # Devuelve b'ABCDE'
```

### `float()`

La función `float()` se utiliza para convertir un número o una cadena en un número flotante.

#### Sintaxis:
```python
float([x])
```

- `x` (opcional): El número o cadena que se va a convertir en un número flotante.

La función `float()` devuelve un número flotante construido a partir del argumento `x`.

Ejemplo:

```python
numero = float("3.14")
print(numero)  # Devuelve 3.14
```

### `iter()`

La función `iter()` devuelve un iterador para un objeto iterable.

#### Sintaxis:
```python
iter(obj[, sentinel])
```

- `obj`: El objeto iterable del que se va a crear un iterador.
- `sentinel` (opcional): Un valor que actúa como una señal para detener la iteración.

La función `iter()` devuelve un iterador para el objeto `obj`. Si se proporciona `sentinel`, `iter()` creará un iterador que produce valores del objeto `obj` hasta que el valor `sentinel` sea encontrado.

Ejemplo:

```python
lista = [1, 2, 3, 4, 5]
iterador = iter(lista)
print(next(iterador))  # Devuelve 1
```

### `print()`

La función `print()` se utiliza para mostrar texto en la consola o terminal.

#### Sintaxis:
```python
print(valor1, valor2, ..., sep=' ', end='\n', file=sys.stdout, flush=False)
```

La función `print()` muestra el texto o los valores proporcionados como argumentos en la salida estándar.

Ejemplo:

```python
print("Hola mundo")  # Muestra "Hola mundo" en la consola
```

### `tuple()`

La función `tuple()` se utiliza para crear una tupla, que es una secuencia inmutable de objetos.

#### Sintaxis:
```python
tuple(iterable)
```

- `iterable`: El objeto iterable del que se crearán los elementos de la tupla.

La función `tuple()` devuelve una nueva tupla cuyos elementos son tomados del objeto iterable proporcionado.

Ejemplo:

```python
lista = [1, 2, 3, 4, 5]
tupla = tuple(lista)
print(tupla)  # Devuelve (1, 2, 3, 4, 5)
```

### `callable()`

La función `callable()` se utiliza para determinar si un objeto es "llamable", es decir, si se puede llamar como una función.

#### Sintaxis:
```python
callable(objeto)
```

- `objeto`: El objeto que se va a comprobar si es llamable.

La función `callable()` devuelve `True` si el objeto es "llamable" (es decir, si se puede llamar como una función), de lo contrario devuelve `False`.

Ejemplo:

```python
def mi_funcion():
    return "Hola mundo"

print(callable(mi_funcion))  # Devuelve True
```

### `format()`

La función `format()` se utiliza para formatear un valor utilizando un especificador de formato.

#### Sintaxis:
```python
format(valor, formato_spec)
```

- `valor`: El valor que se va a formatear.
- `formato_spec`: La cadena de formato que especifica cómo se va a formatear el valor.

La función `format()` devuelve una cadena que representa el valor formateado de acuerdo con la especificación de formato proporcionada.

Ejemplo:

```python
precio = 50
texto = "El precio es: {} euros"
print(format(precio, texto))  # Devuelve "El precio es: 50 euros"
```

### `len()`

La función `len()` se utiliza para obtener la longitud (número de elementos) de un objeto.

#### Sintaxis:
```python
len(objeto)
```

- `objeto`: El objeto del que se va a obtener la longitud.

La función `len()` devuelve la longitud del objeto proporcionado. El objeto puede ser una secuencia (como una lista o una cadena) o una colección (como un diccionario o un conjunto).

Ejemplo:

```python
cadena = "Python"
print(len(cadena))  # Devuelve 6
```

### `property()`

La función `property()` se utiliza para crear una propiedad de un objeto.

#### Sintaxis:
```python
property(fget=None, fset=None, fdel=None, doc=None)
```

- `fget` (opcional): La función de obtención que se utilizará para obtener el valor de la propiedad.
- `fset` (opcional): La función de configuración que se utilizará para establecer el valor de la propiedad.
- `fdel` (opcional): La función de eliminación que se utilizará para eliminar la propiedad.
- `doc` (opcional): La cadena de documentación que se utilizará para describir la propiedad.

La función `property()` devuelve un objeto de propiedad que se puede asignar a un atributo de una clase.

Ejemplo:

```python
class MiClase:
    def __init__(self):
        self._valor = None
    
    def obtener_valor(self):
        return self._valor
    
    def establecer_valor(self, valor):
        self._valor = valor
    
    mi_propiedad = property(obtener_valor, establecer_valor)

objeto = MiClase()
objeto.mi_propiedad = 10
print(objeto.mi_propiedad)  # Devuelve 10
```

### `chr()`

La función `chr()` se utiliza para devolver el carácter Unicode representado por el entero especificado.

#### Sintaxis:
```python
chr(entero)
```

- `entero`: Un entero que representa el valor Unicode del carácter.

La función `chr()` devuelve el carácter Unicode representado por el entero especificado.

Ejemplo:

```python
print(chr(65))  # Devuelve 'A'
```

### `frozenset()`

La función `frozenset()` se utiliza para crear un conjunto inmutable (frozenset) a partir de una secuencia iterable.

#### Sintaxis:
```python
frozenset(secuencia)
```

- `secuencia`: La secuencia iterable (por ejemplo, una lista o una tupla) de la que se creará el conjunto inmutable.

La función `frozenset()` devuelve un conjunto inmutable (frozenset) que contiene los elementos únicos de la secuencia iterable proporcionada.

Ejemplo:

```python
conjunto = frozenset([1, 2, 3, 4])
print(conjunto)  # Devuelve frozenset({1, 2, 3, 4})
```

### `list()`

La función `list()` se utiliza para crear una lista a partir de una secuencia iterable.

#### Sintaxis:
```python
list(secuencia)
```

- `secuencia`: La secuencia iterable (por ejemplo, una tupla o un rango) de la que se creará la lista.

La función `list()` devuelve una lista que contiene los elementos de la secuencia iterable proporcionada.

Ejemplo:

```python
tupla = (1, 2, 3, 4)
lista = list(tupla)
print(lista)  # Devuelve [1, 2, 3, 4]
```

### `range()`

La función `range()` se utiliza para generar una secuencia de números enteros en un rango especificado.

#### Sintaxis:
```python
range([inicio], fin[, paso])
```

- `inicio` (opcional): El valor inicial del rango (por defecto es 0).
- `fin`: El valor final del rango (no se incluye en la secuencia).
- `paso` (opcional): El tamaño del paso entre los números del rango (por defecto es 1).

La función `range()` devuelve un objeto de rango que representa la secuencia de números enteros en el rango especificado.

Ejemplo:

```python
rango = range(1, 10, 2)
print(list(rango))  # Devuelve [1, 3, 5, 7, 9]
```

### `vars()`

La función `vars()` se utiliza para devolver el diccionario de variables locales o el diccionario de atributos de un objeto.

#### Sintaxis:
```python
vars([objeto])
```

- `objeto` (opcional): El objeto del que se devolverán los atributos (por defecto es el espacio de nombres local actual).

La función `vars()` devuelve el diccionario de variables locales si no se proporciona ningún objeto, o devuelve el diccionario de atributos del objeto especificado.

Ejemplo:

```python
def mi_funcion():
    x = 10
    print(vars())

mi_funcion()  # Devuelve {'x': 10}
```

### `classmethod()`

La función `classmethod()` se utiliza para definir un método de clase en Python. Un método de clase recibe la clase como primer argumento en lugar de la instancia.

#### Sintaxis:
```python
classmethod(funcion)
```

- `funcion`: La función que se convertirá en un método de clase.

La función `classmethod()` devuelve un objeto descriptor que envuelve la función dada y la convierte en un método de clase.

Ejemplo:

```python
class MiClase:
    @classmethod
    def mi_metodo(cls):
        print("Este es un método de clase")

MiClase.mi_metodo()  # Imprime "Este es un método de clase"
```

### `getattr()`

La función `getattr()` se utiliza para obtener el valor de un atributo de un objeto dado.

#### Sintaxis:
```python
getattr(objeto, nombre[, valor_por_defecto])
```

- `objeto`: El objeto del que se va a obtener el atributo.
- `nombre`: El nombre del atributo que se desea obtener.
- `valor_por_defecto` (opcional): El valor que se devolverá si el atributo no está presente en el objeto (por defecto es `None`).

La función `getattr()` devuelve el valor del atributo especificado del objeto dado.

Ejemplo:

```python
class MiClase:
    atributo = 10

objeto = MiClase()
print(getattr(objeto, 'atributo'))  # Devuelve 10
```

### `locals()`

La función `locals()` se utiliza para obtener el diccionario de variables locales en el ámbito actual.

#### Sintaxis:
```python
locals()
```

La función `locals()` devuelve un diccionario que contiene las variables locales y sus valores en el ámbito actual.

Ejemplo:

```python
def mi_funcion():
    x = 10
    print(locals())

mi_funcion()  # Devuelve {'x': 10}
```

### `repr()`

La función `repr()` se utiliza para obtener una representación de cadena válida de un objeto.

#### Sintaxis:
```python
repr(objeto)
```

- `objeto`: El objeto del que se desea obtener la representación de cadena.

La función `repr()` devuelve una representación de cadena válida que se puede evaluar para obtener una versión del objeto.

Ejemplo:

```python
cadena = 'Hola'
print(repr(cadena))  # Devuelve "'Hola'"
```

### `zip()`

La función `zip()` se utiliza para combinar iterables en tuplas de elementos correspondientes.

#### Sintaxis:
```python
zip(*iterables)
```

- `iterables`: Los iterables que se van a combinar.

La función `zip()` devuelve un iterador de tuplas, donde la i-ésima tupla contiene el i-ésimo elemento de cada uno de los iterables.

Ejemplo:

```python
lista1 = [1, 2, 3]
lista2 = ['a', 'b', 'c']
resultado = zip(lista1, lista2)
print(list(resultado))  # Devuelve [(1, 'a'), (2, 'b'), (3, 'c')]
```

### `compile()`

La función `compile()` se utiliza para compilar código fuente Python en código byte o en un objeto de código.

#### Sintaxis:
```python
compile(source, filename, mode, flags=0, dont_inherit=False, optimize=-1)
```

- `source`: El código fuente que se va a compilar, puede ser una cadena, un objeto de archivo o un AST (Abstract Syntax Tree).
- `filename`: El nombre del archivo desde el que se ha leído el código fuente.
- `mode`: Especifica el modo de compilación. Puede ser 'exec' si se trata de una secuencia de instrucciones, 'eval' si es una única expresión, o 'single' si es una única instrucción.
- `flags` (opcional): Opciones adicionales de compilación.
- `dont_inherit` (opcional): Si es `True`, no hereda los indicadores de optimización de los bloques de código compilados anteriormente.
- `optimize` (opcional): Nivel de optimización.

La función `compile()` devuelve un objeto de código que puede ser ejecutado por las funciones `exec()` o `eval()`.

### `globals()`

La función `globals()` se utiliza para devolver el diccionario global actual.

#### Sintaxis:
```python
globals()
```

La función `globals()` devuelve un diccionario que representa el ámbito global actual.

### `map()`

La función `map()` se utiliza para aplicar una función a todos los elementos de un iterable dado.

#### Sintaxis:
```python
map(funcion, iterable1, iterable2, ...)
```

- `funcion`: La función que se va a aplicar a cada elemento del iterable.
- `iterable1`, `iterable2`, ...: Los iterables sobre los que se aplicará la función.

La función `map()` devuelve un objeto generador que produce los resultados de aplicar la función a cada elemento del iterable.

### `reversed()`

La función `reversed()` se utiliza para devolver un iterador que recorre el iterable en orden inverso.

#### Sintaxis:
```python
reversed(iterable)
```

- `iterable`: El iterable que se va a recorrer en orden inverso.

La función `reversed()` devuelve un iterador que produce los elementos del iterable en orden inverso.

### `__import__()`

La función `__import__()` se utiliza para importar módulos de forma dinámica en Python.

#### Sintaxis:
```python
__import__(name, globals=None, locals=None, fromlist=(), level=0)
```

- `name`: El nombre del módulo que se desea importar.
- `globals` (opcional): El diccionario global en el que se importará el módulo.
- `locals` (opcional): El diccionario local en el que se importará el módulo.
- `fromlist` (opcional): La lista de nombres de los objetos que se importarán desde el módulo.
- `level` (opcional): El nivel en el que se importará el módulo.

La función `__import__()` devuelve el módulo importado.

### `complex()`

La función `complex()` se utiliza para crear un número complejo a partir de partes real e imaginaria.

#### Sintaxis:
```python
complex(real=0, imag=0)
```

- `real`: La parte real del número complejo (por defecto es 0).
- `imag`: La parte imaginaria del número complejo (por defecto es 0).

La función `complex()` devuelve un número complejo creado a partir de las partes real e imaginaria especificadas.

### `hasattr()`

La función `hasattr()` se utiliza para determinar si un objeto tiene un atributo con un nombre dado.

#### Sintaxis:
```python
hasattr(objeto, nombre)
```

- `objeto`: El objeto del que se va a comprobar la existencia del atributo.
- `nombre`: El nombre del atributo que se va a comprobar.

La función `hasattr()` devuelve `True` si el objeto tiene un atributo con el nombre especificado, de lo contrario devuelve `False`.

### `max()`

La función `max()` se utiliza para obtener el valor máximo de un iterable o de una secuencia de argumentos.

#### Sintaxis:
```python
max(iterable, *args, key=None, default=None)
```

- `iterable`: El iterable del que se va a obtener el valor máximo.
- `*args`: Argumentos adicionales, pueden ser números o iterables.
- `key` (opcional): Una función que se aplicará a cada elemento antes de compararlos.
- `default` (opcional): El valor que se devolverá si el iterable está vacío.

La función `max()` devuelve el valor máximo del iterable o de los argumentos dados.

### `round()`

La función `round()` se utiliza para redondear un número al número entero más cercano.

#### Sintaxis:
```python
round(numero, ndigits=None)
```

- `numero`: El número que se va a redondear.
- `ndigits` (opcional): El número de dígitos decimales a los que se va a redondear (por defecto es 0).

La función `round()` devuelve el número redondeado al número entero más cercano. Si se proporciona `ndigits`, el número se redondea al número de dígitos decimales especificado.

