package Chapter7.Practice;

import java.util.ArrayList;
import java.util.List;

public class Practice7_8_PointTest2 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        Point p = new Point(1, 2);
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
        if (p instanceof Point3D) {

        }
    }
    static class Point {
        int x = 10;
        int y = 20;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Point3D extends Point {
        int z = 30;

        Point3D() {
            this(100, 200, 300);
        }

        public Point3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }
    }

}
