package VIEW;

import CONTROLLER.Controller;
import MODEL.BEANDespesas;
import MODEL.BEANUsuario;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class misc {

    public LocalDate getDate() {
        //Retorna a data atual
        LocalDate dataAtual = LocalDate.now();
        return dataAtual;
    }

    public void avisarDespesasVencimento(BEANUsuario usuario) {
        ArrayList<BEANDespesas> listaDespesas = Controller.listarDespesasApagar(usuario.getId());

        if (listaDespesas != null) {
            for (BEANDespesas lista : listaDespesas) {
                if (dataProxima(lista.getVencimento())) {
                    JOptionPane.showMessageDialog(null, "Conta a vencer:\n" + lista.getDescricao());
                }
            }
        }
    }

    private boolean dataProxima(String data) {

        int dia = Integer.parseInt(data.substring(8));
        int mes = Integer.parseInt(data.substring(5, 7));
        int diaAtual = getDate().getDayOfYear();
        int diaVencimento = (mes - 2) * 30 + (mes / 2) + 28 + dia;
        if ((diaVencimento >= diaAtual) && (diaVencimento <= diaAtual + 10)) {
            return true;
        }
        return false;

    }

    public boolean gasolinaEtanol(float gasolina, float alcool) {
        if ((gasolina * 0.7) > alcool) {
            return true;
        }
        return false;
    }

}
