package study;

import java.io.*;
import java.util.Arrays;
//import java.util.Scanner;
import java.util.Stack;

public class RightBigNumber_17298 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);

        //int n = scanner.nextInt();
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] number = new int[n];

        for(int i=0;i<n;i++){
            number[i] = Integer.parseInt(str[i]);
        }
        /*
        for(int i=0;i<n;i++){
            number[i] = scanner.nextInt();
        }
        */

        int[] answer = new int[n];

        Arrays.fill(answer, -1);

        Stack<Integer> st = new Stack<>();

        //이것도 맞은 코드인데 buffereedWriter를 안했어서 시간초과 뜸
        for(int i=0;i<n;i++){
            if(!st.empty()) {
                while(!st.empty()) {
                    if (number[st.peek()] < number[i]) {
                        answer[st.peek()] = number[i];
                        st.pop();
                    }
                    else{
                        break;
                    }
                }
            }
            st.push(i);
        }

        /*
        //맞은 코드 - 책 그대로
        for(int i=0;i<n;i++){
            while(!st.empty() && number[st.peek()] < number[i]) {
                answer[st.peek()] = number[i];
                st.pop();
            }
            st.push(i);
        }

        */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++){
            bw.write(answer[i]+" ");
        }

        bw.write("\n");
        bw.flush();
        /*
        for(int i=0;i<n;i++){
            System.out.print(answer[i] + " ");
        }
         */


        //시간초과 - 책 아이디어
        /*
        int j=0;
        for(int i=0;i<n;i++){
            if(!st.empty()) {
                while (!st.empty()) {
                    if (number[st.peek()] < number[j]) {
                        answer[st.peek()] = number[j];
                        st.pop();
                    }
                    else{
                        j++;
                    }
                    if(j==n){
                        j--;
                        break;
                    }
                }
            }
            st.push(i);
            j = i+1;
        }

        */

        /*
        while(!st.empty()){
            answer[st.peek()] = number[n-1];
            st.pop();
        }
        */

        //시간초과 - 이중for문? 내 아이디어
        /*
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] num = new int[n];

        for(int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            st.push(num[i]);
        }

        while(!st.empty()){
            int a = st.pop();
            int max = -1;
            for(int i=st.size()-1;i>=0;i--){
                if(st.elementAt(i)>a){
                    max = st.get(i);
                    break;
                }
            }
            System.out.print(max + " ");
        }

        */
    }
}
