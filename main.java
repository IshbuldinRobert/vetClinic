package seminars.vetClinicProject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Animal cat = new Animal("Вася", LocalDate.of(2002, 6, 11), new Illness("Лишай"));
        // System.out.println(cat.getName());
        // cat.setIllness(new Illness(null));
        // System.out.println(cat.getIllness());
        // System.out.println();

        Animal dog = new Dog("Rex", LocalDate.of(2000, 8, 12), new Illness(null));
        // System.out.println(dog.getName());
        // System.out.println(dog.getType());
        // System.out.println();

        Animal bird = new Bird("Кеша", LocalDate.now(), new Illness(null), 2);
        // System.out.println(bird.getName());
        // System.out.println(bird.getType());

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("rrr", LocalDate.now(), null, 4));
        // for (Animal animal : list) {
        //     System.out.println(animal);
        // }

        // bird.wakeUp();
        // cat.hunt();
        // dog.eat();
        // dog.sleep();

        // cat.sleep(cat.getName());
        // cat.wakeUp("10:00");
        // dog.live();
        // dog.fly();
        // bird.swim();

        Bat bat = new Bat("Hucky", LocalDate.now(), new Illness("ОРВ"));
        FlyingFish flyingFish = new FlyingFish("Gury", LocalDate.now(), new Illness("ОРВ"), 4, 4);

        Cow cow = new Cow("Люся", LocalDate.now(), new Illness("Свиной грипп"));
        Hippopotamus gloriya = new Hippopotamus("Глория", LocalDate.now(), new Illness("Бешенство"));

        Otter otter = new Otter("Няшка", LocalDate.now(), new Illness("Грипп"));
        Fish fish = new Fish("Рыбка", LocalDate.now(), new Illness(null), 4);

        bat.swim();
        bat.fly();
        flyingFish.toGo();
        flyingFish.swim();
        System.out.println();
        cow.fly();
        cow.toGo();
        gloriya.fly();
        gloriya.swim();
        System.out.println();
        otter.fly();
        otter.toGo();
        fish.toGo();
        fish.swim();
    }
}
