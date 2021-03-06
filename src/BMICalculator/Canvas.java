package BMICalculator;

import BMICalculator.Configuration;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author KouteiCheke
 */
public class Canvas extends javax.swing.JFrame {

    Configuration myConf = new Configuration();

    /**
     * Creates new form MiFrame
     */
    public Canvas() {
        initComponents();
        setLocationRelativeTo(null);
        man.setSelected(true);
        //this.getContentPane().setBackground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sex = new javax.swing.ButtonGroup();
        credits = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bmiText = new javax.swing.JLabel();
        weightText = new javax.swing.JLabel();
        heightText = new javax.swing.JLabel();
        downSeparator = new javax.swing.JSeparator();
        kgText = new javax.swing.JLabel();
        cmText = new javax.swing.JLabel();
        aboutButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        upSeparator = new javax.swing.JSeparator();
        idealWeightText = new javax.swing.JLabel();
        classificationText = new javax.swing.JLabel();
        bmiValueText = new javax.swing.JLabel();
        bmiResultValueText = new javax.swing.JLabel();
        classificationResultText = new javax.swing.JLabel();
        idealWeightResultText = new javax.swing.JLabel();
        weightSpinner = new javax.swing.JSpinner();
        heightSpinner = new javax.swing.JSpinner();
        meterImage = new javax.swing.JLabel();
        man = new javax.swing.JRadioButton();
        woman = new javax.swing.JRadioButton();
        sex = new javax.swing.JLabel();
        weightAndHeight = new javax.swing.JLabel();
        middleSeparator = new javax.swing.JSeparator();

        credits.setLabelFor(credits);
        credits.setText("Creado por Cheke.");
        credits.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        credits.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de IMC");
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bmiText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bmiText.setText("Calculadora de IMC");

        weightText.setText("Su peso:");

        heightText.setText("Su altura:");

        kgText.setText("kg");

        cmText.setText("cm");

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Watermark.png"))); // NOI18N
        aboutButton.setToolTipText("Creado por KouteiCheke");
        aboutButton.setActionCommand("autor");
        aboutButton.setBorder(null);
        aboutButton.setBorderPainted(false);
        aboutButton.setContentAreaFilled(false);
        aboutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        aboutButton.setDefaultCapable(false);
        aboutButton.setFocusPainted(false);
        aboutButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Watermark - pressed.png"))); // NOI18N
        aboutButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Watermark - rollover.png"))); // NOI18N
        aboutButton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Watermark - rollover.png"))); // NOI18N
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IMC.png"))); // NOI18N

        idealWeightText.setText("Peso ideal:");

        classificationText.setText("Clasificación:");

        bmiValueText.setText("Valor IMC:");

        idealWeightResultText.setToolTipText("");

        weightSpinner.setModel(new javax.swing.SpinnerNumberModel(70, 30, 200, 1));
        weightSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                weightSpinnerStateChanged(evt);
            }
        });

        heightSpinner.setModel(new javax.swing.SpinnerNumberModel(170, 100, 280, 1));
        heightSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                heightSpinnerStateChanged(evt);
            }
        });

        meterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/meter.png"))); // NOI18N

        Sex.add(man);
        man.setSelected(true);
        man.setText("Hombre");
        man.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                manStateChanged(evt);
            }
        });

        Sex.add(woman);
        woman.setText("Mujer");
        woman.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                womanStateChanged(evt);
            }
        });

        sex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sex.setText("Sexo");

        weightAndHeight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        weightAndHeight.setText("Peso y estatura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downSeparator)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(upSeparator)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(sex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weightAndHeight)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(woman)
                                    .addComponent(man)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(heightText)
                                                .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(heightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(cmText))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(kgText))))
                                        .addComponent(meterImage)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(bmiText)
                                            .addGap(5, 5, 5))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(classificationText)
                            .addComponent(idealWeightText)
                            .addComponent(bmiValueText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bmiResultValueText)
                            .addComponent(classificationResultText)
                            .addComponent(idealWeightResultText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aboutButton)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(bmiText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sex)
                            .addComponent(weightAndHeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(middleSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(man)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(woman))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kgText)
                                    .addComponent(weightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmText)
                                    .addComponent(heightSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heightText))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meterImage)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(image)
                        .addGap(31, 31, 31)))
                .addComponent(downSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bmiValueText)
                            .addComponent(bmiResultValueText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(classificationText)
                            .addComponent(classificationResultText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idealWeightText)
                            .addComponent(idealWeightResultText)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aboutButton))))
        );

        image.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        Icon m = new ImageIcon(getClass().getResource("/resources/IMC.png"));
        JOptionPane.showMessageDialog(null, "Aplicación creada por KouteiCheke.\n"
                + "Bajo licencia Creative Commons.", "Calculadora de IMC",
                JOptionPane.INFORMATION_MESSAGE, m);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void calculate() {
        myConf.setWeight((double) (Integer) weightSpinner.getValue());
        myConf.setHeight((double) (Integer) heightSpinner.getValue());
        myConf.calculate();
    }

    private void recalculate() {
        bmiResultValueText.setText(myConf.getBmiValueText());
        classificationResultText.setText(myConf.getClassificationText());
        if (man.isSelected()) {
            idealWeightResultText.setText(myConf.getMenIdealWeightText());
        } else {
            idealWeightResultText.setText(myConf.getWomenIdealWeightText());
        }
    }

    private void weightSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_weightSpinnerStateChanged
        calculate();
        recalculate();
    }//GEN-LAST:event_weightSpinnerStateChanged

    private void heightSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_heightSpinnerStateChanged
        calculate();
        recalculate();
    }//GEN-LAST:event_heightSpinnerStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        calculate();
        if (myConf.getWeight() == 70 && myConf.getHeight() == 170) {
            myConf.load();
            int heightLoaded = (int) myConf.getHeight();
            int weightLoaded = (int) myConf.getWeight();
            heightSpinner.setValue(heightLoaded);
            weightSpinner.setValue(weightLoaded);
            Sex.clearSelection();
            if (myConf.getGender() != 2) {
                man.setSelected(true);
            } else {
                woman.setSelected(true);
            }
            recalculate();
        } else {
            calculate();
            recalculate();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!woman.isSelected()) {
            myConf.save(1);
        } else {
            myConf.save(2);
        }
    }//GEN-LAST:event_formWindowClosing

    private void manStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_manStateChanged
        calculate();
        recalculate();
    }//GEN-LAST:event_manStateChanged

    private void womanStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_womanStateChanged
        calculate();
        recalculate();
    }//GEN-LAST:event_womanStateChanged

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("resources/IMC.png"));
        return retValue;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Locale.setDefault(Locale.ROOT);
        try {

            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Canvas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Sex;
    private javax.swing.JButton aboutButton;
    private javax.swing.JLabel bmiResultValueText;
    private javax.swing.JLabel bmiText;
    private javax.swing.JLabel bmiValueText;
    private javax.swing.JLabel classificationResultText;
    private javax.swing.JLabel classificationText;
    private javax.swing.JLabel cmText;
    private javax.swing.JLabel credits;
    private javax.swing.JSeparator downSeparator;
    private javax.swing.JSpinner heightSpinner;
    private javax.swing.JLabel heightText;
    private javax.swing.JLabel idealWeightResultText;
    private javax.swing.JLabel idealWeightText;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kgText;
    private javax.swing.JRadioButton man;
    private javax.swing.JLabel meterImage;
    private javax.swing.JSeparator middleSeparator;
    private javax.swing.JLabel sex;
    private javax.swing.JSeparator upSeparator;
    private javax.swing.JLabel weightAndHeight;
    private javax.swing.JSpinner weightSpinner;
    private javax.swing.JLabel weightText;
    private javax.swing.JRadioButton woman;
    // End of variables declaration//GEN-END:variables
}
