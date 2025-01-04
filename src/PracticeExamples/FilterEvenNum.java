package PracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNum {

    public static void main(String[] args){

        List<Integer> filternum = new ArrayList<>();

        filternum.add(12);
        filternum.add(3);
        filternum.add(10);
        filternum.add(11);
        filternum.add(32);

        List<Integer> evenNum = filternum.stream().filter(num->num % 2 == 0).toList();

        System.out.println("Filter Even numbers from list: "+ evenNum);


    }
}
