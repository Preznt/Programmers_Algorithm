import java.util.ArrayList;
import java.util.List;

/**
 * 짝수는 싫어요
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class OddArray {
    public int[] solution(int n) {
        List<Integer> arr1 = new ArrayList<>();
        for(int i = 1; i <= n ; i = i+2){
            arr1.add(i);
        }
        return arr1.stream().mapToInt(i -> i).toArray();
    }

}
