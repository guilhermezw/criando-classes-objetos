package composicao.exercicio03;

public class ItemDoPedido {
    private int quantidade;
    private double preco;
    private Produto produto;

    public ItemDoPedido() {
    }

    public ItemDoPedido(int quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal(){
      return preco * quantidade;
    }

    @Override
    public String toString() {
        return getProduto().getNome()
                + ", $"
                + String.format("%.2f", preco)
                + ", Quantidade: "
                + quantidade
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
