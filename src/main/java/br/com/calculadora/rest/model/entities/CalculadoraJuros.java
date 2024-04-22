package br.com.calculadora.rest.model.entities;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraJuros implements CalculoJuros {
    @Override
    public double calcularJurosSimples(double montante, double juros, int periodo) {
        return montante * juros * periodo;    }

    @Override
    public double calcularJurosCompostos(double montante, double juros, int periodo) {
        return montante * Math.pow(1 + juros, periodo) - montante;
    }
}
