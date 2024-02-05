package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;
import seminars.vetClinicProject.staff.Doctor;

public class Bat extends Animal implements Flyable {
    public Bat(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }
    public Bat() {
        super();
    }
    @Override
    public double fly() {
        return 5;
    }
}
