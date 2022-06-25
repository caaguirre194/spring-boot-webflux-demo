# Prueba de concepdo de WebFlux

En este ejercicio se cuenta con un microservicio que maneja toda la lógica de viviendas de usuarios, en donde por ejemplo se expone un servicio que retorna las viviendas que pertenezcan a una persona (Casas, Apartamentos, etc), tambien existe un microservicio que maneja la lógica de vehiculos en donde a su vez se expone un servicio que retorna todos los vehículos que tiene un usuario (Carros, Motos, etc).

¿Qué pasaría si por alguna razon un usuario necesita consultar todas las propiedades (viviendas y vehículos) a la vez?

Con programación tipica MVC debemos llamar a un servicio y luego a otro, lo cual nos incurre en tiempos altos en algunos casos. Es aquí donde se reflejan las ventajas de WebFlux al permitirnos trabajar asincronamente y llamar ambos servicios a la vez y retornar un solo resultado con toda la información que necesitamos. 

## Con programación convencional MVC
 ![GitHub](/docs/img/programming-mvc.png)
 
## Con programación reactiva
 ![GitHub](/docs/img/programming-reactive.png)
 
## Ejecución

Se requiere ejecutar los 3 microservicios a la vez y proceder a probar los endpoits a continuación:

### Endpoints

Método	| Ruta	| Ejemplo	
------------- | ------------------------- | ------------- |
GET	| /propiedades/api/v1/{propietario}	| /propiedades/api/v1/1
GET	| /vehiculos/api/v1/{propietario}	| /vehiculos/api/v1/1 
GET	| /demo/api/v1/{propietario}	| /demo/api/v1/1
 
### Colección Postman

[Descargar](/docs/Demo-WebFllux.postman_collection.json)



Se usó:
* [x] [Spring Boot](https://spring.io/projects/spring-boot/)
* [x] [Spring Reactive](https://spring.io/reactive/)

![Logo](/docs/img/spring-boot.png)
![Logo](/docs/img/web-flux.png) 


Autor:
*  [GitHub](https://github.com/caaguirre194)
	 @caaguirre194
