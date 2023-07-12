import java.util.Arrays;

/**
 * 배열 두배 만들기
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class DoubleArray {
    public int[] solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers).map(number -> number * 2).toArray();


        return answer;
    }
}
