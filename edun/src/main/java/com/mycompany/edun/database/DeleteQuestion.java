/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.edun.database;

import com.mycompany.edun.database.koneksi_db;
import com.mycompany.edun.home_admin;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanbesti
 */
public class DeleteQuestion extends javax.swing.JFrame {

    /**
     * Creates new form deleteQuestion
     */
    public DeleteQuestion() {
        initComponents();
        try {
            File fontButton = new File("src/main/resources/fonts/Nunito-Black.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontButton).deriveFont(24f);
            jLabel3.setFont(font);
            jLabel4.setFont(font);
            jLabel5.setFont(font);
            jLabel6.setFont(font);
            jLabel7.setFont(font);
            jLabel8.setFont(font);
            jLabel9.setFont(font);
            jTextField1.setFont(font);
            jTextField2.setFont(font);
           
            Font font_20 = Font.createFont(Font.TRUETYPE_FONT, fontButton).deriveFont(18f);
            jTextField2.setFont(font_20);
            jTextField3.setFont(font_20);
            jTextField4.setFont(font_20);
            jTextField5.setFont(font_20);
            jTextField6.setFont(font_20);
            jTextField7.setFont(font_20);
            button2.setFont(font_20);
            button3.setFont(font_20);
            button4.setFont(font_20);
        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        button1 = new rojerusan.RSMaterialButtonRectangle();
        rSPanelImage3 = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        button2 = new rojerusan.RSMaterialButtonRectangle();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        bg_op1 = new rojerusan.RSMaterialButtonRectangle();
        bg1 = new rojerusan.RSMaterialButtonRectangle();
        bg_op2 = new rojerusan.RSMaterialButtonRectangle();
        bg2 = new rojerusan.RSMaterialButtonRectangle();
        bg_op3 = new rojerusan.RSMaterialButtonRectangle();
        bg3 = new rojerusan.RSMaterialButtonRectangle();
        bg_op4 = new rojerusan.RSMaterialButtonRectangle();
        bg4 = new rojerusan.RSMaterialButtonRectangle();
        bg_5 = new rojerusan.RSMaterialButtonRectangle();
        bg5 = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        button3 = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        button4 = new rojerusan.RSMaterialButtonRectangle();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Option 1:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Option 2:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Option 3:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Option 4:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Answer:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, -1, -1));

        jTextField3.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 65, 85));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 650, 30));

        jTextField4.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(51, 65, 85));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 650, 30));

        jTextField5.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 65, 85));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 650, 30));

        jTextField6.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 65, 85));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 650, 30));

        jTextField7.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(51, 65, 85));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 650, 30));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/hapus pertanyaan.png"))); // NOI18N
        getContentPane().add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 430, 60));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(124, 58, 237));
        getContentPane().add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 450, 80));

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-x-60.png"))); // NOI18N
        getContentPane().add(rSPanelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 40, 40));

        button1.setBackground(new java.awt.Color(244, 63, 94));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 80, 60));

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/BG-Choose.png"))); // NOI18N
        rSPanelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 65, 85));
        jLabel3.setText("Question ID:");
        rSPanelImage3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 25, -1, -1));

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 65, 85));
        rSPanelImage3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 25, 50, 35));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-search.png"))); // NOI18N
        rSPanelImage3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 33, -1, -1));

        button2.setBackground(new java.awt.Color(2, 132, 199));
        button2.setText("SEARCH");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        rSPanelImage3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 20, 170, 45));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 65, 85));
        jLabel4.setText("Question:");
        rSPanelImage3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 65, 85));
        rSPanelImage3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 680, -1));

        getContentPane().add(rSPanelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 760, 180));

        bg_op1.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bg_op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 130, 50));

        bg1.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 810, 70));

        bg_op2.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bg_op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 130, 50));

        bg2.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 810, 70));

        bg_op3.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bg_op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 130, 50));

        bg3.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 810, 70));

        bg_op4.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bg_op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 130, 50));

        bg4.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 810, 70));

        bg_5.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bg_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 130, 50));

        bg5.setBackground(java.awt.Color.lightGray);
        getContentPane().add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 810, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-garbage-20.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 760, -1, 30));

        button3.setBackground(new java.awt.Color(244, 63, 94));
        button3.setText("DELETE");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 740, 170, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-garbage-20.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 760, -1, 30));

        button4.setBackground(new java.awt.Color(244, 63, 94));
        button4.setText("CLEAR");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        getContentPane().add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 740, 170, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BG.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        home_admin.open=0;
        setVisible(false);       
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        try {
            Connection con = (Connection)koneksi_db.konfigurasi_koneksiDB();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM questions WHERE id = '"+id+"'");
            if (rs.next()) {
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                jTextField7.setText(rs.getString(7));
                jTextField1.setEditable(false);
            }
            else {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Question ID does not Exist!");
            }
        }
        catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        try {
            Connection con = (Connection)koneksi_db.konfigurasi_koneksiDB();
            PreparedStatement ps = con.prepareStatement( "DELETE FROM questions WHERE id=?");
            ps.setString(1, id);
            ps.executeUpdate();
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Question Succesfully Deleted");
            setVisible(false);
            new DeleteQuestion().setVisible(true);
        }
        catch (Exception e) {
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField1.setEditable(true);
    }//GEN-LAST:event_button4ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle bg1;
    private rojerusan.RSMaterialButtonRectangle bg2;
    private rojerusan.RSMaterialButtonRectangle bg3;
    private rojerusan.RSMaterialButtonRectangle bg4;
    private rojerusan.RSMaterialButtonRectangle bg5;
    private rojerusan.RSMaterialButtonRectangle bg_5;
    private rojerusan.RSMaterialButtonRectangle bg_op1;
    private rojerusan.RSMaterialButtonRectangle bg_op2;
    private rojerusan.RSMaterialButtonRectangle bg_op3;
    private rojerusan.RSMaterialButtonRectangle bg_op4;
    private rojerusan.RSMaterialButtonRectangle button1;
    private rojerusan.RSMaterialButtonRectangle button2;
    private rojerusan.RSMaterialButtonRectangle button3;
    private rojerusan.RSMaterialButtonRectangle button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private rojerusan.RSPanelImage rSPanelImage3;
    // End of variables declaration//GEN-END:variables
}
