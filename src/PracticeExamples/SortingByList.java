package PracticeExamples;

import java.util.ArrayList;
import java.util.List;

public class SortingByList {

    public static void main(String[] args){

        List<String> listAlphabet = List.of("King", "Queen", "Minister", "Police", "Thief");

        List<String> sortedListByAlphabet = listAlphabet.stream().sorted().toList();

        System.out.println("Sort the List By Alphabets : "+ sortedListByAlphabet);
    }
}
