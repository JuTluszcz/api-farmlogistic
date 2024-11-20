package br.edu.utfpr.farmlogistic.model;

public class Alimentacao {
    private String tipoAlimentacao;
    private double quantidade;
    private String periodo;

    // Construtores
    public Alimentacao(String tipoAlimentacao, double quantidade, String periodo) {
        this.tipoAlimentacao = tipoAlimentacao;
        this.quantidade = quantidade;
        this.periodo = periodo;
    }

    // Getters e Setters
    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
