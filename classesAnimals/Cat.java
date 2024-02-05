package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;
import seminars.vetClinicProject.staff.Doctor;

public class Cat extends Animal implements Goable {
    public Cat(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }
    public Cat() {
        super();
    }

    @Override
    public double go() {
        return 3;
    }
}
