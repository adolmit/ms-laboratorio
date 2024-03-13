package br.com.laboratorio.mslaboratorio.contoller;

import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.dto.PessoaLaboratorioDTO;
import br.com.laboratorio.mslaboratorio.service.PessoaLaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class PessoaLaboratorioController {
    @Autowired
    private PessoaLaboratorioService pessoaLaboratorioService;

    @PostMapping("/pessoa-laboratorio")
    public PessoaLaboratorioDTO salvar(@RequestBody PessoaLaboratorioDTO pessoaLaboratorioDTO) {
        return pessoaLaboratorioService.salvar(pessoaLaboratorioDTO);
    }

    @GetMapping("/pessoa-laboratorio")
    public List<PessoaLaboratorioDTO> listarTodos() {
        return pessoaLaboratorioService.listarTodos();
    }


    @GetMapping("/pessoa-laboratorio/buscar")
    public List<PessoaLaboratorioDTO> buscar(@RequestParam(name="dtInicio",required=false)
                                             LocalDate dtInicio,
                                             @RequestParam(name="dtFim",required=false)
                                             LocalDate dtFim,
                                             @RequestParam(name="texto",required=false) String texto,
                                             @RequestParam(name="quantidade") Long quantidade
    ) {
        return pessoaLaboratorioService.buscar(dtInicio, dtFim, texto, quantidade);
    }
}
