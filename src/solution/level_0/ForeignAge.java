package solution.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 외계행성의 나이
 * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데,
 * PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
 * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
 */
public class ForeignAge {
    public String solution(int age) {

        int[] arrNum = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();

        String[] nameArray = new String[arrNum.length];
        for(int i = 0; i < arrNum.length ; i++){
            char name = (char)(arrNum[i] + 97);
            nameArray[i] = String.valueOf(name);
        }
        String answer = String.join("",nameArray);
        System.out.println(answer);

        return answer;
    }

    // 큰따옴표(" ")는 문자열(String)을 감싸는 기호이고
    //작은따옴표(' ')는 문자(Character)를 감싸는 기호이다.

    public String anotherSolution(int age) {
        String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }
}
