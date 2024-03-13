package br.com.laboratorio.mslaboratorio.service;

import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.dto.PessoaLaboratorioDTO;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PessoaLaboratorioService {
    public PessoaLaboratorioDTO salvar(PessoaLaboratorioDTO pessoaLaboratorio);
    public List<PessoaLaboratorioDTO> listarTodos();
    public List<PessoaLaboratorioDTO> buscar(LocalDate dtInicio,
                                             LocalDate dtFim,
                                             String texto,
                                             Long quantidade);
}
