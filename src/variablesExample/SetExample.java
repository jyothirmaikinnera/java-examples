package variablesExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Padhu");
        names.add("Pallavi");
        names.add("Sunny");
        names.add("Nani");

        System.out.println("These are Set Names: "+names);

        for(String set : names){
            System.out.println("This is Set ForEach Loop: "+set);
        }

        List<String> setToList = new ArrayList<>(names);
        String oneName = setToList.get(2);
        System.out.println("This is Set into list to get the names : "+oneName);
    }
}
