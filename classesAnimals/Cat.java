package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.*;

public class Cat extends Animal implements Huntable, Goable {
    public Cat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    public Cat() {
        this.name = "Котик";
        this.birthday = null;
        this.illness = null;
    }
    @Override
    public void Eat() {}

    @Override
    public void fly() {
        System.out.println(getType() + " не умеет летать");
    }

    @Override
    public double go() {
        return 5;
    }
}
