package etc.decorater_pattern;

public class NewCustomer extends EventDecorator{
    NewCustomer(Event event) {
        super(event);
    }

    @Override
    public void giveCoupon() {
        giveCouponToNewCustomer();
        super.giveCoupon();
    }

    public void giveCouponToNewCustomer() {
        System.out.println("신규 고객에게 10% 쿠폰을 지급합니다.");
    }
}
