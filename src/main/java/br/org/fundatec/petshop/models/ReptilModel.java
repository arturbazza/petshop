package br.org.fundatec.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_REPTIL")
public class ReptilModel extends TipoAnimalModel {


    @Column(nullable = false)
    private boolean peconhento;

}
