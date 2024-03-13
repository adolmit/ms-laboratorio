package br.com.laboratorio.mslaboratorio.service.impl;

import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.repository.LaboratorioRepository;
import br.com.laboratorio.mslaboratorio.service.LaboratorioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaboratorioServiceImpl implements LaboratorioService {
    @Autowired
    private LaboratorioRepository laboratorioRepository;

    private ModelMapper modelMapper;

    @Override
    public List<LaboratorioDTO> listarTodos() {
        ModelMapper modelMapper = new ModelMapper();

        return laboratorioRepository.findAll()
                .stream()
                .map(it -> modelMapper.map(it, LaboratorioDTO.class))
                .collect(Collectors.toList());
    }

}
