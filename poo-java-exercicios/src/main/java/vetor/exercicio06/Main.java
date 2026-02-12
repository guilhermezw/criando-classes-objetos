package vetor.exercicio06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos quartos deseja alugar?:");
        int n = sc.nextInt();


        Aluguel[] aluguel = new Aluguel[10];

        for(int i = 0; i < n ; i++){
            System.out.println("Aluguel #" + (i + 1));
            sc.nextLine();
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto (0 a 9): ");
            int numeroQuarto = sc.nextInt();
            aluguel[numeroQuarto] = new Aluguel(nome,email,numeroQuarto);
        }

        for (int i = 0 ; i < aluguel.length; i++){
            if (aluguel[i] != null){
                System.out.println(aluguel[i]);
            }
        }
    }
}
