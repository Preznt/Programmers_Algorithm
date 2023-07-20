package solution.level_0;

public class FlipString {
//    "jaiur"
    public String solution(String my_string) {
        int length = my_string.length();
        String answer = my_string;
        StringBuilder sb = new StringBuilder(answer);
        for(int i =0; i < length ; i++) {
            // 이게 안되는 이유가 중간에 중복되는 값이 발생하면 그것도 바꿔버리는 이슈 발생
//            answer = answer.replace(answer.charAt(i), my_string.charAt(length -i-1));

            sb.setCharAt(i,my_string.charAt(length -i-1));
            answer = sb.toString();
        };
        return answer;
    }

    public String anotherSolution(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }
}
