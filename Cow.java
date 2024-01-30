package seminars.vetClinicProject;

import java.time.LocalDate;

public class Cow extends Animal {
    public Cow(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    @Override
    public void fly() {
        System.out.println(getType() + " не умеет летать");
    }
}
