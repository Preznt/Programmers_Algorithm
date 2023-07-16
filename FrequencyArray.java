import java.util.*;


/**
 * 최빈값 구하기
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
 */
public class FrequencyArray {
    public int solution(int[] array) {
    int sum = 0;
    // 배열의 각 숫자가 얼마나 나왔는 key-value 로 저장
    Map<Integer,Integer> frequencyItem = new HashMap<>();
    for(int i : array){
        for(int j = 0; j< array.length; j++) {
            if (i == array[j]) {
                sum += 1;
                    frequencyItem.put(i, sum);
            }
        }
        sum = 0;
    }
    // 값들만 뽑아서 새로 배열을 만든 다음에 가장 큰 값을 구한다
    // 가장 큰 값이 여러개 존재하면 -1을 반환하고 한개만 존재하면 해당 키값을 찾아서 반환
    List<Integer> frequencyArray = new ArrayList<>(frequencyItem.values());
    int max = Collections.max(frequencyArray);
    int maxFrequency = Collections.frequency(frequencyArray, max);

    int answer = 0 ;
    if(maxFrequency > 1){
        answer = -1;
    } else{
        for (Map.Entry<Integer, Integer> entry : frequencyItem.entrySet()) {
            if (entry.getValue().equals(max)) {
              answer = entry.getKey();
                break;
            }
        }
    }
    return answer;
    }


    public int anotherSolution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}