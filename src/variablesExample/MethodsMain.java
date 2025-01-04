package variablesExample;

public class MethodsMain {
    public static void main(String[] args) {

        int result = StaticMethodEx.value;
        int methodIncrement = StaticMethodEx.getIncreasedScore(35);
        int methodDecrement = StaticMethodEx.getDecreasedScore(10);

        System.out.println("Static variable: "+result);
        System.out.println("Static Method1: "+methodIncrement);
        System.out.println("Static Method2: "+methodDecrement);

        InstanceMethodEx example = new InstanceMethodEx();
        example.value = 34;
        System.out.println("Instance variable: "+example.value);
        System.out.println("Instance Method1: "+example.getIncreasedScore(54));
        System.out.println("Instance Method2: "+example.getDecrementScore(23));

    }
}
