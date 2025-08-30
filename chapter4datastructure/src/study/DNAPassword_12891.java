package study;

import java.util.Scanner;
//import java.io.*;

public class DNAPassword_12891 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String p = scanner.next();
        char[] pw = p.toCharArray();
        int[] howmany = new int[4];
        for(int i=0;i<4;i++){
            howmany[i] = scanner.nextInt();
        }

        int[] pwnum = new int[4];

        int start = 0;
        int end = m-1;
        int count = 0;

        for(int i = 0; i<m; i++){
            if(pw[i]=='A'){
                pwnum[0]++;
            }
            else if(pw[i]=='C'){
                pwnum[1]++;
            }
            else if(pw[i]=='G'){
                pwnum[2]++;
            }
            else if(pw[i]=='T'){
                pwnum[3]++;
            }
        }

        while(end<n){
            if(howmany[0]<=pwnum[0] && howmany[1]<=pwnum[1] && howmany[2]<=pwnum[2] && howmany[3]<=pwnum[3]){
                count++;
            }

            if(pw[start]=='A'){
                pwnum[0]--;
            }
            else if(pw[start]=='C'){
                pwnum[1]--;
            }
            else if(pw[start]=='G'){
                pwnum[2]--;
            }
            else if(pw[start]=='T'){
                pwnum[3]--;
            }

            start++;
            end++;

            if(end<n) {
                if (pw[end] == 'A') {
                    pwnum[0]++;
                } else if (pw[end] == 'C') {
                    pwnum[1]++;
                } else if (pw[end] == 'G') {
                    pwnum[2]++;
                } else if (pw[end] == 'T') {
                    pwnum[3]++;
                }
            }
        }
        System.out.println(count);


        //시간초과때문에 시도해봄
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nm = br.readLine();
        String nmarr[] = nm.split(" ");
        int n = Integer.parseInt(nmarr[0]);
        int m = Integer.parseInt(nmarr[1]);
        String p = br.readLine();
        char[] pw = p.toCharArray();
        String howmanystring = br.readLine();
        String howmanyarr[] = howmanystring.split(" ");
        int[] howmany = new int[4];
        for(int i =0;i<4;i++){
            howmany[i] = Integer.parseInt(howmanyarr[i]);
        }
        */

        /*
        //얘도 시간초과
        int start = 0;
        int end = m-1;
        int count = 0;
        int[] newnum = new int[4];
        //char[] newpw = new char[m];

        for(int i=0;i<n-m+1;i++){
            char[] newpw = new char[m];
            int j=0;
            while(j<m){
                newpw[j]=pw[start+j];
                if(newpw[j]=='A'){
                    newnum[0]++;
                }
                else if(newpw[j]=='C'){
                    newnum[1]++;
                }
                else if(newpw[j]=='G'){
                    newnum[2]++;
                }
                else if(newpw[j]=='T'){
                    newnum[3]++;
                }
                j++;
            }
            if(howmany[0]<=newnum[0] && howmany[1]<=newnum[1] && howmany[2]<=newnum[2] && howmany[3]<=newnum[3]){
                count++;
                start++;
                end++;
            }
            else{
                start++;
                end++;
            }
            newnum[0] = 0;
            newnum[1] = 0;
            newnum[2] = 0;
            newnum[3] = 0;
        }

        */


        /*
        while(end<n){
            char[] newpw = new char[m];
            for(int i=0;i<m;i++){
                newpw[i] = pw[start+i];
                if(newpw[i]=='A'){
                    newnum[0]++;
                }
                else if(newpw[i]=='C'){
                    newnum[1]++;
                }
                else if(newpw[i]=='G'){
                    newnum[2]++;
                }
                else if(newpw[i]=='T'){
                    newnum[3]++;
                }
            }

            if(howmany[0]<=newnum[0] && howmany[1]<=newnum[1] && howmany[2]<=newnum[2] && howmany[3]<=newnum[3]){
                count++;
                start++;
                end++;
            }
            else{
                start++;
                end++;
            }
            newnum[0] = 0;
            newnum[1] = 0;
            newnum[2] = 0;
            newnum[3] = 0;
        }

        */
        //bw.write(String.valueOf(count));
        //bw.flush();
    }
}
