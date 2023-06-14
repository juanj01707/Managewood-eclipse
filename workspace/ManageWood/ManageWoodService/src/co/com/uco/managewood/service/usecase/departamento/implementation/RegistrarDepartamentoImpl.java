package co.com.uco.managewood.service.usecase.departamento.implementation;

import co.com.uco.managewood.entity.DepartamentoEntity;
import co.com.uco.managewood.repository.DepartamentoRepository;
import co.com.uco.managewood.service.domain.DepartamentoDomain;
import co.com.uco.managewood.service.mapper.MapperToEntity;
import co.com.uco.managewood.service.usecase.departamento.RegistrarDepartamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrarDepartamentoImpl implements RegistrarDepartamento {

    @Autowired
    private DepartamentoRepository repository;

    @Override
    public void execute(DepartamentoDomain domain) {
        //TODO: Realizar Implementación
        // Crear el ensamblador
        MapperToEntity<DepartamentoDomain,DepartamentoEntity> map = new MapperToEntity<>();
        DepartamentoEntity entity = map.mapToEntity(domain,DepartamentoEntity.class);
        repository.save(entity);
    }
}
