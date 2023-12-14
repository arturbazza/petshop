package br.org.fundatec.petshop.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_UNIDADE")
public class UnidadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUnidade;

    @Column(length = 250, nullable = false)
    private String nome;

    @OneToOne
    @JoinColumn(name = "idEndereco")
    private EnderecoModel endereco;

    @OneToMany(mappedBy = "unidade")
    private List<AtendimentoModel> atendimentos;

}
