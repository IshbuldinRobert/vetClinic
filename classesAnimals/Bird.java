package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.Flyable;
import seminars.vetClinicProject.staff.Doctor;

public class Bird extends Animal implements Flyable {
    private int wingQuantity;

    public Bird(String name, LocalDate birthday, Illness illness, int wingQuantity, Doctor doctor) {
        super(name, birthday, illness, doctor);
        this.wingQuantity = wingQuantity;
    }
    public Bird() {
        super();
    }

    @Override
    public double fly() {
        return 7;
    }

    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, wingQuantity: %d", name, birthday, illness, wingQuantity);
    }
}