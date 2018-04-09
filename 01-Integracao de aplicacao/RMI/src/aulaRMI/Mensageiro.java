package aulaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author João Otávio Mota Roriz
 */
public interface Mensageiro extends Remote {

    public void enviarMensagem(String msg) throws RemoteException;

    public String lerMensagem() throws RemoteException;

}
