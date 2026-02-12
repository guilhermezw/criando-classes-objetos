package composicao.exercicio03;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date momento;
    private StatusDoPedido statusDoPedido;
    private Cliente cliente;
    private List<ItemDoPedido> items = new ArrayList<>();

    private static SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Pedido(Date momento, StatusDoPedido statusDoPedido, Cliente cliente) {
        this.momento = momento;
        this.statusDoPedido = statusDoPedido;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDoPedido> getItems() {
        return items;
    }


    public void adicionarItem(ItemDoPedido pedido){
        items.add(pedido);
    }

    public void removerItem(ItemDoPedido pedido){
        items.remove(pedido);
    }

    public double total(){
        double soma = 0.0;
        for(ItemDoPedido item : items){
            soma += item.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Data do pedido: ");
        sb.append(formatador.format(momento) + "\n");
        sb.append("Status do pedido: ");
        sb.append(statusDoPedido + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Pedidos items:\n");
        for (ItemDoPedido item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total preço: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
