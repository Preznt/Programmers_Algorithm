package solution.level_0;

import java.util.stream.IntStream;

public class SliceArray {
    public int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.range(num1, num2 + 1).map(num -> numbers[num]).toArray();

        // 또 다르 방법
//        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

}
