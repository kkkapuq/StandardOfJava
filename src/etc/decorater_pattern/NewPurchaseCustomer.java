package etc.decorater_pattern;

public class NewPurchaseCustomer extends EventDecorator{

    public NewPurchaseCustomer(Event event) {
        super(event);
    }

    @Override
    public void giveCoupon() {
        giveCouponToNewCustomer();
        super.giveCoupon();
    }

    public void giveCouponToNewCustomer() {
        System.out.println("첫 구매 고객에게 20% 쿠폰을 지급합니다.");
    }
}
