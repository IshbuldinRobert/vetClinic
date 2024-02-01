package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;

public class Otter extends Animal {
    public Otter(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    @Override
    public void fly() {
        System.out.println(getType() + " не умеет летать");
    }
    @Override
    public void Eat() {}
}
