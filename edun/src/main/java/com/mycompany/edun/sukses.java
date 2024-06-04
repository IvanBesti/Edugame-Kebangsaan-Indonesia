/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.edun;

import com.mycompany.edun.database.koneksi_db;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Lusi Alifatul Laila
 */
public class sukses extends javax.swing.JFrame {

    /**
     * Creates new form sukses
     */
    public sukses() {
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

        text_hebat = new javax.swing.JLabel();
        icon_piala = new javax.swing.JLabel();
        icon_star1 = new javax.swing.JLabel();
        icon_star2 = new javax.swing.JLabel();
        icon_star3 = new javax.swing.JLabel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        button_home = new rojerusan.RSMaterialButtonRectangle();
        text_skorKamu = new javax.swing.JLabel();
        skor_pengguna = new javax.swing.JLabel();
        text_PTS = new javax.swing.JLabel();
        icon_restart = new javax.swing.JLabel();
        button_try = new rojerusan.RSMaterialButtonRectangle();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        mask_group = new javax.swing.JLabel();
        background_front = new javax.swing.JLabel();
        background_back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_hebat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Text Hebat.png"))); // NOI18N
        getContentPane().add(text_hebat, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 523, -1, -1));

        icon_piala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon piala.png"))); // NOI18N
        getContentPane().add(icon_piala, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 402, -1, -1));

        icon_star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star1.png"))); // NOI18N
        getContentPane().add(icon_star1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 253, -1, -1));

        icon_star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star2.png"))); // NOI18N
        getContentPane().add(icon_star2, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 223, -1, -1));

        icon_star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/star1.png"))); // NOI18N
        getContentPane().add(icon_star3, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 253, -1, -1));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 330, 30, 30));

        button_home.setBackground(new java.awt.Color(2, 132, 199));
        button_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_homeActionPerformed(evt);
            }
        });
        getContentPane().add(button_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 312, 70, -1));

        text_skorKamu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        text_skorKamu.setText("SKOR KAMU");
        getContentPane().add(text_skorKamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, -1, -1));

        skor_pengguna.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        skor_pengguna.setText("[SKOR PENGGUNA]");
        getContentPane().add(skor_pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 710, -1, -1));

        text_PTS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        text_PTS.setText("PTS");
        getContentPane().add(text_PTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 710, -1, -1));

        icon_restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon restart.png"))); // NOI18N
        getContentPane().add(icon_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 822, -1, -1));

        button_try.setBackground(new java.awt.Color(255, 204, 51));
        button_try.setText("MAIN LAGI");
        button_try.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tryActionPerformed(evt);
            }
        });
        getContentPane().add(button_try, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 800, 249, -1));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 153, 102));
        rSMaterialButtonRectangle1.setText("SELANJUTNYA");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 800, 272, -1));

        mask_group.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Mask group.png"))); // NOI18N
        getContentPane().add(mask_group, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 345, -1, -1));

        background_front.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background Front.png"))); // NOI18N
        getContentPane().add(background_front, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 345, -1, -1));

        background_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Background Back.png"))); // NOI18N
        getContentPane().add(background_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 352, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BG2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_homeActionPerformed
        // TODO add your handling code here:
        login_menu menu = new login_menu();
        menu.setVisible(true);
    }//GEN-LAST:event_button_homeActionPerformed

    private void button_tryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tryActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_button_tryActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
        leaderboard board = new leaderboard();
        board.setVisible(true);
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

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
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sukses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sukses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_back;
    private javax.swing.JLabel background_front;
    private rojerusan.RSMaterialButtonRectangle button_home;
    private rojerusan.RSMaterialButtonRectangle button_try;
    private javax.swing.JLabel icon_piala;
    private javax.swing.JLabel icon_restart;
    private javax.swing.JLabel icon_star1;
    private javax.swing.JLabel icon_star2;
    private javax.swing.JLabel icon_star3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mask_group;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private javax.swing.JLabel skor_pengguna;
    private javax.swing.JLabel text_PTS;
    private javax.swing.JLabel text_hebat;
    private javax.swing.JLabel text_skorKamu;
    // End of variables declaration//GEN-END:variables
}
