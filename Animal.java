package seminars.vetClinicProject;

import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animal(String name, LocalDate birthday, Illness illness) {
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }
    public Animal() {
        this("Безымяный", LocalDate.now(), new Illness("Болезнь"));
    }

    private void wakeUp() {
        System.out.println(getType() + " проснулся");
    }
    private void wakeUp(String time) {
        System.out.println(getType() + " проснулся в " + time);
    }
    private void hunt() {
        System.out.println(getType() + " охотится");
    }
    private void eat() {
        System.out.println(getType() + " ест");
    }
    private void sleep() {
        System.out.println(getType() + " спит");
    }
    private void sleep(String name) {
        System.out.println(name + " спит");
    }
    public void live() {
        wakeUp();
        hunt();
        eat();
        sleep();

        // cat.sleep(cat.getName());
        // cat.wakeUp("10:00");
    }

    public void fly() {
        System.out.println(getType() + " летает");
    }
    public void swim() {
        System.out.println(getType() + " плавает");
    }
    public void toGo() {
        System.out.println(getType() + " передвигается");
    }

    // gets
    public String getName() {
        return name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public Illness getIllness() {
        return illness;
    }
    public String getType() {
        return getClass().getSimpleName();
    }

    // sets
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s", name, birthday, illness);
    }
}
