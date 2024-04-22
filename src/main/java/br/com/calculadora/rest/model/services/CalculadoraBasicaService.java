package br.com.calculadora.rest.model.services;

import br.com.calculadora.rest.model.entities.OperacoesBasicas;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Service
public class CalculadoraBasicaService {
    // Injeção de dependência: passando a abstração como atributo e instanciando no construtor para fornecer implementações específicas.
    private final OperacoesBasicas calculadoraBasica;
    private static final Logger logger = LogManager.getLogger(CalculadoraBasicaService.class);

    public CalculadoraBasicaService(OperacoesBasicas calculadoraBasica) {
        this.calculadoraBasica = calculadoraBasica;
    }
    public double adicionar(double a, double b) {
        double resultado = calculadoraBasica.adicionar(a, b);
        logger.info("Somando {} e {}. Resultado: {}", a, b, resultado);
        return resultado;
    }
    public double subtrair(double a, double b) {
        double resultado = calculadoraBasica.subtrair(a,b);
        logger.info("Subtraindo {} e {}. Resultado: {}", a, b, resultado);
        return  resultado;
    }
    public double multiplicar(double a, double b) {
        return calculadoraBasica.multiplicar(a,b);
    }
    public double dividir(double a, double b) {
        return calculadoraBasica.dividir(a,b);
    }

}
