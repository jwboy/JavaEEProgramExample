
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RMIDemoInterface extends Remote {
public int count(int i) throws RemoteException; //声明的接口方法count()
}
