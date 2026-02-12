package tratamento.exercicio02.model.entities;

import tratamento.exercicio02.model.exception.BusinessException;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double saqueLimite;

    public Conta() {
    }

    public Conta(int numero, String titular, double saldo, double saqueLimite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.saqueLimite = saqueLimite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaqueLimite() {
        return saqueLimite;
    }

    public void setSaqueLimite(double saqueLimite) {
        this.saqueLimite = saqueLimite;
    }


    public double saque(double quantia) {
        if (quantia > saqueLimite){
            throw new BusinessException("Erro de retirada: O valor excede o limite de retirada");
        } else if (quantia > getSaldo()){
            throw new BusinessException("Erro de retirada: Saldo insuficinete");
        } else {
            return saldo -= quantia;
        }
    }
}
