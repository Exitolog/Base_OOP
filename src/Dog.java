import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        super(name, birthDate, vaccianations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 20;
    }
}
