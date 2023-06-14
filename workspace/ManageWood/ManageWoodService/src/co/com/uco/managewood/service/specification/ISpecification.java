package co.com.uco.managewood.service.specification;

import java.util.List;

public interface ISpecification<T> {
    void isSatisfied(T data);
}
