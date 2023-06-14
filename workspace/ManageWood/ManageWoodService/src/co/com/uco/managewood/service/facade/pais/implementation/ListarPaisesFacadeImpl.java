package co.com.uco.managewood.service.facade.pais.implementation;

import co.com.uco.managewood.dto.PaisDTO;
import co.com.uco.managewood.service.facade.pais.ListarPaisesFacade;
import co.com.uco.managewood.service.usecase.pais.ListarPaises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ListarPaisesFacadeImpl implements ListarPaisesFacade {

    @Autowired
    private ListarPaises useCase;

    @Override
    public List<PaisDTO> execute(Optional<PaisDTO> dto) {
        return null;
    }
}
