// 피자 나눠 먹기 (1)
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 7 == 0)
            answer = n / 7;
        else
            answer = n / 7 + 1;
        
        return answer;
    }
}

// 피자 나눠 먹기 (2)
class Solution {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= 6 * n; i++) {
			if (6 * i % n == 0) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}

// 피자 나눠 먹기 (3)
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n % slice == 0)
            answer = n / slice;
        else
            answer = n / slice + 1;
        
        return answer;
    }
}

// 배열의 평균 값
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        
        return answer;
    }
}
