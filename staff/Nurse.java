package seminars.vetClinicProject.staff;

public class Nurse {
    String surname;
    String name;

    public Nurse(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("surname: %s, name: %s",surname, name);
    }
}
