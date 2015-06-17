/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.dainamic.nepum.ui.hp;


import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import pt.dainamic.nepum.model.LoginSession;
import pt.dainamic.nepum.ui.hp.appointments.Schedule;
import pt.dainamic.nepum.ui.hp.patients.PatientsList;

/**
 *
 * @author jorge
 */
public class HealthProfessionalMenu extends javax.swing.JFrame {

    /**
     * Creates new form HealthProfessionalMenu
     */
    public HealthProfessionalMenu() {
        initComponents();
        setIcon();
    }
 private void setIcon(){
        List<Image> icons = new ArrayList<>();
        icons.add(new ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/logo.png")).getImage());
        icons.add(new ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/logo-icon.png")).getImage());
        setIconImages(icons);
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
        jButtonHealthProfessional = new javax.swing.JButton();
        jButtonProfile = new javax.swing.JButton();
        jButtonSchedule = new javax.swing.JButton();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setName(""); // NOI18N
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonHealthProfessional.setText("Pacientes");
        jButtonHealthProfessional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHealthProfessionalActionPerformed(evt);
            }
        });
        jPanelWallpaper.add(jButtonHealthProfessional, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 140, 40));

        jButtonProfile.setText("Perfil");
        jButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfileActionPerformed(evt);
            }
        });
        jPanelWallpaper.add(jButtonProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 140, 40));

        jButtonSchedule.setText("Agenda");
        jButtonSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScheduleActionPerformed(evt);
            }
        });
        jPanelWallpaper.add(jButtonSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 140, 40));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/dainamic/nepum/images/backGround/first.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 717, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelWallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelWallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScheduleActionPerformed
        // TODO add your handling code here:
        new Schedule().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonScheduleActionPerformed

    private void jButtonHealthProfessionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHealthProfessionalActionPerformed
        // TODO add your handling code here:
        new PatientsList().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonHealthProfessionalActionPerformed

    private void jButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfileActionPerformed
        new HealthProfessionalProfile(LoginSession.getInstance().getIdHealthProfessional()).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonProfileActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHealthProfessional;
    private javax.swing.JButton jButtonProfile;
    private javax.swing.JButton jButtonSchedule;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelWallpaper;
    // End of variables declaration//GEN-END:variables
}
