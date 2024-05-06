# Método lower()
cadena = "Hola Mundo"
cadena_min = cadena.lower()
print("Método lower():", cadena_min)  # Resultado: "hola mundo"

# Método upper()
cadena = "Hola Mundo"
cadena_mayus = cadena.upper()
print("Método upper():", cadena_mayus)  # Resultado: "HOLA MUNDO"

# Método strip()
cadena = "   Hola Mundo   "
cadena_stripped = cadena.strip()
print("Método strip():", cadena_stripped)  # Resultado: "Hola Mundo"

# Método replace()
cadena = "Hola Mundo"
cadena_reemplazada = cadena.replace("Mundo", "Amigo")
print("Método replace():", cadena_reemplazada)  # Resultado: "Hola Amigo"

# Método split()
cadena = "Hola Mundo"
subcadenas = cadena.split()
print("Método split():", subcadenas)  # Resultado: ['Hola', 'Mundo']

# Método join()
palabras = ['Hola', 'Mundo']
cadena_unida = ' '.join(palabras)
print("Método join():", cadena_unida)  # Resultado: "Hola Mundo"

# Método startswith()
cadena = "Hola Mundo"
comienza_con_hola = cadena.startswith("Hola")
print("Método startswith():", comienza_con_hola)  # Resultado: True

# Método endswith()
cadena = "Hola Mundo"
termina_con_mundo = cadena.endswith("Mundo")
print("Método endswith():", termina_con_mundo)  # Resultado: True
