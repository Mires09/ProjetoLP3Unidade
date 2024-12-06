/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetolp3unidade;

import javax.swing.JOptionPane;

public class Capainicial extends javax.swing.JFrame {

   
    public Capainicial() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoentrar = new javax.swing.JButton();
        bemvindo = new javax.swing.JLabel();
        feitopor = new javax.swing.JLabel();
        fotoentrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoentrar.setBackground(new java.awt.Color(153, 153, 255));
        botaoentrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botaoentrar.setText("ENTRAR");
        botaoentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoentrarActionPerformed(evt);
            }
        });
        jPanel1.add(botaoentrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 200, 40));

        bemvindo.setFont(new java.awt.Font("Yu Gothic Medium", 3, 28)); // NOI18N
        bemvindo.setForeground(new java.awt.Color(153, 153, 255));
        bemvindo.setText("Bem Vindo/a ao Portal de Cadastros");
        jPanel1.add(bemvindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 530, 50));

        feitopor.setForeground(new java.awt.Color(102, 102, 255));
        feitopor.setText("Criado por: Thamires Guedes e Lorena Costa");
        jPanel1.add(feitopor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        fotoentrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetolp3unidade/Imagem entrada/Flor.jpeg"))); // NOI18N
        jPanel1.add(fotoentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoentrarActionPerformed
        new projetolp3unidade. PainelCadastro().setVisible(true);
        this.dispose();
         JOptionPane.showMessageDialog(this, "Este Portal Foi Criado Para o Gerenciamento dos Dados dos Funcionários.\nRealize o Cadastro e/ou Verifique as Informações Clicando no Botão de 'Exibir'", "Informações", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_botaoentrarActionPerformed


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
            java.util.logging.Logger.getLogger(Capainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemvindo;
    private javax.swing.JButton botaoentrar;
    private javax.swing.JLabel feitopor;
    private javax.swing.JLabel fotoentrada;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
