package seminars.vetClinicProject;

import java.time.LocalDate;

public class Bat extends Animal {
    public Bat(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    @Override
    public void swim() {
        System.out.println(getType() + " не умеет плавать");
    }
}
