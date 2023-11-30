package br.edu.infnet.appEduca;

import java.time.LocalDate;

public class Mensalidade {
    private double valorPago;
    private LocalDate dataInicial;
    private LocalDate dataFinal;

    public Mensalidade(double valorPago, LocalDate dataInicial, LocalDate dataFinal) {
        // Adiciona verificações, se necessário
        if (valorPago < 0) {
            throw new IllegalArgumentException("O valor pago não pode ser negativo.");
        }

        this.valorPago = valorPago;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        // Adiciona verificações, se necessário
        if (valorPago < 0) {
            throw new IllegalArgumentException("O valor pago não pode ser negativo.");
        }

        this.valorPago = valorPago;
    }

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

    public void add(Mensalidade mensalidade) {
    }

    
}
