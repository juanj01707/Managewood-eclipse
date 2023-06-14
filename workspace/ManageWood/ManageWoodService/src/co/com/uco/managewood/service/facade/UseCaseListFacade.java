package co.com.uco.managewood.service.facade;

import java.util.List;
import java.util.Optional;

public interface UseCaseListFacade<T> {
    List<T> execute(Optional<T> dto);
}
