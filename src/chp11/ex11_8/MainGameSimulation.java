package chp11.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight gengi = new MagicKnight("겐지");

        atomic.slash();
        uther.slash();
        gengi.slash();

        Healer healer1 = (HolyKnight)uther;
        Healer healer2 = new HolyKnight("우서동생");

        healer1.heal();
        healer1.recovery();
//        healer1.slash(); // Healer 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출하 수 있다.

        Magician magician1 = (MagicKnight)gengi;
        magician1.magicShield();
        magician1.teleport();
    }
}
