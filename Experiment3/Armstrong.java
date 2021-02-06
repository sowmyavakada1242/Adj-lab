 //inteface file
import java.rmi.*;

public interface Armstrong extends Remote{
	//declaration of remote methods

	public int armstrong(int n) throws RemoteException;
}
