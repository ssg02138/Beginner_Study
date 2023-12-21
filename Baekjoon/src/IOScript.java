import java.util.Scanner;

public class IOScript {

    public static void b_2557() {
//        문제
//        Hello World!를 출력하시오.
//
//                입력
//                없음
//
//        출력
//        Hello World!를 출력하시오.
//
//                예제 입력 1
//        예제 출력 1
//        Hello World!

        System.out.print("Hello World!");

    }


    public static void b_1000() {
//    문제
//    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//    출력
//    첫째 줄에 A+B를 출력한다.
//
//    예제 입력 1
//            1 2
//    예제 출력 1
//            3
        Scanner in = new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();

        System.out.println(a+b);
    }


    public static void b_1001() {
//        문제
//        두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        첫째 줄에 A-B를 출력한다.
//
//                예제 입력 1
//        3 2
//        예제 출력 1
//        1
//
        Scanner in = new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();

        System.out.println(a-b);
    }


    public static void b_10998() {
//        문제
//        두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        첫째 줄에 A×B를 출력한다.
//
//        예제 입력 1
//        1 2
//        예제 출력 1
//        2
//        예제 입력 2
//        3 4
//        예제 출력 2
//        12

        Scanner in = new Scanner(System.in);

        int a= in.nextInt();
        int b= in.nextInt();

        System.out.println(a*b);
    }


    public static void b_1008() {
//        문제
//        두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//        출력
//        첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
//
//        예제 입력 1
//        1 3
//        예제 출력 1
//        0.33333333333333333333333333333333
//        10-9 이하의 오차를 허용한다는 말은 꼭 소수 9번째 자리까지만 출력하라는 뜻이 아니다.
//
//                예제 입력 2
//        4 5
//        예제 출력 2
//        0.8

        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println(a/b);
    }


    public static void b_10869() {
//        문제
//        두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를
//        출력하는 프로그램을 작성하시오.
//
//        입력
//        두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
//
//        출력
//        첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
//
//        예제 입력 1
//        7 3
//        예제 출력 1
//        10
//        4
//        21
//        2
//        1

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }


    public static void b_10926() {
//        문제
//        준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다.
//        준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가
//        주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어진다.
//        아이디는 알파벳 소문자로만 이루어져 있으며, 길이는 50자를 넘지 않는다.
//
//                출력
//        첫째 줄에 준하의 놀람을 출력한다. 놀람은 아이디 뒤에 ??!를 붙여서 나타낸다.
//
//        예제 입력 1
//        joonas
//        예제 출력 1
//        joonas??!
//                예제 입력 2
//        baekjoon
//        예제 출력 2
//        baekjoon??!

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        System.out.println(a + "??!");
    }


    public static void b_18108() {
//        문제
//        ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에
//        막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다.
//        공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
//
//        불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로
//        연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다.
//        불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
//
//                입력
//        서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
//
//        출력
//        불기 연도를 서기 연도로 변환한 결과를 출력한다.
//
//                예제 입력 1
//        2541
//        예제 출력 1
//        1998

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a - 543);
    }


    public static void b_10430() {
//        문제
//                (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//
//        (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//
//                세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//
//        출력
//        첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C,
//        넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
//
//        예제 입력 1
//        5 8 4
//        예제 출력 1
//        1
//        1
//        0
//        0

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }


    public static void b_2588() {
//        문제
//                (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

//        (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에
//        들어갈 값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈
//        세자리 자연수가 주어진다.
//
//        출력
//        첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
//
//        예제 입력 1
//        472
//        385
//        예제 출력 1
//        2360
//        3776
//        1416
//        181720

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*(b%100/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }


    public static void b_11382() {
//        문제
//        꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
//
//                입력
//        첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
//
//                출력
//        A+B+C의 값을 출력한다.
//
//        예제 입력 1
//        77 77 7777
//        예제 출력 1
//        7931

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b+c);
    }


    public static void b_10171() {
//        문제
//        아래 예제와 같이 고양이를 출력하시오.
//
//                입력
//        없음.
//
//                출력
//        고양이를 출력한다.
//
//        예제 입력 1
//        예제 출력 1
//            \    /\
//            )  ( ')
//            (  /  )
//            \(__)|

        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }


    public static void b_10172() {
//        문제
//        아래 예제와 같이 개를 출력하시오.
//
//                입력
//        없음.
//
//                출력
//        개를 출력한다.
//
//        예제 입력 1
//        예제 출력 1
//        |\_/|
//        |q p|   /}
//        ( 0 )"""\
//        |"^"`    |
//        ||_/=\\__|

        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}





