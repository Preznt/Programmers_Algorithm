package solution.level_0;

import java.util.Scanner;
/**
 * "*"로 직각삼각형 출력하기
 * "*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
 * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
 */
public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        };

        // 아래와 같이 더 쉽게 표현할 수 있다.
//        for(int i=1; i<=n; i++){
//            System.out.println("*".repeat(i));
//        }
    }


}
