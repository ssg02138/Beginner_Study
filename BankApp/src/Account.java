import java.util.Scanner;
public class Account {

    static Account[] accounts = new Account[100];
    static int index = 0;

    private static void createAccount() {
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
}
