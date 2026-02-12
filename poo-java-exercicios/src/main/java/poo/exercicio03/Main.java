package poo.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Estudante estudante = new Estudante();

        System.out.println("Digite o nome do aluno: ");
        estudante.nome = sc.nextLine();
        System.out.println("Digite a nota do primeiro trimestre: ");
        estudante.primeiraTrimestre = sc.nextDouble();
        System.out.println("Digite a nota do segundo trimestre: ");
        estudante.segundoTrimestre = sc.nextDouble();
        System.out.println("Digite a nota do terceiro trimestre: ");
        estudante.terceiroTrimestre = sc.nextDouble();

        estudante.verificarNota();

    }
}
