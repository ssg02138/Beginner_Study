public class Account {
    private String ano;//계좌번호
    private String name;//소유자
    private String pwd;//비밀번호
    private int balance;//잔고
    //생성자
    public Account(String ano, String name, String pwd, int balance) {
        //super();//=> Account extends Object
        this.ano = ano;
        this.name = name;
        this.pwd = pwd;
        this.balance = balance;
    }
    //메소드
    protected String getAno() {return ano;}
    protected void setAno(String ano) {this.ano = ano;}
    protected String getName() {return name;}
    protected void setName(String name) {this.name = name;}
    protected String getPwd() {return pwd;}
    protected void setPwd(String pwd) {this.pwd = pwd;}
    protected int getBalance() {return balance;}
    protected void setBalance(int balance) {this.balance = balance;}
    public void deposit(int amount) {
        this.balance+=amount;
    }
}