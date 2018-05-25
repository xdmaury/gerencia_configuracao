package VIEW;

import CONTROLLER.Controller;
import MODEL.DespesasBEAN;
import MODEL.UsuarioBEAN;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InterfacePrincipal extends javax.swing.JFrame {

    private javax.swing.table.DefaultTableModel ttDespesas;

    public InterfacePrincipal() {
//        Controller controle = new Controller();
        initComponents();
        this.setLocationRelativeTo(this);
        ttDespesas = (javax.swing.table.DefaultTableModel) jTableContasPagar.getModel();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoTelasDespesas = new javax.swing.JButton();
        BotaoTelaGastos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContasPagar = new javax.swing.JTable();
        jDataSaldo = new com.toedter.calendar.JDateChooser();
        lblSaldo = new javax.swing.JLabel();
        textSaldo = new javax.swing.JTextField();
        BotaoTelaReceitas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        textVlrEtanol = new javax.swing.JTextField();
        textVlrGasolina = new javax.swing.JTextField();
        BotaoVerificarEtGas = new javax.swing.JButton();
        lblVlrEtanol = new javax.swing.JLabel();
        lblVlrGasolina = new javax.swing.JLabel();
        printResult = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        BotaoTelaEstatisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        BotaoTelasDespesas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoTelasDespesas.setText("Despesas");
        BotaoTelasDespesas.setActionCommand("AdicionarDespesas");
        BotaoTelasDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTelasDespesasActionPerformed(evt);
            }
        });

        BotaoTelaGastos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoTelaGastos.setText("Gastos");
        BotaoTelaGastos.setActionCommand("AdicionarDespesas");
        BotaoTelaGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTelaGastosActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Contas apagar ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTableContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Valor", "Data Vencimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableContasPagar);
        if (jTableContasPagar.getColumnModel().getColumnCount() > 0) {
            jTableContasPagar.getColumnModel().getColumn(0).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableContasPagar.getColumnModel().getColumn(1).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTableContasPagar.getColumnModel().getColumn(2).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        lblSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSaldo.setText("Saldo:");

        textSaldo.setEditable(false);

        BotaoTelaReceitas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoTelaReceitas.setText("Receitas");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Etanol ou Gasolina ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        BotaoVerificarEtGas.setText("Verificar");
        BotaoVerificarEtGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarEtGasActionPerformed(evt);
            }
        });

        lblVlrEtanol.setText("Valor Etanol");

        lblVlrGasolina.setText("Valor Gasolina");

        printResult.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        printResult.setForeground(new java.awt.Color(0, 255, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textVlrEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVlrEtanol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textVlrGasolina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVlrGasolina, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(BotaoVerificarEtGas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(printResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVlrEtanol)
                    .addComponent(lblVlrGasolina))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textVlrEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textVlrGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BotaoVerificarEtGas)
                .addGap(59, 59, 59)
                .addComponent(printResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Cotação do dia "));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        BotaoTelaEstatisticas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoTelaEstatisticas.setText("Estatísticas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BotaoTelaReceitas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoTelaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoTelasDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoTelaEstatisticas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDataSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(textSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotaoTelaReceitas)
                        .addComponent(BotaoTelaEstatisticas)
                        .addComponent(BotaoTelasDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSaldo)
                                .addComponent(textSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDataSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(BotaoTelaGastos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoTelasDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTelasDespesasActionPerformed
        Despesas telaDespesas = new Despesas(this, true);
        telaDespesas.setLocationRelativeTo(null);
        telaDespesas.setUsuario(usuario);
        telaDespesas.setVisible(true);
    }//GEN-LAST:event_BotaoTelasDespesasActionPerformed

    private void BotaoTelaGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTelaGastosActionPerformed
        Gastos telaGastos = new Gastos(this, true);
        telaGastos.setLocationRelativeTo(null);
        telaGastos.setVisible(true);
    }//GEN-LAST:event_BotaoTelaGastosActionPerformed

    private void BotaoVerificarEtGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarEtGasActionPerformed
        // TODO add your handling code here:
        try {
            float valorGasolina = Float.parseFloat(textVlrGasolina.getText().toString());
            float valorEtanol = Float.parseFloat(textVlrEtanol.getText().toString());

            if ((valorGasolina * 0.70) > valorEtanol) {
                printResult.setText("");
                textVlrEtanol.setText("");
                textVlrGasolina.setText("");
                printResult.setText("Abasteça com etanol!");

            } else {
                printResult.setText("");
                textVlrEtanol.setText("");
                textVlrGasolina.setText("");
                printResult.setText("Abasteça com gasolina!");

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro " + erro);
            printResult.setText("");
            textVlrEtanol.setText("");
            textVlrGasolina.setText("");
        }
    }//GEN-LAST:event_BotaoVerificarEtGasActionPerformed

    public void preencher_Tabela_Produtos(ArrayList<DespesasBEAN> despesas) {
        ttDespesas.setNumRows(0);

        try {
            for (DespesasBEAN despesa : despesas) {
                ttDespesas.addRow(new Object[]{despesa.getDescricao(), despesa.getValor(), despesa.getVencimento()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Despesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrincipal().setVisible(true);
            }
        });
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoTelaEstatisticas;
    private javax.swing.JButton BotaoTelaGastos;
    private javax.swing.JButton BotaoTelaReceitas;
    private javax.swing.JButton BotaoTelasDespesas;
    private javax.swing.JButton BotaoVerificarEtGas;
    private com.toedter.calendar.JDateChooser jDataSaldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContasPagar;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblVlrEtanol;
    private javax.swing.JLabel lblVlrGasolina;
    private java.awt.Label printResult;
    private javax.swing.JTextField textSaldo;
    private javax.swing.JTextField textVlrEtanol;
    private javax.swing.JTextField textVlrGasolina;
    // End of variables declaration//GEN-END:variables
    private UsuarioBEAN usuario = null;

    public void setUsuario(UsuarioBEAN usuario) {
        this.usuario = usuario;
        preencher_Tabela_Produtos(Controller.listarDespesas(usuario.getId()));   
    }

}


