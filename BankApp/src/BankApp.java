import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {

        boolean isExit = false;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 계좌 개설");
            System.out.println("2. 계좌 조회");
            System.out.println("3. 입금");
            System.out.println("4. 종료");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    isExit = true;
                    break;
            }

        } while(!isExit);
    }
}

