/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corretor.cotepe.icms.view;

import br.corretor.cotepe.icms.util.CorretorAtoCotepe;
import br.corretor.cotepe.icms.util.FileHelper;
import br.corretor.cotepe.icms.util.StringHelper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jacoboliveira
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscaArquivoField = new javax.swing.JTextField();
        buscaButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        fecharButton = new javax.swing.JButton();
        correcaoButton = new javax.swing.JButton();
        notaPAButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Corretor Ato Cotepe Versão 1.0");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        jLabel1.setText("Localize o arquivo:");

        buscaArquivoField.setEditable(false);

        buscaButton.setText("...");
        buscaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaButtonActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        jPanel2.add(statusLabel);

        fecharButton.setText("Fechar");
        fecharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharButtonActionPerformed(evt);
            }
        });
        jPanel2.add(fecharButton);

        correcaoButton.setText("Aplicar Correção");
        correcaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correcaoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(correcaoButton);

        notaPAButton.setText("Nota PA");
        notaPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaPAButtonActionPerformed(evt);
            }
        });
        jPanel2.add(notaPAButton);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscaArquivoField, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscaArquivoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaButton))
                .addGap(34, 34, 34)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/corretor/cotepe/icms/imagens/logo-ourobits.jpg"))); // NOI18N

        jMenu2.setText("Sobre");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Desenvolvedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = null;
        if (StringHelper.isBlank(buscaArquivoField.getText())) {
            chooser = new JFileChooser(System.getProperty("user.home"));
        } else {
            chooser = new JFileChooser(buscaArquivoField.getText());
        }

        FileNameExtensionFilter extension = new FileNameExtensionFilter("Arquivo Texto (*.txt)", "txt");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(extension);
        chooser.setFileHidingEnabled(true);
        chooser.setMultiSelectionEnabled(false);

        chooser.setApproveButtonText("Abrir");

        int choice = chooser.showOpenDialog(this);

        if (choice == JFileChooser.APPROVE_OPTION) {
            File arquivo = chooser.getSelectedFile();
            buscaArquivoField.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_buscaButtonActionPerformed

    private void correcaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correcaoButtonActionPerformed
        // TODO add your handling code here:

        Thread runner = new Thread(new Runnable() {
            @Override
            public void run() {
                correcaoButton.setEnabled(false);
                buscaButton.setEnabled(false);
                buscaArquivoField.setEnabled(false);
                fecharButton.setEnabled(false);
                statusLabel.setText("Correção em andamento...");


                Thread runner2 = new Thread(new Runnable() {
                    @Override
                    public void run() {

                        CorretorAtoCotepe corretorAtoCotepe = new CorretorAtoCotepe();
                        try {

                            if (StringHelper.isBlank(
                                    buscaArquivoField.getText())) {
                                throw new NullPointerException("Localize o arquivo!");
                            }

                            boolean result = corretorAtoCotepe.corrigir(buscaArquivoField.getText());

                            if (result) {
                                JOptionPane.showMessageDialog(MainFrame.this, "Documento corrigido com sucesso!");
                            } else {
                                JOptionPane.showMessageDialog(MainFrame.this, "O Documento não possui erros!");
                            }

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
                        } finally {
                            statusLabel.setText("Correção finalizada...");
                            buscaArquivoField.setEnabled(true);
                            fecharButton.setEnabled(true);
                            buscaButton.setEnabled(true);
                            correcaoButton.setEnabled(true);
                        }
                    }
                });
                runner2.start();

            }
        });
        runner.start();

    }//GEN-LAST:event_correcaoButtonActionPerformed

    private void fecharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_fecharButtonActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SobreDialog sobreDialog = new SobreDialog(this, true);

        sobreDialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void notaPAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaPAButtonActionPerformed
        try {
            if (StringHelper.isBlank(
                    buscaArquivoField.getText())) {
                throw new NullPointerException("Localize o arquivo!");
            }
            
            File arquivo = new File(buscaArquivoField.getText());
            String enconding = "ISO-8859-1";
            List<String> linhas = FileHelper.readLines(arquivo, enconding);
            StringBuilder conteudo = new StringBuilder();
            for (String linha : linhas) {
                String a = linha.substring(0, 3);
                if (a.equals("E05") || a.equals("E06") || a.equals("E08")
                        || a.equals("E09") || a.equals("E10") || a.equals("E11")
                        || a.equals("E12") || a.equals("E13")) {
                    continue;
                }
                conteudo.append(linha).append(File.separator.equals("\\") ? "\r\n" : "\n");
            }


            JFileChooser chooser = new JFileChooser();

            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

            chooser.setMultiSelectionEnabled(false);

            int choice = chooser.showSaveDialog(this);

            if (choice == JFileChooser.APPROVE_OPTION) {
                File caminhoEscolhido = chooser.getSelectedFile();
                String nomeArquivo = "notapa_" + arquivo.getName();
                
                boolean arquivoIgual = false;
                for (File file : caminhoEscolhido.listFiles()) {
                    if (nomeArquivo.equals(file.getName())) {
                        arquivoIgual = true;
                        break;
                    }
                }
                if (arquivoIgual) {
                    int opcao = JOptionPane.showConfirmDialog(this, "Este arquivo já existe deseja sobrescrever?",
                            "Pergunta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (opcao == JOptionPane.OK_OPTION) {
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                new FileOutputStream(new File(caminhoEscolhido.getPath() + nomeArquivo)), enconding));
                        writer.write(conteudo.toString());
                        writer.flush();
                        writer.close();
                    }
                    JOptionPane.showMessageDialog(this, "Arquivo sobrescrito com sucesso!");
                    return;
                }
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(new File(caminhoEscolhido.getPath()+File.separator + nomeArquivo)), enconding));
                writer.write(conteudo.toString());
                writer.flush();
                writer.close();
                JOptionPane.showMessageDialog(this, "Arquivo modificado com sucesso!");
            }



        } catch (Exception ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(MainFrame.this, ex.getMessage(), "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_notaPAButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscaArquivoField;
    private javax.swing.JButton buscaButton;
    private javax.swing.JButton correcaoButton;
    private javax.swing.JButton fecharButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton notaPAButton;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
