package study;

import java.util.*;

public class Good_1253 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];

        for(int i=0;i<n;i++){
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num);
        int count = 0;

        for(int number=0; number<n;number++) {
            int start = 0;
            int end = n - 1;

            while (start < end) {
                if (num[start] + num[end] == num[number]) {
                    if (start != number && end != number) {
                        count++;
                        break;
                    } else if (start == number) {
                        start++;
                    } else if (end == number) {
                        end--;
                    }
                } else if (num[start] + num[end] < num[number]) {
                    start++;
                } else if (num[start] + num[end] > num[number]) {
                    end--;
                }
            }
        }
        System.out.println(count);


    }
}
