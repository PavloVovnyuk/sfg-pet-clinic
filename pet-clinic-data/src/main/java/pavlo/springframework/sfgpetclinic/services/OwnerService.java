package pavlo.springframework.sfgpetclinic.services;

import pavlo.springframework.sfgpetclinic.model.Owner;

/**
 * * Created by Pavlo 04.03.2021
 * *
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
