import java.io.*;
import java.util.*;
public class stringexample{
    public static void main(String args[]){
        String name=new String("Ram");
        StringBuffer sb=new StringBuffer(name);
        sb.append("is back");
        System.out.println(sb.toString());
                System.out.println("after deleting string");
                sb.delete(3,9);
                System.out.println(sb.toString());


    }
}