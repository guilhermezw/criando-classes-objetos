package poo.exercicio04;

public class ConversorMoeda {

    public static  final double IOF = 0.06;

    public  static double conversaoMoeda(double valorDolar , double comprarDolar){
        double calcular = valorDolar * comprarDolar * IOF;
        return calcular + valorDolar * comprarDolar;
    }

}
