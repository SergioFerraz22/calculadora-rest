package br.com.calculadora.rest.model.services;

import br.com.calculadora.rest.model.entities.CalculoJuros;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CalculadoraJurosService {
    private final CalculoJuros calculadoraJuros;

    public CalculadoraJurosService(CalculoJuros calculadoraJuros) {
        this.calculadoraJuros = calculadoraJuros;
    }
    public double calcularJurosSimples(double principal, double taxa, int tempo) {
        return calculadoraJuros.calcularJurosSimples(principal, taxa, tempo);
    }
    public double calcularJurosComposto(double principal, double taxa, int tempo) {
        return calculadoraJuros.calcularJurosCompostos(principal,taxa,tempo);
    }
}
