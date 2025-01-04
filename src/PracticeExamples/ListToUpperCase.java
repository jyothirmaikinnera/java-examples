package PracticeExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToUpperCase {

    public static void main(String[] args){

        List<String> names = new ArrayList<>();

        names.add("padhu");
        names.add("aadhya");
        names.add("pallavi");
        names.add("Nani");
        names.add("Bablu");
        names.add("sunny");


        List<String> upperCaseNames = names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());

        System.out.println("List of String to UpperCase lettes: "+upperCaseNames);

    }
}
