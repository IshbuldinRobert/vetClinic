package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;
import seminars.vetClinicProject.staff.Doctor;

public class Swan extends Animal implements Flyable, Goable, Swimable {
    public Swan(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }
    public Swan() {
        super();
    }
    @Override
    public double go() {
        return 5;
    }
    @Override
    public double swim() {
        return 3;
    }
    @Override
    public double fly() {
        return 7;
    }
}
