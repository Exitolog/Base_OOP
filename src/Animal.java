import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccianations;
    protected String illness;
    protected String owner;

    public Animal(String name, LocalDate birthDate, List<String> vaccianations, String illness, String owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccianations = vaccianations;
        this.illness = illness;
        this.owner = owner;
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
    public void lifeCycle(){
        wakeup();
        eat();
        play();
        sleep();
    }
    private void toGo(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Животное умеет бегать?");
        String input = scanner.nextLine();
        if(input.equals("Да")){
            System.out.println("Animal going");
        }
        else {
            System.out.println("Животное не умеет бегать");
        }
    }
    private void fly(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Животное умеет летать?");
        String input = scanner.nextLine();
        if(input.equals("Да")){
            System.out.println("Animal flies");
        }
        else {
            System.out.println("Животное не умеет летать");
        }
    }
    private void swim(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Животное умеет плавать?");
        String input = scanner.nextLine();
        if(input.equals("Да")){
            System.out.println("Animal swims");
        }
        else {
            System.out.println("Животное не умеет плавать");
        }
    }
    public void movement(){
        toGo();
        fly();
        swim();
    }
}
