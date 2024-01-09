import java.util.Scanner;
import java.util.Arrays;
public class BankApp {
    private static Account[] accounts = new Account[100];
    private static int index = 0;
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
                    createAccount();
                    break;
                case 2:
                    checkAccount();
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

     Account account = new Account(accountNumber, name, password, balance);
     accounts[index++] = account;
}

private static Account checkAccount(String accountNumber) {
    Account account=null;
    for(int i =0;i<accouts.length;i++) {
        if(accouts[i]!=null)
            if(accouts[i].getAccountNumber().equals(accountNumber)) {
                //문자열의 내용비교: 문자열1.equals(문자열2)
                account = accouts[i];
            }
    }
    return account;
}
