import java.util.Scanner;
import java.util.Arrays;

class LeftRightArraySum{
    public static void main(String args[]){

        int T,N;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Tests:");
        T = sc.nextInt();

        while(T>0){
            System.out.println("\nEnter size:");
            N = sc.nextInt();

            int arr[] = new int[N];

            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }

            int[] arr1 = getSliceOfArray(arr, 0, N/2-1);
            int[] arr2 = getSliceOfArray(arr, (N/2), N);
            
            int sum1 = 0;
            for(int i=0;i<arr1.length;i++){
                sum1 += arr1[i];
            }
            //System.out.println("Sum1"+sum1);
            int sum2 = 0;
            for(int i=0;i<arr2.length;i++){
                sum2 += arr2[i];
            }
            //System.out.println("Sum1"+sum2);
            System.out.println(sum1*sum2);
            T--;
        }
        sc.close();
    }

    public static int[] getSliceOfArray(int[] arr, int start, int end){
        int[] slice = Arrays.copyOfRange(arr, start, end+1);
        return slice;
    }
}