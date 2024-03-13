package br.com.laboratorio.mslaboratorio.service.impl;

import br.com.laboratorio.mslaboratorio.dto.PropriedadeDTO;
import br.com.laboratorio.mslaboratorio.repository.PropriedadeRepository;
import br.com.laboratorio.mslaboratorio.service.PropriedadeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PropriedadeServiceImpl implements PropriedadeService {
    @Autowired
    private PropriedadeRepository propiedadeRepository;
    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<PropriedadeDTO> listarTodos() {
        return propiedadeRepository.findAll()
                .stream()
                .map(it -> modelMapper.map(it, PropriedadeDTO.class))
                .collect(Collectors.toList());
    }
}
