package pavlo.springframework.sfgpetclinic.services;

import pavlo.springframework.sfgpetclinic.model.Vet;
/**
 * * Created by Pavlo 04.03.2021
 * *
 */
public interface VetSerice {
    Vet findById(Long id);

    Vet save(Vet vet);

    <Set> Vet findAll();
}
