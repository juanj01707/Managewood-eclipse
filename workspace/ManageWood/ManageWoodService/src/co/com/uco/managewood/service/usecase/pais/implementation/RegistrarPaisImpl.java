package co.com.uco.managewood.service.usecase.pais.implementation;

import co.com.uco.managewood.entity.PaisEntity;
import co.com.uco.managewood.repository.PaisRepository;
import co.com.uco.managewood.service.domain.PaisDomain;
import co.com.uco.managewood.service.mapper.MapperToEntity;
import co.com.uco.managewood.service.usecase.pais.RegistrarPais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrarPaisImpl implements RegistrarPais {

    @Autowired
    private PaisRepository repository;

    @Override
    public void execute(PaisDomain domain) {
        //TODO: realizar Implementación validaciones
        // Crear ensamblador
        MapperToEntity<PaisDomain,PaisEntity> map = new MapperToEntity<>();
        PaisEntity entity = map.mapToEntity(domain,PaisEntity.class);
        // Realizar validaciones
        repository.save(entity);
    }
}
