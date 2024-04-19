package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }

    public String toString() {
        return "{id='" + this.getId()
                + "', firstName='" + this.getFirstName()
                + "', lastName='" + this.getLastName() + "'}";
    }
}
