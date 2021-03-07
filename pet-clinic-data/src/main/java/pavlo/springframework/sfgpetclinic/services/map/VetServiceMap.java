package pavlo.springframework.sfgpetclinic.services.map;

import pavlo.springframework.sfgpetclinic.model.Vet;
import pavlo.springframework.sfgpetclinic.services.CrudService;

import java.util.Collections;
import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findAllById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }
}
