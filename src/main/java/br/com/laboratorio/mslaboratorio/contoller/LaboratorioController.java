package br.com.laboratorio.mslaboratorio.contoller;

import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.service.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaboratorioController {
    @Autowired
    private LaboratorioService laboratorioService;

    @GetMapping("/laboratorios")
    public List<LaboratorioDTO> listarTodos() {
        return laboratorioService.listarTodos();
    }
}
