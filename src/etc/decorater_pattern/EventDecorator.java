package etc.decorater_pattern;

public abstract class EventDecorator implements Event{
    private Event event;

    public EventDecorator(Event event) {
        this.event = event;
    }

    @Override
    public void giveCoupon() {
        event.giveCoupon();
    }

    @Override
    public void givePoint() {
        event.givePoint();
    }
}
