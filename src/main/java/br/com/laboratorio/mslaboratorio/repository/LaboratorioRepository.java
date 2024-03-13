package br.com.laboratorio.mslaboratorio.repository;

import br.com.laboratorio.mslaboratorio.Entity.LaboratorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboratorioRepository extends JpaRepository<LaboratorioEntity, Long> {
}
