package poo.exercicio02;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem){
        double valorDoAumento = this.salarioBruto * (porcentagem / 100.0);
        this.salarioBruto += valorDoAumento;
    }
}
