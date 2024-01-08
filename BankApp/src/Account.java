import java.util.Scanner;
public class Account {
    private String accountNubmer;
    private String name;
    private String password;
    private int balance;

    public Account(String accountNubmer, String name, String password, int balance) {
        this.accountNubmer = accountNubmer;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

}