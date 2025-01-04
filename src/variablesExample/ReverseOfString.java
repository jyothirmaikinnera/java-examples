package variablesExample;

public class ReverseOfString {
    public static void main(String[] args) {
        String name = "Padhu Kinnera";
        String revNum = "";
        for(int i = name.length()-1;i > 0;i--){
            revNum = revNum + name.charAt(i);
        }
        System.out.println("Reverse of String: "+revNum);
    }
}
