package solution.level_0;

/**
 * 문자 반복 출력하기
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때,
 * my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
public class RepeatString {
    public String solution(String my_string, int n) {
        String answer = my_string;
        StringBuilder sb = new StringBuilder(answer);

        for(int i = 0; i < answer.length() ; i = i + 3){
            String oneChar = String.valueOf(answer.charAt(i));
            // 아래와 같이 char의 타입이 맞지 않아 String으로 변환해봤지만
            // setChartAt이 파라미터가 char타입을 요구하므로 결국 안된다..
//            sb.setCharAt(i, String.valueOf(my_string.charAt(i)).repeat(i + 1));
            sb.insert(i, oneChar.repeat(n -1));
            answer = sb.toString();
//            answer = answer.replace(oneChar, oneChar.repeat(n));
        };
        System.out.println(answer);
        return answer;
    }

    // String과 char의 차이점

}
