package herenca.exercicio03;

public class PessoaFisica extends Contribuinte {
    private double despesasComSaude;

    public PessoaFisica(String nome, double rendaAnual, double despesasComSaude) {
        super(nome, rendaAnual);
        this.despesasComSaude = despesasComSaude;
    }

    @Override
    public double taxa() {
        if(getRendaAnual() < 20000.00){
           return getRendaAnual() * 0.15 - despesasComSaude * 0.5;
        } else {
           return (getRendaAnual() * 0.25) - (despesasComSaude * 0.5);
        }
    }

    public double getDespesasComSaude() {
        return despesasComSaude;
    }

    public void setDespesasComSaude(double despesasComSaude) {
        this.despesasComSaude = despesasComSaude;
    }
}
