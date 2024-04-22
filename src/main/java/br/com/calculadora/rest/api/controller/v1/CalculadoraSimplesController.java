package br.com.calculadora.rest.api.controller.v1;

import br.com.calculadora.rest.config.SwaggerConfigV1;
import br.com.calculadora.rest.model.services.CalculadoraBasicaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
@Tag(name = "Calculadora simples", description = "Implementando operações basicas de uma calculadora  ")

public class CalculadoraSimplesController implements SwaggerConfigV1 {

    private final CalculadoraBasicaService calculadoraBasicaService;

    @Autowired
    public CalculadoraSimplesController(CalculadoraBasicaService calculadoraService) {
        this.calculadoraBasicaService = calculadoraService;
    }

    @Override
    @PostMapping("calculadora/adicao")
    public double adicao(@RequestParam double a, @RequestParam double b) {
        return calculadoraBasicaService.adicionar(a, b);
    }

    @Override
    @PostMapping("calculadora/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return calculadoraBasicaService.subtrair(a, b);
    }

    @Override
    @PostMapping("calculadora/multiplicacao")
    public double multiplicacao(@RequestParam double a, @RequestParam double b) {
        return calculadoraBasicaService.multiplicar(a, b);
    }

    @Override
    @PostMapping("calculadora/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        return calculadoraBasicaService.dividir(a, b);
    }


}