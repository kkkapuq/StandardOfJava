package Chapter6;

public class MyMath2 {
    long a, b;
    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요 없다.
    long add() {return a+b;}
    long subtract() {return a-b;}
    long multiply() {return a*b;}
    double divide() {return a/b;}

    static long add(long a, long b) {return a+b;}
    static long subtract(long a, long b) {return a-b;}
    static long multiply(long a, long b) {return a*b;}
    static double divide(double a, double b) {return a/b;}
}
