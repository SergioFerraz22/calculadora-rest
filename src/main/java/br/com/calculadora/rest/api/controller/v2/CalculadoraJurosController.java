package br.com.calculadora.rest.api.controller.v2;

import br.com.calculadora.rest.config.SwaggerConfigV2;
import br.com.calculadora.rest.model.services.CalculadoraJurosService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2")
@Tag(name = "Calculadora juros", description = "Implementando calculadora de juros")
public class CalculadoraJurosController  implements SwaggerConfigV2 {

    private final CalculadoraJurosService calculadoraJurosService;

    public CalculadoraJurosController(CalculadoraJurosService calculadoraJurosService) {
        this.calculadoraJurosService = calculadoraJurosService;
    }
    @Override
    @GetMapping("calculadora/juros-simples")
    public double jurosSimples(double a, double b, int tempo) {
        return calculadoraJurosService.calcularJurosSimples(a,b,tempo);
    }

    @Override
    @GetMapping("calculadora/juros-compostos")
    public double jurosCompostos(double a, double b, int tempo) {
        return calculadoraJurosService.calcularJurosComposto(a,b,tempo);
    }
}
