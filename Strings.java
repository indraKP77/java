import java.util.*;
public class Strings {
    public static void main(String args[]){
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("The length of the string is "+name.length());
        // System.out.println("Enter another name for comparision");
        // String name1 = sc.nextLine();

        //name = name1 : 0
        //name < name1 : -ve
        //name > name1 : +ve
        
        // if(name.compareTo(name1) == 0){
        //     System.out.println("Both strings are equal");
        // }
        // else if(name.compareTo(name1) > 0){
        //     System.out.println(name + " is greater than " + name1);
        // }
        // else{
        //     System.out.println(name1 + " is greater than " + name);
        // }
        String subname = name.substring(0,5);
        System.out.println("Substring is "+subname);
        sc.close();
    }
}
