package br.edu.infnet.appEduca;

public class LembreteAssociado {
    private Produto produto;
    private Lembrete lembrete;

    public LembreteAssociado(Produto produto, Lembrete lembrete) {
        this.produto = produto;
        this.lembrete = lembrete;
    }

    // Exemplo de método que usa os atributos
    public void realizarAcao() {
        // Lógica usando produto e lembrete
    }

    // Getters e setters para acessar os atributos, se necessário
    public Produto getProduto() {
        return produto;
    }

    public Lembrete getLembrete() {
        return lembrete;
    }
}