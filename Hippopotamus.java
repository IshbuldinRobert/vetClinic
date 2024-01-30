package seminars.vetClinicProject;

import java.time.LocalDate;

public class Hippopotamus extends Animal {
    public Hippopotamus(String name, LocalDate birthday, Illness illness) {
        super(name, birthday, illness);
    }
    @Override
    public void fly() {
        System.out.println(getType() + " не умеет летать");
    }
}
