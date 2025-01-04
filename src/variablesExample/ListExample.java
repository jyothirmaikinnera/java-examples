package variablesExample;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(7);
        values.add(5);
        values.add(20);
        values.add(63);
        values.add(45);
        System.out.println("The list values: "+values);

        for(Integer value: values){
            System.out.println("This is forEach loop: "+value);
        }

        int result = values.get(0);
        System.out.println("The index of 0 is: "+result);
    }
}
