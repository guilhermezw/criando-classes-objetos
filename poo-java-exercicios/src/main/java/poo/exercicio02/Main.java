package poo.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Digite o salário bruto do funcionario: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Digite o imposto sobre salário bruto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.printf("O salario liquido do funcionario %s e de R$ %.2f\n",funcionario.nome,funcionario.salarioLiquido());
        System.out.println("Qual a porcentagem para aumentar o salário?");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.printf("O salario final de %s e de R$ %.2f",funcionario.nome , funcionario.salarioLiquido());


    }
}
