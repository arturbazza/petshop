package br.org.fundatec.petshop.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CLIENTES")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    @Column(length = 250, nullable = false)
    private String nome;

    @Column(length = 15, nullable = false)
    private String cpf;
    @OneToMany(mappedBy = "cliente")
    private List<AtendimentoModel> atendimentos;

    @OneToMany(mappedBy = "cliente")
    private List<PetModel> pets;

    @OneToOne(mappedBy = "cliente")
    private EnderecoModel endereco;

    // Getters e Setters
}
