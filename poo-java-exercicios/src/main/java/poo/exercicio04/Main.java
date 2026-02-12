package poo.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);


        System.out.println("Qual é o preço do dólar?");
        double valorDolar = sc.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double comprarDolar = sc.nextDouble();

        double conversao = ConversorMoeda.conversaoMoeda(valorDolar,comprarDolar);

        System.out.printf("Valor a ser pago em reais: R$ %.2f" , conversao);

    }
}
