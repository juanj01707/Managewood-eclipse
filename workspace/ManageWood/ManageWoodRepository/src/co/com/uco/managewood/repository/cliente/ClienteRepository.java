package co.com.uco.managewood.repository.cliente;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.uco.managewood.entity.ClienteEntity;


public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID>, ClienteRepositoryCustom{

}
