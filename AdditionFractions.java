import java.util.ArrayList;

/**
 * 7/11 분수의 덧셈
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class AdditionFractions {
    // 소인수분해는 어떤 수를 소수인 인수로 분해하는 것

        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numerator = numer1 * denom2 + numer2 * denom1;
            int denominator = denom1 * denom2;

            // for 반복문 조건을 작은수에서 큰순서로 하게 되면
            // 나눴을 때 끝부분에서 기약분수가 되지 않았는데 큰 수만 남아있어 조건이 성립되지 않아 오류가 발생하여 아래와 같이 수정
            for(int i = numerator  ; i > 1 ; i--){
                if(denominator % i == 0 && numerator % i == 0){
                   numerator /= i;
                   denominator /= i;
                }

            }
            int[] answer = {numerator, denominator};
            return answer;
        }

}
