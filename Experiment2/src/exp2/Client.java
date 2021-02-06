package exp2;


import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Socket s =new Socket("localhost",2719);
		
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter your name :");
		String str = sc.nextLine();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(str);
		String st=sc1.nextLine();
		System.out.println("Hey "+st+" you did the TCP/IP application");
		
		s.close();
			
	}

}