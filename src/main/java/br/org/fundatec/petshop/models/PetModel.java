package br.org.fundatec.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PET")
public class PetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPet;

    @Column(length = 250, nullable = false)
    private String nome;

    @Column(nullable = false)
    private Integer idade;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "idTipoAnimal")
    private TipoAnimalModel tipoAnimal;

}
