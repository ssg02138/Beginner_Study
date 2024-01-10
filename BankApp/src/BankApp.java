import java.text.DecimalFormat;
import java.util.Scanner;
public class BankApp {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);
    private static int seq=0;
    private static boolean isCreated=false;
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
                case 1: createAccount();
                    break;
                case 2: accountList();
                    break;
                case 3: deposit();
                    break;
                case 4:
                    isExit = true;
                    break;
            }
        } while(!isExit);
    }

    private static void createAccount() {
        String ano = String.format(new DecimalFormat("0000").format(++seq));
        System.out.print("이름>");
        String name = sc.next();
        System.out.print("비밀번호>");
        String pwd = sc.next();
        System.out.print("초기입금액>");
        int amount = sc.nextInt();
        for(int i=0;i<accountArray.length;i++) {
            if(accountArray[i]==null) {
                accountArray[i]
                        =new Account(ano,name,pwd,amount);
                System.out.println("계좌 등록 성공");
                isCreated=true;
                break;
            }
        }
    }

    private static boolean isRegistered() {
        return isCreated;
    }

    private static void accountList() {
        if(!isRegistered()) {
            System.out.println("먼저 계좌등록을 하세요");
            return;
        }
        for(int i=0;i<accountArray.length;i++) {
            if(accountArray[i]!=null) {
                System.out.println(accountArray[i].getAno()+"\t"+
                        accountArray[i].getName()+"\t"+
                        accountArray[i].getPwd()+"\t"+
                        accountArray[i].getBalance());
            }
        }
    }

    private static Account findAccount(String ano) {
        Account account=null;
        for(int i =0;i<accountArray.length;i++) {
            if(accountArray[i]!=null)
                if(accountArray[i].getAno().equals(ano)) {
                    account = accountArray[i];
                }
        }
        return account;
    }


    private static void deposit() {
        if(!isRegistered()) {// if(!isCreated)
            System.out.println("먼저 계좌등록을 하세요");
            return;
        }
        accountList();
        System.out.println("입금할 계좌번호를 선택하세요>");
        Account account;
        while(true) {
            String ano = sc.next();
            account = findAccount(ano);
            if(account==null)
                System.out.println("계좌번호를 확인하세요>");
            else
                break;
        }
        System.out.print("입금할 금액을 입력하세요>");
        int amount = sc.nextInt();
        account.deposit(amount);
        System.out.println("예금 성공");
    }
}