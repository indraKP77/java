import java.util.*;
public class placeTiles {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int total = placeTiles(n, m);
        System.out.println("Total number of waysto place tiles: "+total);;
        sc.close();
    }

    public static int placeTiles(int n, int m) {
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalPlacements = placeTiles(n-m, m);
        int hortizontalPlacements = placeTiles(n-1, m);
        return verticalPlacements+hortizontalPlacements;
    }

}