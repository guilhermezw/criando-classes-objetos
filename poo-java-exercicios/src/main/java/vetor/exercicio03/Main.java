package vetor.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vect = new Pessoa[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Dados da "+ (i + 1)+ "a pessoa:");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Pessoa(nome,idade,altura);
        }

        double addAltura = 0;
        double addIdade = 0;
        for(int i = 0; i < vect.length;i++){
            addAltura += vect[i].getAltura();
            if (vect[i].getIdade() < 16){
                addIdade++;
            }
        }

        double media = addAltura / n;
        double mediaIdade = ( addIdade / n ) * 100;
        System.out.printf("Altura média: %.2f\n",media);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", mediaIdade);

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() < 16){
                System.out.println(vect[i].getNome());
            }
        }

    }
}
