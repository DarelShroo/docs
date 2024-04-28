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

