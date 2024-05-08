package pharmacy;

import java.util.Objects;

public class Component implements Comparable<Component> {
    private String name;
    private String weight;
    private int power;
//    private int sumPower;

    @Override
    public int hashCode() {
        return 0;
    }

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
//        this.sumPower = 0;
    }
    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

//    @Override
//    public int compareTo(Component o) {
////        return Integer.compare(this.power, o.power);
//        if(this.name.compareTo(o.name) > 0) {
//            return -1;
//        }
//        if(this.name.compareTo(o.name) < 0){
//            return 1;
//        }
//        else return 0;
//    }
    public int compareTo(Component o) {
//        return Integer.compare(this.power, o.power);
        if(this.power > o.power) {
            return -1;
        }
        if(this.power < o.power){
            return 1;
        }
        else return 0;
    }
    }



