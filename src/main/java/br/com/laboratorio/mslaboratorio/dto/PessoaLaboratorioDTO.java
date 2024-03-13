package br.com.laboratorio.mslaboratorio.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class PessoaLaboratorioDTO {
    private Long id;
    private String nome;
    private LocalDate dtInicio;
    private LocalDate dtFim;
    private LaboratorioDTO laboratorio;
    private PropriedadeDTO propriedade;
    private String observacoes;
}
