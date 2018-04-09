package aulaRMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Joao Otávio Mota Roriz
 */
public class MensageiroCliente {

    public static void main(String[] args) {
        try {
            //cria um mensageiro baseado na URI
            Mensageiro m = (Mensageiro) Naming.lookup(MensageiroImpl.getURI());
            System.out.println(m.lerMensagem());
            if (args.length == 1) {
                m.enviarMensagem(args[0]);
            } else {
                m.enviarMensagem("Mensagem do cliente enviada ao servidor!");
            }
        } catch (MalformedURLException e) {
            System.out.println();
            System.out.println("MalformedURLException: " + e.toString());
        } catch (RemoteException e) {
            System.out.println();
            System.out.println("RemoteException: " + e.toString());
        } catch (NotBoundException e) {
            System.out.println();
            System.out.println("NotBoundException: " + e.toString());
        } catch (Exception e) {
            System.out.println();
            System.out.println("Exception: " + e.toString());
        }
    }
}
