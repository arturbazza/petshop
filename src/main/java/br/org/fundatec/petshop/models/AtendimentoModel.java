package br.org.fundatec.petshop.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_ATENDIMENTO")
public class AtendimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtendimento;

    @Column(nullable = false)
    private LocalDateTime data;

    @Column(length = 250, nullable = false)
    private String nomeAtendente;

    @Column(nullable = false)
    private boolean pagamentoEfetuado;

    @Column(nullable = false)
    private Double valorConsulta;

    @Column(length = 10, nullable = false)
    private String estado;

    // Relacionamentos
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "idProduto")
    private ProdutoModel produto;

    @ManyToOne
    @JoinColumn(name = "idPet")
    private PetModel pet;

    @ManyToOne
    @JoinColumn(name = "idUnidade")
    private UnidadeModel unidade;

}
