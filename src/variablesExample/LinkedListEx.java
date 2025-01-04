package variablesExample;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListEx {
    public static void main(String[] args) {

        List<Integer> values = new LinkedList<>();

        values.add(23);
        values.add(39);
        values.add(41);
        values.add(96);
        values.add(23);
        values.add(39);
        values.add(23);

        System.out.println("This is the LinkedList values: "+values);

        values.forEach(num -> System.out.println(num));

       Set<Integer> numbers = new HashSet<>(values);
       System.out.println("These are converted List into  set numbers: "+numbers);

    }
}
