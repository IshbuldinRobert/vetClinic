package seminars.vetClinicProject;

import java.time.LocalDate;

public class FlyingFish extends Animal {
    private int wingQuantity;
    private int flippersQuantity;

    public FlyingFish(String name, LocalDate birthday, Illness illness, int wingQuantity, int flippersQuantity) {
        super(name, birthday, illness);
        this.wingQuantity = wingQuantity;
        this.flippersQuantity = flippersQuantity;
    }

    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, wingQuantity: %d, flipperQuantity: %d", name, birthday, illness, wingQuantity, flippersQuantity);
    }
    @Override
    public void toGo() {
        System.out.println(getType() + " не умеет ходить");
    }
}
