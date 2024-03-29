package pavlo.springframework.sfgpetclinic.services.map;

import org.springframework.stereotype.Service;
import pavlo.springframework.sfgpetclinic.model.Owner;
import pavlo.springframework.sfgpetclinic.services.CrudService;
import pavlo.springframework.sfgpetclinic.services.OwnerService;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findAllById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
