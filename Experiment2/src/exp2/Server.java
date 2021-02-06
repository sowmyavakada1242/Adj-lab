package exp2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;

public class Server {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket s1 = new ServerSocket(2719);
		System.out.println("Server is ready for clients");
		Socket ss = s1.accept();
		
		Scanner sc = new Scanner(ss.getInputStream());
		String str =sc.nextLine();

		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(str);
		
		ss.close();

	}

}