package Exercicios;

public class Retornos {

    public static double calcularArea(double lado) {
        return lado * lado;
    }

    public static double calcularArea(double lado1, double lado2) {
        return lado1 * lado2;
    }

    public static double calcularArea(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float calcularArea(float diagonal1, float diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
