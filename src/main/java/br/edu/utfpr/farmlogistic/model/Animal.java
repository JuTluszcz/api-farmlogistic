package br.edu.utfpr.farmlogistic.model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "animal")
@Getter
@Setter
@NoArgsConstructor
@ToString
@ApiModel(description = "Modelo que representa um animal na fazenda")
public class Animal extends BasicEntity {
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
}
