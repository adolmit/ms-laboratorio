package br.com.laboratorio.mslaboratorio.Entity;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="LABORATORIO")
public class LaboratorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descricao;
    @Column
    private char estado;
}
