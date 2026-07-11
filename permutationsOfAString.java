import java.util.*;
public class permutationsOfAString {
    public static void main(String args[]){
        String str = "abaa";
        HashSet<String> set = new HashSet<>();
        printComb(str, 0, "");
        printUniqueComb(str, 0, "", set);
    }

    public static void printComb(String str, int idx, String comb){

        if(idx == str.length()){
            System.out.println(comb);
            return;
        }

        printComb(str, idx+1, comb+str.charAt(idx));
        printComb(str, idx+1, comb);

    }

    public static void printUniqueComb(String str, int idx, String comb, HashSet<String> set) {
        if(idx == str.length()){
            if(set.contains(comb)){
                return;
            }
            else{
                set.add(comb);
                System.out.println(comb);
            return;
            }
        }

        printUniqueComb(str, idx+1, comb+str.charAt(idx), set);
        printUniqueComb(str, idx+1, comb, set);
    }

}
