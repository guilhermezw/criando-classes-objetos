package composicao.exercicio01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento:");
        String departamento = sc.nextLine();
        Departamento dp = new Departamento(departamento);
        System.out.println("Insira os dados do trabalhador:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Nivel: ");
        System.out.println(" 1 - Junior");
        System.out.println(" 2 - Mid Level");
        System.out.println(" 3 - Senior");
        int nivel = sc.nextInt();

        NivelDeTrabalhador nivelDeTrabalhador;

        switch (nivel){
            case 1:
                nivelDeTrabalhador = NivelDeTrabalhador.JUNIOR;
                break;
            case 2:
                nivelDeTrabalhador = NivelDeTrabalhador.MID_LEVEL;
                break;
            case 3:
                nivelDeTrabalhador = NivelDeTrabalhador.SENIOR;
                break;
            default:
                System.out.println("Opção inválida! Usando JUNIOR como padrão.");
                nivelDeTrabalhador = NivelDeTrabalhador.JUNIOR;
                break;
        }

        System.out.println("Salário base: ");
        double salarioBase = sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nome , nivelDeTrabalhador ,salarioBase , dp);

        System.out.println("Quantos contratos esse trabalhador tem?: ");
        int numContratos =sc.nextInt();

        for (int i = 0 ; i < numContratos ; i++){
            System.out.println("Insira os dados do contrato nº" + i + 1);
            System.out.print("Data: (DD/MM/YYYY): " );
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();
            ContratoHoras contrato = new ContratoHoras(dataContrato,valorPorHora,horas);
            trabalhador.adicionarContrato(contrato);
        }

        System.out.println();
        System.out.println("Insira o mês e o ano para calcular a renda (MM/AAAA): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome do trabalhador: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda para " + mesEAno + ": " + String.format("%.2f",trabalhador.renda(ano , mes)));

    }
}
