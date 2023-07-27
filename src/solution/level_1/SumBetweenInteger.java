package solution.level_1;

import java.util.stream.IntStream;

/**
 * 두 정수 사이의 합
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */
public class SumBetweenInteger {
    public long solution(int a, int b) {
        if(a==b) return a;
        if(a > b) {
            int initialA = a;
            a = b;
            b = initialA;
        }
        // 하나씩 출력할때
//        IntStream.rangeClosed(a,b).forEach(i -> System.out.println(i));
        return  IntStream.rangeClosed(a,b).sum();
    }

    // 역기서 파라미터 타입을 long형태로 해주어야 통과가 된다...
    public long anotherSolution(int a, int b) {
        if(a > b) {
            int initialA = a;
            a = b;
            b = initialA;
        }

        return (b - a + 1 )* (a + b) /2;
    }

    // 아래 식은 되고 위에는 안되는 이유
    // int의 범위는 약 -2,147,483,648부터 2,147,483,647까지이며 메모리 상에서 4바이트를 차지함
    // long의 범위는 -2^63부터 2^63 - 1까지, 메모리 상에서 8바이트를 차지함
    // 위에서 (b - a + 1 )* (a + b) /2; 이부분을 계산할때 int형으로 계산을 진행시 오버플로우가 발생할 수 있어 long으로 해줘야함
    public long thirdSolution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        return answer;
    }
}
