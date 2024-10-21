# Guía de comandos esenciales de GIT

## Introducción
Git es un sistema de control de versiones distribuido que permite a los equipos de desarrollo gestionar el historial de sus proyectos de manera eficiente. A continuación, se detallan los comandos más comunes y útiles para interactuar con Git en diferentes escenarios.

---

## Verificar la versión de Git instalada
Verifica la versión de Git instalada en tu sistema.

\```sh
$ git --version
\```

---

## Inicializar un repositorio de Git
Crea un nuevo repositorio Git en el directorio actual. Este comando inicializa el control de versiones.

\```sh
$ git init
\```

---

## Clonar un repositorio existente
Clona un repositorio remoto a tu máquina local. Reemplaza `URL_DEL_REPO` con la URL del repositorio que deseas clonar.

\```sh
$ git clone URL_DEL_REPO
\```

---

## Seguimiento de cambios

### Añadir cambios de un archivo al área de preparación (staging)
Agrega un archivo específico al área de preparación, preparándolo para el siguiente commit.

\```sh
$ git add archivo.txt
\```

### Realizar un commit con mensaje descriptivo
Confirma los cambios en el repositorio con un mensaje que describa las modificaciones realizadas.

\```sh
$ git commit --message "descripción del commit"
\```

### Ver el estado del repositorio
Muestra el estado actual de los archivos en el repositorio, indicando cuáles están en staging y cuáles no.

\```sh
$ git status
\```

### Consultar el historial de commits
Muestra el historial de commits de la rama actual, útil para ver los cambios anteriores.

\```sh
$ git log
\```

---

## Gestión de etiquetas (tags)

### Crear una etiqueta en un commit
Añade una etiqueta a un commit específico para marcar versiones importantes o hitos.

\```sh
$ git tag version-1-0-beta
\```

### Listar todas las etiquetas creadas
Muestra todas las etiquetas (tags) creadas en el repositorio.

\```sh
$ git tag --list  
\```

### Eliminar una etiqueta
Elimina una etiqueta existente en el repositorio local.

\```sh
$ git tag --delete version-1-0-beta
\```

---

## Excluir archivos con `.gitignore`
El archivo `.gitignore` se usa para excluir archivos o directorios del control de versiones. Aquí tienes un ejemplo de uso:

\```
# Ejemplo de .gitignore
node_modules/
.DS_Store
*.log
\```

Es fundamental para evitar que archivos innecesarios o privados se suban al repositorio.

---

## Configuración de Git

### Verificar o configurar el usuario y correo electrónico
Configura el nombre de usuario y correo electrónico para tus commits globalmente, es decir, para todos los repositorios.

\```sh
$ git config --global user.email "george.spelvin@example.com"
$ git config --global user.name "George Spelvin"
\```

### Establecer la rama `main` como rama principal por defecto
Configura `main` como la rama principal al inicializar nuevos repositorios.

\```sh
$ git config --global init.defaultBranch main
\```

---

## Gestión de ramas

### Listar todas las ramas en el repositorio
Muestra todas las ramas locales en el repositorio.

\```sh
$ git branch
\```

### Crear una nueva rama
Crea una nueva rama a partir de la actual.

\```sh
$ git branch foo
\```

### Eliminar una rama
Elimina una rama local que ya no necesitas. También puedes forzar la eliminación de ramas.

\```sh
$ git branch --delete foo
$ git branch --delete --force experimental-branch
\```

### Cambiar de rama
Cambia a una rama diferente dentro del repositorio. Ambas opciones funcionan igual:

\```sh
$ git checkout login-feature 
$ git switch login-feature
\```

### Fusionar ramas (merge)
Fusiona una rama en la rama actual. Asegúrate de estar en la rama en la que quieres aplicar los cambios. Podrían surgir conflictos durante el proceso.

\```sh
$ git merge login-feature
\```

---

## Ver el historial de commits
Muestra los commits recientes realizados en la rama actual.

\```sh
$ git log
\```

---

## Gestión de repositorios remotos

### Ver repositorios remotos configurados
Muestra una lista de los repositorios remotos con los que está conectado tu repositorio local.

\```sh
$ git remote --verbose
\```

### Clonar un repositorio remoto
Clona un repositorio remoto en tu máquina local.

\```sh
$ git clone URL_DEL_REPO
\```

### Subir cambios a un repositorio remoto
Sube tus commits locales a un repositorio remoto. Utiliza `--set-upstream` si es la primera vez que subes a esa rama remota.

\```sh
$ git push --set-upstream origin login-feature
\```

# git
git fetch

#git
git pull

#flujo de trabajo con git
En tu computadora local, usa git switch para cambiar a la rama en la que deseas trabajar.
Usa git fetch para obtener información sobre si la copia del repositorio principal de tu rama tiene nuevas ediciones.
Ejecuta git status para ver si tu rama local está "atrasada" respecto a la copia del repositorio principal de la misma rama.
Si lo está, actualiza tus archivos locales con git pull.
Haz y confirma ediciones en la copia local de la rama.
Envía todos los commits en tu copia local de la rama a la copia dorada de la rama con git push.

# git diff
git diff

# git merge
 git merge branch-a