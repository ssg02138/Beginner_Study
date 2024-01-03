import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Array {
    public static void array() {

//        input으로 int1개
//        1차원 배열 생성
//        밸류가 인덱스의 2배
//        2 == input, arrInt = [0, 2]
        // arrInt[0] = 0
        // arrInt[1] = 2 // value = index * 2
        // 6 == input
        //arrInt = [0, 6]
        // 0, 2, 4, 6, 8, 10

        // 2차원 배열
        // 집합 -> 효율적 쓸까?
        // 구구단 -> 9X9 -> 9 X 9 = 81개 변수

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int[][] arrInt = new int[a][b];
//
//        for (int i = 0; i < arrInt.length; i++) {
//            for (int j = 0; j < arrInt[i].length; j++) {
//                arrInt[i][j] = j+1;
////                System.out.println(arrInt[i][j]);
//            }
//            System.out.println(Arrays.toString(arrInt[i]));
//        }
//
//        System.out.println(arrInt[0][3] * arrInt[1][4]);

//        // 로또 기계 만들기
//        // 각 배열에서 한자리씩 랜덤 출력하여 6개의 정수(1~81)를 출력하는 기계를 만들어라
//        // 배열에서 랜덤으로 값을 호출하는 함수는 찾아보기
//        // 1, 18, 24, 16, 71, 81
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arrInt = new int[a][b];

        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                arrInt[i][j] = j + 1;
//                System.out.println(arrInt[i][j]);
            }
            System.out.println(Arrays.toString(arrInt[i]));
        }
        int z = 0;
        do {
            int i1 = (int) Math.round(((Math.random() * (8 - 1)) + 1));
            int i2 = (int) Math.round(((Math.random() * (8 - 1)) + 1));
            z++;

            if (z == 6) {
                System.out.print(arrInt[0][i1] * arrInt[1][i2]);
            } else {
                System.out.print(arrInt[0][i1] * arrInt[1][i2] + ", ");
            }
        } while (z < 6);

//        for (int z = 0; z < 6; z++) {
//            int i1 = (int)Math.round(((Math.random() * (8 - 1)) + 1)); // [0]~[9] == 10
//            int i2 = (int)Math.round(((Math.random() * (8 - 1)) + 1));
//            if (z == 5){
//                System.out.print(arrInt[0][i1] * arrInt[1][i2]);
//
//            } else {
//                System.out.print(arrInt[0][i1] * arrInt[1][i2] + ", ");
//            }
//        }

//        for (int i = 0; i < arrInt.length; i++){
//            temp = i * 2;
//            arrInt[i] = temp;
//            System.out.println(arrInt[i]);
//        }


//        arrInt[0] = 1;
//        arrInt[1] = 3;
//        arrInt[2] = 5;
//        arrInt[3] = 7;
//        arrInt[4] = 9;
//
//        for (int i = 0; i < arrInt.length; i++){
//            System.out.println(arrInt[i]);
//        }


    }

    public static void b_10807() {
//        문제
//        총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
//        셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
//
//                출력
//        첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
//
//                예제 입력 1
//        11
//        1 4 1 2 4 2 4 2 3 4 4
//        2
//        예제 출력 1
//        3
//        예제 입력 2
//        11
//        1 4 1 2 4 2 4 2 3 4 4
//        5
//        예제 출력 2
//        0
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int a = 0;

        for(int j = 0; j < arr.length; j++){
            if(v == arr[j]){
                a++;
            }
        }
        System.out.println(a);
    }


    public static void b_10871() {
//        문제
//        정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//        둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//        출력
//        X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//
//        예제 입력 1
//        10 5
//        1 10 4 9 2 3 8 5 7 6
//        예제 출력 1
//        1 4 2 3

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    public static void b_10818() {
//        문제
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
//        모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//
//        예제 입력 1
//        5
//        20 10 35 30 7
//        예제 출력 1
//        7 35

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[N - 1]);
    }

    public static void b_2562() {
//        문제
//        9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//
//                예를 들어, 서로 다른 9개의 자연수
//
//        3, 29, 38, 12, 57, 74, 40, 85, 61
//
//        이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
//
//        입력
//        첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//
//        출력
//        첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
//
//        예제 입력 1
//        3
//        29
//        38
//        12
//        57
//        74
//        40
//        85
//        61
//        예제 출력 1
//        85
//        8
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];
        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }



    public static void b_10810() {
//    문제
//    도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
//    또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다. 가장 처음 바구니에는 공이 들어있지 않으며,
//    바구니에는 공을 1개만 넣을 수 있다.
//    도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고,
//    정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다. 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고,
//    새로 공을 넣는다. 공을 넣을 바구니는 연속되어 있어야 한다.
//    공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
//
//            입력
//    첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//    둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
//    각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
//    예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
//    도현이는 입력으로 주어진 순서대로 공을 넣는다.
//
//    출력
//    1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.
//
//    예제 입력 1
//            5 4
//            1 2 3
//            3 4 4
//            1 4 1
//            2 2 2
//    예제 출력 1
//            1 2 1 1 0

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }


    public static void b_10813() {
//        문제
//        도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
//        바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
//        도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
//        공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
//        둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다.
//        각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
//        도현이는 입력으로 주어진 순서대로 공을 교환한다.
//
//        출력
//        1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
//
//        예제 입력 1
//        5 4
//        1 2
//        3 4
//        1 4
//        2 2
//        예제 출력 1
//        3 1 4 2 5
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int M = sc.nextInt();
        int temp;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for(int j = 0; j < M; j++) {
            int I = sc.nextInt();
            int J = sc.nextInt();

            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }


    public static void b_5597() {
//        문제
//        X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데,
//        학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어 있다.
//        교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
//
//                입력
//        입력은 총 28줄로 각 제출자(학생)의 출석번호 n(1 ≤ n ≤ 30)가 한 줄에 하나씩 주어진다. 출석번호에 중복은 없다.
//
//                출력
//        출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것을 출력하고, 2번째 줄에선 그 다음 출석번호를 출력한다.
//
//        예제 입력 1
//        3
//        1
//        4
//        5
//        7
//        9
//        6
//        10
//        11
//        12
//        13
//        14
//        15
//        16
//        17
//        18
//        19
//        20
//        21
//        22
//        23
//        24
//        25
//        26
//        27
//        28
//        29
//        30
//        예제 출력 1
//        2
//
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[31];
        int a;

        for(int i = 1; i<29; i++) {
            a = sc.nextInt();
            arr[a] = 1;
        }
        for(int i=1; i<arr.length; i++) {
            if(arr[i]!= 1) {
                System.out.println(i);
            }
        }
    }


    public static void b_3052() {
//        문제
//        두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
//        예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//        수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//                입력
//        첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//        출력
//        첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
//
//        예제 입력 1
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        예제 출력 1
//        10
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        boolean bl;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt()%42;
        }

        for(int i=0; i<arr.length; i++) {
            bl = false;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if(bl == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
