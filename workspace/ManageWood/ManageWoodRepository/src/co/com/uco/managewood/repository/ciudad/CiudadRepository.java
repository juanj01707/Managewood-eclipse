package co.com.uco.managewood.repository.ciudad;

import co.com.uco.managewood.entity.CiudadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CiudadRepository extends JpaRepository<CiudadEntity, UUID>, CiudadRepositoryCustom {
}
