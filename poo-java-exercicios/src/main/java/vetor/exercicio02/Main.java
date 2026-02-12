package vetor.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] numero = new double[n];

        for(int i =0 ; i < numero.length; i++){
            System.out.print("Digite um número: ");
            numero[i] = sc.nextDouble();
        }
        double soma = 0;
        System.out.print("Valores: ");
        for (int i = 0; i < numero.length; i++){
            System.out.printf("%.2f\t", numero[i]);
            soma += numero[i];
        }
        System.out.println();
        double media = soma / n;
        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Media: %.2f", media);


    }
}
