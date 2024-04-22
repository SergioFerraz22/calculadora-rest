package br.com.calculadora.rest.model.entities;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraBasica implements OperacoesBasicas {

    @Override
    public double adicionar(double a, double b) {
        return a + b;
    }
    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

}
