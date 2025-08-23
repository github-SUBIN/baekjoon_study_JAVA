package study;

import java.util.Scanner;

//2018번이랑 비슷하게 풀면 되는것 같아서 쉽게 생각했는데 while문 조건 헷갈림. 많이 틀림 ㅜㅜ
public class Jumong_1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }
        int count=0;
        int start=num[0];
        int i=1;
        int restart = 0;
        while(restart<n-1){
            if(i<=n-1){
                if(start+num[i]==m){
                    count++;
                }
                i++;
            }
            /*
            if(start+num[i]==m && i<=n-1){
                count++;
                i++;
            }
            else if(start+num[i]!=m && i<=n-1){
                i++;
            }
            */
            else if(i==n){
                restart++;
                i = restart+1;
                start = num[restart];
            }
        }
        System.out.println(count);
    }
}
