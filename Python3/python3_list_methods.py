# Método list()
my_list = [1,'a', [1,2,3], {"numbers": [1,2,3,4]}]
print("Lista creada:", my_list)

# Método list() con string
string_list = list('Python')
print("Método list() con string:", string_list)  # Resultado: ['P', 'y', 't', 'h', 'o', 'n']

# Método list() con range()
range_list = list(range(10))
print("Método list() con range:", range_list)  # Resultado: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

# Acceder a un índice y modificarlo
shopping = ['Agua', 'Huevos', 'Aceite', 'Manzana']
print("Acceder a un índice:", shopping[0])  # Resultado: Agua
shopping[0] = 'Café'
print("Modificar un índice:", shopping)  # Resultado: ['Café', 'Huevos', 'Aceite', 'Manzana']

# Trocear una lista y revertirla
numbers = [0, 1, 2, 3]
print("Trocear una lista:", numbers[2:3])  # Resultado: [2]
print("Revertir una lista:", numbers[::-1])  # Resultado: [3, 2, 1, 0]

# Añadir elementos a una lista
numbers = [0, 1, 2, 3]
numbers.append(4)
print("Añadir elemento al final:", numbers)  # Resultado: [0, 1, 2, 3, 4]
numbers.insert(0, 'cero')
print("Insertar elemento en un índice:", numbers)  # Resultado: ['cero', 0, 1, 2, 3, 4]

# Repetir elementos
numbers = [0, 1, 2, 3]
print("Repetir elementos:", numbers * 2)  # Resultado: [0, 1, 2, 3, 0, 1, 2, 3]

# Combinar listas
numbers = [1, 2, 3]
name_numbers = ['cero', 'uno']
combined_list = name_numbers + numbers
print("Combinar listas:", combined_list)  # Resultado: ['cero', 'uno', 1, 2, 3]

# Borrar y extraer elementos
shopping = ['Agua', 'Huevos', 'Aceite', 'Sal', 'Limón']
popped_item = shopping.pop(0)
print("Borrar y extraer elemento:", popped_item)  # Resultado: Agua
shopping.clear()
print("Borrar todos los elementos:", shopping)  # Resultado: []

# Buscar un elemento
shopping = ['Agua', 'Huevos', 'Aceite', 'Sal', 'Limón', 'Agua']

def foundIndexes(elements):
    tempList = elements[:]  # Crear una copia de la lista original
    try:
        indexFound = tempList.index('Agua')
    except ValueError:
        return
    tempList.pop(indexFound)
    print("Encontrado en el índice:", indexFound)
    if indexFound < len(tempList):  # Corregir el nombre de la variable 'index' a 'indexFound'
        foundIndexes(tempList)

foundIndexes(shopping)
