import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal{
    public Snake(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        super(name, birthDate, vaccianations, illness, owner);
    }
}
