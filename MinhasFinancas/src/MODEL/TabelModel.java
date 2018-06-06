/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcos
 */
public class TabelModel extends AbstractTableModel{
    
    private ArrayList<Object[]> linhas;
    private String[] colunas;

    public TabelModel() {
        this.linhas = new ArrayList<>();
        this.colunas = new String[]{"Pago?", "Id", "Documento", "Valor", "Vencimento"};
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Boolean.class;
        }
        return super.getColumnClass(columnIndex);
    }
    
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex < 0){
            return rowIndex;
        }else{
            switch(columnIndex){
                case 0: return this.linhas.get(rowIndex)[0];
                case 1: return this.linhas.get(rowIndex)[1];
                case 2: return this.linhas.get(rowIndex)[2];
                case 3: return this.linhas.get(rowIndex)[3];
                case 4: return this.linhas.get(rowIndex)[4];
                default: return  -1;
            }
        }
    }
    
    
    
    public void removeLinha(int linha){
        linhas.remove(linha);
        fireTableRowsUpdated(linha, linha);
    }
    
    public void adicionaLinha(Object[] object){
        linhas.add(object);
        fireTableRowsInserted(linhas.size(), linhas.size());
    }

    public void setLinhas(ArrayList<Object[]> linhas) {
        this.linhas = linhas;
        fireTableDataChanged();
    }
    
    public void inverteValor(int linha){
        linhas.get(linha)[0] = !(boolean) linhas.get(linha)[0];
    }
    
}
