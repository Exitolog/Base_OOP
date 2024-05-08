package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {

    private int index;
    private final List<Component> components;
    private int sumPower;


    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
        this.sumPower = 0;

    }

    public List<Component> getComponents() {
        return components;
    }

    public void addComponents(Component... components) {
        if (components.length == 0) System.out.println("Вы ничего не ввели");
        else Collections.addAll(this.components, components);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(components);
    }
    //    public int getSumPower (Component ... components){
//        if(components.length == 0) System.out.println("Вы ничего не ввели");
//            else
//            for (components  : Component component) {
//                sumPower = sumPower + next().getPower();
//            }
//        return sumPower;
//    }
//    public void getSumPower(Component ... component){
//        if (component.length == 0) System.out.println("Вы ничего не ввели");
//        else Collections.(this.sumPower, sumPower);
//
//    }


    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        //component c = components.get(index);
        //index++;
        //return c;
        return components.get(index++);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(o.hashCode(), this.hashCode());
}


        }


