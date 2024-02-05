package seminars.vetClinicProject;

import java.util.ArrayList;
import java.util.List;

import seminars.vetClinicProject.classesAnimals.Animal;
import seminars.vetClinicProject.interfaces.*;
import seminars.vetClinicProject.staff.*;

public class VeterinaryClinic {
    public List<String> getFlying(List<Animal> animals) {
        List<String> flyingAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            try {
                Flyable temp = (Flyable) animal;
                flyingAnimals.add(((Animal)temp).getName());
            } catch (Exception e) {}
        }
        return flyingAnimals;
    }

    public List<String> getSwimable(List<Animal> animals) {
        List<String> swimingAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            try {
                Swimable temp = (Swimable) animal;
                swimingAnimals.add(((Animal)temp).getName());
            } catch (Exception e) {}
        }
        return swimingAnimals;
    }

    public List<String> getGoable(List<Animal> animals) {
        List<String> goingAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            try {
                Goable temp = (Goable) animal;
                goingAnimals.add(((Animal)temp).getName());
            } catch (Exception e) {}
        }
        return goingAnimals;
    }

    public void getDoctors(List<Doctor> doctors) {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    public void getNurses(List<Nurse> nurses) {
        for (Nurse nurse : nurses) {
            System.out.println(nurse);
        }
    }
}
