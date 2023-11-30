package br.edu.infnet.appEduca;

import java.time.LocalDate;

public class Avaliacao {
    private int nota;
    private LocalDate dataAvaliacao;
    private String comentario;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        // Adicione verificações, se necessário
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar no intervalo de 0 a 10.");
        }

        this.nota = nota;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
