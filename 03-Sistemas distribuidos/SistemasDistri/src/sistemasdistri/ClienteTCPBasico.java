package sistemasdistri;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author João Otávio
 */
public class ClienteTCPBasico {
    public static void main(String[] args) {
        try{
            Socket cliente = new Socket("192.168.0.127",8890);
            ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
            Date data_atual = (Date)entrada.readObject();
            
            JOptionPane.showMessageDialog(null, "Data recebida do servidor: " + data_atual.toString());
            entrada.close();
            System.out.println("Conexão encerrada!");
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}
