# 📚 Proyecto Java con Spring Boot 🎬

Este es un proyecto Java utilizando Spring Boot. A continuación se describen los pasos para configurar y ejecutar el proyecto.

## 🗂️ Estructura del Proyecto

```
.gitattributes
.gitignore
bd.sql
docker-compose.yml
Dockerfile
mvnw
mvnw.cmd
pom.xml
.mvn/
    wrapper/
        maven-wrapper.properties
src/
    main/
        java/
            mx/
    resources/
        application.properties
        static/
        templates/
test/
    java/
        mx/
target/
    classes/
        application.properties
        mx/
            ipn/
        static/
            css/
        templates/
            accessDenied.html
            admin.html
            administrador.html
            editarUsuario.html
            error.html
            home.html
            libros.html
            login.html
            ...
    test-classes/
        mx/
            ipn/
```

## ✅ Prerrequisitos

- Java 21 o superior ☕
- Maven 3.6.3 o superior 🛠️
- Docker (opcional, para ejecutar con Docker) 🐳

## ⚙️ Configuración

1. Clonar el repositorio:

    ```sh
    git clone https://github.com/PabloGranados/IS
    cd IS
    ```

2. Configurar las propiedades de la aplicación en `src/main/resources/application.properties`.

3. Crear la base de datos utilizando el script `bd.sql`.

## 🚀 Construcción y Ejecución

### 🪶 Usando Maven

1. Construir el proyecto:

    ```sh
    ./mvnw clean install
    ```

2. Ejecutar la aplicación:

    ```sh
    ./mvnw spring-boot:run
    ```

### 🐳 Usando Docker

1. Construir la imagen de Docker:

    ```sh
    docker build -t nombre-imagen .
    ```

2. Ejecutar el contenedor:

    ```sh
    docker-compose up
    ```

## 📂 Estructura de Directorios

- `src/main/java/mx/`: Contiene el código fuente de la aplicación.
- `src/main/resources/`: Contiene los recursos estáticos y las plantillas.
- `src/test/java/mx/`: Contiene las pruebas unitarias.
- `target/`: Directorio generado después de la construcción del proyecto.

## 📸 Funcionamiento con Docker 

![Docker](/img/docker.png)

## 📸 Funcionamiento general 

![Login](/img/login.png)

![Register](/img/register.png)

![Home](/img/home.png)