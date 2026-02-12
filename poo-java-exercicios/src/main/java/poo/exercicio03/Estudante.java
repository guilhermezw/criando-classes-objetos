package poo.exercicio03;

public class Estudante {
    public String nome;
    public double primeiraTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public double calculoNota(){
        return primeiraTrimestre + segundoTrimestre + terceiroTrimestre;
    }

    public void verificarNota(){
        if (calculoNota() < 60){
            System.out.printf("Nota do aluno: %.2f\n" , calculoNota());
            double diferencia = 60 - calculoNota();
            System.out.printf("Aluno reprovado faltam %.2f para ser aprovado!", diferencia);
        } else {
            System.out.printf("Nota do aluno: %.2f\n",calculoNota());
            System.out.println("Aluno aprovado!");
        }
    }
}
