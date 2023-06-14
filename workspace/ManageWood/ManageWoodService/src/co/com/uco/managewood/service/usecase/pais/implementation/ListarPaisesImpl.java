package co.com.uco.managewood.service.usecase.pais.implementation;

import co.com.uco.managewood.service.domain.PaisDomain;
import co.com.uco.managewood.service.usecase.pais.ListarPaises;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListarPaisesImpl implements ListarPaises {
    @Override
    public List<PaisDomain> execute(Optional<PaisDomain> domain) {
        return null;
    }
}
