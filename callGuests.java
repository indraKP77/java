import java.util.*;
public class callGuests {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int total = diffWays(n);
        System.out.println("Total number of ways to invite people to a party: "+total);
        sc.close();
    }

    public static int diffWays(int n){
        if(n<=1){
            return 1;
        }
        int way1 = diffWays(n-1);
        int way2 = (n-1)*diffWays(n-2);
        return way1+way2;
    }

}
