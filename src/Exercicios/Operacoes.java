package Exercicios;

public class Operacoes {

    public static void soma(double valor1, double valor2) {
        double resultado = valor1 + valor2;
        System.out.println("A soma de " + valor1 + " + " + valor2 + " resulta em " + resultado);
    }

    public static void subtracao(double valor1, double valor2) {
        double resultado = valor1 - valor2;
        System.out.println("A subtração de " + valor1 + " - " + valor2 + " resulta em " + resultado);
    }

    public static void multiplicacao(double valor1, double valor2) {
        double resultado = valor1 * valor2;
        System.out.println("A multiplicação de " + valor1 + " por " + valor2 + " resulta em " + resultado);
    }

    public static void divisao(double valor1, double valor2) {
        double resultado = valor1 / valor2;
        System.out.println("A divisão de " + valor1 + " por " + valor2 + " resulta em " + resultado);
    }
}