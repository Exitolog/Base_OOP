import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6),
        new ArrayList<>(), "Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal dog = new Dog("Kesha", LocalDate.of(1996, 6, 6),
        new ArrayList<>(), "Chumka", "Boss");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(dog);

        System.out.println("---------------");

       barsik.lifeCycle();
        barsik.movement();


    }
}