import java.rmi.*;
import java.rmi.server.*;


public class RMIServer extends UnicastRemoteObject implements Armstrong{
	
	public RMIServer() throws RemoteException{
		super();
	}

	public int armstrong(int n) throws RemoteException{
		 int t,sum=0,remainder,digits=0;
    	 t = n;
    	 while (t != 0) {
    		digits++;
    		t = t/10;
  		}
  		t = n;
		while (t != 0) {
    		remainder = t%10;
    		int c;
  			int p = 1;
			for (c = 1; c <= digits; c++)
    		p = p*remainder;
    		sum = sum + p;
    		t = t/10;
  		}
  		if (n == sum)
    		return 1;
  		else
    		return 0;	
	}
	public static void main(String args[]) throws Exception{
		RMIServer server =new RMIServer();
		System.out.println("RMI Server is running");
		Naming.rebind("armstrongServer",server);
	}


}
