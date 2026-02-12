package poo.exercicio05;

public class Conta {
    private final int numeroConta;
    private String nomeTitular;
    private double saldoConta;
    public static final double taxa = 5.0;

    public Conta(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void saldoDeposito(double addDeposito){
        this.saldoConta += addDeposito;
    }

    public void saldoSaque(double subSaque){
        this.saldoConta -= subSaque + taxa;
    }
}
