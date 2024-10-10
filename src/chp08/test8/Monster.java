package chp08.test8;

public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        this.name = s;
        this.hp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void attack(Monster enemy){
        enemy.hp -= 10;
        System.out.printf("%s이(가) %s을(를) 공격했습니다! %s의 남은 체력:%d\n ", this.name, enemy.getName(),enemy.getName(),enemy.hp);
    }


    public static void battle(Monster a, Monster b) {
        while(a.hp >0 && b.hp >0){
            Monster attacker = (Math.random()<0.5)? a: b;
            Monster defender = (attacker == a) ? b: a;
            attacker.attack(defender);
        }

    }
}
