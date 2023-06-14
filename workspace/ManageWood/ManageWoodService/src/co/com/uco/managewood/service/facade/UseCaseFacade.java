package co.com.uco.managewood.service.facade;

public interface UseCaseFacade<T> {
    void execute(T dto);
}
