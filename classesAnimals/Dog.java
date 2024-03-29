package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;
import seminars.vetClinicProject.staff.Doctor;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        super(name, birthday, illness, doctor);
    }
    public Dog() {
        super();
    }
    @Override
    public double go() {
        return 7;
    }
    @Override
    public double swim() {
        return 3;
    }
}