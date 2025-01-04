package variablesExample;

public class SubClassMain {
    public static void main(String[] args) {
        SubClassEx  example = new SubClassEx(23);
        example.num = 21;
        example.pubNum = 35;
        System.out.println("This is super class variable : "+example.num);
        System.out.println("This is Super Class Variable: "+example.pubNum);
        System.out.println(example.getSuperClassMethod());
    }

}
