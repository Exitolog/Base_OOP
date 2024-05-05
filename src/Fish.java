import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable {
    public Fish(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        super(name, birthDate, vaccianations, illness, owner);
    }

    @Override
    public double swim() {
        return 20;
    }
}
