package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {


        Component pineceline = new Component("Pinectline","10mg", 100 );
        Component salt = new Component("Salt", "20mg", 10);
        Component sugar = new Component("Sugar", "87mg", 80);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(salt, pineceline);
        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(sugar, pineceline);
        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponents(salt, pineceline);
        Pharmacy pharmacy4 = new Pharmacy();
        pharmacy4.addComponents(salt, pineceline);
        Pharmacy pharmacy5 = new Pharmacy();
        pharmacy5.addComponents(sugar, pineceline);


        Set<Pharmacy> result = new HashSet<Pharmacy>();
        result.add(pharmacy3);
        result.add(pharmacy5);
        result.add(pharmacy4);
        for (Pharmacy pharmacy : result){
            System.out.println(pharmacy.getComponents());
        }
        System.out.println(result.size());



//        for( Component c : pharmacy2){
//           System.out.println(c);
//        }

//        List<Component> list = new ArrayList<>();
//        list.add(pineceline);
//        list.add(salt);
//        list.add(sugar);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
