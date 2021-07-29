package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
/*
https://www.baeldung.com/spring-bean

Definicion: inversion de Control IoC
		En pocas palabras es el proceso por el cual un objeto define sus control sin crearlas, el framoweor
		toma el control del flujo natural del programa
		
			Ej. si Company tiene una Address lo que hay que hacer para crear un objeto Company es crear un 
				objeto Address primero

			la Forma e hacerlo con inversion de control es con @Configuration y @Bean
			------------------ Defincion de Copany sin Address
			@Component
			public class Company {
				// this body is the same as before
			}
			------------------ En la clase Config
			@Configuration
			@ComponentScan(basePackageClasses = Company.class)
			public class Config {
				@Bean
				public Address getAddress() {
					return new Address("High Street", 1000);
				} 
			}


Definicion: Beans 

// @SpringBootApplication es como agregar  muchos tags al mismo tiempo
// 				@Confguration permite usar anotaciones para inyeccion de dependencias
                @EnableAutoConfiguration --> hace que se le agreguen beans a la clase
				dependiendo de la configuracion del classpath, otros beans, etc
				@ComponentScan --> le dice a spring que busque, configuraciones, componenete y servicios
				en el mismo paquete que se encuentra esta etiqueta, hasta que encuentre Controllers
				

*/