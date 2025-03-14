# 📚 Proyecto Java con Spring Boot 🎬

¡Bienvenido al Sistema de Recomendaciones de Libros y Películas! Este proyecto está desarrollado en Java utilizando Spring Boot y tiene como objetivo proporcionar recomendaciones personalizadas de libros y películas a los usuarios. 🌟

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