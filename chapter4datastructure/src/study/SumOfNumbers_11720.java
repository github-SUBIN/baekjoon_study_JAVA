package study;

import java.util.*;

public class SumOfNumbers_11720 {
    public static void main(String[] args) {
        //int로 하면 11, 10987654321에서 오류가 나길래 long으로 바꿈.
        //long으로 바꿔도 25, 700000000000000000000000에서 오류가 나므로 long도 안됨
        //그냥 문자열로 받아야겠다
        /*
        long num = scanner.nextLong();
        long num2 = scanner.nextLong();
        List<Long> list1 = new ArrayList<Long>();
        for(int i=1;i<=num;i++)
        {
            list1.add(num2%10);
            num2 = num2/10;
        };
        for(int i=0;i<num;i++)
        {
            sum+=list1.get(i);
        }
        System.out.println(sum);
        */
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String num2 = scanner.next();
        char[] numarr = num2.toCharArray();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int a = Character.getNumericValue(numarr[i]);
            sum += a;
            //sum+=numarr[i]-'0';
        }
        System.out.println(sum);
    }
}

