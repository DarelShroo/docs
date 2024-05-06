## Métodos de Cadenas de Texto en Python 📚💻

### lower()

El método lower() convierte una cadena a minúsculas.
```
cadena = "Hola Mundo"
cadena_min = cadena.lower()  # Resultado: "hola mundo"
```
### upper()

El método upper() convierte una cadena a mayúsculas.

```
cadena = "Hola Mundo"
cadena_mayus = cadena.upper()  # Resultado: "HOLA MUNDO"
```

### strip()

El método strip() elimina los espacios en blanco al principio y al final de una cadena.

```
cadena = "   Hola Mundo   "
cadena_stripped = cadena.strip()  # Resultado: "Hola Mundo"
```

### replace()

El método replace() reemplaza una subcadena por otra en una cadena.

```
cadena = "Hola Mundo"
cadena_reemplazada = cadena.replace("Mundo", "Amigo")  # Resultado: "Hola Amigo"
```

### split()

El método split() divide una cadena en una lista de subcadenas utilizando un separador.

```
cadena = "Hola Mundo"
subcadenas = cadena.split()  # Resultado: ['Hola', 'Mundo']
```

### join()

El método join() une los elementos de una lista en una cadena utilizando el separador especificado.

```
palabras = ['Hola', 'Mundo']
cadena_unida = ' '.join(palabras)  # Resultado: "Hola Mundo"
```

### startswith()

El método startswith() verifica si una cadena comienza con una subcadena específica.

```
cadena = "Hola Mundo"
comienza_con_hola = cadena.startswith("Hola")  # Resultado: True
```

### endswith()

El método endswith() verifica si una cadena termina con una subcadena específica.

```
cadena = "Hola Mundo"
termina_con_mundo = cadena.endswith("Mundo")  # Resultado: True
```