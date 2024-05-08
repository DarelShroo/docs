## Listas en Python 📚💻

Las listas en python pueden tener diferentes tipos de datos incluso otra lista. Se representan de la siguiente manera:

```python
my_list = [1,'a', [1,2,3], {"numbers": [1,2,3,4]}]
```

### `list()`
```python
list('Python') # [ P , y , t , h , o , n ]
list(range(10)) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

### Operaciones con listas
#### Acceder a un índice y modificarlo

```python
shopping = ['Agua' , 'Huevos' , 'Aceite', 'Manzana']
shopping[0] # Agua
shopping[0] = 'Café' # ['Café', 'Huevos' , 'Aceite', 'Manzana'] 

shopping[1:3] = ['Café', 'Platano'] # ['Agua', 'Café', 'Platano']
```

###  Trocear y revertir una lista `reverse()` `reversed()`

```python
numbers = [0,1,2,3] 

numbers[2:3] # [2,3]
numbers[::-1] # [3,2,1,0]
list(reversed(numbers)) # [3,2,1,0]
numbers.reverse() # [3,2,1,0]
```

### Añadir elementos a una lista `insert()` `apend()`

```python
numbers = [1,2,3]
name_numbers = ['cero', 'uno']

name_numbers + numbers # ['cero','uno',1,2,3] -> la lista no se modifica se puede usar también +=

numbers.extend(name_number) # [1,2,3,'cero','uno']
```

#### Repetir elementos
```python
numbers = [0,1,2,3]

numbers * 2 # [0,1,2,3,0,1,2,3]
```

### Combinar listas `extend()`

```python
numbers = [1,2,3]
name_numbers = ['cero', 'uno']

name_numbers + numbers # ['cero','uno',1,2,3] -> la lista no se modifica se puede usar también +=

numbers.extend(name_number) # [1,2,3,'cero','uno']
```

### Borrar y extraer elementos `pop()` `clear()`

```python
shopping = ['Agua' , 'Huevos' , 'Aceite' , 'Sal' , 'Limón']
shopping.pop(0) # La lista se queda a si: ['Huevos' , 'Aceite' , 'Sal' , 'Limón'] y además pop devuelve el elemento borrado (Extrae el elemento).
shopping.clear() # []
``` 

### Búscar un elemento `ìndex()`
```python
shopping = ['Agua' , 'Huevos' , 'Aceite' , 'Sal' , 'Limón',  'Agua']
shopping.index('Agua') # 0 Si hubiera mas adelante 'Agua' otra vez nos devolvería 0. Solo devuelve el índice de la primera posición encontrada.

# Ejemplo de recursividad aplicado a la búsqueda de elementos.
def foundIndexes(elements):
    tempList = elements[:] 
    try:
        indexFound = tempList.index('Agua')
    except ValueError:
        return
    tempList.pop(indexFound)
    print(indexFound)
    if indexFound < len(tempList):  
        foundIndexes(tempList)

foundIndexes(shopping)
```

### Pertenencia