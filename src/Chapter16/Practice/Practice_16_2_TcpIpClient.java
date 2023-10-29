package Chapter16.Practice;

import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice_16_2_TcpIpClient {
    public static void main(String[] args) {

        try {

            String serverIP = "127.0.0.1";
            System.out.println("서버에 연결중입니다. 서버IP :" + serverIP);
            Socket socket = new Socket(serverIP, 7777);

            // 소켓의 입력 스트림을 얻는다.
            InputStream in = socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);

            // 소켓으로부터 받은 데이터를 출력한다.
            System.out.println("서버로부터 받은 메세지 : " + dis.readUTF());
            System.out.println("연결을 종료합니다.");

            // 스트림과 소켓을 닫는다.
            dis.close();
            socket.close();
            System.out.println("연결이 종료되었습니다.");
        } catch (ConnectException ce) {
            ce.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String getTime() {
        SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
        return f.format(new Date());
    }
}
