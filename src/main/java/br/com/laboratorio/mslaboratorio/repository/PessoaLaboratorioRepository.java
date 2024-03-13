package br.com.laboratorio.mslaboratorio.repository;

import br.com.laboratorio.mslaboratorio.Entity.PessoaLaboratorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface PessoaLaboratorioRepository extends JpaRepository<PessoaLaboratorioEntity, Long> {
    @Query("SELECT p.laboratorio.id, p.nome, COUNT(*) FROM PessoaLaboratorioEntity p " +
            "WHERE p.dtInicio >= ?1 AND p.dtFim<=?2 AND p.observacoes like %?3% " +
            "group by p.laboratorio.id, p.nome " +
            "order by p.laboratorio.id DESC ")
    List<PessoaLaboratorioEntity> buscar(LocalDate dtInicio, LocalDate dtFim, String texto, Long quantidade);
}
