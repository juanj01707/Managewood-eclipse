package co.com.uco.managewood.service.usecase.cliente.implementation;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.uco.managewood.crosscutting.exceptions.service.ServiceCustomException;
import co.com.uco.managewood.entity.ClienteEntity;
import co.com.uco.managewood.repository.cliente.ClienteRepository;
import co.com.uco.managewood.service.domain.ClienteDomain;

import co.com.uco.managewood.service.mapper.MapperToEntity;
import co.com.uco.managewood.service.specification.cliente.ClienteSpecification;
import co.com.uco.managewood.service.usecase.cliente.RegistrarCliente;
import jakarta.persistence.PersistenceException;

public class RegistrarClienteImpl implements RegistrarCliente{

	@Autowired
    private ClienteRepository repository;

    @Autowired
    private ClienteSpecification specification;

    @Override
    public void execute(ClienteDomain domain) {
        try{
            specification.isSatisfied(domain);
            MapperToEntity<ClienteDomain, ClienteEntity> mapperToEntity = new MapperToEntity<>();
            ClienteEntity entity = mapperToEntity.mapToEntity(domain, ClienteEntity.class);
            repository.save(entity);
        }catch (ServiceCustomException exception){
            throw ServiceCustomException.createUserException(exception.getUserMessage());
        }catch (PersistenceException exception){
            throw ServiceCustomException.wrapException(exception.getMessage(),ServiceCustomException.createUserException("a"));
        }

    }

}
