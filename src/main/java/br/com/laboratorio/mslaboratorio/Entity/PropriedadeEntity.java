package br.com.laboratorio.mslaboratorio.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="PROPRIEDADE")
public class PropriedadeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descricao;
    @Column
    private char estado;
}