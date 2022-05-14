package Exercicios;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.25;
    }

    public static double getTaxaTresParcelas() {
        return 0.35;
    }

    public static void calcular(double valor, int parcelas) {
        if(parcelas == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Considerando duas parcelas, o valor final do empréstimo é de R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("Considerando três parcelas, o valor final do empréstimo é de R$ " + valorFinal);
        }
    }
}
