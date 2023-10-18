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
public class Exame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultado;

    private Date data;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Tipo_Exame", referencedColumnName = "id")
    private TipoExame idTipoExame;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CRM_Medico", referencedColumnName = "CRM")
    private Medico medico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CPF_Funcionario", referencedColumnName = "CPF")
    private Funcionario funcionario;
}
