package br.ucsal.clinicaespecial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CRM;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "contato", length = 15)
    private String contato;

    private String endereco;

    @OneToOne(mappedBy = "medico")
    private Exame exame;
}
