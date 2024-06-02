/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.edun;

import com.mycompany.edun.database.koneksi_db;
import java.awt.Font;
import java.io.File;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nadiaag
 */
public class login_admin extends javax.swing.JFrame {

    /**
     * Creates new form login_admin
     */
    public login_admin() {
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

        panel_login_admin = new javax.swing.JPanel();
        label_login_admin = new javax.swing.JLabel();
        label_username = new javax.swing.JLabel();
        input_username = new javax.swing.JTextField();
        label_password = new javax.swing.JLabel();
        input_password = new javax.swing.JPasswordField();
        button_login = new rojerusan.RSMaterialButtonRectangle();
        button_back_game = new javax.swing.JButton();
        shw_password = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setName("frameAdmin"); // NOI18N
        setUndecorated(true);

        panel_login_admin.setBackground(new java.awt.Color(241, 245, 249));

        label_login_admin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        label_login_admin.setText("Login Admin");

        label_username.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_username.setText("Username");

        input_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usernameActionPerformed(evt);
            }
        });

        label_password.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        label_password.setText("Password");

        input_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passwordActionPerformed(evt);
            }
        });

        button_login.setText("Log In");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        button_back_game.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        button_back_game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Back-Arrow-Black.png"))); // NOI18N
        button_back_game.setText("Ke Permainan");
        button_back_game.setIconTextGap(12);
        button_back_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_back_gameActionPerformed(evt);
            }
        });

        shw_password.setText("Show Password");
        shw_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shw_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_login_adminLayout = new javax.swing.GroupLayout(panel_login_admin);
        panel_login_admin.setLayout(panel_login_adminLayout);
        panel_login_adminLayout.setHorizontalGroup(
            panel_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_login_adminLayout.createSequentialGroup()
                .addGroup(panel_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_login_adminLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(button_back_game))
                    .addGroup(panel_login_adminLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(panel_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shw_password)
                            .addGroup(panel_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label_password)
                                .addComponent(label_username)
                                .addComponent(label_login_admin)
                                .addComponent(input_username)
                                .addComponent(button_login, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                .addComponent(input_password)))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        panel_login_adminLayout.setVerticalGroup(
            panel_login_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_login_adminLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(button_back_game, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(label_login_admin)
                .addGap(18, 18, 18)
                .addComponent(label_username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shw_password)
                .addGap(14, 14, 14)
                .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_login_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_login_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void input_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usernameActionPerformed

    private void button_back_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_back_gameActionPerformed
        // TODO add your handling code here:
        login_user user = new login_user();
        user.setVisible(true);
        user.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_button_back_gameActionPerformed
    
    public void bersih_form_login(){
        input_username.setText("");
        input_password.setText("");
    }
    
    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        // TODO add your handling code here:
        
        try {
        String inputUsername = input_username.getText();
        String inputPassword = new String(input_password.getPassword());
        String perintah_SQL =  "SELECT * FROM admin WHERE username = '"+inputUsername+"' AND password = '"+inputPassword+"';";
        
        Connection penghubung = (Connection)koneksi_db.konfigurasi_koneksiDB();
        
        Statement pernyataanSQL = penghubung.createStatement();
        
        ResultSet hasil_SQL = pernyataanSQL.executeQuery(perintah_SQL);
       
            if (hasil_SQL.next()) {
             
              JOptionPane.showMessageDialog(null, "Login Berhasil!");
              home_admin home_admin = new home_admin();
              home_admin.setVisible(true);
              this.setVisible(false);
            } else {
            
              JOptionPane.showMessageDialog(null, "Username/Password Invalid!");
              bersih_form_login();
            }
        
        } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Gagal, Login! \n"+e.getMessage());
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void input_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_passwordActionPerformed

    
    
    private void shw_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shw_passwordActionPerformed
        // TODO add your handling code here:
        if(shw_password.isSelected()) {
            input_password.setEchoChar((char)0);
        }
        else {
            input_password.setEchoChar('*');
        }
    }//GEN-LAST:event_shw_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_back_game;
    private rojerusan.RSMaterialButtonRectangle button_login;
    private javax.swing.JPasswordField input_password;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel label_login_admin;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_username;
    private javax.swing.JPanel panel_login_admin;
    private javax.swing.JCheckBox shw_password;
    // End of variables declaration//GEN-END:variables
}
