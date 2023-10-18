package br.ucsal.clinicaespecial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CPF;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "contato", length = 15)
    private String contato;

    @Column(name = "cargo", length = 100)
    private String cargo;

    @Column(name = "data_admissao")
    private Date dataAdmissao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CNPJ_Empresa", referencedColumnName = "CNPJ")
    private Empresa empresa;

    @OneToOne(mappedBy = "funcionario")
    private Exame exame;
}
