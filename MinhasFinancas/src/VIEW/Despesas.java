package VIEW;

import CONTROLLER.Controller;
import MODEL.GrupoContasBEAN;
import MODEL.TipoContasBEAN;
import MODEL.DespesasBEAN;
import java.sql.Date;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Despesas extends javax.swing.JDialog {

    public Despesas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setGrupoContas();
        setLocationRelativeTo(null);
        textPis.setText("0");
        textICMS.setText("0");
        textCofins.setText("0");
        textParcela.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        textDocumento = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblParcelas = new javax.swing.JLabel();
        textParcela = new javax.swing.JTextField();
        lblVencimento = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        cb_grupoConta = new javax.swing.JComboBox<>();
        cb_TipoConta = new javax.swing.JComboBox<>();
        lblItem = new javax.swing.JLabel();
        lblICMS = new javax.swing.JLabel();
        textICMS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textPis = new javax.swing.JTextField();
        lblPIS = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textCofins = new javax.swing.JTextField();
        lblCofins = new javax.swing.JLabel();
        textValor = new javax.swing.JFormattedTextField(new DecimalFormat("#,##0.00"));
        jDataVencimento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        rbAPagar = new javax.swing.JRadioButton();
        rbPago = new javax.swing.JRadioButton();
        BotaoSalvar = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("%");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("PIS:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe Despesa"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor.setText("Valor:");

        textDocumento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblParcelas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblParcelas.setText("Parcelas:");

        textParcela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblVencimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVencimento.setText("Vencimento:");

        lblGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGrupo.setText("Grupo:");

        cb_grupoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_grupoConta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_grupoContaItemStateChanged(evt);
            }
        });

        cb_TipoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_TipoConta.setToolTipText("");

        lblItem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblItem.setText("Item:");

        lblICMS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblICMS.setText("ICMS:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("%");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("%");

        lblPIS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPIS.setText("PIS:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("%");

        lblCofins.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCofins.setText("COFINS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor)
                    .addComponent(lblParcelas)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textParcela)
                        .addGap(18, 18, 18)
                        .addComponent(lblVencimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textDocumento)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(lblGrupo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_grupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_TipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblICMS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textICMS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCofins)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textCofins, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPIS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textPis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(lblGrupo)
                    .addComponent(cb_grupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem)
                    .addComponent(cb_TipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(textDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblICMS)
                    .addComponent(textICMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblParcelas)
                        .addComponent(textParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVencimento)
                        .addComponent(lblPIS)
                        .addComponent(textPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(jDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCofins)
                    .addComponent(textCofins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Situação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        rbAPagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAPagar.setText("A pagar");
        rbAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAPagarActionPerformed(evt);
            }
        });

        rbPago.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbPago.setText("Pago");
        rbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAPagar)
                    .addComponent(rbPago)))
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        try {

            oDespesa.setDescricao(textDocumento.getText());
            Object oValor = textValor.getValue();
            oDespesa.setValor(Float.valueOf(oValor.toString()));

            if (rbAPagar.isSelected()) {
                oDespesa.setSituacao(0);
            }
            if (rbPago.isSelected()) {
                oDespesa.setSituacao(-1);
            }

            //Caso o numero de parcela seja difente de 0 o status de parcela muda
            oDespesa.setVezes(Integer.parseInt(textParcela.getText()));
            if (oDespesa.getVezes() != 0) {
                oDespesa.setParcelado(1);
            } else {
                oDespesa.setParcelado(0);
            }
            oDespesa.setIcms(Integer.parseInt(textICMS.getText()));
            oDespesa.setPis(Integer.parseInt(textPis.getText()));
            oDespesa.setCofins(Integer.parseInt(textCofins.getText()));

            // (item + 1) ele pega a posicao da lista +1 porque ela comça do zero 
            oDespesa.setId_grupo(cb_grupoConta.getSelectedIndex() + 1);
            oDespesa.setId_tipo(cb_TipoConta.getSelectedIndex() + 1);

            //Formantando a data para salvar no banco
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            //Pegando a data atual do dia
            Date datah = new Date(System.currentTimeMillis());

            //oDespesa.setDataInclusao(formato.format(datah));
            oDespesa.setVencimento(formato.format(jDataVencimento.getDate()));

            // ATENÇAO ..........................................................
            //Criar um metodo para pegar o id do usuario para inserir uma despesa
            oDespesa.setId_usuario(1);

            Controller.addDespesa(oDespesa);
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            limparTela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro!");
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    public void limparTela() {
        textValor.setText("");
        textCofins.setText("0");
        textDocumento.setText("");
        textICMS.setText("0");
        textPis.setText("0");
        textValor.setText("0");
        rbPago.setSelected(false);
        rbAPagar.setSelected(false);
        cb_TipoConta.setSelectedIndex(0);
        cb_grupoConta.setSelectedIndex(0);
    }
    private void rbAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAPagarActionPerformed
        this.rbPago.setSelected(false);
    }//GEN-LAST:event_rbAPagarActionPerformed

    private void rbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPagoActionPerformed
        this.rbAPagar.setSelected(false);
    }//GEN-LAST:event_rbPagoActionPerformed

    private void cb_grupoContaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_grupoContaItemStateChanged

        GrupoContasBEAN grupo = new GrupoContasBEAN();
        grupo.setIdGrupoContas(-1);
        
        for (GrupoContasBEAN lista : listaGrupoContas) {
            if (lista.getDescricao().equals(cb_grupoConta.getSelectedItem().toString())) {
                grupo = lista;
                break;  
            }
        }
        setTipoContas(grupo);
    }//GEN-LAST:event_cb_grupoContaItemStateChanged

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
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JComboBox<String> cb_TipoConta;
    private javax.swing.JComboBox<String> cb_grupoConta;
    private com.toedter.calendar.JDateChooser jDataVencimento;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblCofins;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblICMS;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblPIS;
    private javax.swing.JLabel lblParcelas;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblVencimento;
    private javax.swing.JRadioButton rbAPagar;
    private javax.swing.JRadioButton rbPago;
    private javax.swing.JTextField textCofins;
    private javax.swing.JTextField textDocumento;
    private javax.swing.JTextField textICMS;
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

    private void setTipoContas(GrupoContasBEAN grupo) {
        cb_TipoConta.removeAllItems();
        this.listaTipoContas = Controller.listaTipoContas(grupo.getIdGrupoContas());
        cb_TipoConta.removeAllItems();
        listaTipoContas.forEach((tc) -> {
            cb_TipoConta.addItem(tc.getDescricao());
        });
    }
}
