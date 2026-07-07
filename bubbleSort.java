import java.util.*;
public class bubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("Array before sorting");
        printArray(arr);
        for(int i = 0;i < arr.length;i++){
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nArray after sorting");
        printArray(arr);
        sc.close();
    }
    public static void printArray(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        //Bubble Sort Time complexity : O(n²)
    }
}
