package co.com.uco.managewood.service.facade.cliente.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.uco.managewood.dto.ClienteDTO;
import co.com.uco.managewood.service.domain.ClienteDomain;
import co.com.uco.managewood.service.facade.cliente.RegistrarClienteFacade;
import co.com.uco.managewood.service.mapper.MapperDTOToDomain;
import co.com.uco.managewood.service.usecase.cliente.RegistrarCliente;



public class RegistrarClienteFacadeImpl implements RegistrarClienteFacade{
	@Autowired
    private RegistrarCliente useCase;

    @Override
    public void execute(ClienteDTO dto) {
        MapperDTOToDomain<ClienteDTO, ClienteDomain> mapperDTOToDomain = new MapperDTOToDomain<>();
        ClienteDomain domain = mapperDTOToDomain.mapToDomain(dto, ClienteDomain.class);
        useCase.execute(domain);

    }


}
