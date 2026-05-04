package com.hugonavarro.ejerciciosdocumentacion;

public class ComprobacionIA {
    private double numero1;
    private double numero2;
    private double resultado;
    private String operacion;

    public ComprobacionIA(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double suma() {
        resultado = numero1 + numero2;
        operacion = "Suma";
        return resultado;
    }

    public double resta() {
        resultado = numero1 - numero2;
        operacion = "Resta";
        return resultado;
    }

    public double multiplicacion() {
        resultado = numero1 * numero2;
        operacion = "Multiplicación";
        return resultado;
    }

    public double division() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
            operacion = "División";
            return resultado;
        } else {
            throw new ArithmeticException("ERROR: División entre cero.");
        }
    }

    public void mostrarResultado() {
        System.out.println("Operación: " + operacion);
        System.out.println("Resultado: " + resultado);
    }
}
