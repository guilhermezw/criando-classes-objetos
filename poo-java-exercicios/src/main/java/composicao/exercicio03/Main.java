package composicao.exercicio03;

import composicao.exercicio01.NivelDeTrabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do cliente: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        Date dataNascimento = formatador.parse(sc.next());

        Cliente cliente = new Cliente(nome,email,dataNascimento);

        System.out.println("Insira os dados do pedido: ");
        System.out.println("Status:  ");
        System.out.println(" 1 - Pagamento Pendente");
        System.out.println(" 2 - Processamento");
        System.out.println(" 3 - Enviado");
        System.out.println(" 4 - Entregue");
        System.out.print("Informe o status:");
        int opcaoStatus = sc.nextInt();
        StatusDoPedido statusDoPedido;

        switch (opcaoStatus){
            case 1:
                statusDoPedido = StatusDoPedido.PAGAMENTO_PENDENTE;
                break;
            case 2:
                statusDoPedido = StatusDoPedido.PROCESSAMENTO;
                break;
            case 3:
                statusDoPedido = StatusDoPedido.ENVIADO;
                break;
            case 4:
                statusDoPedido = StatusDoPedido.ENTREGUE;
            default:
                System.out.println("Opção inválida! Usando Processamento como padrão.");
                statusDoPedido = StatusDoPedido.PROCESSAMENTO;
                break;
        }

        Pedido pedido = new Pedido(new Date() , statusDoPedido , cliente);

        System.out.print("Quantos itens há neste pedido? ");
        int numItems = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numItems; i++){
            System.out.println("Insira os dados do item " + (i + 1) + "nº:");
            System.out.print("Nome do produto: ");
            String nomeItem = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoItem = sc.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeItem = sc.nextInt();
            sc.nextLine();

            Produto produto = new Produto(nomeItem,precoItem);
            ItemDoPedido itemDoPedido = new ItemDoPedido(quantidadeItem , precoItem , produto);

            pedido.adicionarItem(itemDoPedido);
        }

        System.out.println();
        System.out.println(pedido);


    }
}
