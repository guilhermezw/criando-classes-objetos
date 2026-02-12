package herenca.exercicio02;

public class ProdutoImportado extends Produto{
    private double taxaAlfandegaria;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, double preco, double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    @Override
    public String etiquetaPreco(){
        return "Produto Importado: " + getNome() + " | Preço: R$ " + precoTotal() + " | Taxa alfandegaria: " + getTaxaAlfandegaria();
    }

    public double precoTotal(){
        return getPreco() + taxaAlfandegaria;
    }
}
