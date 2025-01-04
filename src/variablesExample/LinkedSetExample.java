package variablesExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetExample {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Apple");
        names.add("Grapes");
        names.add("Mango");
        names.add("Guava");
        names.add("Licchi");
        System.out.println("LinkedList Elements: "+names);

        names.stream().forEach(name->System.out.println(name));
    }
}
