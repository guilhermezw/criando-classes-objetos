package tratamento.exercicio02;

import tratamento.exercicio02.model.entities.Conta;
import tratamento.exercicio02.model.exception.BusinessException;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean exception = false;
        do{
            try{
                System.out.println();
                System.out.println("Informe os dados da conta");
                System.out.print("Insira numero da conta: ");
                int numero = sc.nextInt();
                System.out.print("Insira nome do titular: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Insira o saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.print("Insira limite de retirada: ");
                double saqueLimite = sc.nextDouble();
                Conta conta = new Conta(numero,nome,saldo,saqueLimite);
                System.out.println();

                System.out.print("Insira o valor para saque: ");
                double quantia = sc.nextDouble();
                conta.saque(quantia);
                System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
                exception = true;
            } catch (BusinessException erro){
                System.out.println(erro.getMessage());
                System.out.println("Tente novamente.");
            } catch (InputMismatchException erro){
                System.out.println();
                System.out.println("Valor Invalido.");
                sc.next();
            }
        } while (!exception);




    }
}
