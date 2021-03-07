package pavlo.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T save(T object);

    T findAllById(ID id);

    void delete(T object);

    void deleteById(ID id);


}
