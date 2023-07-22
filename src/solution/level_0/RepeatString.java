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

    public String anotherSolution(String my_string, int n){
        char[] arr = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            for(int i = 0; i < n ; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // String과 char의 차이점
    // char 같은 경우는 내용물이 1개의 문자로 제한되는 반면에 String은 그런 제한이 없이 문자를 담을 수 있다.
    // 내용물의 차이는 char는 해당 변수 안에 값을 직접적으로리 가지고 있고 String은 클래스타입의 변수이기에 임의로 만들어진 값이 들어있는 위치의 좌표를 내용물로 가진다.

    // String, StringBuilder, StringBuffer
    // 모두 문자열을 저장하고, 관리하는 클래스
    // 아주 기본적인 차이는 String은 immutable(불변), 나머지는 mutable(변함)에 있다.
    // String 객체는 한번 생성되면 할당된 메모리 공간이 변하지 않는다.
    //
    // StringBuilder, StringBuffer는 문자열 연산 등으로 기존 객체의 공간이 부족하게 되는 경우,기존의 버퍼 크기를 늘리며 유연하게 동작한다.
    // 두 클래스의 차이점은 바로 동기화 여부이다.
    // StringBuffer는 각 메서드별로 Synchronized Keyword가 존재하여, 멀티스레드 환경에서도 동기화를 지원
    // 반면, StringBuilder는 동기화를 보장하지 않음.
}
