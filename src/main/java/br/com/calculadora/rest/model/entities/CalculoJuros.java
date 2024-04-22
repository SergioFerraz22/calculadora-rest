package br.com.calculadora.rest.model.entities;

public interface CalculoJuros {
    double calcularJurosSimples(double montante, double juros, int periodo);
    double calcularJurosCompostos(double montante, double juros, int periodo);

}
