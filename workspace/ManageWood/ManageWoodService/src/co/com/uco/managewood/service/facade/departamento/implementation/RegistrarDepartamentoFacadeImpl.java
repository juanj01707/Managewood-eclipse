package co.com.uco.managewood.service.facade.departamento.implementation;

import co.com.uco.managewood.dto.DepartamentoDTO;
import co.com.uco.managewood.service.domain.DepartamentoDomain;
import co.com.uco.managewood.service.facade.departamento.RegistrarDepartamentoFacade;
import co.com.uco.managewood.service.mapper.MapperDTOToDomain;
import co.com.uco.managewood.service.usecase.departamento.RegistrarDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistrarDepartamentoFacadeImpl implements RegistrarDepartamentoFacade {

    @Autowired
    private RegistrarDepartamento useCase;

    @Override
    public void execute(DepartamentoDTO dto) {
        MapperDTOToDomain<DepartamentoDTO,DepartamentoDomain> map = new MapperDTOToDomain<>();
        DepartamentoDomain domain = map.mapToDomain(dto, DepartamentoDomain.class);
        useCase.execute(domain);
    }
}
