# Agradecimiento 🙏📚

Gran parte de la información proporcionada en este documento ha sido extraída del libro en PDF creado por Sergio Delgado Quintero, ex profesor en la Escuela de Organización Industrial (EOI) en el curso de Python en el año 2019. Puedes encontrar más recursos y detalles en [aprendepython.es](https://aprendepython.es/). 🚀

# Gestión de Paquetes con PIP

## Instalación de PIP

PIP (Python Package Installer) es una herramienta que facilita la instalación y gestión de paquetes en Python. A continuación se muestra cómo instalarlo:

```bash
curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py
python get-pip.py
```

Para verificar que PIP se ha instalado correctamente y está disponible como variable de entorno, ejecuta el siguiente comando:

```bash
pip --version
```

## Instalación de un Paquete con PIP

Una vez que PIP está instalado, puedes instalar fácilmente paquetes de Python utilizando el siguiente comando:

```bash
pip install nombre_del_paquete
```

# Creación de Entorno Virtual de Trabajo

Los entornos virtuales permiten aislar las dependencias de tus proyectos Python. A continuación se muestran los pasos para crear y activar un entorno virtual:

## Windows

```bash
cd myproject
python3 -m venv --prompt myproject .venv
.venv\Scripts\activate
```

## Linux

```bash
cd myproject
python -m venv --prompt myproject .venv
source .venv/bin/activate
```

Para salir del entorno virtual, simplemente ejecuta:

```bash
deactivate
```

# Gestión de Entornos Virtuales con pyenv

pyenv es una herramienta que facilita cambiar entre múltiples versiones de Python en un mismo sistema. Aquí se explica cómo instalarlo en Windows:

## Instalación de pyenv en Windows usando PowerShell

Primero, abre la consola de PowerShell en modo administrador y ejecuta los siguientes comandos:

```powershell
Set-ExecutionPolicy Unrestricted
Invoke-WebRequest -UseBasicParsing -Uri "https://raw.githubusercontent.com/pyenv-win/pyenv-win/master/pyenv-win/install-pyenv-win.ps1" -OutFile "./install-pyenv-win.ps1"
./install-pyenv-win.ps1
```

Para verificar que pyenv se ha instalado correctamente y está disponible como variable de entorno, ejecuta:

```bash
pyenv --version
```

# Tipos de Datos en Python

Python es un lenguaje de programación dinámico que admite varios tipos de datos. A continuación se muestra una tabla con los tipos de datos más comunes en Python:

| Nombre    | Tipo      | Ejemplos                  |
|-----------|-----------|---------------------------|
| Booleano  | bool      | True, False               |
| Entero    | int       | 21, 34500, 34_500         |
| Flotante  | float     | 3.14, 1.5e3               |
| Complejo  | complex   | 2j, 3 + 5j                |
| Cadena    | str       | "tfn", "tenerife - islas canarias" |
| Tupla     | tuple     | (1, 3, 5)                 |
| Lista     | list      | ["Chrome", "Firefox"]     |
| Conjunto  | set       | {2, 4, 6}                 |
| Diccionario | dict    | {"Chrome": "v79", "Firefox": "v71"} |

# Variables y Constantes

Las variables en Python son contenedores para almacenar valores de datos. Por otro lado, las constantes son valores que no cambian. Aquí se muestra cómo definirlas:

```python
# Variables
nombre_de_variable = valor

# Constantes
MI_CONSTANTE = CONSTANTE
```

# Asignación Múltiple

Python permite asignar un mismo valor a varias variables al mismo tiempo. Por ejemplo:

```python
tres = three = drei = 3
```

# Funciones Integradas
[Funciones integradas en Python](./python_built_in.md)

# Mutabilidad
Las variables son nombres, no lugares. Cuando asignamos un valor a una variable el nombre de la variable apunta a una zona en memoria donde está guardado ese valor.
```
a = 5_5_5 #Python ignora _ (555)
b = a
```

Si utilizamos id(a) id(b) verás que ambas variables apuntan al mismo sitio en memoria.

Cuando volvemos a asignar valor cambia la zona de memoria donde apuntamos. Cuando esta zona de memoria no de puede modificar es cuando hablamos de inmutabilidad.

# Asignación aumentada
```
number = 0
number //= 5
number += 
number *= 3
number//=4
number**=1
```

# Módulo
En Python, el operador "%" se utiliza para obtener el resto de una división entre números.
Consejo: Si se calcula el módulo de cualquier número con respecto al tamaño de una lista, el resultado estará siempre entre 0 y el tamaño total de la lista.

# Strings
En Python los strings pueden ser recorrido representando cada valor una posición que puede ser accedida con un índice positivo y también negativo.

```
my_string = "My String"
print(my_string[3])
print(my_string[-6]) # En negativo comienza en -1 ya que 0 es positivo.
```

Ambos imprimirán "S"

```[start:end:step]``` Permite extraer elementos de una secuencia, como una lista o una cadena en Python. Indica que se extraerán elementos desde el índice start hasta el índice end - 1, dando saltos de tamaño step.

[Algúnos métodos de strings](./python3_string_methods.md)

# Condicionales

Ejemplos de uso:

```python
cold = True
value = None

if not cold:
    print('Hace frio')
else: 
     print('No hace frio')

if vacio is None:
    print('Is None')
else: 
     print('Is not None')

# También podemos hacer uso de elseif en python no existe los switch-case existen los match-case 

point(2, 5)
match point:
    case (x, y):
        print(f'({x},{y}) is in plane')
    case (x, y, z):
        print(f'({x},{y},{z}) is in space')

match point:
    case (int(), int()):
        print(f'{point} is in plane')
    case (int(), int(), int()):
        print(f'{point} is in space')
    case _:
        print('Unknown!')    

match point:
    case (int(x), int(y)):
        print(f'({x},{y}) is in plane')
    case (int(x), int(y), int(z)):
        print(f'({x},{y},{z}) is in space')
    case _:
        print('Unknown!')  

match age:
    case 0 | None:
        print('Waaath!')
```

Se puede hacer uso de operadores lógicos:
```python
x > 10 or x < 0 and y < 10 
not(x == 0)
```

# Operador Morsa
``` python
# Sin el operador morsa
numero = 5
cuadrado = numero ** 2

# Con el operador morsa
cuadrado := 5 ** 2 # asigna valores a variables como parte de una expresión y, al mismo tiempo, evalua esa expresión
```

``` python
while 0 <= (mark := float(input( Introduzca una nueva nota: ))) <= 10:
    print(mark) 

print('Nota fuera de rango')