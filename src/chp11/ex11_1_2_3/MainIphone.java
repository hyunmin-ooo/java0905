package chp11.ex11_1_2_3;

public class MainIphone {
    public static void main(String[] args) {
// 업캐스팅된 경우의 참조 변수는 부모의 것을 사용할 수 있고 자식의 것은 오버라이딩
// 된 것만 사용할 수 있다
        Phone p = new IPhone();
        p.callPhone("010-7333-7522");
        p.receivePhone("02-546-4586");
        System.out.println("제조사명:" + Phone.PRODUCT_NAME);

        IPhone iPhone = new IPhone();
        iPhone.beep();
        iPhone.callPhone("010-45415-4854");
        iPhone.playMusic("APT");
        iPhone.sendAirdrop("사진");
        iPhone.sendMessage("오늘 수능 대박나라");

        Alarm alarm = iPhone;
        alarm.beep();
        alarm.playMusic("");

        
    }
}
