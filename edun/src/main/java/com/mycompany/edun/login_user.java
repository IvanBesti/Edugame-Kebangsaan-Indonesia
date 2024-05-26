/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.edun;

import java.awt.Font;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author nadiaag
 */

public class login_user extends javax.swing.JFrame {
    /** Creates new form login_user */
    public login_user() {
        initComponents();
        
        try{
           // Add Customize Font Button
           File fontButton = new File("src/main/resources/fonts/Nunito-Black.ttf");
           Font font_button = Font.createFont(Font.TRUETYPE_FONT, fontButton).deriveFont(24f);
           button_Play.setFont(font_button);
           button_Back.setFont(font_button);
           button_Home.setFont(font_button);
           button_Admin.setFont(font_button);
           
           // Add Customize Font 20 Black
           File font20 = new File("src/main/resources/fonts/Nunito-Black.ttf");
           Font font_20 = Font.createFont(Font.TRUETYPE_FONT, font20).deriveFont(18f);
           text_name.setFont(font_20);
           
           // Add Customize Font 24 Black
           File font24 = new File("src/main/resources/fonts/Nunito-Black.ttf");
           Font font_24 = Font.createFont(Font.TRUETYPE_FONT, font24).deriveFont(20f);
           input_name.setFont(font_24);

        // Set the frame visible
        setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        input_name = new javax.swing.JTextField();
        text_name = new javax.swing.JLabel();
        icon_play = new rojerusan.RSPanelImage();
        button_Play = new rojerusan.RSMaterialButtonRectangle();
        bg_name = new javax.swing.JLabel();
        character_kids = new javax.swing.JLabel();
        icon_back = new rojerusan.RSPanelImage();
        button_Back = new rojerusan.RSMaterialButtonRectangle();
        icon_admin = new rojerusan.RSPanelImage();
        icon_home = new rojerusan.RSPanelImage();
        button_Home = new rojerusan.RSMaterialButtonRectangle();
        button_Admin = new rojerusan.RSMaterialButtonRectangle();
        bg_pattern = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login User");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setOpaque(false);
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 690, 530));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input_name.setFont(new java.awt.Font("Nunito", 1, 24)); // NOI18N
        input_name.setForeground(new java.awt.Color(15, 23, 42));
        input_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        input_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(148, 163, 184)));
        input_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_name.setMargin(new java.awt.Insets(100, 6, 2, 6));
        input_name.setName(""); // NOI18N
        input_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nameActionPerformed(evt);
            }
        });
        jPanel1.add(input_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 430, 60));

        text_name.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        text_name.setForeground(new java.awt.Color(51, 65, 85));
        text_name.setText("SIAPA NAMA KAMU?");
        jPanel1.add(text_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        icon_play.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Play.png"))); // NOI18N
        jPanel1.add(icon_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 700, 30, 30));

        button_Play.setBackground(new java.awt.Color(124, 58, 237));
        button_Play.setIcon(new javax.swing.ImageIcon("/Users/nadiaag/NetBeansProjects/Edugame-Kebangsaan-Indonesia/edun/src/main/resources/assets/Icon-Play.png")); // NOI18N
        button_Play.setText("MULAI PERMAINAN");
        button_Play.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        button_Play.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(button_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 680, 410, -1));

        bg_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BG-Name.png"))); // NOI18N
        jPanel1.add(bg_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 510, 330));

        character_kids.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cartoon.png"))); // NOI18N
        jPanel1.add(character_kids, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 460, 340));

        icon_back.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Back-Arrow.png"))); // NOI18N
        jPanel1.add(icon_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, 30));

        button_Back.setBackground(new java.awt.Color(244, 63, 94));
        button_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Back-Arrow.png"))); // NOI18N
        button_Back.setText("KEMBALI");
        button_Back.setAlignmentX(0.5F);
        button_Back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        button_Back.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_Back.setIconTextGap(50);
        button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BackActionPerformed(evt);
            }
        });
        jPanel1.add(button_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 230, -1));

        icon_admin.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-User.png"))); // NOI18N
        icon_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_adminMouseClicked(evt);
            }
        });
        jPanel1.add(icon_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 110, 30, 30));

        icon_home.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        jPanel1.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, 30, 30));

        button_Home.setBackground(new java.awt.Color(2, 132, 199));
        button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomeActionPerformed(evt);
            }
        });
        jPanel1.add(button_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 90, 90, -1));

        button_Admin.setBackground(new java.awt.Color(5, 150, 105));
        button_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        button_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AdminActionPerformed(evt);
            }
        });
        jPanel1.add(button_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 90, 90, -1));

        bg_pattern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BG.png"))); // NOI18N
        jPanel1.add(bg_pattern, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1440, 1040));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_input_nameActionPerformed

    private void button_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_HomeActionPerformed

    private void button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_BackActionPerformed

    private void button_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AdminActionPerformed
        // TODO add your handling code here:
//        jDesktopPane1.removeAll();
        
        login_admin admin = new login_admin();
        jDesktopPane1.add(admin);
        admin.setVisible(true);
        admin.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_button_AdminActionPerformed

    private void icon_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_adminMouseClicked
        // TODO add your handling code here:
//        jDesktopPane1.removeAll();
//        jDesktopPane1.repaint();
//        
//        login_admin admin = new login_admin();
//        jDesktopPane1.add(admin);
//        admin.setVisible(true);
    }//GEN-LAST:event_icon_adminMouseClicked

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
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_name;
    private javax.swing.JLabel bg_pattern;
    private rojerusan.RSMaterialButtonRectangle button_Admin;
    private rojerusan.RSMaterialButtonRectangle button_Back;
    private rojerusan.RSMaterialButtonRectangle button_Home;
    private rojerusan.RSMaterialButtonRectangle button_Play;
    private javax.swing.JLabel character_kids;
    private rojerusan.RSPanelImage icon_admin;
    private rojerusan.RSPanelImage icon_back;
    private rojerusan.RSPanelImage icon_home;
    private rojerusan.RSPanelImage icon_play;
    private javax.swing.JTextField input_name;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel text_name;
    // End of variables declaration//GEN-END:variables

}
