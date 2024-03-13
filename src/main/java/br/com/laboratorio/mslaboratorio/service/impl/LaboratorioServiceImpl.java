package br.com.laboratorio.mslaboratorio.service.impl;

import br.com.laboratorio.mslaboratorio.Entity.LaboratorioEntity;
import br.com.laboratorio.mslaboratorio.Entity.PessoaLaboratorioEntity;
import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.dto.PessoaLaboratorioDTO;
import br.com.laboratorio.mslaboratorio.repository.LaboratorioRepository;
import br.com.laboratorio.mslaboratorio.service.LaboratorioService;
import javassist.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaboratorioServiceImpl implements LaboratorioService {
    @Autowired
    private LaboratorioRepository laboratorioRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<LaboratorioDTO> listarTodos() {
        return laboratorioRepository.findAll()
                .stream()
                .map(it -> modelMapper.map(it, LaboratorioDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public LaboratorioDTO buscar(Long id) {
        LaboratorioEntity x = laboratorioRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
        return modelMapper.map(x,LaboratorioDTO.class);
    }

    @Override
    public LaboratorioDTO salvar(LaboratorioDTO laboratorioDTO) {
        LaboratorioEntity p= this.laboratorioRepository.save(modelMapper.map(laboratorioDTO, LaboratorioEntity.class));
        return modelMapper.map(p, LaboratorioDTO.class);
    }

    @Override
    public void actualizar(Long id, LaboratorioDTO laboratorioDTO) {
        laboratorioDTO.setId(id);
        this.laboratorioRepository.save(modelMapper.map(laboratorioDTO, LaboratorioEntity.class));
    }

    @Override
    public void excluir(Long id) {
        this.laboratorioRepository.deleteById(id);
    }

}
