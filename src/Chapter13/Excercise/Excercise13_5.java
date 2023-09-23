package Chapter13.Excercise;

class Exercise13_5
{
    static boolean stopped = false;
    public static void main(String[] args)
    {
        Thread5 th1 = new Thread5();
        th1.start();
        try {
            Thread.sleep(6*1000);
        } catch(Exception e) {}
        th1.interrupt();
        stopped = true; // . 쓰레드를 정지시킨다
        System.out.println("stopped");
    }
}
class Thread5 extends Thread {
    public void run() {
// Exercise13_5.stopped false . 의 값이 인 동안 반복한다
        for(int i=0; !Exercise13_5.stopped; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3*1000);
            } catch(Exception e) {}
        }
    } // run()
}

// 설명 : main과 th1은 별개의 쓰레드이다. 따라서 main에서 stopped를 바꾼다고 바로 적용이 되지않고, th1의 sleep이 끝날때 체크를함
// 따라서 이를 즉각적으로 반응해주려면, 현재 일시정지 상태가 된 쓰레드인 th1을 인터럽트 해줘서 바로 Exception을 발생시켜버리면됨