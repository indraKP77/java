import java.util.*;
public class backTracking {
    public static void main(String[] args) {
        String str = "ABCD";
        String perm = "";
        getPerm(str, perm, 0);
    }
    public static void getPerm(String str, String perm, int idx){
        if(idx == str.length()){
            System.out.println(perm);
            return;
        }
        char currChar = str.charAt(idx);
        perm = perm+currChar;
        getPerm(str, perm, idx+1);
        perm = perm.substring(0, perm.length()-1);
        getPerm(str, perm, idx+1);
    }


}
