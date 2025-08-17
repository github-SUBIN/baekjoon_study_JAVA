package study;

import java.util.*;

public class Average_1546 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        scanner.nextLine(); //nextInt()로 한번 읽고 엔터치면 밑의 nextLine()을 읽지 못하고 끝나므로 scanner.nextLine();으로 엔터 읽어주고 내려감

        String score = scanner.nextLine(); //nextLine은 띄어쓰기 포함해서 읽음

        String[] score2 = score.split(" "); //String 배열에 띄어쓰기 기준으로 구분해서 만듦

        List<Integer> scorelist = new ArrayList<>(); //크기 미리 지정하지 않고 만들 수 있는 리스트!

        for(int i=0;i<num;i++){
            scorelist.add(Integer.parseInt(score2[i])); //int들어가는 리스트에 문자열 배열을 숫자로 바꿔서 넣기
        }

        int biggest = 0;
        for(int i=0;i<scorelist.size();i++){
            if(biggest<scorelist.get(i)){
                biggest = scorelist.get(i); //점수중 최대값 찾기
            }
        }

        List<Double> newscore = new ArrayList<>(); //새로운 점수 내야하니 double로 리스트 만들기
        for(int i=0;i<scorelist.size();i++){
            newscore.add(((double)scorelist.get(i)/biggest)*100.0); //(double) 잊지말기!!
            //(double) 안하거나 100.0만 하면 double 리스트에 맞지 않으므로 오류남! 주의주의
        }
        double avg = 0;
        double sum=0;
        for(int i=0;i<newscore.size();i++){
            sum+=newscore.get(i); //변형된 리스트의 값 다 더해주기
            //System.out.println(newscore.get(i));
        }
        avg = sum/newscore.size(); //평균내기
        System.out.println(avg);


        //같은 코딩. 자바에서는 int[[ score = new int[num]이 가능하다!
        /*
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] score = new int[num];
        for(int i=0; i<num;i++){
            score[i] = scanner.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0;i<num;i++){
            if(max<score[i]){
                max=score[i];
            }
            sum+=score[i];
        }
        System.out.println(sum*100.0/max/num);
        */
    }
}
