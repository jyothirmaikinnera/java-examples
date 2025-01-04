package PracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NamesByLength {
    public static void main(String[] args) {

        List<String>  names = new ArrayList<>();
        names.add("Rose");
        names.add("Banana");
        names.add("Apple");
        names.add("Blue");
        names.add("Green");

        Map<Integer,List<String>>  groupOStringByLength = names.stream().collect(Collectors.groupingBy(word->word.length()));

        System.out.println(groupOStringByLength);
    }

}
