//Day23
//특이한 정렬
import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        
        for(int i=0; i<numlist.length; i++){
            for(int j=0; j<numlist.length; j++){
                if(Math.abs(n-numlist[i])<=Math.abs(n-numlist[j])){
                    int tmp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = tmp;
                }
            }
        }
        return numlist;
    }
}
//등수 매기기
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sum = new int[score.length];
        
        int count;
        
        //합을 넣은 배열
        for (int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        //등수 매기기
        for (int i = 0; i < sum.length; i++) {
            count = 1;
            for (int j = 0; j < sum.length; j++){
                if(sum[i]<sum[j]){
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
//옹알이 (1)
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        //babbling을 돌면서 aya, ye, woo, ma를 차례로 공백으로 치환
        for (int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "0");
            babbling[i] = babbling[i].replace("ye", "0");
            babbling[i] = babbling[i].replace("woo", "0");
            babbling[i] = babbling[i].replace("ma", "0");
            babbling[i] = babbling[i].replaceAll("0", "");
            
            if (babbling[i].isEmpty()){
                answer++;
            }
            
        }
        
        return answer;
    }
}
//로그인 성공?
class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (int i=0; i<db.length; i++){
            if (id.equals(db[i][0]) && pw.equals(db[i][1])){
                answer = "login";
                break;
            } else if (id.equals(db[i][0]) && pw != db[i][1]) {
                answer = "wrong pw";
                break;
            } else {
                answer = "fail";
            } 
             
        }
        return answer;
    }
}
