package aulaRMI;

import java.rmi.Naming;

/**
 *
 * @author João Otávio Mota Roriz
 */
public class MensageiroServidor {

    public MensageiroServidor() {
        try {
            Mensageiro m = new MensageiroImpl();
            Naming.rebind(MensageiroImpl.getURI(), m);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new MensageiroServidor();
    }
}
