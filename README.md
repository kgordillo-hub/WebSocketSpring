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

Debemos generar un archivo de configuración del proyecto y guardarlo como web.config

```
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <system.webServer>
    <handlers>
      <add name="httpPlatformHandler" path="*" verb="*" modules="httpPlatformHandler" resourceType="Unspecified" />
    </handlers>
    <httpPlatform processPath="%JAVA_HOME%\bin\java.exe"
        arguments="-Djava.net.preferIPv4Stack=true -Dserver.port=%HTTP_PLATFORM_PORT% -jar &quot;%HOME%\site\wwwroot\<your jar name>&quot;">
    </httpPlatform>
  </system.webServer>
</configuration>
```
Reemplazamos 'your jar name' por la ruta dentro del folder de wwwroot donde hayamos subido nuestro jar (sin los símbolos de <>).

### Desplegando en Azure

Creamos una nueva app service y luego accedemos a la consola de Kudu agregando **scm** a la url de la aplicación ejemplo:
```
https://aplicacionprueba.scm.azurewebsites.net/
```
Una vez dentro vamos a la "Debug console" y viajamos hasta el directorio wwwroot, una vez allí subimos el archivo web config creado previamente. Luego, creamos una carpeta (de manera opcional, también podemos dejarlo en la raíz) donde guardaremos nuesro jar, debe coincidir con la ruta y el nombre que configuramos en al web.config.

Hecho esto ya tenemos desplegada la aplicación en Azure usando Spring boot.

## Build With

* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [SpringBoot](https://spring.io/projects/spring-boot) - Para la construcción de la aplicación
* [SpringBoot initializr](https://start.spring.io/) - Para generación del artefacto

## License

This project is licensed under the Apache License 2.0 License
