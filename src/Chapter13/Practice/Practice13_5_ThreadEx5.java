package Chapter13.Practice;

/**
 * 두 개의 쓰레드가 각자 나눠서 작업을 수행
 */
class Practice13_5_ThreadEx5 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.printf("소요시간1 : " + (System.currentTimeMillis() - Practice13_5_ThreadEx5.startTime));
        System.out.println();
    }
}

class ThreadEx5_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.printf("소요시간 2: " + (System.currentTimeMillis() - Practice13_5_ThreadEx5.startTime));
    }
}