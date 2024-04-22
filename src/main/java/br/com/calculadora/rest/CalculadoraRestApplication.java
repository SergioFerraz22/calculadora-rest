package br.com.calculadora.rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "CalculadoraOO-Rest",
        version = "2.0",
        description = "Este é um projeto exemplo de uma calculadora orientada a objetos utilizando o serviço RESTful."
))
public class CalculadoraRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraRestApplication.class, args);
    }

}
