import java.util.Scanner;

class NumberOfNumbers{
    public static void main(String args[]){
        int t,n,k,count;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Cases:");
        t = sc.nextInt();

        while(t>0){
            System.out.println("Size of array:");
            n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            //To String
            s = "";
            for(int i=0;i<n;i++){
                s = s + Integer.toString(arr[i]);
            }
            //System.out.println(s);
            
            //To char array for iteration
            char[] c = s.toCharArray();
            
            //input for the req. digit
            k = sc.nextInt();
            
            //Iterating through char array and counting
            count = 0;
            for(char ch: c){
                //System.out.println((int)ch);
                if((int)ch==k+48){
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
        sc.close();
    }
}
