package variablesExample;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<Integer> values =  new TreeSet<>();
        values.add(23);
        values.add(41);
        values.add(98);
        values.add(67);
        values.add(12);
        System.out.println("TreeSet Values : "+values);

        for(Integer value : values){
            System.out.println(value);
        }

    }
}
