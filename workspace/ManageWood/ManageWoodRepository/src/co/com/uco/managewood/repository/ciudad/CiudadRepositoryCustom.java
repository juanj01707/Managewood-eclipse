package co.com.uco.managewood.repository.ciudad;

import co.com.uco.managewood.entity.CiudadEntity;

import java.util.List;

public interface CiudadRepositoryCustom {
    List<CiudadEntity> findCustom(CiudadEntity ciudadEntity);
}
