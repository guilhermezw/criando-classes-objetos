package poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Retangulo retangulo= new Retangulo();

        System.out.println("Menu: Retângulo");
        System.out.println("Digite a altura do Retângulo: ");
        retangulo.altura = sc.nextDouble();
        System.out.println("Digite a largura do Retângulo: ");
        retangulo.largura = sc.nextDouble();
        System.out.printf("A area do Retângulo: %.2f", retangulo.area());
        System.out.printf("O perimetro do Retângulo: %.2f " , retangulo.perimetro());
        System.out.printf("A diagonal do Retângulo: %.2f" , retangulo.diagonal());
    }
}