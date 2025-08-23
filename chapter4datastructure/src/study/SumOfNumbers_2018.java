package study;

import java.util.Scanner;

//보고나서 고민 오래했지만 1트만에 통과함~!~!~
public class SumOfNumbers_2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n;
        int count = 0;
        int start = 1;
        int restart = 1;
        while(start<=n){
            a = a - start;
            if(a==0){
                count++;
            }
            else if(a>0){
                start++;
            }
            else if(a<0){
                a = n;
                restart++;
                start = restart;
            }
        }
        System.out.println(count);
        /*
        //교재코딩
        int n = scanner.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != n ){
            if(sum==n){
                count++;
                end_index++;
                sum = sum + end_index;
            }
            else if(sum > n){
                sum = sum-start_index;
                start_index++;
            }
            else{
                end_index++;
                sum = sum+end_index;
            }
        }
        System.out.println(count);

        */
    }
}


