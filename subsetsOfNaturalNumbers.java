import java.util.*;
public class subsetsOfNaturalNumbers {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> sub = new ArrayList<>();
        findSubsets(n, sub);
    }

    public static void findSubsets(int n, ArrayList<Integer> sub){
     
        if(n == 0){
            printSubsets(sub);
            return;
        }
        sub.add(n);
        findSubsets(n-1, sub);
        sub.remove(sub.size()-1);
        findSubsets(n-1, sub);
    }

    public static void printSubsets(ArrayList<Integer> sub){
        for(int i = 0;i < sub.size();i++){
            System.out.print(sub.get(i)+" ");
        }
        System.out.println();
    }

}
