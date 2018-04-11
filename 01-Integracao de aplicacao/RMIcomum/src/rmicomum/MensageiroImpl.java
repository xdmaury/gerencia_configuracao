package rmicomum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Formatter;

public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro{
    
    private static String SERVIDOR="localhost";
    private static Integer PORTA=1099;
    private static String SERVICO="ServicoMensagens";
    
    private String msgRecebida = "sem mensagens";
    
    public static String getURI(){
        String uri = String.format("rmi://%s:%d/%s", SERVIDOR,PORTA,SERVICO);
        return uri;
    }
    
    public  MensageiroImpl()throws RemoteException{
        super();
    }
    
    public void enviarMensagem(String msg) throws RemoteException {
        System.out.println(msg);
        msgRecebida = msg;
    }

    public String lerMensagem() throws RemoteException {
        return msgRecebida;
    }
    
}