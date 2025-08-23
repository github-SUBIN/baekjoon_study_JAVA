package study;

import java.util.Scanner;

public class SumOfIntervals5_11660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] num = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                num[i][j] = scanner.nextInt();
            }
        }

        int[][] sumnum = new int[n][n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0; j<n;j++){
                sum+=num[i][j];
                sumnum[i][j]=sum;
            }
        }

        int[][] xy = new int[m][4];
        for(int i=0;i<m;i++){
            for(int j=0;j<4;j++){
                xy[i][j] = scanner.nextInt();
            }
        }

        int sum2=0;
        for(int i=0;i<m;i++){
            int x1 = xy[i][0];
            int y1 = xy[i][1];
            int x2 = xy[i][2];
            int y2 = xy[i][3];
            /*
            //시간초과뜸
            for(int j=x1-1;j<=x2-1;j++){
                for(int t=y1-1;t<=y2-1;t++){
                    sum+=num[j][t];
                }
            }
            */
            for(int j=x1-1;j<=x2-1;j++) {
                if(y1==1){
                    sum2 += sumnum[j][y2 - 1];
                }
                else{
                    sum2 += sumnum[j][y2 - 1] - sumnum[j][y1 - 2];
                }
            }
            System.out.println(sum2);
            sum2 = 0;
        }

    }
}
