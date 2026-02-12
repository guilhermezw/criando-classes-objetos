package vetor.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] numero = new int[n];

        for(int i = 0; i < numero.length; i++){
            System.out.print("Digite um número: ");
            numero[i] = sc.nextInt();
        }

        for (int i = 0; i < numero.length; i++){
            if (numero[i] < 0){
                System.out.println();
                System.out.println("Número Negativo: " + numero[i]);
            }
        }
    }
}
