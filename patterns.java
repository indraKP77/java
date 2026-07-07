import java.util.*;
public class patterns {
    public static void main(String args[]){
        printSum();
        int fact = printFactorial();
        System.out.println(fact);
        }
        public static void printSum(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            sc.close();
        }
        public static int printFactorial(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to find its factorial");
            int n = sc.nextInt();
            int fact = 1;
            for(int i = 1;i <= n;i++){
                fact = fact*i;
            }
            sc.close();
            return fact;
        }
    }


