package br.ucsal.clinicaespecial.model;

import jakarta.persistence.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Atestado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date data;

    @Column(name = "data_expiracao")
    private Date dataExpiracao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_Exame", referencedColumnName = "id")
    private Exame exame;
}
