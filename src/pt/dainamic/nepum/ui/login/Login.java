/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.login;

/**
 *
 * @author jorge
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelBackGround = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassWord = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonForgot = new javax.swing.JButton();
        jLabelLoginBack = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setName(""); // NOI18N
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelLogin.setText("Login");
        jPanelBackGround.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanelBackGround.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 30));

        jTextFieldPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPassWordActionPerformed(evt);
            }
        });
        jPanelBackGround.add(jTextFieldPassWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/buttons/login.jpg"))); // NOI18N
        jButtonLogin.setText("Iniciar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelBackGround.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 20));

        jButtonForgot.setText("Esqueceu-se da password?");
        jButtonForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotActionPerformed(evt);
            }
        });
        jPanelBackGround.add(jButtonForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 20));

        jLabelLoginBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/backGround/orange.jpg"))); // NOI18N
        jPanelBackGround.add(jLabelLoginBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 250));

        jPanelWallpaper.add(jPanelBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 190, 250));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/backGround/login.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPassWordActionPerformed
        
    }//GEN-LAST:event_jTextFieldPassWordActionPerformed

    private void jButtonForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonForgotActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
    }//GEN-LAST:event_jButtonLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonForgot;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLoginBack;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelBackGround;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldPassWord;
    // End of variables declaration//GEN-END:variables
}
