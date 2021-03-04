package pavlo.springframework.sfgpetclinic.services;

import pavlo.springframework.sfgpetclinic.model.Pet;
/**
 * * Created by Pavlo 04.03.2021
 * *
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    <Set> Pet findAll();
}
