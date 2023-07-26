package Chapter6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMath2Test {


    @Test
    void add() {
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        assertEquals(300, MyMath2.add(200L, 100));
        assertEquals(300, mm.add());
    }

    @Test
    void subtract() {
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        assertEquals(100, MyMath2.subtract(200L, 100L));
        assertEquals(100, mm.subtract());
    }

    @Test
    void multiply() {
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        assertEquals(20000, MyMath2.multiply(200L, 100L));
        assertEquals(20000, mm.multiply());
    }

    @Test
    void divide() {
        MyMath2 mm = new MyMath2();
        mm.a = 200L;
        mm.b = 100L;
        assertEquals(2.0, MyMath2.divide(200L, 100L));
        assertEquals(2.0, mm.divide());
    }
}