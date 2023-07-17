import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 짝요는 싫어요
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class OddArray {
    // Array 와 List 의 차이점
    // Array는 객체 생성시 크기 할당 필수,정해진 공간이 있고 인덱스가 존재함
    // List는 객체 생성시 크기 할당 필요 없음,인덱스가 없다.

    // ArrayList란?
    // Array(배열)와 List(리스트)의 장점을 합친 것
    // 배열의 특성인 인덱스로 식별자를 쓰는 것이 가능하고, 리스트 특성그대로 크기를 동적으로 사용할 수 있다.
    public int[] solution(int n) {
        List<Integer> arr1 = new ArrayList<>();
        for(int i = 1; i <= n ; i = i+2){
            arr1.add(i);
        }
        return arr1.stream().mapToInt(i -> i).toArray();
    }

    public int[] anotherSolution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }

}
