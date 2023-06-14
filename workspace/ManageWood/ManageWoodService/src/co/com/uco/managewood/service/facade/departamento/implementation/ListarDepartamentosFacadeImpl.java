package co.com.uco.managewood.service.facade.departamento.implementation;

import co.com.uco.managewood.dto.DepartamentoDTO;
import co.com.uco.managewood.service.facade.departamento.ListarDepartamentosFacade;
import co.com.uco.managewood.service.usecase.departamento.ListarDepartamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ListarDepartamentosFacadeImpl implements ListarDepartamentosFacade {

    @Autowired
    private ListarDepartamentos useCase;

    @Override
    public List<DepartamentoDTO> execute(Optional<DepartamentoDTO> dto) {
        return null;
    }
}
