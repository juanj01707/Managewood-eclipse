package co.com.uco.managewood.repository;

import co.com.uco.managewood.entity.DepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, UUID> {
}
