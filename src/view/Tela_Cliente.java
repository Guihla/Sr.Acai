
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import model.Cliente;

public class Tela_Cliente extends javax.swing.JFrame {

    public Tela_Cliente() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField_Telefone = new javax.swing.JTextField();
        jTextField_Nome = new javax.swing.JTextField();
        jTextField_Rua = new javax.swing.JTextField();
        jTextField_Numero = new javax.swing.JTextField();
        jTextField_Bairro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenss_Cliente/Leão Senhor Açaí Topo.png"))); // NOI18N
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 3, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenss_Cliente/Retangulo_Topo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenss_Cliente/Botão Voltar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 915, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenss_Cliente/Botao_Cadastrar (1).png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, -1, -1));

        jTextField_Telefone.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_Telefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField_Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 365, 62));

        jTextField_Nome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_Nome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 365, 62));

        jTextField_Rua.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_Rua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField_Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 365, 62));

        jTextField_Numero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_Numero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField_Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 365, 62));

        jTextField_Bairro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField_Bairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 365, 62));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel4.setText("Rua/Avenida");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel5.setText("Número");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel6.setText("Bairro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 650, -1, -1));

        jButton3.setText("Buscar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu_Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Cliente C = new Cliente();
        String Nome;
        Nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
        try {
            if(C.Existe(Nome)){
                jTextField_Nome.setText(C.getNome());
                jTextField_Rua.setText(C.getRua());
                jTextField_Numero.setText(""+C.getNumero());
                jTextField_Bairro.setText(C.getBairro());
                jTextField_Telefone.setText(C.getTelefone());
            } else JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
        } catch (java.sql.SQLException e) {
            System.out.println("Erro " + e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cliente C = new Cliente();
        int compras = 1;
            C.setNome(jTextField_Nome.getText());
            C.setRua(jTextField_Rua.getText());
            C.setNumero(25);
            C.setBairro(jTextField_Bairro.getText());
            C.setQtd_Compras(compras);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField_Bairro;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Numero;
    private javax.swing.JTextField jTextField_Rua;
    private javax.swing.JTextField jTextField_Telefone;
    // End of variables declaration//GEN-END:variables
}
