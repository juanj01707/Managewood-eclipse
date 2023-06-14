package co.com.uco.managewood.service.facade.pais.implementation;

import co.com.uco.managewood.dto.PaisDTO;
import co.com.uco.managewood.service.domain.PaisDomain;
import co.com.uco.managewood.service.facade.pais.RegistrarPaisFacade;
import co.com.uco.managewood.service.mapper.MapperDTOToDomain;
import co.com.uco.managewood.service.usecase.pais.RegistrarPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrarPaisFacadeImpl implements RegistrarPaisFacade {

    @Autowired
    private RegistrarPais useCase;

    @Override
    public void execute(PaisDTO dto) {
        MapperDTOToDomain<PaisDTO,PaisDomain> map = new MapperDTOToDomain<>();
        PaisDomain domain = map.mapToDomain(dto, PaisDomain.class);
        useCase.execute(domain);
    }
}
