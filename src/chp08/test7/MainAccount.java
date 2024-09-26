package chp08.test7;

public class MainAccount {
    public static void main(String[] args) {
        Account a = new Account("123_45", 10000);
        Account b = new Account("567-89", 10000);
        while (a.transfer(b,3000)){
            ;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
