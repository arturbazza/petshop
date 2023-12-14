package br.org.fundatec.petshop.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;

    @Column(nullable = false)
    private Double valor;

    @Column(length = 100, nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "produto")
    private List<AtendimentoModel> atendimentos;

    @ManyToOne
    @JoinColumn(name = "idTipoAnimal")
    private TipoAnimalModel tipoAnimal;
}
