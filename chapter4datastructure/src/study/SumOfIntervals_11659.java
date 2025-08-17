package study;

import java.util.Scanner;

public class SumOfIntervals_11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        int[] s = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            s[i] = sum;
            //System.out.println(s[i]);
        }

        for(int i=0;i<m;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if(a==1){
                int result = s[b-1];
                System.out.println(result);
            }
            else{
                int result = s[b-1]-s[a-2];
                System.out.println(result);
            }
        }
    }
}
