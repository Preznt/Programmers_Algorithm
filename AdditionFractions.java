import java.util.ArrayList;

/**
 * 7/11 분수의 덧셈
 */
public class AdditionFractions {
    // 소인수분해는 어떤 수를 소수인 인수로 분해하는 것

        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numerator = numer1 * denom2 + numer2 * denom1;
            int denominator = denom1 * denom2;
            int[] answer = new int[2];

            for(int i = numerator  ; i > 1 ; i--){
                if(denominator % i == 0 && numerator % i == 0){
                   numerator /= i;
                   denominator /= i;
                }

            }

            answer[0] = numerator;
            answer[1] = denominator;

            return answer;
        }

}
