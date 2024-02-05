package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.Swimable;
import seminars.vetClinicProject.staff.Doctor;

public class Fish extends Animal implements Swimable {
    private int flippersQuantity;

    public Fish(String name, LocalDate birthday, Illness illness, int flippersQuantity, Doctor doctor) {
        super(name, birthday, illness, doctor);
        this.flippersQuantity = flippersQuantity;
    }
    public Fish() {
        super();
    }

    @Override
    public double swim() {
        return 7;
    }
    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, flippersQuantity: %d", name, birthday, illness, flippersQuantity);
    }
}
