package chp08.test7;

public class Account {
    private String name;
    private int money;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public boolean transfer(Account b, int i) {
        if(this.money >= i){
            this.money -= i;
            b.setMoney(b.getMoney() + i);
            System.out.println(i+"을" + this.name +"에게 송금을 완료했습니다.");
            return true;
        } else{
            System.out.println("자금 부족");
            return false;
        }



    }
}
