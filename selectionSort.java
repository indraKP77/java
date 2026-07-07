import java.util.*;
public class selectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array");
        for(int i = 0;i < arr.length;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("Array before sorting");
        printArray(arr);
        selsort(arr);
        System.out.println("\nArray after sorting");
        printArray(arr);
        sc.close();
    }
    public static void printArray(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void selsort(int arr[]){
        for(int i = 0;i < arr.length;i++){
            int small = i;
            for(int j = i+1;j < arr.length;j++){
                if(arr[j]<arr[small]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}
