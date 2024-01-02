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
}
