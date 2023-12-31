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
}
