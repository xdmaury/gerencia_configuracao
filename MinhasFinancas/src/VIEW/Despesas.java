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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("%");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("PIS:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Despesas");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe Despesa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValor.setText("Valor Total:");

        txtDecricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblParcelas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcelas.setText("Compra Parcelada?");

        txtParcela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcelaActionPerformed(evt);
            }
        });

        lblVencimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVencimento.setText("Vencimento:");

        lblGrupo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGrupo.setText("Grupo:");

        cbGrupoConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGrupoConta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGrupoContaItemStateChanged(evt);
            }
        });

        cbTipoConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipoConta.setToolTipText("");

        lblItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblItem.setText("Item:");

        lblICMS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblICMS.setText("ICMS:");

        txtIcms.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("%");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("%");

        txtPis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPIS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPIS.setText("PIS:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("%");

        txtCofins.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCofins.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCofins.setText("COFINS:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        lblParcelas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblParcelas1.setText("Quantas vezes?");

        cbParcelado.setBackground(new java.awt.Color(255, 255, 255));
        cbParcelado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblParcelas)
                        .addGap(67, 67, 67)
                        .addComponent(cbParcelado)
                        .addGap(18, 18, 18)
                        .addComponent(lblGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(cbGrupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblItem)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValor)
                                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblParcelas1)
                                .addGap(18, 18, 18)
                                .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblVencimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCofins)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCofins, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPIS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblICMS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem)
                    .addComponent(lblGrupo)
                    .addComponent(lblParcelas)
                    .addComponent(cbParcelado)
                    .addComponent(cbGrupoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIcms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblICMS)
                    .addComponent(jLabel11))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDecricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPIS)
                    .addComponent(jLabel12))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCofins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCofins)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVencimento)
                            .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblParcelas1))
                        .addComponent(jDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Situação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        rbApagar.setBackground(new java.awt.Color(255, 255, 255));
        rbApagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbApagar.setText("A pagar");
        rbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApagarActionPerformed(evt);
            }
        });

        rbPago.setBackground(new java.awt.Color(255, 255, 255));
        rbPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbPago.setText("Pago");
        rbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPagoActionPerformed(evt);
            }
        });

        btnSalva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalva.setText("Salvar");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbApagar)
                .addGap(18, 18, 18)
                .addComponent(rbPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalva)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalva)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbApagar)
                        .addComponent(rbPago)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalva;
    private javax.swing.JComboBox<String> cbGrupoConta;
    private javax.swing.JCheckBox cbParcelado;
    private javax.swing.JComboBox<String> cbTipoConta;
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
