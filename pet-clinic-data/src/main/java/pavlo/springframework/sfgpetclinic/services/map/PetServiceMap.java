package pavlo.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pavlo.springframework.sfgpetclinic.model.Pet;
import pavlo.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findAllById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);

    }
}
