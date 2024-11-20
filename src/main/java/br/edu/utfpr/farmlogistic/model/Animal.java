package br.edu.utfpr.farmlogistic.model;

public class Animal {
    private double peso;
    private String raca;
    private String tipoAlimentacao;
    private int idade;
    private String estadoSaude;

    public Animal(double peso, String raca, String tipoAlimentacao, int idade, String estadoSaude) {
        this.peso = peso;
        this.raca = raca;
        this.tipoAlimentacao = tipoAlimentacao;
        this.idade = idade;
        this.estadoSaude = estadoSaude;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

}
