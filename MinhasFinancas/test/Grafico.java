import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Grafico {
    public static void main(String[] args) {
        EventQueue.invokeLater(Grafico::run);
    }

    private static void run() {
        // Cria uma tela com uma panel vazia dentro. Usa esta panel para definir
        // o tamanho mínimo e preferencial da janela.
        JFrame frame = new JFrame("Olá, JFreeChart!");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel raiz = new JPanel();
        raiz.setLayout(new BorderLayout());
        Dimension tamanho = new Dimension(700, 500);
        raiz.setPreferredSize(tamanho);
        raiz.setMinimumSize(tamanho);
        frame.add(raiz);
        frame.pack();
        Dimension sd = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((sd.width - frame.getWidth()) / 2, (sd.height - frame.getHeight()) / 2);

        // Cria o painel aonde o gráfico será mostrado.
        JPanel primeiroGrafico = new JPanel();
        Dimension tamanhoArea = new Dimension(600, 450);
        primeiroGrafico.setPreferredSize(tamanhoArea);
        primeiroGrafico.setMinimumSize(tamanhoArea);
        raiz.add(primeiroGrafico, BorderLayout.CENTER);

        // Cria o botão.
        JPanel areaBotoes = new JPanel();
        JButton botao = new JButton("Criar gráfico");
        areaBotoes.add(botao);
        raiz.add(areaBotoes, BorderLayout.SOUTH);

        // Define o que acontece ao clicar no botão.
        botao.addActionListener(e -> {
            DefaultPieDataset dpd = new DefaultPieDataset();
            dpd.setValue("Valor 1", 10);
            dpd.setValue("Valor 2", 20);
            dpd.setValue("Valor 3", 30);
            dpd.setValue("Valor 4", 40);

            JFreeChart grafico = ChartFactory.createPieChart("Nome do Gráfico", dpd, true, true, true);

            ChartPanel chartPanel = new ChartPanel(grafico);
            primeiroGrafico.add(chartPanel);
            primeiroGrafico.validate();
        });

        // Mostra a tela.
        frame.setVisible(true);
    }
}