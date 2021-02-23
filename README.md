# Spring Boot - crud  😊

_El proyecto construido por solicitud de Soaint para postulación de trabajo, los datos consultados son almacenados en base de datos._
_La aplicacion tiene una arquitectura multicapa,  excepciones son centralizadas con  "ControllerAdvice" además de crear una factory de excepciones._
_Se utilizan pruebas unitarias con mockito y de integración_
-Se valida con sonar-

## Comenzando 🚀

_ _


### Pre-requisitos 📋

```
- Eclipse 2020-12 o cualquiera de los ultimos
- Junit 5
- Java 8
- Maven 3.6.3
- Cuenta Heroku 
- Cuenta github
```

### Instalación 🔧

_Para la instalación es necesario tener el proyecto en github y tambien en crear una "app" en heroku, ademas de tenerlo conectados_

_Comando utilizados git_

```
git add .
git commit -m "cambios"
git push github master
```

_Comandos utilizados en Heroku para ver los logs_

```
heroku logs --tail
```
_Comandos utilizados en Heroku para ver las keys en la cache_

```
heroku redis:cli --confirm [nombre de app]
```

## Ejecutando las pruebas con curl ⚙️

### Crear producto 🔩

```
curl -i -X POST -H "Content-Type: application/json" -d "{\"nombre\": \"heroku test to soaint\"}" https://crud-fsancho.herokuapp.com/api/productos
```

### Obtener producto ⌨️

```
curl https://crud-fsancho.herokuapp.com/api/productos/1
```
### Obtener lista ⌨️

```
curl https://crud-fsancho.herokuapp.com/api/productos
```
### Actualiza producto ⌨️

```
curl -i -X PUT -H "Content-Type: application/json" -d "{\"nombre\": \"soy un cambio - to soaint\", \"existe\": true}" https://crud-fsancho.herokuapp.com/api/productos/1
```
## Contrato con openapi ⚙️

### Se utiliza swagger de openapi 🔩

```
https://crud-fsancho.herokuapp.com//swagger-ui.html
```
## Despliegue 📦

_El despliegue es automatico a heroku, aplicando los comandos anteriormente mencionados, al realizar push se realiza compilacion e instalación._

## Construido con 🛠️

_Herramientas destacadas_
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Spring boot](https://start.spring.io/) - Plantilla de Proyecto de cero
* Sonar Lint
* OpenApi (swagger)

## Versionado 📌

Se utilizo [GitHub/spring-boot - crud soain](https://github.com/fernandosanchosamata/crud-to-soaint) para el versionado. 

## Autores ✒️
* **Fernando Alfredo Sancho Samata** - *Desarrollador java enterprise*

---
