package br.org.fundatec.petshop.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_TIPO_ANIMAL")
@Inheritance(strategy = InheritanceType.JOINED)
public class TipoAnimalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoAnimal;

    @Column(length = 50, nullable = false)
    private String especie;

    @OneToMany(mappedBy = "tipoAnimal")
    private List<PetModel> pets;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private ProdutoModel produto;

}
