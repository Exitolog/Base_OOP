import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        super(name, birthDate, vaccianations, illness, owner);
    }

    }
