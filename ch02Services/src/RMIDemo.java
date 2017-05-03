import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
public class RMIDemo extends UnicastRemoteObject implements RMIDemoInterface {
	@Override
	public int count(int i) throws RemoteException {
		return i - 1;
	}

	public RMIDemo(Registry reg) throws Exception, RemoteException {
		super();
		reg.bind("RMIDemo", this);
	}
	
	public static void main(String[] args) {
		Registry reg = null;
		try {
			reg = LocateRegistry.createRegistry(1000);
			RMIDemo e = new RMIDemo(reg);
		} catch(Exception e) {
		}
	}
}
