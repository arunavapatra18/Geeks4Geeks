import java.util.*;
class RotateArray{
    public static void main(String args[]){
        
        int test_case,size,rotate_by,temp,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTest Cases:");
        test_case = sc.nextInt();
        
        while(test_case>0){
            System.out.println("\nEnter the size and rotation: ");
            size = sc.nextInt();
            rotate_by =sc.nextInt();

            int arr[] = new int[size];

            for(int j=0;j<size;j++){
                arr[j] = sc.nextInt();
            }
        
            while(rotate_by>0){
                temp = arr[0];
                for(i=0;i<size;i++){
                    if(i<=size-2){
                        arr[i] = arr[i+1];
                    }
                }
                arr[size-1] = temp;
                rotate_by--;
            }

            for(int j=0;j<size;j++){
                System.out.print(arr[j]+" ");
            }
            test_case--;
        }

        sc.close();
    }
}