package variablesExample;

public class SuperClassEx {
     int num;
    public int pubNum;

    public SuperClassEx(){

    }
    public SuperClassEx(int number){
        this.num = number;
        System.out.println("this is the super class of one parameter Constructor");

    }
    public int getId(){

     return 7;
    }
}
