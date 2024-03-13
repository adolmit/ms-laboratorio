package br.com.laboratorio.mslaboratorio.service.impl;

import br.com.laboratorio.mslaboratorio.Entity.PessoaLaboratorioEntity;
import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.dto.PessoaLaboratorioDTO;
import br.com.laboratorio.mslaboratorio.repository.PessoaLaboratorioRepository;
import br.com.laboratorio.mslaboratorio.service.PessoaLaboratorioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaLaboratorioServiceImpl implements PessoaLaboratorioService {

    @Autowired
    PessoaLaboratorioRepository pessoaLaboratorioRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public PessoaLaboratorioDTO salvar(PessoaLaboratorioDTO pessoaLaboratorio) {
        PessoaLaboratorioEntity p= this.pessoaLaboratorioRepository.save(modelMapper.map(pessoaLaboratorio, PessoaLaboratorioEntity.class));
        return modelMapper.map(p,PessoaLaboratorioDTO.class);
    }

    @Override
    public List<PessoaLaboratorioDTO> listarTodos() {
        return pessoaLaboratorioRepository.findAll()
                .stream()
                .map(it -> modelMapper.map(it, PessoaLaboratorioDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<PessoaLaboratorioDTO> buscar(LocalDate dtInicio, LocalDate dtFim, String texto, Long quantidade) {
        List<PessoaLaboratorioEntity> x =  pessoaLaboratorioRepository.buscar(dtInicio, dtFim, texto, quantidade);
        return x
                .stream()
                .map(it -> modelMapper.map(it, PessoaLaboratorioDTO.class))
                .collect(Collectors.toList());

    }
}
