package chp08.ex8_8;

public class Account {
    private int balance;
    private String accNumber;
    private String name;
    private String pwd;
    private int deposit;
    private int withdraw;

    public Account(int balance, String accNumber, String name, String pwd) {
        this.balance = balance;
        this.accNumber = accNumber;
        this.name = name;
        this.pwd = pwd;
    }

    public void deposit(int money) {
        balance += money;// balance = balance + money
    }
    public void withdraw(int money) {
        balance -= money;// balance = balance - money
    }


    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accNumber='" + accNumber + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

