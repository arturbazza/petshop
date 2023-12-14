package br.org.fundatec.petshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ENDERECO")
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    @Column(length = 250, nullable = false)
    private String logradouro;

    @Column(length = 150, nullable = false)
    private String bairro;

    @Column(nullable = false)
    private Integer numero;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private ClienteModel cliente;

    @OneToOne(mappedBy = "endereco")
    private UnidadeModel unidade;

}
