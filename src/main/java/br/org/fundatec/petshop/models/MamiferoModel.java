package br.org.fundatec.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_MAMIFERO")
public class MamiferoModel extends TipoAnimalModel {

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private boolean possuiPelos;

    @OneToOne(mappedBy = "mamifero")
    private VacinaModel vacina;
}
