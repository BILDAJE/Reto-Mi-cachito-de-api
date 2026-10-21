
package edu.altair.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Indica que esta clase es el punto de entrada de la aplicación Spring Boot.
@SpringBootApplication
public class AltairApiApplication {

    // Método principal que se ejecuta al iniciar la aplicación.
    public static void main(String[] args) {

        // Inicia Spring Boot y pone en marcha la aplicación.
        SpringApplication.run(AltairApiApplication.class, args);
    }

}
