package pavlo.springframework.sfgpetclinic.services;

import pavlo.springframework.sfgpetclinic.model.Owner;

/**
 * * Created by Pavlo 04.03.2021
 * *
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    <Set> Owner findAll();

}
