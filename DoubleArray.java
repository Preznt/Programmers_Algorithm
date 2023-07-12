import java.util.Arrays;

/**
 * 배열 두배 만들기
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class DoubleArray {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(number -> number * 2).toArray();
        // 자바 스트림
        // Java 8에서 추가된 기능으로 컬렉션에 저장되어있는 엘리먼트들을 하나씩 순회하면서 처리할 수 있는 코드패턴
        // 람다식과 함께 표현되어 간결한 표현 가능
        // 내부 반복자와 함꼐 사용하기 때문에 병렬처리가 쉽다
    }
}
