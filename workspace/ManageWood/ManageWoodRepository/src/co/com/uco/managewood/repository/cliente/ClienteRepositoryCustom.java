package co.com.uco.managewood.repository.cliente;

import java.util.List;

import co.com.uco.managewood.entity.ClienteEntity;

public interface ClienteRepositoryCustom {
	 List<ClienteEntity> findCustom(ClienteEntity clienteEntity);
}
