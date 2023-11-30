package br.edu.infnet.appEduca;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Produto {
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private int tipoProduto;
    private double duracao;
    private int paginas;
    private List<Pedido> pedidos = new ArrayList<>();
    
    private Set<LembreteAssociado> lembretesAssociados = new HashSet<>();

    public void associarLembrete(Lembrete lembrete) {
        LembreteAssociado lembreteAssociado = new LembreteAssociado(this, lembrete);
        lembretesAssociados.add(lembreteAssociado);
        lembrete.getProdutosAssociados().add(lembreteAssociado);
    }

    public Set<LembreteAssociado> getLembretesAssociados() {
        return lembretesAssociados;
    }
    
    public Produto(LocalDate dataInicial, LocalDate dataFinal, int tipoProduto, double duracao, int paginas) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipoProduto = tipoProduto;
       // Verificações adicionadas - 0 é vídeo aula e 1 é PDF
       if (tipoProduto == 0 && paginas != 0) {
        throw new IllegalArgumentException("Para tipo de produto 0, a quantidade de páginas deve ser 0.");
    } else if (tipoProduto == 1 && duracao != 0) {
        throw new IllegalArgumentException("Para tipo de produto 1, a duração deve ser 0.");
    }

    this.duracao = duracao;
    this.paginas = paginas;
    }

    // Métodos getters e setters

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(int tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }
}

