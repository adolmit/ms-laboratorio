package br.com.laboratorio.mslaboratorio.service;

import br.com.laboratorio.mslaboratorio.Entity.LaboratorioEntity;
import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface LaboratorioService {
    public List<LaboratorioDTO> listarTodos();
    public LaboratorioDTO buscar(Long id);
    public LaboratorioDTO salvar(LaboratorioDTO laboratorioDTO);
    public void actualizar(Long id, LaboratorioDTO laboratorioDTO);
    public void excluir(Long id) ;
}
