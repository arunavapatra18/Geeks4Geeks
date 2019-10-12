import java.util.Scanner;

class InversePermutation{
    public static void main(String args[]){
        int T,N,index,temp;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while(T>0){
            N = sc.nextInt();
            int arr[] = new int[N];
            int arr2[]= new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }

            for(index=0;index<N;index++){
                temp = arr[index];
                arr2[temp-1] = index+1;
            }
            
            for(int i=0;i<N;i++){
                System.out.print(arr2[i]+" ");
            }
            T--;
        }
    }
}