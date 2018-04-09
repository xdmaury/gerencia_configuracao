package aulaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author João Otávio Mota Roriz
 */
public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro {

    private static String servidor = "localhost";
    private static Integer porta = 1099;
    private static String servico = "Mensageria";
    private String msgrecebida = "Nenhuma mensagem";

    public static String getURI() {
        String uri = String.format("rmi://%s:%d/%s", servidor, porta, servico);
        return uri;
    }

    public MensageiroImpl() throws RemoteException {
        super();

    }

    public void enviarMensagem(String msg) throws RemoteException {
        System.out.println(msg);
        msgrecebida = msg;
    }

    public String lerMensagem() throws RemoteException {
        return msgrecebida;
    }
}
