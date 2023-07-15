import java.util.*;

/**
 * 최빈값 구하기
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 */
public class FrequencyArray {
    public int solution(int[] array) {
    int sum = 0;
    Map<Integer,Integer> frequencyItem = new HashMap<>();
    for(int i : array){
        for(int j = 0; j< array.length; j++) {
            if (i == array[j]) {
                sum += 1;
                if (sum > 1) {
                    frequencyItem.put(i, sum);
                }

            }
        }
        sum = 0;

    }
    List<Integer> frequencyArray = new ArrayList<>(frequencyItem.values());
//        System.out.println(Collections.max(frequencyArray));
    int answer = 1;
    if(frequencyItem.size() > 1){
        if(frequencyArray.size() != frequencyArray.stream().distinct().count()){
            answer = -1;
        }else{
            answer = Collections.max(frequencyArray);
        }
    } else if(frequencyItem.size() == 1){
        answer = frequencyArray.get(0);
    }

        System.out.println(answer);
    return answer;

    }
}