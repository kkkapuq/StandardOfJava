package etc.decorater_pattern;

public class BaseEvent implements Event {
    @Override
    public void giveCoupon() {
        System.out.println("쿠폰이 지급되었습니다.");
    }

    @Override
    public void givePoint() {
        System.out.println("포인트가 지급되었습니다.");
    }
}
