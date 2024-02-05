package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.interfaces.Flyable;
import seminars.vetClinicProject.interfaces.Swimable;
import seminars.vetClinicProject.staff.Doctor;

public class FlyingFish extends Animal implements Swimable, Flyable {
    private int wingQuantity;
    private int flippersQuantity;

    public FlyingFish(String name, LocalDate birthday, Illness illness, int wingQuantity, int flippersQuantity, Doctor doctor) {
        super(name, birthday, illness, doctor);
        this.wingQuantity = wingQuantity;
        this.flippersQuantity = flippersQuantity;
    }
    public FlyingFish() {
        super();
    }

    @Override
    public double swim() {
        return 7;
    }
    
    @Override
    public double fly() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, wingQuantity: %d, flipperQuantity: %d", name, birthday, illness, wingQuantity, flippersQuantity);
    }
}
