# Prueba de concepdo de WebFlux

En este ejercicio se maneja una lógica de negocio donde existe un microservicio que retorna las viviendas que pertenezcan a un usuario (Casas, Apartamentos, etc), tambien está un microservicio que expone un servicio que retorna todos los vehículos que tiene el mismo (Carros, Motos, etc).

¿Qué pasaría si por alguna razon un usuario necesita todas las propiedades (viviendas y vehículos) a la vez?

Con programación tipica MVC debemos llamar a un servicio y luego a otro, lo cual nos incurre en tiempos altos en algunos casos. Es aquí donde se reflejan las ventajas de WebFlux al permitirnos trabajr asincronamente y llamar ambos servicios a la vez y retornar un solo resultado con toda la información que necesitamos. 

## Con programación convencional MVC
 ![GitHub](/docs/img/programming-mvc.png)
 
 ## Con programación reactiva
 ![GitHub](/docs/img/programming-reactive.png)

Using:
* [x] [Spring Boot](https://spring.io/projects/spring-boot/)
* [x] [Spring Reactive](https://spring.io/reactive/)

![Logo](/docs/img/spring-boot.png)
![Logo](/docs/img/web-flux.png) 


Autor:
*  [GitHub](https://github.com/caaguirre194)
	 @caaguirre194
