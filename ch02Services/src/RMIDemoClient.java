import java.rmi.*;
public class RMIDemoClient {
	public static void main(String[] args) {
		RMIDemoInterface iRMIDemo = null;
		try {
			String target = null;
			if(args.length < 1) {
				target = "rmi://localhost:1000/RMIDemo";
			} else {
				target = "rmi://" + args[0] + "localhost:1000/RMIDemo";
			}
			System.out.println("target: " + target);
			Remote objRemote = Naming.lookup(target);
			if(objRemote instanceof RMIDemoInterface) {
				iRMIDemo = (RMIDemoInterface)objRemote;
			} else {
				throw new Exception("Bad object returned from remote machine.");
			}
		} catch(Exception e) {
			System.out.println("error in lookup() " + e.toString());
		}
		try {
			System.out.println("iRMIDemo.count(5): " + iRMIDemo.count(5));
		} catch(RemoteException e) {
			System.out.println("Remote error: " + e.toString());
		}
	}
}
