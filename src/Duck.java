import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Flyable, Goable, Swimable{
    public Duck(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        super(name, birthDate, vaccianations, illness, owner);
    }

    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 14;
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 3;
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 0;
    }
}
