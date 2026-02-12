package composicao.exercicio02;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> listPost = new ArrayList<>();

        int exit = 1;

        do {
            System.out.print("Quantos post desejar criar?");
            int numPost = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < numPost; i++) {
                System.out.println("Criar Post: ");
                LocalDateTime data = LocalDateTime.now();
                System.out.println("Data da criação: " + data);
                System.out.print("Digite o titulo do post: ");
                String titulo = sc.nextLine();
                System.out.print("Digite o conteudo do post: ");
                String conteudo = sc.nextLine();
                System.out.print("Digite números de like:");
                int like = sc.nextInt();
                Post post = new Post(data, titulo, conteudo, like);
                System.out.println("Quantos comentarios deseja adicionar?");
                int numComentario = sc.nextInt();
                sc.nextLine();

                for (int j = 0; j < numComentario; j++) {
                    System.out.print("Digite o comentario: ");
                    String texto = sc.nextLine();
                    Comentario comentario = new Comentario(texto);
                    post.adicionarComentario(comentario);
                }
                listPost.add(post);
            }

            for (Post p : listPost) {
                System.out.println(p);
            }
            System.out.println("Exit : 0");
            exit = sc.nextInt();
            System.out.println();
        } while (exit != 0);


    }

}
