package VIEW;

import CONTROLLER.Controller;
import MODEL.DespesasBEAN;
import MODEL.UsuarioBEAN;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class Gastos2 extends javax.swing.JDialog {

    public Gastos2(java.awt.Frame parent, boolean modal) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("De");

        rbPago.setText("Pago");
        rbPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPagoActionPerformed(evt);
            }
        });

        rbApagar.setText("A pagar");
        rbApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbApagarActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Até");

        Quadro.setVisible(true);

        javax.swing.GroupLayout QuadroLayout = new javax.swing.GroupLayout(Quadro.getContentPane());
        Quadro.getContentPane().setLayout(QuadroLayout);
        QuadroLayout.setHorizontalGroup(
            QuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        QuadroLayout.setVerticalGroup(
            QuadroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupos", "Tipo" }));

        javax.swing.GroupLayout planoFundoLayout = new javax.swing.GroupLayout(planoFundo);
        planoFundo.setLayout(planoFundoLayout);
        planoFundoLayout.setHorizontalGroup(
            planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Quadro)
                    .addGroup(planoFundoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGrupo, 0, 100, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        planoFundoLayout.setVerticalGroup(
            planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDataAte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(cbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(planoFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(rbPago)
                        .addComponent(rbApagar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quadro)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Grupos", planoFundo);

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
                .addComponent(jTabbedPane1)
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
            java.util.logging.Logger.getLogger(Gastos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gastos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gastos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gastos2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gastos2 dialog = new Gastos2(new javax.swing.JFrame(), true);
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
    private com.toedter.calendar.JDateChooser jDataAte;
    private com.toedter.calendar.JDateChooser jDataDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel planoFundo;
    private javax.swing.JRadioButton rbApagar;
    private javax.swing.JRadioButton rbPago;
    // End of variables declaration//GEN-END:variables
    private ArrayList<DespesasBEAN> lista;
    private UsuarioBEAN usuario;

    private PieDataset CriaDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        if (cbGrupo.getSelectedIndex() == 0) {
            double fixos = 0, investimentos = 0, outros = 0;
            for (DespesasBEAN l : lista) {
                switch (l.getId_grupo()) {
                    case 0:
                        fixos = l.getValor();
                        break;
                    case 1:
                        investimentos = l.getValor();
                        break;
                    case 2:
                        outros = l.getValor();
                        break;
                    default:
                        break;
                }
            }
            dataset.setValue("Gastos Fixos", new Double(fixos));
            dataset.setValue("Investimentos", new Double(investimentos));
            dataset.setValue("Outros", new Double(outros));
        } else {
            ArrayList<String> listaDescricao = new ArrayList<>();
            ArrayList<Double> listaDouble = new ArrayList<>();
            int id = -1;
            double valor = 0;
            for (DespesasBEAN l : lista) {
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
                dataset.setValue(listaDescricao.get(i), listaDouble.get(i));
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

    public void setUsuario(UsuarioBEAN usuario) {
        this.usuario = usuario;
        String[] periodo = periodoAtual();
        lista = CONTROLLER.Controller.listarDespesas(usuario.getId(), 0, periodo[0], periodo[1]);
        Quadro.setContentPane(CriaPainel());
    }

}
