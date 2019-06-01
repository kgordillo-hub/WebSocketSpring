# WebSocketSpring
Repositorio para aplicación tipo web socket con Spring boot para un sistema ciber físico médico.

## Empezando con Spring boot
Para poder correr el proyecto deberemos tener instalada la última versión de Maven. Disponible en:
https://maven.apache.org/download.cgi

### Compilando el proyecto

Para generar el artefacto del proyecto correremos con Maven la siguiente instrucción
```
mvn clean package
```
Esto nos generará un JAR file que desplegaremos en Azure. Para ello, utilizaremos el servicio de Web apps de Azure con un servidor de aplicaciones Tomcat 9.0 y Windows server.

Debemos generar un archivo de configuración del proyecto
