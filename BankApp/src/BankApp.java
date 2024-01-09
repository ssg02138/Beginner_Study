import java.util.Scanner;
public class BankApp {
    static Account[] accountArray = new Account[100];
    static int index = 0;
    public static void main(String[] args) {

        boolean isExit = false;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 계좌 개설");
            System.out.println("2. 계좌 조회");
            System.out.println("3. 입금");
            System.out.println("4. 종료");
            System.out.print("항목을 입력하세요: ");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    //checkAccount();
                    break;
                case 3:
                    break;
                case 4:
                    isExit = true;
                    break;
            }

        } while(!isExit);
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
        accountArray[index++] = account;
    }
//
//    public static Account checkAccount(String accountNumber) {
//        Account account=null;
//        for(int i =0; i<accountArray.length; i++) {
//            if(accountArray[i]!=null)
//                if(accountArray[i].getAccountNumber().equals(accountNumber)) {
//                    account = accountArray[i];
//                }
//        }
//        return account;
//    }
}


//private static void deposit() {
//    System.out.println("입금할 계좌번호를 선택하세요.");
//    //입금
//    Account account;
//    while(true) {
//        String accountNumber = sc.next();//계좌번호 입력
//        account = checkAccount(accountNumber);//입력된 값으로 계좌배열에서 해당하는 계좌정보를 찾아서 리턴받음
//        if(account==null)//해당하는 계좌가 없으면
//            System.out.println("계좌번호를 확인하세요.");
//        else
//            break;//계속 입력받다가 계좌번호가 맞아서 계좌정보를 얻어오면
//    }//반복문을 빠져나감.
//    System.out.print("입금할 금액을 입력하세요.");
//    int amount = sc.nextInt();
//    account.deposit(amount);//입금 처리
//    System.out.println("예금 성공");
//}