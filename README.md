# Prueba técnica Backend EVC Gestión Integral de Riesgos

## Prerrequisitos: 
Asegurarse de tener instalado: 
```
Java Development Kit (JDK) 17 or higher
MySQL y MySQL Workbench
```

## Instrucciones para Ejecutar:

1. Clonar el repositorio:
```
git clone https://github.com/SanAfaGal/prueba-spring.git
```
   
2. Navegar al directorio del proyecto:
```
cd prueba-spring
```

3. Configurar la base de datos en el archivo application.properties:
```
# Database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/prueba_tecnica
spring.datasource.username={username} ✅
spring.datasource.password={password} ✅
sprint.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA configuration
spring.jpa.show-sql=true
spring.jpa.open-in-view=false

# Thymeleaf configuration
spring.thymeleaf.check-template-location=false

# Server configuration
server.port=8080
```

## Uso y ejemplos
Para poder ver la documentación y probar los endpoints, se debe ingresar a la siguiente URL una vez el proyecto se esté ejecutando:
```
http://localhost:8080/swagger-ui.html
```

## Versión de Spring Boot 🛠️: 
```
Springboot 3.2.5
```

## Dependencias
- **spring-boot-starter-data-jpa**: Manejo de operaciones de base de datos con JPA.
- **spring-boot-starter-jdbc**: Conexiones JDBC y operaciones con bases de datos.
- **spring-boot-starter-web**: Construcción de aplicaciones web y APIs REST.
- **spring-boot-devtools**: Mejora de la experiencia de desarrollo (recarga automática, etc.).
- **mysql-connector-j**: Conexión con bases de datos MySQL.
- **lombok**: Reducción del boilerplate de código (generación automática de getters, setters, etc.).
- **spring-boot-starter-test**: Pruebas unitarias y de integración.
- **springdoc-openapi-starter-webmvc-ui**: Documentación automática de la API con Swagger.

## Contacto
Para cualquier duda o consulta, contactar por medio de correo: afanadorgaleano@gmail.com o WhatsApp: +57 316 7991132
