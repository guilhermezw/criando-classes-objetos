package vetor.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);
        double maior = 0;
        int posicao = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] numero = new double[n];

        for (int i = 0; i < numero.length; i++){
            System.out.print("Digite um número:");
            numero[i] = sc.nextDouble();

        }

        for (int i = 0 ; i < numero.length; i++){
            if (i == 0){
                maior = numero[i];
            }
            if (numero[i] > maior){
                maior = numero[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor: %.2f\n", maior);
        System.out.println("Posição do maior valor: " + posicao);

    }
}
