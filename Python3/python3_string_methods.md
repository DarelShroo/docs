## Métodos de Cadenas de Texto en Python 📚💻

### `lower()`

El método lower() convierte una cadena a minúsculas.
```python
cadena = "Hola Mundo"
cadena_min = cadena.lower()  # Resultado: "hola mundo"
```
### `upper()`

El método upper() convierte una cadena a mayúsculas.

```python
cadena = "Hola Mundo"
cadena_mayus = cadena.upper()  # Resultado: "HOLA MUNDO"
```

### `strip()`

El método strip() elimina los espacios en blanco al principio y al final de una cadena.

```python
cadena = "   Hola Mundo   "
cadena_stripped = cadena.strip()  # Resultado: "Hola Mundo"
```

### `rstrip()`

El método rstrip() elimina los espacios en blanco al final de una cadena.

```python

cadena = "   Hola Mundo   "
cadena_stripped = cadena.rstrip()  # Resultado: "   Hola Mundo"
```

### `lstrip()`

El método lstrip() elimina los espacios en blanco al principio de una cadena.

```python

cadena = "   Hola Mundo   "
cadena_stripped = cadena.lstrip()  # Resultado: "Hola Mundo   "
```

### `replace()`

El método replace() reemplaza una subcadena por otra en una cadena.

```python
cadena = "Hola Mundo"
cadena_reemplazada = cadena.replace("Mundo", "Amigo")  # Resultado: "Hola Amigo"
```

### `split()`

El método split() divide una cadena en una lista de subcadenas utilizando un separador.

```python
cadena = "Hola Mundo"
subcadenas = cadena.split()  # Resultado: ['Hola', 'Mundo']
```

### `join()`

El método join() une los elementos de una lista en una cadena utilizando el separador especificado.

```python
palabras = ['Hola', 'Mundo']
cadena_unida = ' '.join(palabras)  # Resultado: "Hola Mundo"
```

### `startswith()`

El método startswith() verifica si una cadena comienza con una subcadena específica.

```python
cadena = "Hola Mundo"
comienza_con_hola = cadena.startswith("Hola")  # Resultado: True
```

### `endswith()`

El método endswith() verifica si una cadena termina con una subcadena específica.

```python
cadena = "Hola Mundo"
termina_con_mundo = cadena.endswith("Mundo")  # Resultado: True
```

### `capitalize()`

El método capitalize() convierte la primera letra de una cadena a mayúscula y el resto de las letras a minúsculas.

```python
cadena = "hola mundo"
cadena_cap = cadena.capitalize()  # Resultado: "Hola mundo"
```

### `title()`

El método title() convierte la primera letra de cada palabra a mayúscula en una cadena.

```python
cadena = "hola mundo"
cadena_title = cadena.title()  # Resultado: "Hola Mundo"
```

### `swapcase()`

El método swapcase() intercambia mayúsculas por minúsculas y viceversa en una cadena.

```python
cadena = "Hola Mundo"
cadena_swap = cadena.swapcase()  # Resultado: "hOLA mUNDO"
```


### `find()`

El método find() busca la primera ocurrencia de un substring dentro de una cadena y devuelve el índice donde comienza esta ocurrencia. Si no encuentra el substring, devuelve -1.

```python
cadena = "¡Hola mundo!"
indice = cadena.find("mundo")  # Resultado: 5
```


### `isalnum()`

Devuelve True si todos los caracteres de la cadena son alfanuméricos (letras o números), False de lo contrario.

```python
cadena = "Hola123"
resultado = cadena.isalnum()  # Resultado: True
```

### `isalpha()`

Devuelve True si todos los caracteres de la cadena son letras, False de lo contrario.

```python
cadena = "Hola"
resultado = cadena.isalpha()  # Resultado: True
```
### `isnumeric()`

Devuelve True si todos los caracteres de la cadena son números, False de lo contrario.

```python
cadena = "123"
resultado = cadena.isnumeric()  # Resultado: True
```
### `isupper()`

Devuelve True si todos los caracteres de la cadena están en mayúsculas, False de lo contrario.

```python
cadena = "HOLA"
resultado = cadena.isupper()  # Resultado: True
```

### `islower()`

Devuelve True si todos los caracteres de la cadena están en minúsculas, False de lo contrario.

```python
cadena = "hola"
resultado = cadena.islower()  # Resultado: True
```

### `istitle()`

Devuelve True si la cadena sigue las reglas de capitalización de un título, False de lo contrario.

```python
cadena = "Hola Mundo"
resultado = cadena.istitle()  # Resultado: True
```

## Unicode

Python es capaz de interpretar cierto caracácteres unicode.
```python
rocket = chr(0x1F680)
print(rocket)  # Resultado: 🚀
```