/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.dainamic.nepum.ui.login;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.log4j.Logger;
import pt.dainamic.nepum.model.LoginSession;
import pt.dainamic.nepum.ui.admin.AdminMenu;
import pt.dainamic.nepum.ui.hp.HealthProfessionalMenu;
import pt.dainamic.nepum.util.PlaceholderPassField;
import pt.dainamic.nepum.util.PlaceholderTextField;
import pt.dainamic.nepum.ws.LoginWS;

/**
 *
 * @author jorge
 */
public class LoginPage extends javax.swing.JFrame {
    private Logger log = Logger.getLogger(LoginPage.class);
    private LoginWS lWS;
    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        lWS = new LoginWS();
        initComponents();
        setIcon();
        setFields();
        
    }

    private String[] checkFile() {
        FileReader fileR = null;
        try {
            fileR = new FileReader("properties/predifinedSession.txt");
            StringBuilder file = new StringBuilder();
            BufferedReader buff = new BufferedReader(fileR);
            while (buff.ready()) {
                file.append(buff.readLine());
            }   buff.close();
            String[] split = file.toString().split("/");
            return split;
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally {
            try {
                fileR.close();
            } catch (IOException ex) {
                log.error(ex.getMessage());
            }

        }
        return null;
    }

    private void setFields(){
        String[] str = checkFile();
        if(str[0].equals("1")){
            jTextFieldEmail.setText(str[1]);
            jTextFieldPassword.setText(str[2]);
        }
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
        jLabelLogin = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jButtonForgot = new javax.swing.JButton();
        jTextFieldEmail = new PlaceholderTextField("E-mail");;
        jTextFieldPassword = new PlaceholderPassField("Password");
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setName(""); // NOI18N
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelLogin.setText("Login");
        jPanelWallpaper.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jButtonLogin.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Iniciar Sessão");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jButtonLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLoginKeyPressed(evt);
            }
        });
        jPanelWallpaper.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 180, 30));

        jButtonForgot.setText("Esqueceu-se da password?");
        jButtonForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotActionPerformed(evt);
            }
        });
        jPanelWallpaper.add(jButtonForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 180, 20));
        jPanelWallpaper.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 180, 30));

        jTextFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPasswordKeyPressed(evt);
            }
        });
        jPanelWallpaper.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 180, 30));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/backGround/login.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String getPass(){
        StringBuilder sb = new StringBuilder();
        char[] pass = jTextFieldPassword.getPassword();
        for(char c : pass){
            sb.append(c);
        }
        return sb.toString();
    }
    private void predifinedSession(){
        String[] str = checkFile();
        if(str[0].equals("0")){
            int resposta;
            String[] messages = {"Sim","Não"};
            resposta = JOptionPane.showOptionDialog(null, "Deseja predefinir esta conta?", "Predefinir Conta",
                JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, messages, null);
            if (resposta == JOptionPane.YES_OPTION) {
            String toUpdate = "0/";
            String updated = "1/"+jTextFieldEmail.getText()+"/"+getPass();
            try {
                updateLine(toUpdate,updated);
            } catch (IOException ex) {
                log.error(ex.getMessage());
            }
            }
        }
    }

    private void updateLine(String toUpdate, String updated) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("properties/predifinedSession.txt"));
        String line;
        String input = "";

        while ((line = file.readLine()) != null)
            input += line + "\n";

        input = input.replace(toUpdate, updated);

        FileOutputStream os = new FileOutputStream("properties/predifinedSession.txt");
        os.write(input.getBytes());

        file.close();
        os.close();
}

    private void jButtonForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotActionPerformed
        JTextField email = new JTextField();
        JTextField numCc = new JTextField();

        Object[] message = {
            "Email:", email,
            "Num. CC:", numCc
        };

        int option = JOptionPane.showOptionDialog(null, message, "Recuperar password", 
                         JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                         null,
                         new String[]{"Recuperar", "Cancelar"},
                         "default");
        if (option == JOptionPane.OK_OPTION) {
            if (email.getText().isEmpty() || numCc.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os dados");
            } else if (numCc.getText().trim().length() != 8) {
                JOptionPane.showMessageDialog(null, "O NºCC deve ter 8 digitos!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                lWS.getPassword(email.getText().trim(), Integer.parseInt(numCc.getText().trim()));
                JOptionPane.showMessageDialog(null, "Password enviada para o respetivo email");
                dispose();
            }

        } else {
            dispose();
        }
    }//GEN-LAST:event_jButtonForgotActionPerformed

    private void jButtonLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyPressed

    }//GEN-LAST:event_jButtonLoginKeyPressed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String email = jTextFieldEmail.getText().trim();
        try {
            LoginWS loginWS = new LoginWS();
            LoginSession log = loginWS.validateLogin(email, getPass());
            LoginSession.getInstance().setIdAdmin(log.getIdAdmin());
            LoginSession.getInstance().setIdHealthProfessional(log.getIdHealthProfessional());
            if (LoginSession.getInstance().getIdAdmin() == 0
                && LoginSession.getInstance().getIdHealthProfessional() != 0) {
                new HealthProfessionalMenu().setVisible(true);
                dispose();
                predifinedSession();
            } else if (LoginSession.getInstance().getIdAdmin() != 0
                && LoginSession.getInstance().getIdHealthProfessional() == 0) {
                new AdminMenu().setVisible(true);
                dispose();
                predifinedSession();
            } else {
                throw new RuntimeException("Pacientes não tem  permissão de acesso nesta aplicação");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(LoginPage.this,
                e.getMessage(), "Erro ao iniciar sessão", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jTextFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonLogin.doClick();
        }
    }//GEN-LAST:event_jTextFieldPasswordKeyPressed

    private void setIcon() {
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/logo.png")).getImage());
        icons.add(new ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/logo-icon.png")).getImage());
        setIconImages(icons);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonForgot;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelWallpaper;
    private PlaceholderTextField jTextFieldEmail;
    private PlaceholderPassField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables
}
