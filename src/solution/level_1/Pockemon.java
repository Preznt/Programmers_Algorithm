package solution.level_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 이때, 첫 번째(3번) 폰켓몬과 네 번째(3번) 폰켓몬을 선택하는 방법은 한 종류(3번 폰켓몬 두 마리)의 폰켓몬만 가질 수 있지만,
 * 다른 방법들은 모두 두 종류의 폰켓몬을 가질 수 있습니다. 따라서 위 예시에서 가질 수 있는 폰켓몬 종류 수의 최댓값은 2가 됩니다.
 * 당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
 * N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중,
 * 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아, 그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class Pockemon {
    public int solution(int[] nums) {
        // 선택하는 개수
        int answer = nums.length / 2;

        // 중복 제외한 총 종류의 수
        Set<Integer> type = new HashSet<>();
        for(int n : nums){
            type.add(n);
        }
        int typeNumber = type.size();
        if(typeNumber < answer){ answer = typeNumber;}

        System.out.println(typeNumber + "선택 값" + answer);
        return answer;
    }
}
