# ¡Hola Spring!

Este es un proyecto básico de Spring Boot que implementa un servicio REST con un endpoint que devuelve un mensaje simple.

## Requisitos

- **Java 21**
- **Maven**
- **Spring Boot** (Spring Web)

## Instalación y Ejecución

1. Clona este repositorio:

   ```sh
   git clone https://github.com/PabloGranados/IS.git
   cd IT

2. Ejecutar el proyecto:

Si tienes Visual Studio Code, puedes utilizar la extencion "Extension Pack for Java"

Y en el archivo HolaSpringApplication.java dar click derecho y seleccionar "Run Java"

3. Probar el endpoint

Una vez iniciado, el servicio estará disponible en:

http://localhost:8080/api/mensaje

Puedes probarlo en:

Navegador: Ingresa la URL en la barra de direcciones.

Postman: Realiza una petición GET a la misma URL.

## Respuesta esperada:

"¡Hola Spring!"

## Configuración Adicional

Si deseas cambiar el puerto del servidor, edita el archivo application.properties:

server.port=PUERTO

Esto hará que el servicio se ejecute en http://localhost:PUERTO/api/mensaje