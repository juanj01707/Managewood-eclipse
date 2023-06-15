package co.com.uco.managewood.repository.cliente.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.hibernate.internal.util.StringHelper;

import co.com.uco.managewood.crosscutting.helper.UUIDHelper;
import co.com.uco.managewood.entity.ClienteEntity;
import co.com.uco.managewood.repository.cliente.ClienteRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class ClienteRepositoryImpl implements ClienteRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ClienteEntity> findCustom(ClienteEntity ClienteEntity) {
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<ClienteEntity> query = criteriaBuilder.createQuery(ClienteEntity.class);
            Root<ClienteEntity> ClienteRoot = query.from(ClienteEntity.class);
            List<Predicate> predicates = new ArrayList<>();

            if (!Objects.isNull(ClienteEntity)){
                if (!UUIDHelper.isDefaultUUID(ClienteEntity.getCodigo())){
                    predicates.add(criteriaBuilder.equal(ClienteRoot.get("codigo"),ClienteEntity.getCodigo()));
                }
                if (StringHelper.isNotEmpty(ClienteEntity.getNombre())){
                    predicates.add(criteriaBuilder.equal(ClienteRoot.get("nombre"),ClienteEntity.getNombre()));
                }
                if (!UUIDHelper.isDefaultUUID(ClienteEntity.getTipoIdentificacion().getCodigo())){
                    predicates.add(criteriaBuilder.equal(ClienteRoot.get("departamento"),ClienteEntity.getTipoIdentificacion()));
                }
            }

            query.select(ClienteRoot).where(criteriaBuilder.and(predicates.toArray(new Predicate[0])));

            return entityManager.createQuery(query).getResultList();

        }catch (Exception e){
            //TODO: Hacer las otras excepciones (SQL por ejemplo)}
            System.out.println(e.getMessage());
        }
        return null;
    }
}


