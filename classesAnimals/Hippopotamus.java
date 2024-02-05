package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.Goable;
import seminars.vetClinicProject.interfaces.Swimable;
import seminars.vetClinicProject.staff.Doctor;

public class Hippopotamus extends Animal implements Goable, Swimable {
    public Hippopotamus(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }
    public Hippopotamus() {
        super();
    }

    @Override
    public double swim() {
        return 4;
    }

    @Override
    public double go() {
        return 5;
    }
}
