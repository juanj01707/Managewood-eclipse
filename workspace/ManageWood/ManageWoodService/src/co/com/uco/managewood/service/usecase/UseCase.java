package co.com.uco.managewood.service.usecase;

public interface UseCase<D> {
    void execute(D domain);
}
