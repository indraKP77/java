import java.util.*;
public class twoDArrays {
    public static void main(String args[]){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size and column size");
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j< arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
