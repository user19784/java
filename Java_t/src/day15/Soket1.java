package day15;

import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



public class Soket1 {

	public static void main(String[] args) {
		MyServer ms = new MyServer();
		Myclient mc = new Myclient();
		
		ms.go(15000);
	}

}

class MyServer{
	InputStream is;
	OutputStream os;
	ServerSocket serverSocket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;
	public void go(int port) {
		try {
			serverSocket = new ServerSocket(port);
			while(true){
				System.out.println("요청대기");
				socket = serverSocket.accept();
				System.err.println("접속 IP: " +socket.getInetAddress());
				is = socket.getInputStream();
				os = socket.getOutputStream();
				ois = new ObjectInputStream(is);
				oos = new ObjectOutputStream(os);
				String msg = (String)ois.readObject();
				System.out.println("클라이언트의 메세지: "+ msg);
				
				String respon = "서버가 준 메세지 : "+msg;
				oos.writeObject(respon);
				socket.close();
			
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

class Myclient{
	InputStream is;
	OutputStream os;
	ServerSocket serverSocket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket socket;
	Scanner sc = new Scanner(System.in);
	private String msg = null;
	
	public void go(String ip, int port) {
		try {
		socket = new Socket(ip, port);
		is = socket.getInputStream();
		os = socket.getOutputStream();
		ois = new ObjectInputStream(is);
		oos = new ObjectOutputStream(os);
		
		System.out.println("보낼 메시지>>");
		String msg = sc.next();
		oos.writeObject(msg);
		
		String server_msg = (String)ois.readObject();
		System.out.println(server_msg);
		}catch (Exception e) {
		 e.printStackTrace();
		}
	}

}