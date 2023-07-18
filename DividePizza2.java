public class DividePizza2 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= 50; i++){
            if(6 * i % n == 0) {
                answer = i;
                break;
            }

        }
        return answer;
    }

    public int anotherSolution(int n) {
        int answer = 1;
        while (true) {
            if (6 * answer % n == 0) {
                return answer;
            }

            answer++;
        }
    }
}
