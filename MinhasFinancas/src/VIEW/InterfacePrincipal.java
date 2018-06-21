package VIEW;

import CONTROLLER.Controller;
import MODEL.BEANDespesas;
import MODEL.BEANReceitas;
import MODEL.BEANUsuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InterfacePrincipal extends javax.swing.JFrame {

    private javax.swing.table.DefaultTableModel ttDespesas;
//    private TabelModel model = new TabelModel();

    public InterfacePrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        ttDespesas = (javax.swing.table.DefaultTableModel) jTableContasPagar.getModel();

//        jTableContasPagar.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        lblResultatoGasEta = new java.awt.Label();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        rbApagar = new javax.swing.JRadioButton();
        rbPago = new javax.swing.JRadioButton();
        jDataDe = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jDataAte = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.SystemColor.window);
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
        BotaoTelaGastos.setText("Gastos e Estatísticas");
        BotaoTelaGastos.setActionCommand("AdicionarDespesas");
        BotaoTelaGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTelaGastosActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.window);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Contas apagar ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jTableContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pago?", "Id", "Documento", "Valor", "Vencimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContasPagar.setGridColor(new java.awt.Color(255, 255, 255));
        jTableContasPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableContasPagarMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContasPagar);
        if (jTableContasPagar.getColumnModel().getColumnCount() > 0) {
            jTableContasPagar.getColumnModel().getColumn(0).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTableContasPagar.getColumnModel().getColumn(1).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(1).setPreferredWidth(5);
            jTableContasPagar.getColumnModel().getColumn(2).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableContasPagar.getColumnModel().getColumn(3).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTableContasPagar.getColumnModel().getColumn(4).setResizable(false);
            jTableContasPagar.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        lblSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSaldo.setText("Saldo:");

        textSaldo.setEditable(false);
        textSaldo.setBackground(new java.awt.Color(255, 255, 255));

        BotaoTelaReceitas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotaoTelaReceitas.setText("Receitas");
        BotaoTelaReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoTelaReceitasActionPerformed(evt);
            }
        });

        jPanel3.setBackground(java.awt.SystemColor.window);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " Etanol ou Gasolina ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        textVlrGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVlrGasolinaActionPerformed(evt);
            }
        });

        BotaoVerificarEtGas.setText("Verificar");
        BotaoVerificarEtGas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVerificarEtGasActionPerformed(evt);
            }
        });

        lblVlrEtanol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVlrEtanol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlrEtanol.setText("Valor Etanol");

        lblVlrGasolina.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVlrGasolina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlrGasolina.setText("Valor Gasolina");

        lblResultatoGasEta.setAlignment(java.awt.Label.CENTER);
        lblResultatoGasEta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblResultatoGasEta.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResultatoGasEta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textVlrGasolina))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(textVlrEtanol))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVlrEtanol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblVlrGasolina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(BotaoVerificarEtGas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblVlrEtanol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textVlrEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblVlrGasolina)
                .addGap(18, 18, 18)
                .addComponent(textVlrGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BotaoVerificarEtGas)
                .addGap(25, 25, 25)
                .addComponent(lblResultatoGasEta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jPanel4.setBackground(java.awt.SystemColor.window);
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

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rbApagar.setBackground(new java.awt.Color(255, 255, 255));
        rbApagar.setText("A pagar");
        rbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApagarActionPerformed(evt);
            }
        });

        rbPago.setBackground(new java.awt.Color(255, 255, 255));
        rbPago.setText("Pago");
        rbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPagoActionPerformed(evt);
            }
        });

        jLabel1.setText("De");

        jLabel2.setText("Até");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoTelaReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoTelaGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoTelasDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDataSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSaldo)
                        .addGap(18, 18, 18)
                        .addComponent(textSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(32, 32, 32)
                                .addComponent(rbApagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPago)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(jDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotaoTelaGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoTelasDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoTelaReceitas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSaldo)
                                .addComponent(textSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDataSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(rbApagar)
                                .addComponent(rbPago)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDataAte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDataDe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName(" Contas a pagar ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        setUsuario(usuario);
    }//GEN-LAST:event_BotaoTelasDespesasActionPerformed

    private void BotaoTelaGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTelaGastosActionPerformed
//        Gastos telaGastos = new Gastos(this, true);
        Gasto telaGastos = new Gasto(this, true);
        telaGastos.setLocationRelativeTo(null);
        telaGastos.setUsuario(usuario);
        telaGastos.setVisible(true);
    }//GEN-LAST:event_BotaoTelaGastosActionPerformed

    private void BotaoVerificarEtGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVerificarEtGasActionPerformed
        // TODO add your handling code here:
        try {
            if (verificaCamposPreenchidos()) {
                float valorGasolina = Float.parseFloat(textVlrGasolina.getText().toString());
                float valorEtanol = Float.parseFloat(textVlrEtanol.getText().toString());

                misc m = new misc();
                lblResultatoGasEta.setText("");
                textVlrEtanol.setText("");
                textVlrGasolina.setText("");
                if (m.gasolinaEtanol(valorGasolina, valorEtanol)) {
                    lblResultatoGasEta.setText("Abasteça com etanol!");
                } else {
                    lblResultatoGasEta.setText("Abasteça com gasolina");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Necessario preencher todos os campos em branco!");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro " + erro);
            lblResultatoGasEta.setText("");
            textVlrEtanol.setText("");
            textVlrGasolina.setText("");
        }
    }//GEN-LAST:event_BotaoVerificarEtGasActionPerformed

    private void BotaoTelaReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoTelaReceitasActionPerformed
        Receitas tela = new Receitas(this, true);
        tela.setLocationRelativeTo(null);
        tela.setUsuario(usuario);
        tela.setVisible(true);
        setUsuario(usuario);
    }//GEN-LAST:event_BotaoTelaReceitasActionPerformed

    private void jTableContasPagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContasPagarMousePressed
        int index = jTableContasPagar.getSelectedRow();
        int situacao = listaDespesas.get(index).getSituacao();
        if (situacao == 0) {
            situacao = -1;
        } else if (situacao == -1) {
            situacao = 0;
        }
        Controller.atualizarSituacao(situacao, listaDespesas.get(index).getId());
    }//GEN-LAST:event_jTableContasPagarMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (verificaCamposPreenchidos()) {
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            String inicio = formato.format(jDataDe.getDate());
            String fim = formato.format(jDataAte.getDate());
            byte situacao = 0;
            if (rbApagar.isSelected()) {
                situacao = 0;
            }
            if (rbPago.isSelected()) {
                situacao = -1;
            }
            atualizaSaldoDisponivel(situacao, inicio, fim);
        } else {
            JOptionPane.showMessageDialog(null, "Necessario preencher todos os campos em branco!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApagarActionPerformed
        this.rbPago.setSelected(false);
    }//GEN-LAST:event_rbApagarActionPerformed

    private void rbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPagoActionPerformed
        this.rbApagar.setSelected(false);
    }//GEN-LAST:event_rbPagoActionPerformed

    private void textVlrGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVlrGasolinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVlrGasolinaActionPerformed

    public void preencher_Tabela_Produtos(ArrayList<BEANDespesas> despesas) {
        ttDespesas.setNumRows(0);
        try {
            for (BEANDespesas despesa : despesas) {
                Boolean oPago = false;
                if (despesa.getSituacao() == -1) {
                    oPago = true;
                }
                ttDespesas.addRow(new Object[]{oPago, despesa.getId(), despesa.getDescricao(), despesa.getValor(), despesa.getVencimento()});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar dados - " + erro);
        }
//        for (DespesasBEAN despesa : despesas) {
//            Boolean oPago = false;
//            if (despesa.getSituacao() == -1) {
//                oPago = true;
//            }
//            model.adicionaLinha(new Object[]{oPago, despesa.getId(), despesa.getDescricao(), despesa.getValor(), despesa.getVencimento()});
//        }
    }

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
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton BotaoTelaGastos;
    private javax.swing.JButton BotaoTelaReceitas;
    private javax.swing.JButton BotaoTelasDespesas;
    private javax.swing.JButton BotaoVerificarEtGas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDataAte;
    private com.toedter.calendar.JDateChooser jDataDe;
    private com.toedter.calendar.JDateChooser jDataSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContasPagar;
    private java.awt.Label lblResultatoGasEta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblVlrEtanol;
    private javax.swing.JLabel lblVlrGasolina;
    private javax.swing.JRadioButton rbApagar;
    private javax.swing.JRadioButton rbPago;
    private javax.swing.JTextField textSaldo;
    private javax.swing.JTextField textVlrEtanol;
    private javax.swing.JTextField textVlrGasolina;
    // End of variables declaration//GEN-END:variables
    private BEANUsuario usuario = null;
    private float saldo;
    private float despesas;
    private ArrayList<BEANReceitas> listaReceitas = null;
    private ArrayList<BEANDespesas> listaDespesas = null;

    private void setSaldo() {
        this.saldo = 0;
        listaReceitas = Controller.listaReceitasIDusuario(usuario.getId());
        if (listaReceitas != null) {
            for (BEANReceitas lista : listaReceitas) {
                saldo += lista.getValor();
            }
        }

    }

    private void setDespesas(int situacao, String inicio, String fim) {
        this.despesas = 0;
        listaDespesas = Controller.listarDespesas(usuario.getId(), situacao, inicio, fim);
        if (listaDespesas != null) {
            for (BEANDespesas lista : listaDespesas) {
                despesas += lista.getValor();
            }
            preencher_Tabela_Produtos(listaDespesas);
            misc m = new misc();
            m.avisarDespesasVencimento(usuario);
        }
    }

    private void checarDespesas(BEANUsuario usuario) {
        this.usuario = usuario;
        misc m = new misc();
        m.avisarDespesasVencimento(usuario);
    }

    private void atualizaSaldoDisponivel(int situacao, String inicio, String fim) {
        setSaldo();
        setDespesas(situacao, inicio, fim);
        textSaldo.setText(Float.toString(saldo - despesas));
    }

    public void setUsuario(BEANUsuario usuario) {
        this.usuario = usuario;
        preencher_Tabela_Produtos(Controller.listarDespesasApagar(usuario.getId()));
        String[] periodo = periodoAtual();
        atualizaSaldoDisponivel(0, periodo[0], periodo[1]);
    }

    private boolean verificaCamposPreenchidos() {
        String inicio = "", fim = "";
        try {
            inicio = jDataAte.getDate().toString();
            fim = jDataDe.getDate().toString();
        } catch (java.lang.NullPointerException e) {

        }
        return !(inicio.isEmpty() || fim.isEmpty() || !(rbApagar.isSelected() || rbPago.isSelected()));
    }

    private String[] periodoAtual() {
        Date datah = new Date(System.currentTimeMillis());
        String inicio = null, fim = null;
        inicio = fim = datah.toString();
        inicio = inicio.substring(0, 8) + "01";
        fim = fim.substring(0, 8) + "30";
        return new String[]{inicio, fim};
    }

}
