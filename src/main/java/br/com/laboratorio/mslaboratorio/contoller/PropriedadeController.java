package br.com.laboratorio.mslaboratorio.contoller;

import br.com.laboratorio.mslaboratorio.dto.PropriedadeDTO;
import br.com.laboratorio.mslaboratorio.service.PropriedadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropriedadeController {
    @Autowired
    private PropriedadeService propriedadeService;

    @GetMapping("/propriedades")
    public List<PropriedadeDTO> listarTodos() {
        return propriedadeService.listarTodos();
    }
}
