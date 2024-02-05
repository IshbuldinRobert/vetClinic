package seminars.vetClinicProject;
import seminars.vetClinicProject.classesAnimals.*;
import seminars.vetClinicProject.staff.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        List<Nurse> nurses = new ArrayList<>();

        nurses.add(new Nurse("Иванова", "Наталья"));
        nurses.add(new Nurse("Петрова", "Мария"));
        nurses.add(new Nurse("Власова", "Валерия"));

        doctors.add(new Doctor("Воронцов", "Иван", nurses.get(0)));
        doctors.add(new Doctor("Склифосовский", "Петр", nurses.get(1)));
        doctors.add(new Doctor("Макротин", "Федор", nurses.get(2)));

        animals.add(new Bat("Летучая мышь", LocalDate.now(), null, doctors.get(0)));
        animals.add(new Bird("Птица", LocalDate.now(), null, 2, doctors.get(1)));
        animals.add(new Cat("Кошка", LocalDate.now(), null, doctors.get(2)));
        animals.add(new Cow("Корова", LocalDate.now(), null, doctors.get(0)));
        animals.add(new Dog("Собака", LocalDate.now(), null, doctors.get(1)));
        animals.add(new Hippopotamus("Гиппопотам", LocalDate.now(), null, doctors.get(2)));
        animals.add(new Otter("Выдра", LocalDate.now(), null, doctors.get(0)));
        animals.add(new Fish("Рыба", LocalDate.now(), null, 4, doctors.get(1)));
        animals.add(new FlyingFish("Летучая рыба", LocalDate.now(), null, 4, 4, doctors.get(2)));
        animals.add(new Swan("Лебедь", LocalDate.now(), null, doctors.get(0)));

        // System.out.println("Летающие");
        // System.out.println("Bat летит со скоростью " + ((Bat)(animals.get(0))).fly());
        // System.out.println("Bird летит со скоростью " + ((Bird)(animals.get(1))).fly());
        // System.out.println("FlyingFish летит со скоростью " + ((FlyingFish)(animals.get(8))).fly());
        // System.out.println("Ходячие");
        // System.out.println("Cat идет со скоростью " + ((Cat)(animals.get(2))).go());
        // System.out.println("Cow идет со скоростью " + ((Cow)(animals.get(3))).go());
        // System.out.println("Dog идет со скоростью " + ((Dog)(animals.get(4))).go());
        // System.out.println("Плавающие");
        // System.out.println("Otter плавает со скоростью " + ((Otter)(animals.get(6))).swim());
        // System.out.println("Fish плавает со скоростью " + ((Fish)(animals.get(7))).swim());
        // System.out.println("FlyingFish плавает со скоростью " + ((FlyingFish)(animals.get(8))).swim());
        
        VeterinaryClinic vetClinik = new VeterinaryClinic();
        System.out.printf("\nЛетающие: %s", String.join(", ", vetClinik.getFlying(animals)));
        System.out.printf("\nПлавающие: %s", String.join(", ", vetClinik.getSwimable(animals)));
        System.out.printf("\nБегающие: %s", String.join(", ", vetClinik.getGoable(animals)));
        System.out.println();

        System.out.print("\nДоктора и пациенты");
        System.out.printf("\nВоронцов: %s", String.join(", ", doctors.get(0).getPatients(animals)));
        System.out.printf("\nСклифосовский: %s", String.join(", ", doctors.get(1).getPatients(animals)));
        System.out.printf("\nМакротин: %s", String.join(", ", doctors.get(2).getPatients(animals)));
        System.out.println("\n");

        System.out.println("Доктора");
        vetClinik.getDoctors(doctors);
        System.out.println("Медсестры");
        vetClinik.getNurses(nurses);
    }
}