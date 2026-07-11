import java.util.*;
import java.util.HashSet;
public class subSequences {
    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string to find all subsequences");
        str = sc.nextLine();
        findSubSequences(str, 0, "", set);
        sc.close();
    }
    public static void findSubSequences(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        findSubSequences(str, idx+1, newString+str.charAt(idx), set);
        findSubSequences(str, idx+1, newString, set);
    }
}
