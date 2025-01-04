package variablesExample;
public class InstanceAndStatic {
   static int age = 10;
   String name;

    public static void main(String[] args) {
        InstanceAndStatic ex = new InstanceAndStatic();
        ex.name = "Pallavi";
        System.out.println("The instance variable example :"+ex.name);
        System.out.println("The static variable: "+InstanceAndStatic.age);
    }

}
