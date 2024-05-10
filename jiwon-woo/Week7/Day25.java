//Day25
//문자열 밀기
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String copy = A;

        for (int i = 0; i < A.length(); i++) {
            
            if (copy.equals(B)) {
                return answer;
            }

            String str = copy.substring(copy.length() - 1);
            copy = str + copy.substring(0, copy.length() - 1);
            answer++;
        }

        return -1;
    }
}
//종이 자르기
class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = M * N - 1;
        return answer;
    }
}
//연속된 수의 합
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int temp = 0;
        
        for(int i=0;i<num;i++){
            temp+=i;
        }
        int value = (total-temp)/num;

        for(int i=0;i<num;i++){
            answer[i]=i+value;
        }

        return answer;
    }
}
//다음에 올 숫자
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int len = common.length;
        //등차이면
        if (common[1]-common[0] == common[2]-common[1]){
            int d = common[1]-common[0];
            answer = common[len-1] + d;
        } else { //등비이면
            int r = common[1] / common[0];
            answer = common[len-1] * r;
        }
        
        
        return answer;
    }
}
