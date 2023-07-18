public class DividePizza2 {
    public int solution(int n) {
        for(int i = 1; i <= n; i++){
            if(6 * i % n == 0) {
                System.out.println(i);
                return i;
            }

        }
        return 0;
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
