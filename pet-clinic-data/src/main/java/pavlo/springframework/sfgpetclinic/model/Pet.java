package pavlo.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

public class Pet extends BaseEntity {
    private petType petType;
    private Owner owner;
    private LocalDate birthDate;

    public pavlo.springframework.sfgpetclinic.model.petType getPetType() {
        return petType;
    }

    public void setPetType(pavlo.springframework.sfgpetclinic.model.petType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
