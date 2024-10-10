# GIT

## Verificar la versión de Git instalada
Para conocer la versión de Git que tienes instalada, ejecuta el siguiente comando:

```sh
$ git --version
```

## Inicializar un proyecto con Git
Para inicializar un nuevo repositorio Git en un proyecto local:

```sh
$ git init
```

## Clonar un repositorio existente
Para clonar un repositorio remoto a tu máquina local, usa la URL del repositorio:

```sh
$ git clone URL_DEL_REPO
```

## Seguimiento de cambios

### Añadir cambios de un fichero al área de preparación (staging)
Para añadir un archivo específico al área de preparación, usa el comando `git add` seguido del nombre del archivo:

```sh
$ git add archivo.txt
```

### Hacer un commit con un mensaje descriptivo
Después de añadir archivos al área de preparación, haz un commit con una descripción de los cambios:

```sh
$ git commit --message "descripción del commit"
```

## Excluir archivos con `.gitignore`
Para evitar que ciertos archivos o directorios sean seguidos por Git, crea un archivo `.gitignore` y lista los archivos o rutas que quieras excluir:

## Excluir archivos con `.gitignore`
Para evitar que ciertos archivos o directorios sean seguidos por Git, crea un archivo `.gitignore` y lista los archivos o rutas que quieras excluir:

```
# Ejemplo de .gitignore
node_modules/
.DS_Store
*.log
```

Recuerda que este archivo es esencial para excluir elementos innecesarios del repositorio.

## Configuración de Git

### Verificar o configurar el usuario y correo electrónico
Puedes verificar o configurar tu nombre de usuario y dirección de correo electrónico para los commits globalmente:

```sh
$ git config --global user.email "george.spelvin@example.com"
$ git config --global user.name "George Spelvin"
```

### Configurar la rama `main` como la rama principal por defecto
Para que `main` sea la rama principal por defecto al inicializar nuevos repositorios:

```sh
$ git config --global init.defaultBranch main
```

## Gestión de ramas

### Listar todas las ramas
Para listar todas las ramas en el repositorio actual:

```sh
$ git branch
```

### Crear una nueva rama
Para crear una nueva rama llamada `foo`:

```sh
$ git branch foo
```

### Eliminar una rama
Si necesitas eliminar una rama llamada `foo`, usa:

```sh
$ git branch --delete foo
```

## Ver el historial de commits
Para ver un registro detallado de los commits realizados en la rama actual, usa `git log`:

```sh
$ git log
```
