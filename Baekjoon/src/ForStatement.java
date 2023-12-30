import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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
            System.out.println(a + " * " + i + " = " + (a * i));
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

        for (int i = 0; i < N; i++) {
            if (i % 4 == 0) {
                System.out.print("long ");
            }
        }
        System.out.println("int");
    }


    public static void b_15552() throws IOException {
//        문제
//        본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다.
//        입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
//        C++을 사용하고 있고 cin/cout을 사용하고자 한다면,
//        cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고,
//        endl 대신 개행문자(\n)를 쓰자.
//        단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등
//        C의 입출력 방식을 사용하면 안 된다.
//        Java를 사용하고 있다면, Scanner와 System.out.println 대신
//        BufferedReader와 BufferedWriter를 사용할 수 있다.
//        BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
//
//        Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다.
//        단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우
//        .rstrip()을 추가로 해 주는 것이 좋다.
//
//        또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서
//        저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
//
//        자세한 설명 및 다른 언어의 경우는 이 글에 설명되어 있다.
//        이 블로그 글에서 BOJ의 기타 여러 가지 팁을 볼 수 있다.
//
//        입력
//        첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다.
//        다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
//
//                출력
//        각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
//
//                예제 입력 1
//        5
//        1 1
//        12 34
//        5 500
//        40 60
//        1000 1000
//        예제 출력 1
//        2
//        46
//        505
//        100
//        2000
        // 2 Line
        // 1 2 3 -> tokenizer : 1(one) / 2(two) / 3 -> Buffer
        // 4 5 -> tokenizer : 4(one) / 5(two) -> Buffer
        // 버퍼링 -> 끊김 -> 1 "2" 4 5
        // Buffer(string(1) + " ")
        // Output)
        // 1 2
        // 4 5

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }


    public static void b_11021() throws IOException {
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다.
//        테스트 케이스 번호는 1부터 시작한다.
//
//        예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        Case #1: 2
//        Case #2: 5
//        Case #3: 7
//        Case #4: 17
//        Case #5: 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write("Case #" + i + ": ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();

    }


    public static void b_11022() throws IOException {
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
//        x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
//
//                예제 입력 1
//        5
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        예제 출력 1
//        Case #1: 1 + 1 = 2
//        Case #2: 2 + 3 = 5
//        Case #3: 3 + 4 = 7
//        Case #4: 9 + 8 = 17
//        Case #5: 5 + 2 = 7

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int a;
        int b;

        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": ");
            bw.write(a + " + " + b + " = ");
            bw.write((a + b) + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }


    public static void b_2438() {
//        문제
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//                입력
//        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//        출력
//        첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//                예제 입력 1
//        5
//        예제 출력 1
//                  *
//                  **
//                  ***
//                  ****
//                  *****
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void b_2439() {
//        문제
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//        하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//
//        입력
//        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//        출력
//        첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//                예제 입력 1
//        5
//        예제 출력 1
//                *
//               **
//              ***
//             ****
//            *****
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void b_10952() {
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//                입력
//        입력은 여러 개의 테스트 케이스로 이루어져 있다.
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//        입력의 마지막에는 0 두 개가 들어온다.
//
//                출력
//        각 테스트 케이스마다 A+B를 출력한다.
//
//                예제 입력 1
//        1 1
//        2 3
//        3 4
//        9 8
//        5 2
//        0 0
//        예제 출력 1
//        2
//        5
//        7
//        17
//        7

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int a;
//        int b;
//
//        StringTokenizer st;
//
//        for (int i = 0; i <= 1; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            a = Integer.parseInt(st.nextToken());
//            b = Integer.parseInt(st.nextToken());
//            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
//
//
//        }
//        br.close();
//
//        bw.flush();
//        bw.close();

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        }
    }


    public static void b_10951() {
//        문제
//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//                입력
//        입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        각 테스트 케이스마다 A+B를 출력한다.
//
//                예제 입력 1
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

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
