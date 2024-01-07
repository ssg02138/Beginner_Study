import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        static Account[] accounts = new Account[100];
        static int index = 0;

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
                    createAccount();
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
public static void createAccount() {
    Scanner sc = new Scanner(System.in);
    System.out.println("계좌번호: ");
    String accountNumber = sc.nextLine();

    System.out.println("이름: ");
    String name = sc.nextLine();

    System.out.println("비밀번호: ");
    String password = sc.nextLine();

    System.out.println("잔고: ");
    int balance = Integer.parseInt(sc.nextLine());

    Account account = new Account();
    accounts[index++] = account;
}

