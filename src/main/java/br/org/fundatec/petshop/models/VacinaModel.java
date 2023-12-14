package br.org.fundatec.petshop.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TB_VACINA")
public class VacinaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVacina;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private LocalDate validade;

    @Column(nullable = false)
    private String doencasAplicaveis;

    @OneToOne
    @JoinColumn(name = "idMamifero")
    private MamiferoModel mamifero;

}
