package VIEW;

import CONTROLLER.Controller;
import MODEL.GrupoContasBEAN;
import MODEL.TipoContasBEAN;
import MODEL.DespesasBEAN;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.time.LocalDate;


public class Despesas extends javax.swing.JDialog {
    public misc m = new misc();
    public LocalDate dataAtual = m.getDate();

    public Despesas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setGrupoContas();
        setTipoContas();
        String dia = String.valueOf(dataAtual.getDayOfMonth());
        textDia.setText(dia);
        textMes.setText(String.valueOf(dataAtual.getMonthValue()));
        textAno.setText(String.valueOf(dataAtual.getYear()));
        textPis.setText("0");
        textICMS.setText("0");
        textCofins.setText("0");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textParcela = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textMes = new javax.swing.JTextField();
        textAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cb_grupoConta = new javax.swing.JComboBox<>();
        cb_TipoConta = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textICMS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textPis = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textCofins = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        textValor = new javax.swing.JFormattedTextField(new DecimalFormat("#,##0.00"));
        textDia = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dia = new javax.swing.text.MaskFormatter("##");

            textDia = new javax.swing.JFormattedTextField(dia);
        }catch(Exception e){
        }
        jPanel2 = new javax.swing.JPanel();
        APagar = new javax.swing.JRadioButton();
        Pago = new javax.swing.JRadioButton();
        BotaoSalvar = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("%");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("PIS:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe Despesa"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Valor:");

        textDocumento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Parcelas:");

        textParcela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Vencimento:");

        textMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setText("Dia");

        jLabel6.setText("Mês");

        jLabel7.setText("Ano");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Grupo:");

        cb_grupoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_grupoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_grupoContaActionPerformed(evt);
            }
        });

        cb_TipoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_TipoConta.setToolTipText("");
        cb_TipoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TipoContaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Item:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("ICMS:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("%");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("%");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("PIS:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("%");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("CONFINS:");

        textDia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textDocumento)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textDia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_grupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_TipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textICMS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textCofins, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textPis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(cb_grupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cb_TipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(textICMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(textPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(textDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17)
                    .addComponent(textCofins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Situação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        APagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        APagar.setText("A pagar");
        APagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APagarActionPerformed(evt);
            }
        });

        Pago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pago.setText("Pago");
        Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(APagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APagar)
                    .addComponent(Pago)))
        );

        BotaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(BotaoSalvar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        //Criando o objeto despesa
        DespesasBEAN oDespesa = new DespesasBEAN();
        try{
            
            int dia = Integer.parseInt(textDia.getText());
            int mes = Integer.parseInt(textMes.getText());
            int ano = Integer.parseInt(textAno.getText());
            /*
            if(!m.validaData(dia, mes, ano)){
                throw new Exception("Informe uma data válida");
            }*/
            
            oDespesa.setDocumento(textDocumento.getText());
            Object oValor = textValor.getValue();
            oDespesa.setValorOriginal(Float.valueOf(oValor.toString()));
 //           oDespesa.setDataVencimento((Date) m.formatarData(dia, mes, ano).getCalendarType());
            oDespesa.setOrigem("Tela Despesas");
            if(APagar.isSelected()){
                oDespesa.setSituacao(0);
            }if(Pago.isSelected()){
                oDespesa.setSituacao(-1);
            }
            oDespesa.setParcela(Integer.parseInt(textParcela.getText()));
            oDespesa.setICMS(Integer.parseInt(textICMS.getText()));
            oDespesa.setPIS(Integer.parseInt(textPis.getText()));
            oDespesa.setCOFINS(Integer.parseInt(textCofins.getText()));
            oDespesa.setIdGrupoContas(cb_grupoConta.getSelectedIndex());
            oDespesa.setIdTipoConta(cb_TipoConta.getSelectedIndex());
            
//            Controller c = new Controller();
            
            Controller.addDespesa(oDespesa);
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void cb_TipoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TipoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_TipoContaActionPerformed

    private void cb_grupoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_grupoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_grupoContaActionPerformed

    private void APagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APagarActionPerformed
        this.Pago.setSelected(false);
    }//GEN-LAST:event_APagarActionPerformed

    private void PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoActionPerformed
        this.APagar.setSelected(false);
    }//GEN-LAST:event_PagoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
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
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Despesas dialog = new Despesas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton APagar;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JRadioButton Pago;
    private javax.swing.JComboBox<String> cb_TipoConta;
    private javax.swing.JComboBox<String> cb_grupoConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField textAno;
    private javax.swing.JTextField textCofins;
    private javax.swing.JTextField textDia;
    private javax.swing.JTextField textDocumento;
    private javax.swing.JTextField textICMS;
    private javax.swing.JTextField textMes;
    private javax.swing.JTextField textParcela;
    private javax.swing.JTextField textPis;
    private javax.swing.JFormattedTextField textValor;
    // End of variables declaration//GEN-END:variables
    private ArrayList<GrupoContasBEAN> listaGrupoContas;
    private ArrayList<TipoContasBEAN> listaTipoContas;
    
    private void setGrupoContas() {
        this.listaGrupoContas = Controller.listaGrupoContas();
        listaGrupoContas.forEach((gc) -> {
            cb_grupoConta.addItem(gc.getDescricao());
        });
    }
    private void setTipoContas() {
        this.listaTipoContas = Controller.listaTipoContas();
        listaTipoContas.forEach((tc) -> {
            cb_TipoConta.addItem(tc.getDescricao());
        });
    }    
}
