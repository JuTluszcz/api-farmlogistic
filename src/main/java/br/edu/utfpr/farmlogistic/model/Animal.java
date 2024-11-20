package br.edu.utfpr.farmlogistic.model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Modelo que representa um animal na fazenda")
public class Animal {
    @ApiModelProperty(value = "Peso do animal em quilogramas", example = "20.5")
    private double peso;
    
    @ApiModelProperty(value = "Raça do animal", example = "Labrador")
    private String raca;
    
    @ApiModelProperty(value = "Tipo de alimentação do animal", example = "Seca")
    private String tipoAlimentacao;
    
    @ApiModelProperty(value = "Idade do animal em anos", example = "5")
    private int idade;
    
    @ApiModelProperty(value = "Estado de saúde do animal", example = "Saudável")
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
