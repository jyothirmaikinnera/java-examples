package variablesExample;

public class OperatorsEx {
    public static void main(String[] args) {
        String name1 = "Padhu";
        String name2 = "Padhu";

        String name3 = new String("Pallavi");
        String name4 = new String("Pallavi");

        System.out.println(name1 == name2);
        System.out.println(name3 == name2);
        System.out.println(name3 == name4);

        System.out.println(name1.equals(name2));
        System.out.println(name2.equals(name3));
        System.out.println(name3.equals(name4));






    }

}
