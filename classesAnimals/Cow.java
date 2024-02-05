package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.Goable;
import seminars.vetClinicProject.staff.Doctor;

public class Cow extends Animal implements Goable {
    public Cow(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }

    public Cow() {
        super();
    }
    @Override
    public double go() {
        return 6;
    }
}
