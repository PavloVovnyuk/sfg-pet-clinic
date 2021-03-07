package pavlo.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findAll();

    T findAll(ID id);

    T save(T object);

    void delete(T objexct);

    void deleteById(ID id);


}
