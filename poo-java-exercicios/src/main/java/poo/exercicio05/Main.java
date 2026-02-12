package poo.exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double addDeposito , subSaque;

       Conta conta;

        System.out.println("Digite o número da conta bancaria:");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do titular da conta bancaria: ");
        String nomeTitular = sc.nextLine();
        System.out.println("Deseja fazer um depósito inicial? (Y/N) ");
        char opcao = sc.next().charAt(0);


        if(opcao == 'Y'|| opcao == 'y') {
            System.out.println("Insira o valor do depósito inicial: ");
            addDeposito = sc.nextDouble();
            conta = new Conta(numeroConta,nomeTitular);
            conta.saldoDeposito(addDeposito);
            System.out.println("Dados da Conta:");
            System.out.println("Conta: " + conta.getNumeroConta() + " Titular da Conta: " + conta.getNomeTitular() + " Saldo: R$ " + conta.getSaldoConta());
        } else {
            conta = new Conta(numeroConta,nomeTitular);
            System.out.println("Dados da Conta:");
            System.out.println("Conta: " + conta.getNumeroConta() + " Titular da Conta: " + conta.getNomeTitular() + " Saldo: R$ " + conta.getSaldoConta());
        }

        System.out.println("Insira o valor de depósito: ");
        addDeposito = sc.nextDouble();
        conta.saldoDeposito(addDeposito);
        System.out.println("Dados da conta atualizados: ");
        System.out.println("Conta: " + conta.getNumeroConta() + " Titular da Conta: " + conta.getNomeTitular() + " Saldo: R$ " + conta.getSaldoConta());
        System.out.println("Insira o valor saque:");
        subSaque = sc.nextDouble();
        conta.saldoSaque(subSaque);
        System.out.println("Dados da conta atualizados: ");
        System.out.println("Conta: " + conta.getNumeroConta() + " Titular da Conta: " + conta.getNomeTitular() + " Saldo: R$ " + conta.getSaldoConta());


    }
}
