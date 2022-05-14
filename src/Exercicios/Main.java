package Exercicios;

public class Main {

    public static void main(String[] args) {
        // Operações
        System.out.println("--- Exercício 01 ---");
        Operacoes.soma(2, 5);
        Operacoes.subtracao(10, 3);
        Operacoes.multiplicacao(2.5, 4.3);
        Operacoes.divisao(12, 5);

        // Mensagem de saudação
        System.out.println("--- Exercício 02 ---");
        Mensagem.saudacao(5);
        Mensagem.saudacao(14);
        Mensagem.saudacao(20);
        Mensagem.saudacao(28);

        // Empréstimo
        System.out.println("--- Exercício 03 ---");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(2500, 3);
        Emprestimo.calcular(1500, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(500, Emprestimo.getTresParcelas());

        // Sobrecarga
        System.out.println("--- Exercício Área de Quadriláteros ---");
        Sobrecarga.calcularArea(5);
        Sobrecarga.calcularArea(2d, 10d);
        Sobrecarga.calcularArea(7, 8, 9);
        Sobrecarga.calcularArea(2f, 10f);

        // Retornos
        System.out.println("--- Exercício Retornos ---");
        double areaQuadrado = Retornos.calcularArea(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Retornos.calcularArea(2d, 10d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = Retornos.calcularArea(7, 8, 9);
        System.out.println("Área do trapézio: " + areaTrapezio);

        float areaLosango = Retornos.calcularArea(2f, 10f);
        System.out.println("Área do losango: " + areaLosango);
    }
}
