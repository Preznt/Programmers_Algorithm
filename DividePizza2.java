/**
 * 피자 나눠먹기2
 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
 * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 */
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
