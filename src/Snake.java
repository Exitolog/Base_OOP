import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal implements Goable, Swimable{
    public Snake(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        super(name, birthDate, vaccianations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 3;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 3;
    }
}
