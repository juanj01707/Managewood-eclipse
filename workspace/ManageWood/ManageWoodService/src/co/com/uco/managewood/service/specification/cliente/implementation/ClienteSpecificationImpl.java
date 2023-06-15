package co.com.uco.managewood.service.specification.cliente.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.uco.managewood.crosscutting.exceptions.service.ServiceCustomException;
import co.com.uco.managewood.crosscutting.helper.ObjectHelper;
import co.com.uco.managewood.crosscutting.helper.StringHelper;
import co.com.uco.managewood.crosscutting.messages.customization.CatalogoMensajes;
import co.com.uco.managewood.service.domain.ClienteDomain;
import co.com.uco.managewood.service.specification.cliente.ClienteSpecification;


@Service
public class ClienteSpecificationImpl implements ClienteSpecification{


    //TODO: CREAR UNA INTERFAZ QUE IMPLEMENTE EL METODO
    protected CatalogoMensajes catalogoMensajes;

    @Override
    public void isSatisfied(final ClienteDomain domain) {

        if (!StringHelper.isOnlyWordsAndSpace(domain.getNombre())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.Cliente.name"));
        }
        if (!ObjectHelper.isNull(domain.getTipoIdentificacion())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.Cliente.departamentonull"));
        }
        
        if (!StringHelper.isOnlyNumbers(domain.getCelular())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.ciudad.celular"));
        }
        if (!StringHelper.isOnlyWordsAndSpace(domain.getIdentificacion())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.Cliente.identificacion"));
        }
        if (!StringHelper.isOnlyWordsAndSpaceAndNumbers(domain.getCorreo())) {
            throw ServiceCustomException.createUserException(catalogoMensajes.getMessage("specification.Cliente.correo"));
        }
    }

}
