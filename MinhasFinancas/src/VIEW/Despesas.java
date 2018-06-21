package VIEW;

import CONTROLLER.Controller;
import MODEL.BEANGrupoContas;
import MODEL.BEANTipoContas;
import MODEL.BEANDespesas;
import MODEL.BEANUsuario;
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
        txtParcela.setEnabled(false);
        txtPis.setText("0");
        txtIcms.setText("0");
        txtCofins.setText("0");
        txtParcela.setText("1");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        txtDecricao = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblParcelas = new javax.swing.JLabel();
        txtParcela = new javax.swing.JTextField();
        lblVencimento = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        cbGrupoConta = new javax.swing.JComboBox<>();
        cbTipoConta = new javax.swing.JComboBox<>();
        lblItem = new javax.swing.JLabel();
        lblICMS = new javax.swing.JLabel();
        txtIcms = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPis = new javax.swing.JTextField();
        lblPIS = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtCofins = new javax.swing.JTextField();
        lblCofins = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField(new DecimalFormat("#,##0.00"));
        jDataVencimento = new com.toedter.calendar.JDateChooser();
        lblParcelas1 = new javax.swing.JLabel();
        cbParcelado = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        rbApagar = new javax.swing.JRadioButton();
        rbPago = new javax.swing.JRadioButton();
        btnSalva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("%");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("PIS:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe Despesa"));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblValor.setText("Valor Total:");

        txtDecricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblParcelas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblParcelas.setText("Compra Parcelada?");

        txtParcela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcelaActionPerformed(evt);
            }
        });

        lblVencimento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblVencimento.setText("Vencimento:");

        lblGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGrupo.setText("Grupo:");

        cbGrupoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbGrupoConta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGrupoContaItemStateChanged(evt);
            }
        });

        cbTipoConta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTipoConta.setToolTipText("");

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

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblParcelas1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblParcelas1.setText("Quantas vezes?");

        cbParcelado.setBackground(new java.awt.Color(255, 255, 255));
        cbParcelado.setText("Sim");
        cbParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParceladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblParcelas)
                        .addGap(14, 14, 14)
                        .addComponent(cbParcelado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbGrupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblParcelas1)
                                    .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblVencimento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCofins))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPIS))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblICMS))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCofins, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItem)
                            .addComponent(cbGrupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrupo))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblParcelas)
                            .addComponent(cbParcelado))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIcms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblICMS)
                            .addComponent(jLabel11))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValor)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPIS)
                            .addComponent(jLabel12))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao)
                            .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCofins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCofins)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblVencimento)
                                .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblParcelas1))
                            .addComponent(jDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Situação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        rbApagar.setBackground(new java.awt.Color(255, 255, 255));
        rbApagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbApagar.setText("A pagar");
        rbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApagarActionPerformed(evt);
            }
        });

        rbPago.setBackground(new java.awt.Color(255, 255, 255));
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
                .addComponent(rbApagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbApagar)
                    .addComponent(rbPago)))
        );

        btnSalva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalva.setText("Salvar");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Despesas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalva)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalva)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed

        if (verificaCamposPreenchidos()) {

            //Criando o objeto despesa
            BEANDespesas oDespesa = new BEANDespesas();

            oDespesa.setDescricao(txtDecricao.getText());

            Object oValor = txtValor.getValue();
            oDespesa.setValor(Float.valueOf(oValor.toString()));

            if (rbApagar.isSelected()) {
                oDespesa.setSituacao(0);
            }
            if (rbPago.isSelected()) {
                oDespesa.setSituacao(-1);
            }

            //Caso o numero de parcela seja difente de 0 o status de parcela muda
            oDespesa.setVezes(Integer.parseInt(txtParcela.getText()));
//            if (oDespesa.getVezes() != 0) {
//                oDespesa.setParcelado(1);
//            } else {
//                oDespesa.setParcelado(0);
//            }
            oDespesa.setIcms(Integer.parseInt(txtIcms.getText()));
            oDespesa.setPis(Integer.parseInt(txtPis.getText()));
            oDespesa.setCofins(Integer.parseInt(txtCofins.getText()));

            // (item + 1) ele pega a posicao da lista +1 porque ela comça do zero 
            oDespesa.setId_grupo(listaGrupoContas.get(cbGrupoConta.getSelectedIndex()).getIdGrupoContas());
            oDespesa.setId_tipo(listaTipoContas.get(cbTipoConta.getSelectedIndex()).getIdTipoConta());

            //Formantando a data para salvar no banco
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            //Pegando a data atual do dia
            Date datah = new Date(System.currentTimeMillis());

            //oDespesa.setDataInclusao(formato.format(datah));
            oDespesa.setVencimento(formato.format(jDataVencimento.getDate()));

            // ATENÇAO ..........................................................
            //Criar um metodo para pegar o id do usuario para inserir uma despesa
            oDespesa.setId_usuario(usuario.getId());

            try {
                if (oDespesa.getVezes() > 1) {
                    for (int i = 1; i <= oDespesa.getVezes(); i++) {
                        oDespesa.setParcelado(i);
                        Controller.addDespesa(oDespesa);
                        oDespesa.setVencimento(atualizaDataVencimento(oDespesa.getVencimento()));
                    }
                } else {
                    oDespesa.setParcelado(1);
                    Controller.addDespesa(oDespesa);
                }
                JOptionPane.showMessageDialog(null, "Cadastro realizado!");
                limparTela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Necessario preencher todos os campos em branco!");
        }

    }//GEN-LAST:event_btnSalvaActionPerformed

    public void limparTela() {
        txtValor.setText("");
        txtCofins.setText("0");
        txtDecricao.setText("");
        txtIcms.setText("0");
        txtPis.setText("0");
        txtValor.setText("0");
        rbPago.setSelected(false);
        rbApagar.setSelected(false);
        cbTipoConta.setSelectedIndex(0);
        cbGrupoConta.setSelectedIndex(0);
    }
    private void rbApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbApagarActionPerformed
        this.rbPago.setSelected(false);
    }//GEN-LAST:event_rbApagarActionPerformed

    private void rbPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPagoActionPerformed
        this.rbApagar.setSelected(false);
    }//GEN-LAST:event_rbPagoActionPerformed

    private void cbParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParceladoActionPerformed
        if (cbParcelado.isSelected()) {
            lblValor.setText("Valor Parcela:");
            txtParcela.setEnabled(true);
        } else {
            lblValor.setText("Valor Total:");
            txtParcela.setEnabled(false);
            txtParcela.setText("1");
        }
    }//GEN-LAST:event_cbParceladoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void cbGrupoContaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGrupoContaItemStateChanged

        BEANGrupoContas grupo = new BEANGrupoContas();
        grupo.setIdGrupoContas(-1);

        for (BEANGrupoContas lista : listaGrupoContas) {
            if (lista.getDescricao().equals(cbGrupoConta.getSelectedItem().toString())) {
                grupo = lista;
                break;
            }
        }
        setTipoContas(grupo);
    }//GEN-LAST:event_cbGrupoContaItemStateChanged

    private void txtParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcelaActionPerformed

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
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnSalva;
    private javax.swing.JComboBox<String> cbGrupoConta;
    private javax.swing.JCheckBox cbParcelado;
    private javax.swing.JComboBox<String> cbTipoConta;
    private com.toedter.calendar.JDateChooser jDataVencimento;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel lblParcelas1;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblVencimento;
    private javax.swing.JRadioButton rbApagar;
    private javax.swing.JRadioButton rbPago;
    private javax.swing.JTextField txtCofins;
    private javax.swing.JTextField txtDecricao;
    private javax.swing.JTextField txtIcms;
    private javax.swing.JTextField txtParcela;
    private javax.swing.JTextField txtPis;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
    private ArrayList<BEANGrupoContas> listaGrupoContas;
    private ArrayList<BEANTipoContas> listaTipoContas;
    private BEANUsuario usuario = null;

    public void setUsuario(BEANUsuario usuario) {
        this.usuario = usuario;
    }

    private void setGrupoContas() {
        this.listaGrupoContas = Controller.listaGrupoContas();
        listaGrupoContas.forEach((gc) -> {
            if (!gc.getDescricao().equals("Receitas")) {
                cbGrupoConta.addItem(gc.getDescricao());
            }
        });
    }

    private void setTipoContas(BEANGrupoContas grupo) {
        cbTipoConta.removeAllItems();
        this.listaTipoContas = Controller.listaTipoContas(grupo.getIdGrupoContas());
        listaTipoContas.forEach((tc) -> {
            cbTipoConta.addItem(tc.getDescricao());
        });
    }

    private boolean verificaCamposPreenchidos() {
        return !(txtValor.getText().isEmpty() || txtParcela.getText().isEmpty() || txtDecricao.getText().isEmpty() || !(rbPago.isSelected() || rbApagar.isSelected()));
    }

    private String atualizaDataVencimento(String vencimento) {
//        "yyyy/MM/dd"
        String sAno = vencimento.substring(0, 4);
        String sMes = vencimento.substring(5, 7);
        String sDia = vencimento.substring(8);
        int iAno = Integer.valueOf(sAno);
        int iMes = Integer.valueOf(sMes);
        if (iMes == 12) {
            sMes = "01";
            iAno += 1;
            sAno = Integer.toString(iAno);
        } else {
            if (iMes < 9) {
                sMes = "0";
                iMes += 1;
                sMes += iMes;
            } else {
                iMes += 1;
                sMes = Integer.toString(iMes);
            }
        }
        return sAno + "/" + sMes + "/" + sDia;
    }

}
