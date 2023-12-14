package br.org.fundatec.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PEIXE")
public class PeixeModel extends TipoAnimalModel {

    @Column(nullable = false)
    private String tipoAgua;
}
