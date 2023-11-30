package br.edu.infnet.appEduca;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private LocalDate dataPedido;
    private int tipoPedido;
    private double valor;
    private List<Produto> produtos = new ArrayList<>();

    public Pedido(LocalDate dataPedido, int tipoPedido, double valor) {
        this.dataPedido = dataPedido;
        this.tipoPedido = tipoPedido;
        // Tipo 0 - mensalidade; tipo 1 - compra única
        this.valor = valor;
    }

    // Métodos getters e setters

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(int tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        produto.adicionarPedido(this);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
        produto.removerPedido(this);
    }

    public void adicionarMensalidade(Mensalidade mensalidade) {
        // Verificações adicionadas
        if (tipoPedido != 0) {
            throw new IllegalArgumentException("Somente pedidos do tipo 0 podem ter mensalidades.");
        }

        mensalidade.add(mensalidade);
    }


}