package variablesExample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> valuesByNames = new HashMap<>();

        valuesByNames.put(7,"Jyothirmai");
        valuesByNames.put(5,"Vasavi Guru");
        valuesByNames.put(1,"Harshitha");
        valuesByNames.put(3,"Prathiba");
        valuesByNames.put(2,"Jyothirmai");
        valuesByNames.put(5,"Vasavi");

        System.out.println("The Map Elements are : "+valuesByNames);

        for(Map.Entry<Integer,String> mapEx : valuesByNames.entrySet()){
            System.out.println("Thr forEach loop of Map Elements: "+mapEx.getKey()+" "+mapEx.getValue());
        }
    }
}
