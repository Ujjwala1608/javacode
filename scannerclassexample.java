import java.util.*;
public class scannerclassexample{

    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        //getting string value from user
        System.out.println("enter a name");
        String username=obj.next();
        System.out.println("your name is"+username);
    }
}