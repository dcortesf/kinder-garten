# Backend para aplicación de guarderia

Este backend está desarrollado para el proyecto de fin de Ciclo Formativo de Grado Superior. Este proyecto
consiste en la creación de una aplicación de Guardería con un Frontal desarrollado en React.js y
un backend desarrollado utilizando Spring Framework, concretamente Spring Boot. El diseño sigue el 
patrón Arquitectura de Microservicios.

## Requisitos de Software

- Java 1.11
- Maven 3.9.6
- MySQL x.x

## Instalación y arranque

Para bajar y compilar el código

` git clone git@github.com:dcortesf/kinder-garten.git `

Desde el directorio kinder-garten

`mvn clean compile
./mvnw spring-boot:run
`

Comprueba que el microservicio arranca sin errores.

## Prueba

Teclea la siguiente url en tu navegador:

`http://localhost:8080/kindergarten/parents`

Esto devolverá una lista mockeada de padres.
