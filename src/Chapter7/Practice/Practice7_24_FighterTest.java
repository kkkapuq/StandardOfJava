package Chapter7.Practice;

class Practice7_24_FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

    }

    static class Unit{
        int currentHP;
        int x;
        int y;
    }

    static class Fighter extends Unit implements Fightable {
        // 클래스 레벨에선 접근 제어자를 설정해줘야 한다.
        public void move(int x, int y) {
            // 내용 생략
        }

        public void attack(Unit u) {
            // 내용 생략
        }
    }


    interface Fightable extends Movable, Attackable { }

    interface Movable {
        void move(int x, int y);
    }

    interface Attackable {
        void attack(Unit u);
    }

}
