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

    public String getAccountNumber() {
        return accountNubmer;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNubmer = accountNubmer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}