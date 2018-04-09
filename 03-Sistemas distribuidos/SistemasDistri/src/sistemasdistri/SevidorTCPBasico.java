package sistemasdistri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author João Otávio
 */
public class SevidorTCPBasico {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(7566);
            System.out.println("Servidor ouvindo a porta 7566");

            while (true) {
                Socket serv = servidor.accept();

                System.out.println("Cliente conectado: " + serv.getInetAddress().getHostAddress());
                ObjectOutputStream said = new ObjectOutputStream(serv.getOutputStream());

                InputStreamReader entrd = new InputStreamReader(serv.getInputStream());
                BufferedReader bfd = new BufferedReader(entrd);
                String digita = bfd.readLine();

                System.out.println(digita);

                String[] auxiliar = digita.split(" ");
                String aux = auxiliar[1];

                said.flush();

                String file;
                if (aux.equals("/")) {
                    file = "C:/Users/João Otávio/Desktop/docs/index.html";
                } else if (aux.equals("teste.html")) {
                    file = "C:/Users/João Otávio/Desktop/docs/teste.html";
                } else {
                    file = "C:/Users/João Otávio/Desktop/docs/teste.html";
                }
                
                FileInputStream f = new FileInputStream(file);
                byte[] b = new byte[4096];

                String header = "HTTP/1.1 200 OK\r\n\r\n";
                serv.getOutputStream().write(header.getBytes("UTF-8"));
                int x = f.read(b);
                if (x != -1) {
                    serv.getOutputStream().write(b, 0, x);
                }
                serv.close();

            }
        } catch (Exception e) {
            System.out.println("[info] Erro: " + e.getMessage());
        } finally {
        }
    }
}
