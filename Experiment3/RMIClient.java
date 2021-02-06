import java.rmi.*;
import java.util.*;

public class RMIClient {
	public static void main(String args[]) throws Exception{

		int n,res;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter n value:");
		n=sc.nextInt();
		
		
		Armstrong arm=(Armstrong)Naming.lookup("rmi://localhost:1099/armstrongServer");

		res=arm.armstrong(n);
			if(res==1){
				System.out.println("Armstrong number");
			}
			else{
				System.out.println("Not Armstrong number");
	
			}
	}
}