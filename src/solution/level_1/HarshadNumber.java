package solution.level_1;

/**
 * 햐샤드 수
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 */
public class HarshadNumber {
    public boolean solution(int x) {
        int initialX = x;
        int sum = 0;

        // 반복문을 이용해서 각 자리수 더하기
        while (x > 0){
            int remainder = x % 10;
            x = x/10;
            sum = sum + remainder;
        }
        // 만약 x를 sum으로 나눈 값의 boolean 값을 반환
        return initialX % sum == 0;

    }

    public boolean anotherSolution(int x) {
        // 각 문자의 유니코드 코드 포인트 값에서 문자 '0'의 유니코드 코드 포인트 값을 뺸다
        // '0'의 코드 포인트 값은 48이다.
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        System.out.println(sum);
        return x % sum == 0;
    }
}
