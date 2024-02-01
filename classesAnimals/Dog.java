package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;

public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    public Dog() {
        this.name = "Песик";
        this.birthday = null;
        this.illness = null;
    }

    @Override
    public void Eat() {}

    @Override
    public double go() {
        return 7;
    }
}
