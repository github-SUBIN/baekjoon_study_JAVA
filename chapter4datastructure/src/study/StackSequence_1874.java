package study;

import java.util.Scanner;
import java.util.Stack;

//개선된 코드로 풀어보기
public class StackSequence_1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }

        int j=0;
        Stack<Integer> st = new Stack<>();

        int i=1;

        int[] answer = new int[2*n];
        int a=0;


        while(j<n){
            if(i==1){
                st.push(i);

                answer[a] = 1;
                a++;

                i++;
            }
            else {
                if (!st.empty() && st.peek() == num[j]) {
                    answer[a] = 2;
                    a++;

                    st.pop();
                    j++;
                }
                else if(!st.empty() && st.peek() > num[j]){
                    answer[a] = 3;
                    break;
                }
                else {
                    answer[a] = 1;
                    a++;

                    st.push(i);
                    i++;
                }
            }
        }

        int doit = 0;
        for(int k=0;k<2*n;k++){
            if(answer[k]==3){
                doit = 1;
                break;
            }
        }

        if(doit == 0) {
            for (int k = 0; k < 2 * n; k++) {
                if(answer[k]==1){
                    System.out.println("+");
                }
                else if(answer[k]==2){
                    System.out.println("-");
                }
            }
        }
        else{
            System.out.println("NO");
        }
    }
}
