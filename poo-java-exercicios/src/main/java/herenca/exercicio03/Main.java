package herenca.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();
        System.out.println("Insira o número de contribuintes: ");
        int n = sc.nextInt();

        for(int i = 1; i < n ; i++){
            System.out.println("Dados do contribuinte nº" + i + ":");
            System.out.println("Pessoa física ou jurídica (f/j)");
            char opcao = sc.nextLine().charAt(0);
            System.out.println("Digite o nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite a renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (opcao == 'f' || opcao == 'F'){
                System.out.println("Digite despesas com saúde: ");
                double despesasComSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome , rendaAnual ,despesasComSaude));
            } else if (opcao == 'j' || opcao == 'J'){
                System.out.println("Digite número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome , rendaAnual ,numeroDeFuncionarios));
            } else {
                System.out.println("Digite caraceter f ou j");
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("Impostos Pagos: ");
        for (Contribuinte imposto : list){
            double tax = imposto.taxa();
            System.out.println(imposto.getNome() + ": $ " + String.format("%.2f" , tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("Total Impostos: $ " + String.format("%.2f" , sum));
    }
}
