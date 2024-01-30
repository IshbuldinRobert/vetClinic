package seminars.vetClinicProject;

import java.time.LocalDate;

public class Bird extends Animal {
    private int wingQuantity;

    public Bird(String name, LocalDate birthday, Illness illness, int wingQuantity) {
        super(name, birthday, illness);
        this.wingQuantity = wingQuantity;
    }

    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, wingQuantity: %d", name, birthday, illness, wingQuantity);
    }
    @Override
    public void swim() {
        System.out.println(getType() + " не умеет плавать");
    }
}