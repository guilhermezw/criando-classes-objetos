package herenca.exercicio03;

public class PessoaJuridica extends Contribuinte {
    private int numeroDeFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double taxa() {
        if(numeroDeFuncionarios > 10){
            return getRendaAnual() * 0.14;
        } else {
            return  getRendaAnual() * 0.16;
        }
    }


    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }
}
