//Day24
//치킨쿠폰
class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
		int count = 0;

		while (coupon >= 10) {
			int left_coupon = coupon % 10;
			count += coupon / 10;
			coupon = left_coupon + coupon / 10;
		}
		return count;
    }
}
//이진수 더하기
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        answer = Integer.toBinaryString(res);
        return answer;
    }
}
//A로 B만들기
import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(a);
        
        if (Arrays.equals(b, a)){
            answer = 1;
        }

        return answer;
    }
}
//k의 개수
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a<=j; a++){
            int b = a;
            while (true){
                if (b == 0)
                    break;
                if (b % 10 == k)
                    answer++;
                b /= 10;
            }
        }
        return answer;
    }
}
