package co.com.uco.managewood.service.facade.ciudad.implementation;

import co.com.uco.managewood.dto.CiudadDTO;
import co.com.uco.managewood.service.domain.CiudadDomain;
import co.com.uco.managewood.service.facade.ciudad.RegistrarCiudadFacade;
import co.com.uco.managewood.service.mapper.MapperDTOToDomain;
import co.com.uco.managewood.service.usecase.ciudad.RegistrarCiudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrarCiudadFacadeImpl implements RegistrarCiudadFacade {

    @Autowired
    private RegistrarCiudad useCase;

    @Override
    public void execute(CiudadDTO dto) {
        MapperDTOToDomain<CiudadDTO, CiudadDomain> mapperDTOToDomain = new MapperDTOToDomain<>();
        CiudadDomain domain = mapperDTOToDomain.mapToDomain(dto, CiudadDomain.class);
        useCase.execute(domain);
    }
}
