package herenca.exercicio02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();
        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            System.out.println("Dados do Produto #" + (i+1));
            System.out.println("Comum, usado ou importado (c/u/i)?");
            char opcao = sc.next().charAt(0);
            System.out.println("Nome do produto: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Preço do produto: ");
            double preco = sc.nextDouble();
            if(opcao == 'i' || opcao == 'I'){
                System.out.println("Taxa Alfandegaria: ");
                double taxaAlfandegariaProdutoImportado = sc.nextDouble();
                ProdutoImportado produtoImportado = new ProdutoImportado(nome,preco,taxaAlfandegariaProdutoImportado);
                listaProdutos.add(produtoImportado);
            } else if (opcao == 'c' || opcao == 'C') {
                Produto produtoComum = new Produto(nome , preco);
                listaProdutos.add(produtoComum);
            } else if (opcao == 'U' || opcao == 'u') {
                System.out.println("Data de fabricação (DD/MM/AAAA): ");
                LocalDate dataFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                ProdutoUsado produtoUsado = new ProdutoUsado(nome,preco, dataFabricacao);
                listaProdutos.add(produtoUsado);
            }

            System.out.println();
            System.out.println("Etiquetas de Produtos: ");
            for(Produto produto : listaProdutos){
                System.out.println(produto.etiquetaPreco());
            }
        }
    }
}
