package rmiservidor;

import java.rmi.Naming;
import rmicomum.Mensageiro;
import rmicomum.Mensageiro;
import rmicomum.MensageiroImpl;
import rmicomum.MensageiroImpl;

public class MensageiroServidor {
    
    public MensageiroServidor(){
        try {
            Mensageiro m = new MensageiroImpl();
            Naming.rebind(MensageiroImpl.getURI(), m);
            
        } catch (Exception e) {
            System.out.println("Erro "+ e);
        }
    }
    
    public static void main(String[] args) {
        new MensageiroServidor();
    }
    
}