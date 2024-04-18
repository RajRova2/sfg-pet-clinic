package guru.springframework.sfgpetclinic.model;

public class Vet extends Person {
    public String toString() {
        return "{id='" + this.getId()
                + "', firstName='" + this.getFirstName()
                + "', lastName='" + this.getLastName() + "'}";
    }
}
