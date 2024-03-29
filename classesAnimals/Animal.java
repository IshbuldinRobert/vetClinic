package seminars.vetClinicProject.classesAnimals;

import java.time.LocalDate;

import seminars.vetClinicProject.Illness;
import seminars.vetClinicProject.staff.Doctor;

public abstract class Animal {
    protected String name;
    protected LocalDate birthday;
    protected Illness illness;
    protected Doctor doctor;

    public Animal(String name, LocalDate birthday, Illness illness, Doctor doctor) {
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
        this.doctor = doctor;
    }
    public Animal() {
        this("Безымяный", LocalDate.now(), new Illness("Болезнь"), new Doctor(null, null, null));
    }

    // private void wakeUp() {
    //     System.out.println(getType() + " проснулся");
    // }
    // private void wakeUp(String time) {
    //     System.out.println(getType() + " проснулся в " + time);
    // }
    // private void hunt() {
    //     System.out.println(getType() + " охотится");
    // }
    // private void eat() {
    //     System.out.println(getType() + " ест");
    // }
    // private void sleep() {
    //     System.out.println(getType() + " спит");
    // }
    // private void sleep(String name) {
    //     System.out.println(name + " спит");
    // }
    // public void live() {
    //     wakeUp();
    //     hunt();
    //     eat();
    //     sleep();

    //     // cat.sleep(cat.getName());
    //     // cat.wakeUp("10:00");
    // }

    // public abstract void Eat();

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
    public Doctor getDoctor() {
        return doctor;
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
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return String.format("name: %s, birthday: %s, illness: %s, doctor: %s", name, birthday, illness, doctor);
    }
}