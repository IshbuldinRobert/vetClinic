package seminars.vetClinicProject.staff;

import java.util.ArrayList;
import java.util.List;

import seminars.vetClinicProject.classesAnimals.Animal;

public class Doctor {
    String surname;
    String name;
    String nurse;

    public Doctor(String surname, String name, Nurse nurse) {
        this.surname = surname;
        this.name = name;
        this.nurse = nurse.getSurname();
    }
    
    public String getSurname() {
        return surname;
    }
    
    public String getName() {
        return name;
    }

    public String getNurse() {
        return nurse;
    }

    public List<String> getPatients(List<Animal> animals) {
        List<String> patients = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getDoctor().getName().equals(this.name)) {
                patients.add(animal.getName());
            }
        }
        return patients;
    }

    @Override
    public String toString() {
        return String.format("surname: %s, name: %s, nurse: %s", surname, name, nurse);
    }
}