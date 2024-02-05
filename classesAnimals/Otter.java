package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.Goable;
import seminars.vetClinicProject.interfaces.Swimable;
import seminars.vetClinicProject.staff.Doctor;

public class Otter extends Animal implements Goable, Swimable {
    public Otter(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }
    public Otter() {
        super();
    }

    @Override
    public double swim() {
        return 5;
    }

    @Override
    public double go() {
        return 6;
    }
}
