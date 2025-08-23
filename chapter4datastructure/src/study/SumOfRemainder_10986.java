package study;

import java.util.Scanner;
//import java.io.*;

public class SumOfRemainder_10986 {
    /*
    public static void main(String[] args) throws IOException{
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //int m = scanner.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nm = br.readLine();
        String nmarr[] = nm.split(" ");
        int n = Integer.parseInt(nmarr[0]);
        int m = Integer.parseInt(nmarr[1]);
        int[] num = new int[n];
        String number = br.readLine();
        String numberarr[] = number.split(" ");
        for(int i=0;i<n;i++) {
            num[i] = Integer.parseInt(numberarr[i]);
        }
        //시간초과
        int r=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=num[j];
                if(sum%m==0){
                    r++;
                }
            }
        }
        bw.write(String.valueOf(r));
        bw.flush();
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }

        long[] s = new long[n];
        long[] re = new long[m];
        for(int i=0;i<m;i++){
            re[i]=0;
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=num[i];
            s[i] = sum;
            s[i] = s[i]%m;
            re[(int)s[i]]++;
        }
        long count=0;
        for(int i=0;i<m;i++){
            if(re[i]>1){
                count += (re[i]*(re[i]-1))/2;
            }
        }
        for(int i=0;i<n;i++){
            if(s[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}