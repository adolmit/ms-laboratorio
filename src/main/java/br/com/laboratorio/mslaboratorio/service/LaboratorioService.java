package br.com.laboratorio.mslaboratorio.service;

import br.com.laboratorio.mslaboratorio.Entity.LaboratorioEntity;
import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;

import java.util.List;

public interface LaboratorioService {
    public List<LaboratorioDTO> listarTodos();
}
