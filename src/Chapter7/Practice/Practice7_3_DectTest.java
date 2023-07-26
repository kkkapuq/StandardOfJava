package Chapter7.Practice;

class Practice7_3_DectTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c.toString());

        d.shuffle();
        c = d.pick(0);
        System.out.println(c);
    }

    static class Deck {
        final int CARD_NUM = 52;
        Card cardArr[] = new Card[CARD_NUM];

        Deck(){
            int i = 0;
            for (int k = Card.KIND_MAX; k > 0; k--) {
                for (int n = 0; n < Card.NUM_MAX; n++) {
                    cardArr[i++] = new Card(k, n + 1);
                }
            }
        }

        Card pick(int index) {
            return cardArr[index];
        }

        Card pick(){
            int index = (int) (Math.random() * CARD_NUM);
            return pick(index);
        }

        void shuffle() {
            for (int i = 0; i < cardArr.length; i++) {
                int r = (int) (Math.random() * CARD_NUM);
                Card temp = cardArr[i];
                cardArr[i] = cardArr[r];
                cardArr[r] = temp;
            }
        }

    }

    static class Card {
        static final int KIND_MAX = 4;
        static final int NUM_MAX = 13;

        static final int SPADE = 4;
        static final int DIAMOND = 3;
        static final int HEART = 2;
        static final int CLOVER = 1;
        int kind;
        int number;

        Card(){
            this(SPADE, 1);
        }

        public Card(int kind, int number) {
            this.kind = kind;
            this.number = number;
        }

        // 생성자로 인해 객체가 생성되었을 때 바로 출력해주기 위해 toString을 오버라이딩함.
//        public String toString(){
//            String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
//            String numbers = "0123456789XJQK"; // 숫자 10은 X로 표현
//            return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
//        }
    }
}
