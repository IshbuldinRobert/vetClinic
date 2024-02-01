package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;

public class Fish extends Animal {
    private int flippersQuantity;

    public Fish(String name, LocalDate birthday, Illness illness, int flippersQuantity) {
        super(name, birthday, illness);
        this.flippersQuantity = flippersQuantity;
    }
    @Override
    public void fly() {
        System.out.println(getType() + " не умеет летать");
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " не умеет ходить");
    }
    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, flippersQuantity: %d", name, birthday, illness, flippersQuantity);
    }
    @Override
    public void Eat() {}
}
