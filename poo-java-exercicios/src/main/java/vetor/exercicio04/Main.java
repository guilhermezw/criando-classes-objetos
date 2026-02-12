package vetor.exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] numero = new int[n];

        int addNumerosPar = 0;

        for(int i = 0; i < numero.length; i++){
            System.out.print("Digite um número: ");
            numero[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Numeros pares:");
        for(int i = 0; i < numero.length; i++){
            if (numero[i] % 2 == 0){
                System.out.print("\t" + numero[i]);
                addNumerosPar++;
            }
        }
        System.out.println();
        System.out.print("Quantidade de números pares: " + addNumerosPar);
    }
}
