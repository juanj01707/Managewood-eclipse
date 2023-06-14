package co.com.uco.managewood.service.usecase.departamento.implementation;

import co.com.uco.managewood.service.domain.DepartamentoDomain;
import co.com.uco.managewood.service.usecase.departamento.ListarDepartamentos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListarDepartamentosImpl implements ListarDepartamentos {
    @Override
    public List<DepartamentoDomain> execute(Optional<DepartamentoDomain> domain) {
        return null;
    }
}
