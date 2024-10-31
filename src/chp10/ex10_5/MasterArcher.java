package chp10.ex10_5;

public class MasterArcher extends Archer {
    // super는 부모 클래스가 있을때 사용할 수 있음 shoot()를 사용할 때 부모클래스 shoot()을 가져온다.
    @Override
    public void shoot() {
        System.out.println("숙련된 궁수의 활 공격으로 30의 피해를 주었습니다.");
    }
}
