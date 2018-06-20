package VIEW;

import CONTROLLER.Controller;
import MODEL.DespesasBEAN;
import MODEL.UsuarioBEAN;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class misc {

    public LocalDate getDate() {
        //Retorna a data atual
        LocalDate dataAtual = LocalDate.now();
        return dataAtual;
    }
    
    public void avisarDespesasVencimento(UsuarioBEAN usuario){
        ArrayList<DespesasBEAN> listaDespesas = Controller.listarDespesasApagar(usuario.getId());
        
        if (listaDespesas != null) {
            for (DespesasBEAN lista: listaDespesas) {
                if(dataProxima(lista.getVencimento()))
                    JOptionPane.showMessageDialog(null, "Conta a vencer:\n" + lista.getDescricao());
            }
        }
    }
    
    private boolean dataProxima(String data){
        
        int dia = Integer.parseInt(data.substring(8));
        int mes = Integer.parseInt(data.substring(5, 7));
        int diaAtual = getDate().getDayOfYear();
        int diaVencimento = (mes-2)*30+(mes/2)+28+dia;
        if((diaVencimento>=diaAtual)&&(diaVencimento<=diaAtual+10))
            return true;
        return false;
        
    }
    
    public boolean gasolinaEtanol(float gasolina, float alcool){
        if((gasolina * 0.7)> alcool)
            return true;
        return false;
    }

}
