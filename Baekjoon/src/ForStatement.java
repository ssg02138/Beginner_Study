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


    public static void b_8393() {
//        문제
//        n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//        출력
//        1부터 n까지 합을 출력한다.
//
//        예제 입력 1
//        3
//        예제 출력 1
//        6
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void b_25304() {
//    문제
//    준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다.
//    정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
//    준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
//
//    영수증에 적힌,
//    구매한 각 물건의 가격과 개수
//    구매한 물건들의 총 금액
//    을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
//
//    입력
//    첫째 줄에는 영수증에 적힌 총 금액
//    $X$가 주어진다.
//
//    둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수
//    $N$이 주어진다.
//
//    이후
//    $N$개의 줄에는 각 물건의 가격
//    $a$와 개수
//    $b$가 공백을 사이에 두고 주어진다.
//
//            출력
//    구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
//    일치하지 않는다면 No를 출력한다.
//
//    제한
//    1 ≤ X ≤ 1,000,000,000
//    1 ≤ N ≤ 100
//    1 ≤ a ≤ 1,000,000
//    1 ≤ b ≤ 10

//    예제 입력 1
//            260000
//            4
//            20000 5
//            30000 2
//            10000 6
//            5000 8
//    예제 출력 1
//    Yes
//    영수증에 적힌 구매할 물건들의 목록으로 계산한 총 금액은
//    20000 × 5 + 30000 × 2 + 10000 × 6 + 5000 × 8 = 260000원이다.
//    이는 영수증에 적힌 총 금액인 260000원과 일치한다.
//
//    예제 입력 2
//            250000
//            4
//            20000 5
//            30000 2
//            10000 6
//            5000 8
//    예제 출력 2
//    No
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += (a * b);
        }
        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


    public static void b_25314() {
//        입력
//        첫 번째 줄에는 문제의 정수
//        N이 주어진다.
//        (4<=N<=1,000; N은 4의 배수)
//
//        출력
//        혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라.
//
//        예제 입력 1
//        4
//        예제 출력 1
//        long int
//        예제 입력 2
//        20
//        예제 출력 2
//        long long long long long int
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            if (i % 4 == 0) {
                System.out.print("long ");
            }
        }
        System.out.println("int");
    }
}
