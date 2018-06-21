package VIEW;

import CONTROLLER.Controller;
import MODEL.BEANDespesas;
import MODEL.BEANReceitas;
import MODEL.BEANUsuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Gasto extends javax.swing.JDialog {

    public Gasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        planoFundo = new javax.swing.JPanel();
        jDataAte = new com.toedter.calendar.JDateChooser();
        jDataDe = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        rbPago = new javax.swing.JRadioButton();
        rbApagar = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Quadro = new javax.swing.JInternalFrame();
        cbGrupo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonSalarioCompremetido = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar = new javax.swing.JProgressBar();
        jLabeProgression = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabeProgression2 = new javax.swing.JLabel();
        jButtonImpostos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelDespesas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelTotalImpostos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        planoFundo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("De");

        rbPago.setBackground(new java.awt.Color(255, 255, 255));
        rbPago.setText("Pago");
        rbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPagoActionPerformed(evt);
            }
        });

        rbApagar.setBackground(new java.awt.Color(255, 255, 255));
        rbApagar.setText("A pagar");
        rbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApagarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Até");

        Quadro.setBackground(new java.awt.Color(255, 255, 255));
        Quadro.setVisible(true);

        javax.swing.GroupLayout QuadroLayout = new javax.swing.GroupLayout(Quadro.getContentPane());
        Quadro.getContentPane().setLayout(QuadroLayout);
        QuadroLayout.setHorizontalGroup(
            QuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        QuadroLayout.setVerticalGroup(
            QuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        cbGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupos", "Tipo" }));
        cbGrupo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout planoFundoLayout = new javax.swing.GroupLayout(planoFundo);
        planoFundo.setLayout(planoFundoLayout);
        planoFundoLayout.setHorizontalGroup(
            planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quadro)
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        planoFundoLayout.setVerticalGroup(
            planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDataAte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDataDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(rbPago)
                        .addComponent(rbApagar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(cbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Quadro)
                .addGap(6, 6, 6))
        );

        jTabbedPane1.addTab("Gastos", planoFundo);

        jPanel2.setBackground(java.awt.SystemColor.window);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));
        jPanel2.setName(""); // NOI18N

        jButtonSalarioCompremetido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalarioCompremetido.setText("Salario compremetido");
        jButtonSalarioCompremetido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalarioCompremetidoActionPerformed(evt);
            }
        });

        jPanel3.setBackground(java.awt.SystemColor.window);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estáticas salario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jProgressBar.setBackground(java.awt.SystemColor.window);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Compremetido");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Disponível");

        jProgressBar2.setBackground(java.awt.SystemColor.window);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabeProgression2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addComponent(jLabeProgression, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabeProgression, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabeProgression2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        jButtonImpostos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonImpostos.setText("Impostos pagos");
        jButtonImpostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImpostosActionPerformed(evt);
            }
        });

        jPanel4.setBackground(java.awt.SystemColor.window);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estáticas de impostos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Total despesas:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("R$");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("% Impostos: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("%");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelTotalImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(jLabelDespesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabelDespesas, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addComponent(jLabelTotalImpostos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButtonSalarioCompremetido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonImpostos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalarioCompremetido)
                    .addComponent(jButtonImpostos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estatisticas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            lista = CONTROLLER.Controller.listarDespesas(usuario.getId(), situacao, inicio, fim);
            Quadro.setContentPane(CriaPainel());
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

    private void jButtonSalarioCompremetidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalarioCompremetidoActionPerformed
        // TODO add your handling code here:
        ArrayList<BEANDespesas> listaDespesas = new ArrayList<BEANDespesas>();
        ArrayList<BEANReceitas> listaReceitas = new ArrayList<BEANReceitas>();
        Controller controle = new Controller();

        SimpleDateFormat formatoY = new SimpleDateFormat("yyyy");
        SimpleDateFormat formatoM = new SimpleDateFormat("MM");

        //Pegando a data do dia
        Date dataDia = new Date(System.currentTimeMillis());

        //Convertendo a data para string
        String ano = (String) formatoY.format(dataDia);
        String mes = (String) formatoM.format(dataDia);

        //Formatando a data do dia para consultar no banco as contas desse mes
        String data = ano + "-" + mes;

        //Trocar este metodo que lista as contas com busca somente a deste mes
        //Temos que pegar a lista de despesas do usuario longado
        /*
        Aqui eu peguei uma lista de todas as contas e coloquei ali manulmente o
        salario/receitas do usuario
        */
        listaDespesas = controle.listarDespesasVencidas(usuario.getId(), data);
        listaReceitas = controle.listaReceitasIDusuario(usuario.getId());

        if (!listaReceitas.isEmpty()) {
            if (!listaDespesas.isEmpty()) {
                //Exibir painel
                jPanel2.setVisible(true);
                //Metodo para pegar todo saldo do usuario
                double saldo = 0;
                for (BEANReceitas receitas : listaReceitas) {
                    saldo = saldo + receitas.getValor();
                }

                float resultado = 0;
                for (BEANDespesas despesas : listaDespesas) {
                    resultado = (float) (resultado + ((despesas.getValor() * 100) / saldo));
                    jProgressBar.setValue((int) resultado);
                    jProgressBar2.setValue((int) (100 - resultado));
                }

                String perc = resultado + "%";
                String percDisp = (100 - resultado) + "%";
                jLabeProgression.setText(perc);
                jLabeProgression2.setText(percDisp);

            } else {
                JOptionPane.showMessageDialog(null, "Você não possui contas vencidas :)");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não possui receitas!");
        }

    }//GEN-LAST:event_jButtonSalarioCompremetidoActionPerformed

    private void jButtonImpostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImpostosActionPerformed

        ArrayList<BEANDespesas> listaDespesas = new ArrayList<BEANDespesas>();
        Controller controle = new Controller();

        //Buscando no banco todas as despesas pagas
        listaDespesas = controle.listarDespesasPagas(usuario.getId());
        if (!listaDespesas.isEmpty()) {
            //Exibir o painel
            jPanel3.setVisible(true);
            //Soma % de impostos
            float impostos = 0;
            float despesas = 0;
            for (BEANDespesas despesa : listaDespesas) {
                impostos = impostos + (despesa.getCofins() + despesa.getIcms() + despesa.getPis());
                despesas = despesas + despesa.getValor();
            }
            jLabelDespesas.setText(String.valueOf(despesas));
            jLabelTotalImpostos.setText(String.valueOf(impostos));
        } else {
            JOptionPane.showMessageDialog(null, "Voce não possui despesas pagas!");
        }

    }//GEN-LAST:event_jButtonImpostosActionPerformed

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

    public static void main(String args[]) {

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
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gasto dialog = new Gasto(new javax.swing.JFrame(), true);
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
    private javax.swing.JInternalFrame Quadro;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonImpostos;
    private javax.swing.JButton jButtonSalarioCompremetido;
    private com.toedter.calendar.JDateChooser jDataAte;
    private com.toedter.calendar.JDateChooser jDataDe;
    private javax.swing.JLabel jLabeProgression;
    private javax.swing.JLabel jLabeProgression2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDespesas;
    private javax.swing.JLabel jLabelTotalImpostos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel planoFundo;
    private javax.swing.JRadioButton rbApagar;
    private javax.swing.JRadioButton rbPago;
    // End of variables declaration//GEN-END:variables
    private ArrayList<BEANDespesas> lista;
    private BEANUsuario usuario;

    private PieDataset CriaDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        if (cbGrupo.getSelectedIndex() == 0) {
            double fixos = 0, investimentos = 0, outros = 0;
            for (BEANDespesas l : lista) {
                switch (l.getId_grupo()) {
                    case 0:
                        fixos += l.getValor();
                        break;
                    case 1:
                        investimentos += l.getValor();
                        break;
                    case 2:
                        outros += l.getValor();
                        break;
                    default:
                        break;
                }
            }
            dataset.setValue("Gastos Fixos = " + fixos, new Double(fixos));
            dataset.setValue("Investimentos = " + investimentos, new Double(investimentos));
            dataset.setValue("Outros = " + outros, new Double(outros));
        } else {
            ArrayList<String> listaDescricao = new ArrayList<>();
            ArrayList<Double> listaDouble = new ArrayList<>();
            int id = -1;
            double valor = 0;
            for (BEANDespesas l : lista) {
                if (id != l.getId_tipo()) {
                    id = l.getId_tipo();
                    listaDescricao.add(Controller.getDescricao(id));
                    valor = 0;
                    listaDouble.add(valor);
                }
                if (id == l.getId_tipo()) {
                    valor = listaDouble.get(listaDouble.size() - 1);
                    valor += l.getValor();
                    listaDouble.remove(listaDouble.size() - 1);
                    listaDouble.add(valor);
                }
            }
            for (int i = 0; i < listaDouble.size(); i++) {
                dataset.setValue(listaDescricao.get(i) + " = " + listaDouble.get(i) , listaDouble.get(i));
            }
        }

        return dataset;
    }

    private JFreeChart CriaGrafico(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Gastos por Grupos", // chart title 
                dataset, // data    
                true, // include legend   
                true,
                false);

        return chart;
    }

    public JPanel CriaPainel() {
        JFreeChart chart = CriaGrafico(CriaDataset());
        return new ChartPanel(chart);
    }

    public void setUsuario(BEANUsuario usuario) {
        this.usuario = usuario;
        String[] periodo = periodoAtual();
        lista = CONTROLLER.Controller.listarDespesas(usuario.getId(), 0, periodo[0], periodo[1]);
        Quadro.setContentPane(CriaPainel());
    }

}
