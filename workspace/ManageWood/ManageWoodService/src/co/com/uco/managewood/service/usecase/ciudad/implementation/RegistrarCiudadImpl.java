package co.com.uco.managewood.service.usecase.ciudad.implementation;

import co.com.uco.managewood.crosscutting.exceptions.ManegeWoodCustomException;
import co.com.uco.managewood.crosscutting.exceptions.service.ServiceCustomException;
import co.com.uco.managewood.entity.CiudadEntity;
import co.com.uco.managewood.repository.ciudad.CiudadRepository;
import co.com.uco.managewood.service.domain.CiudadDomain;
import co.com.uco.managewood.service.mapper.MapperToEntity;
import co.com.uco.managewood.service.specification.ciudad.CiudadSpecification;
import co.com.uco.managewood.service.usecase.ciudad.RegistrarCiudad;
import jakarta.persistence.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrarCiudadImpl implements RegistrarCiudad {

    @Autowired
    private CiudadRepository repository;

    @Autowired
    private CiudadSpecification specification;

    @Override
    public void execute(CiudadDomain domain) {
        try{
            specification.isSatisfied(domain);
            MapperToEntity<CiudadDomain, CiudadEntity> mapperToEntity = new MapperToEntity<>();
            CiudadEntity entity = mapperToEntity.mapToEntity(domain, CiudadEntity.class);
            repository.save(entity);
        }catch (ServiceCustomException exception){
            throw ServiceCustomException.createUserException(exception.getUserMessage());
        }catch (PersistenceException exception){
            throw ServiceCustomException.wrapException(exception.getMessage(),ServiceCustomException.createUserException("a"));
        }

    }
}
