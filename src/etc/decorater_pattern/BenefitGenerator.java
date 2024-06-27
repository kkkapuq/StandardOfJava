package etc.decorater_pattern;

public class BenefitGenerator {
    public static void main(String[] args) {

        // 1. 쿠폰이 지급되었다는 알림 return
        Event event = new BaseEvent();
        event.giveCoupon();
        System.out.println("==========================");

        // 2. 신규 고객에겐 10% 쿠폰 지급
        Event newCustomer = new NewCustomer(new BaseEvent());
        newCustomer.giveCoupon();
        System.out.println("==========================");

        // 3. 첫 구매 고객에겐 20% 쿠폰 지급
        Event newPurchaseCustomer = new NewPurchaseCustomer(new BaseEvent());
        newPurchaseCustomer.giveCoupon();
        System.out.println("==========================");

        // 4. 신규 고객이고 첫 구매 고객에겐 10% 쿠폰과 20% 쿠폰 모두 지급
        Event newPurchaseCustomer2 = new NewPurchaseCustomer(new NewCustomer(new BaseEvent()));
        newPurchaseCustomer2.giveCoupon();
        System.out.println("==========================");


    }
}
