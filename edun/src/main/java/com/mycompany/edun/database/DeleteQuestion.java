/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.edun.database;

import com.mycompany.edun.HomeAdmin;
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

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        close = new rojerusan.RSPanelImage();
        line_header = new javax.swing.JSeparator();
        cta = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_save = new javax.swing.JLabel();
        delete = new rojerusan.RSMaterialButtonRectangle();
        jPanel3 = new javax.swing.JPanel();
        txt_save1 = new javax.swing.JLabel();
        clear = new rojerusan.RSMaterialButtonRectangle();
        line_cta = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        search = new rojerusan.RSMaterialButtonRectangle();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        first_opt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        scnd_opt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        third_opt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fourth_opt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        correct_answer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(15, 23, 42));
        title.setText("Perbarui Pertanyaan");

        close.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 70));

        line_header.setForeground(new java.awt.Color(226, 232, 240));
        background.add(line_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 670, 10));

        cta.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_save.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        txt_save.setForeground(new java.awt.Color(255, 255, 255));
        txt_save.setText("Hapus");
        jPanel2.add(txt_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 80, -1));

        delete.setBackground(new java.awt.Color(225, 29, 72));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 5, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_save1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        txt_save1.setForeground(new java.awt.Color(51, 65, 85));
        txt_save1.setText("Bersihkan");
        jPanel3.add(txt_save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        clear.setBackground(new java.awt.Color(241, 245, 249));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, -1, -1));

        javax.swing.GroupLayout ctaLayout = new javax.swing.GroupLayout(cta);
        cta.setLayout(ctaLayout);
        ctaLayout.setHorizontalGroup(
            ctaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(467, 467, 467))
        );
        ctaLayout.setVerticalGroup(
            ctaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ctaLayout.createSequentialGroup()
                .addGroup(ctaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        background.add(cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 670, 100));

        line_cta.setForeground(new java.awt.Color(226, 232, 240));
        background.add(line_cta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 670, -1));

        jLabel10.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(15, 23, 42));
        jLabel10.setText("<html>\nCari Pertanyaan Berdasarkan ID \n<span style=\"color: #F73B3B;\">*</span>\n</html>");
        background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        background.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 520, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon-search.png"))); // NOI18N
        background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 50, 40));

        search.setBackground(new java.awt.Color(67, 56, 202));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        background.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, 60));

        jLabel15.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(15, 23, 42));
        jLabel15.setText("<html> Pertanyaan  <span style=\"color: #F73B3B;\">*</span> </html>");
        background.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTextField2.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 65, 85));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        background.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 600, 40));

        jLabel16.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(15, 23, 42));
        jLabel16.setText("<html> Opsi Pertama  <span style=\"color: #F73B3B;\">*</span> </html>");
        background.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        first_opt.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        first_opt.setForeground(new java.awt.Color(51, 65, 85));
        first_opt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_optActionPerformed(evt);
            }
        });
        background.add(first_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 600, 40));

        jLabel17.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(15, 23, 42));
        jLabel17.setText("<html> Opsi Kedua  <span style=\"color: #F73B3B;\">*</span> </html>");
        background.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        scnd_opt.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        scnd_opt.setForeground(new java.awt.Color(51, 65, 85));
        background.add(scnd_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 600, 40));

        jLabel18.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(15, 23, 42));
        jLabel18.setText("<html> Opsi Ketiga  <span style=\"color: #F73B3B;\">*</span> </html>");
        background.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        third_opt.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        third_opt.setForeground(new java.awt.Color(51, 65, 85));
        background.add(third_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 600, 40));

        jLabel19.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(15, 23, 42));
        jLabel19.setText("<html> Opsi Keempat  <span style=\"color: #F73B3B;\">*</span> </html>");
        background.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        fourth_opt.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        fourth_opt.setForeground(new java.awt.Color(51, 65, 85));
        fourth_opt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourth_optActionPerformed(evt);
            }
        });
        background.add(fourth_opt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 600, 40));

        jLabel13.setFont(new java.awt.Font("SF Pro Text", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 23, 42));
        jLabel13.setText("<html> Jawaban  <span style=\"color: #F73B3BA;\">*</span> </html>");
        background.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        correct_answer.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        correct_answer.setForeground(new java.awt.Color(51, 65, 85));
        background.add(correct_answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 600, 40));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        HomeAdmin.open=0;
        setVisible(false);
    }//GEN-LAST:event_closeMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        try {
            Connection con = (Connection)DBConnection.konfigurasi_koneksiDB();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM questions WHERE id = '"+id+"'");
            if (rs.next()) {
                jTextField2.setText(rs.getString(2));
                first_opt.setText(rs.getString(3));
                scnd_opt.setText(rs.getString(4));
                third_opt.setText(rs.getString(5));
                fourth_opt.setText(rs.getString(6));
                correct_answer.setText(rs.getString(7));
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
    }//GEN-LAST:event_searchActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void first_optActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_optActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_optActionPerformed

    private void fourth_optActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourth_optActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourth_optActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        String id=jTextField1.getText();
        try {
            Connection con = (Connection)DBConnection.konfigurasi_koneksiDB();
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
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        first_opt.setText("");
        scnd_opt.setText("");
        third_opt.setText("");
        fourth_opt.setText("");
        correct_answer.setText("");
        jTextField1.setEditable(true);
    }//GEN-LAST:event_clearActionPerformed

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
            @Override
            public void run() {
                new DeleteQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private rojerusan.RSMaterialButtonRectangle clear;
    private rojerusan.RSPanelImage close;
    private javax.swing.JTextField correct_answer;
    private javax.swing.JPanel cta;
    private rojerusan.RSMaterialButtonRectangle delete;
    private javax.swing.JTextField first_opt;
    private javax.swing.JTextField fourth_opt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JSeparator line_cta;
    private javax.swing.JSeparator line_header;
    private javax.swing.JTextField scnd_opt;
    private rojerusan.RSMaterialButtonRectangle search;
    private javax.swing.JTextField third_opt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txt_save;
    private javax.swing.JLabel txt_save1;
    // End of variables declaration//GEN-END:variables
}
