package variablesExample;

public class SubClassEx extends SuperClassEx{

    public SubClassEx(){
        super();
        System.out.println("This is the default constructor");
    }
    public SubClassEx(int num){
        super(num);
        System.out.println("This is from subclass one constructor");
    }
    public int getSuperClassMethod(){
        System.out.println("This is Sub Class one Constructor");
        int num = super.pubNum;
    return super.getId();
    }

}
