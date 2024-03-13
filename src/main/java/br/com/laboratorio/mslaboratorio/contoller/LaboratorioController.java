package br.com.laboratorio.mslaboratorio.contoller;

import br.com.laboratorio.mslaboratorio.dto.LaboratorioDTO;
import br.com.laboratorio.mslaboratorio.service.LaboratorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaboratorioController {
    @Autowired
    private LaboratorioService laboratorioService;

    @GetMapping("/laboratorios")
    public List<LaboratorioDTO> listarTodos() {
        return laboratorioService.listarTodos();
    }
    @GetMapping("/laboratorios/{id}")
    public LaboratorioDTO buscar(@PathVariable Long id) {
        return laboratorioService.buscar(id);
    }
    @PostMapping("/laboratorios")
    public LaboratorioDTO salvar(@RequestBody LaboratorioDTO laboratorioDTO) {
        return laboratorioService.salvar(laboratorioDTO);
    }
    @PutMapping("/laboratorios/{id}")
    public void actualizar(@PathVariable Long id, @RequestBody LaboratorioDTO laboratorioDTO) {
        laboratorioService.actualizar(id, laboratorioDTO);
    }
    @DeleteMapping("/laboratorios/{id}")
    public void excluir(@PathVariable Long id) {
        laboratorioService.excluir(id);
    }
}
