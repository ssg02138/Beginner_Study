import java.util.Scanner;

public class ConditionalStatement {
    public static void b_1330() {
//        문제
//        두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//
//                출력
//        첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//        A가 B보다 큰 경우에는 '>'를 출력한다.
//        A가 B보다 작은 경우에는 '<'를 출력한다.
//        A와 B가 같은 경우에는 '=='를 출력한다.
//        제한
//                -10,000 ≤ A, B ≤ 10,000
//        예제 입력 1
//        1 2
//        예제 출력 1
//                <
//                예제 입력 2
//        10 2
//        예제 출력 2
//                >
//                예제 입력 3
//        5 5
//        예제 출력 3
//                ==

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        }
        if (a < b) {
            System.out.println("<");
        }
        if (a == b) {
            System.out.println("==");
        }
    }


    public static void b_9498() {
//        문제
//        시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C,
//        60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//        출력
//        시험 성적을 출력한다.
//
//                예제 입력 1
//        100
//        예제 출력 1
//        A
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 90) {
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");
        } else if (a >= 70) {
            System.out.println("C");
        } else if (a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }


    public static void b_2753() {
//        문제
//        연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//                예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
//                1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
//                하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//
//        입력
//        첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//
//        출력
//        첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
//
//        예제 입력 1
//        2000
//        예제 출력 1
//        1
//        예제 입력 2
//        1999
//        예제 출력 2
//        0

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 4 == 0) {
            if (a % 400 == 0) {
                System.out.println("1");
            } else if (a % 100 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }

    public static void b_14681() {
//        문제
//        흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
//        사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
//        예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
//        점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
//
//        점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
//        단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
//
//                입력
//        첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다.
//        (−1000 ≤ y ≤ 1000; y ≠ 0)
//
//        출력
//        점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
//
//        예제 입력 1
//        12
//        5
//        예제 출력 1
//        1
//        예제 입력 2
//        9
//                -13
//        예제 출력 2
//        4

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0) {
            if (b > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        }
        if (a < 0) {
            if (b > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
