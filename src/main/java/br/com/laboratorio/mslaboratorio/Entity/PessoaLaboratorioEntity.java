package br.com.laboratorio.mslaboratorio.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="PESSOA_LABORATORIO")
public class PessoaLaboratorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column(name = "dt_inicio")
    private LocalDate dtInicio;
    @Column(name = "dt_fim")
    private LocalDate dtFim;
    @OneToOne
    @JoinColumn(name = "laboratorio_id", referencedColumnName = "id")
    private LaboratorioEntity laboratorio;
    @OneToOne
    @JoinColumn(name = "propriedade_id", referencedColumnName = "id")
    private PropriedadeEntity propriedade;
    @Column
    private String observacoes;

}
