import java.util.*;

public class recursion {
    public static int first = -1;
    public static int last = -1;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int x = sc.nextInt();
        
        // int sum = printSum(n);
        
        // System.out.println("Sum of all natural numbers upto " + n + " is " + sum);
        // sc.close();
        // int a = 0;int b = 1;
        // System.out.print(a + " " + b);
        // printFibonacci(a, b, n-2);
        // System.out.println("Enter it's exponent");
        // int n = sc.nextInt();
        // int res = exponential(x,n);
        // System.out.println(res);
        String str;
        System.out.println("Enter a string");
        str = sc.nextLine();
        System.out.println("Enter a character");
        char c = sc.next().charAt(0);
        firstAndLastOccurence(str, 0, c);
    }
    
    public static int printSum(int n){
        if(n == 0){
            return 0;
        }
        return n + printSum(n - 1);
    }

    public static void printFibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.print(" " + c);
        printFibonacci(b, c, n-1);
    }

    public static int exponential(int x, int n){
        if(x == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n%2 == 0){
            return exponential(x, n/2)*exponential(x, n/2);
        }
        else{
            return exponential(x, n/2)*exponential(x, n/2)*x;
        }
    }

    public static void firstAndLastOccurence(String str, int idx, char c){
        if(idx == str.length()){
            System.out.println("First occurence of char "+first);
            System.out.println("Last occurence of char "+last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == c){
            if(first == -1){
                first = idx;
            }
            last = idx;
        }
        firstAndLastOccurence(str, idx+1, currChar);
    }

}