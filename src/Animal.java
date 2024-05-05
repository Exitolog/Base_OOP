import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccianations;
    protected String illness;
    protected String owner;
    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccianations = vaccianations;
        this.illness = illness;
        this.owner = owner;
        this.type = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccianations() {
        return vaccianations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }
    private void wakeup(){
        System.out.println("Animal is wakeup");
    }

    private void wakeup(int time){
        System.out.println("Animal is wakeup" + time);
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccianations=" + vaccianations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
    private void eat(){
        System.out.println("Animal ate");
    }
    private void play(){
        System.out.println("Animal played");
    }
    private void sleep(){
        System.out.println("Animal sleeping");
    }
    //public abstract void lifeCycle();




}
