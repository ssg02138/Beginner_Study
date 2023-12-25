import java.util.Scanner;
public class ForStatement {

    public static void b_2739() {
//        문제
//        N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
//
//                입력
//        첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
//
//                출력
//        출력형식과 같게 N*1부터 N*9까지 출력한다.
//
//        예제 입력 1
//        2
//        예제 출력 1
//        2 * 1 = 2
//        2 * 2 = 4
//        2 * 3 = 6
//        2 * 4 = 8
//        2 * 5 = 10
//        2 * 6 = 12
//        2 * 7 = 14
//        2 * 8 = 16
//        2 * 9 = 18
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i < 10; i++) {
           System.out.println(a + " * " + i + " = " +(a * i));
        }
    }

    public static void b_10950() {
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//                각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        각 테스트 케이스마다 A+B를 출력한다.
//
//                예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        2
//        5
//        7
//        17
//        7
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
