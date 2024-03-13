package br.com.laboratorio.mslaboratorio.repository;

import br.com.laboratorio.mslaboratorio.Entity.PropriedadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropriedadeRepository extends JpaRepository<PropriedadeEntity, Long> {
}
