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
                arrInt[i][j] = j+1;
//                System.out.println(arrInt[i][j]);
            }
            System.out.println(Arrays.toString(arrInt[i]));
        }
        int z = 0;
        do{
            int i1 = (int)Math.round(((Math.random() * (8 - 1)) + 1));
            int i2 = (int)Math.round(((Math.random() * (8 - 1)) + 1));
            z++;

            if (z == 6){
                System.out.print(arrInt[0][i1] * arrInt[1][i2]);
            } else {
                System.out.print(arrInt[0][i1] * arrInt[1][i2] + ", ");
            }
        } while(z < 6);

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
}
