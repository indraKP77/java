import java.util.*;
public class subSequences {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string to find all subsequences");
        str = sc.nextLine();
        findSubSequences(str, 0, "");
    }
    public static void findSubSequences(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        findSubSequences(str, idx+1, newString+str.charAt(idx));
        findSubSequences(str, idx+1, newString);
    }
}
