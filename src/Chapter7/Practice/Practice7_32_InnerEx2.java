package Chapter7.Practice;

class Practice7_32_InnerEx2 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // static 메서드는 인스턴스 멤버에 접근할 수 없음
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려면 외부 클래스를 통해서 접근이 가능하다.
        Practice7_32_InnerEx2 outer = new Practice7_32_InnerEx2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() {
        // 인스턴스 메서드에서는 인스턴스 멤버와 static 멤버 모두 접근이 가능하다.
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // 지역 클래스는 접근 불가
//        LocalInner lv = new LocalInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
