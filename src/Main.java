import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Animal barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6),
        new ArrayList<>(), "Chumka", "Boss", 4);
Animal dog = new Dog("Kesha", LocalDate.of(1996, 6, 6),
        new ArrayList<>(), "Chumka", "Boss");
Animal snake = new Snake("Snake", LocalDate.of(1997, 7, 6),
                new ArrayList<>(), "Chumka", "Boss");
Animal duck = new Duck("Duck",LocalDate.of(2015, 10, 4),
        new ArrayList<>(), "Chumka", "Lady");
Animal fish = new Fish("Dori",LocalDate.of(2020, 10, 4),
                new ArrayList<>(), "Chumka", "Lady");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(dog);
        animals.add(duck);
        animals.add(snake);
        animals.add(fish);


        System.out.println("---------------");


            Clinic clinic = new Clinic();
            clinic.addPatients(barsik, duck, snake,dog, fish);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyables());
        System.out.println(clinic.getSwimables());

      Nurse nurse1 = new Nurse(4, "Masha", "HappyAnimal");
      Doctor doctor1 = new Doctor(10,"Misha", "HappyAnimal", nurse1);
        doctor1.consultIlness(barsik);
        nurse1.giveInjections(barsik);
    }
}