package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;

public class Bat extends Animal implements Flyable {
    public Bat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    public Bat() {
        this(null, null, null);
    }
    @Override
    public void fly() {
        System.out.println(getType() + " flying");
    }
    @Override
    public void Eat() {}
}
