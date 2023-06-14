package co.com.uco.managewood.service.specification.ciudad.implementation;

import co.com.uco.managewood.crosscutting.exceptions.service.ServiceCustomException;
import co.com.uco.managewood.crosscutting.helper.ObjectHelper;
import co.com.uco.managewood.crosscutting.helper.StringHelper;
import co.com.uco.managewood.crosscutting.messages.customization.CatalogoMensajes;
import co.com.uco.managewood.crosscutting.messages.customization.implementation.CatalogoMensajesImpl;
import co.com.uco.managewood.service.domain.CiudadDomain;
import co.com.uco.managewood.service.specification.ciudad.CiudadSpecification;
import co.com.uco.managewood.service.usecase.ciudad.ListarCiudades;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadSpecificationImpl implements CiudadSpecification {

    @Autowired
    private ListarCiudades listarCiudades;

    //TODO: CREAR UNA INTERFAZ QUE IMPLEMENTE EL METODO
    protected CatalogoMensajes catalogoMensajes;

    @Override
    public void isSatisfied(final CiudadDomain domain) {
        if (!listarCiudades.execute(Optional.of(domain)).isEmpty()) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.ciudad.database"));
        }
        if (!StringHelper.isOnlyWordsAndSpace(domain.getNombre())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.ciudad.name"));
        }
        if (!ObjectHelper.isNull(domain.getDepartamento())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.ciudad.departamentonull"));
        }
    }
}