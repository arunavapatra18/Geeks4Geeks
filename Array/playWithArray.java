import java.util.Scanner;

class PlayWithArray{
    public static void main(String args[]){
        int T,N,t1,t2;
        
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        while(T>0){
            N = sc.nextInt();
            int arr[] = new int[N];

            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();    
            }

            for(int i=0;i<N;i=i+2){
                if(i+1<N){
                    t1 = arr[i];
                    t2 = arr[i+1];
                    if(t1>t2){
                        arr[i+1] = t1;
                        arr[i] = t2;
                    }
                }
            }

            for(int i =0;i<N;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            T--;
        }
        sc.close();
    }
}