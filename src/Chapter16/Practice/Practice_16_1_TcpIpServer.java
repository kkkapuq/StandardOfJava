package Chapter16.Practice;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Practice_16_1_TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            // 서버 소켓을 생성하여 777번 포트와 결합시킨다.
            serverSocket = new ServerSocket(7777);
            System.out.println(getTime() + ": 서버가 준비 되었습니다.");

        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                System.out.println(getTime() + ": 연결 요청을 기다립니다");
                Socket socket = serverSocket.accept();
                System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");

                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                // 원격 소켓(remote socket)에 데이터를 보낸다.
                dos.writeUTF("[Notice] Test Message1 from Server.");
                System.out.println(getTime() + ": 데이터를 전송했습니다.");

                dos.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
