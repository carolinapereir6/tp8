package br.edu.infnet.appEduca;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Lembrete {
    private LocalDate dataDoLembrete;
    private String informacao;
    private Set<LembreteAssociado> produtosAssociados = new HashSet<>();

    public Set<LembreteAssociado> getProdutosAssociados() {
        return produtosAssociados;
    }
    

    public LocalDate getDataDoLembrete() {
        return dataDoLembrete;
    }

    public void setDataDoLembrete(LocalDate dataDoLembrete) {
        this.dataDoLembrete = dataDoLembrete;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
}
