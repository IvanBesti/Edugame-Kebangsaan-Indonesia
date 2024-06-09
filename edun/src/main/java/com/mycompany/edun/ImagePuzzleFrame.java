/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.edun;

import com.mycompany.edun.JigsawPuzzle.JigsawPuzzle;
import java.awt.Font;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author rayas
 */
public class ImagePuzzleFrame extends javax.swing.JFrame {

    String newName;
    int newMarks = 0;
    String newGameType = "GAMBAR";
    private long startTime;
    private int completedPuzzles = 0;
    private Set<JigsawPuzzle> completedPuzzleSet = new HashSet<>();
    private Timer timer;
    long remainingTime;

    public ImagePuzzleFrame() {
        initComponents();
    }

    public ImagePuzzleFrame(String inputName) {
        this.newName = inputName;
        //cek parsing data
        //JOptionPane.showMessageDialog(null, inputName); 
        initComponents();
        try {
            // Add Customize Font Button
            File fontBlack = new File("src/main/resources/fonts/Nunito-Black.ttf");
            Font font_button = Font.createFont(Font.TRUETYPE_FONT, fontBlack).deriveFont(24f);
            button_Back.setFont(font_button);
            button_selesai.setFont(font_button);

            Font font_20 = Font.createFont(Font.TRUETYPE_FONT, fontBlack).deriveFont(20f);
            text_timer.setFont(font_20);
            jLabelTimer.setFont(font_20);


            // Start Timer
            startTimer();

            // Set initial puzzle visibility
            jigsawPuzzle1.setVisible(true);
            jigsawPuzzle2.setVisible(false);
            jigsawPuzzle3.setVisible(false);
            jigsawPuzzle1.setCompletionCallback(this::puzzleCompleted);

            setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startTimer() {
        startTime = System.currentTimeMillis();
        timer = new Timer(1000, e -> updateTimer());
        timer.start();
    }

    private void updateTimer() {
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        remainingTime = 300 - elapsedTime;

        if (remainingTime <= 0) {
            timer.stop();
            timeOut();
        } else {
            updateTimerLabel();
        }
    }

    private void updateTimerLabel() {
        int minutes = (int) (remainingTime / 60);
        int seconds = (int) (remainingTime % 60);
        jLabelTimer.setText("Waktu: " + minutes + ":" + (seconds < 10 ? "0" : "") + seconds);
    }

    private void timeOut() {
        JOptionPane.showMessageDialog(this, "Waktu Habis!");
    }

    private void puzzleCompleted() {
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        completedPuzzles++;
        completedPuzzleSet.add(getCurrentPuzzle());

        if (completedPuzzles < 3) {
            switchPuzzle();
        } else {
            timer.stop();
            calculateScore(elapsedTime);
            SucceedGameFrame s = new SucceedGameFrame(this.newName, this.newMarks, this.newGameType);
            s.setVisible(true);
            this.dispose();
        }
    }

    private JigsawPuzzle getCurrentPuzzle() {
        if (jigsawPuzzle1.isVisible()) {
            return jigsawPuzzle1;
        }
        if (jigsawPuzzle2.isVisible()) {
            return jigsawPuzzle2;
        }
        return jigsawPuzzle3;
    }

    private void switchPuzzle() {
        if (jigsawPuzzle1.isVisible()) {
            jigsawPuzzle1.setVisible(false);
            jigsawPuzzle2.setVisible(true);
            jigsawPuzzle2.setCompletionCallback(this::puzzleCompleted);
        } else if (jigsawPuzzle2.isVisible()) {
            jigsawPuzzle2.setVisible(false);
            jigsawPuzzle3.setVisible(true);
            jigsawPuzzle3.setCompletionCallback(this::puzzleCompleted);
        }
    }

    private void calculateScore(long elapsedTime) {
        long remainingTime = 300 - elapsedTime;
        if (completedPuzzles == 3) {
            if (remainingTime >= 200) {
                newMarks = 100;
            } else {
                newMarks = (int) ((remainingTime / 200.0f) * 100);
            }
        } else {
            newMarks = (int) (((float) completedPuzzles / 3) * ((remainingTime / 200.0f) * 100));
        }
    }

    private void finishEarly() {
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        timer.stop();
        calculateScore(elapsedTime);
        SucceedGameFrame s = new SucceedGameFrame(this.newName, this.newMarks, this.newGameType);
        s.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jigsawPuzzle3 = new com.mycompany.edun.JigsawPuzzle.JigsawPuzzle();
        jigsawPuzzle2 = new com.mycompany.edun.JigsawPuzzle.JigsawPuzzle();
        jigsawPuzzle1 = new com.mycompany.edun.JigsawPuzzle.JigsawPuzzle();
        jPanel1 = new javax.swing.JPanel();
        icon_home = new rojerusan.RSPanelImage();
        button_Home = new rojerusan.RSMaterialButtonRectangle();
        icon_back = new rojerusan.RSPanelImage();
        button_Back = new rojerusan.RSMaterialButtonRectangle();
        button_selesai = new rojerusan.RSMaterialButtonRectangle();
        bg_timer = new rojerusan.RSPanelImage();
        text_timer = new javax.swing.JLabel();
        jLabelTimer = new javax.swing.JLabel();
        bg_pattern = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jigsawPuzzle3Layout = new javax.swing.GroupLayout(jigsawPuzzle3);
        jigsawPuzzle3.setLayout(jigsawPuzzle3Layout);
        jigsawPuzzle3Layout.setHorizontalGroup(
            jigsawPuzzle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jigsawPuzzle3Layout.setVerticalGroup(
            jigsawPuzzle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jigsawPuzzle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        javax.swing.GroupLayout jigsawPuzzle2Layout = new javax.swing.GroupLayout(jigsawPuzzle2);
        jigsawPuzzle2.setLayout(jigsawPuzzle2Layout);
        jigsawPuzzle2Layout.setHorizontalGroup(
            jigsawPuzzle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jigsawPuzzle2Layout.setVerticalGroup(
            jigsawPuzzle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jigsawPuzzle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        javax.swing.GroupLayout jigsawPuzzle1Layout = new javax.swing.GroupLayout(jigsawPuzzle1);
        jigsawPuzzle1.setLayout(jigsawPuzzle1Layout);
        jigsawPuzzle1Layout.setHorizontalGroup(
            jigsawPuzzle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jigsawPuzzle1Layout.setVerticalGroup(
            jigsawPuzzle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jigsawPuzzle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon_home.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        jPanel1.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 110, 30, 30));

        button_Home.setBackground(new java.awt.Color(2, 132, 199));
        button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomeActionPerformed(evt);
            }
        });
        jPanel1.add(button_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1135, 90, 90, -1));

        icon_back.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Back-Arrow.png"))); // NOI18N
        jPanel1.add(icon_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 30, 30));

        button_Back.setBackground(new java.awt.Color(244, 63, 94));
        button_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Back-Arrow.png"))); // NOI18N
        button_Back.setText("KEMBALI");
        button_Back.setAlignmentX(0.5F);
        button_Back.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        button_Back.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        button_Back.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_Back.setIconTextGap(50);
        button_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_BackActionPerformed(evt);
            }
        });
        jPanel1.add(button_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 90, 230, -1));

        button_selesai.setBackground(new java.awt.Color(124, 58, 237));
        button_selesai.setText("SELESAI");
        button_selesai.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        button_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_selesaiActionPerformed(evt);
            }
        });
        jPanel1.add(button_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 730, 150, -1));

        bg_timer.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_tts.png"))); // NOI18N
        bg_timer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text_timer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        text_timer.setText("TIMER");
        bg_timer.add(text_timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 6, -1, -1));

        jLabelTimer.setText("jLabel1");
        bg_timer.add(jLabelTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 23, 120, 30));

        jPanel1.add(bg_timer, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 735, 130, 60));

        bg_pattern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BG.png"))); // NOI18N
        jPanel1.add(bg_pattern, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1440, 1060));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void button_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_BackActionPerformed
        // TODO add your handling code here:
        LoginUser user = new LoginUser();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_BackActionPerformed

    private void button_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_HomeActionPerformed
        // TODO add your handling code here:
        LoginMenu menu = new LoginMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button_HomeActionPerformed

    private void button_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_selesaiActionPerformed
        // TODO add your handling code here:
        finishEarly();
    }//GEN-LAST:event_button_selesaiActionPerformed

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
            java.util.logging.Logger.getLogger(ImagePuzzleFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImagePuzzleFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImagePuzzleFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImagePuzzleFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImagePuzzleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pattern;
    private rojerusan.RSPanelImage bg_timer;
    private rojerusan.RSMaterialButtonRectangle button_Back;
    private rojerusan.RSMaterialButtonRectangle button_Home;
    private rojerusan.RSMaterialButtonRectangle button_selesai;
    private rojerusan.RSPanelImage icon_back;
    private rojerusan.RSPanelImage icon_home;
    private javax.swing.JLabel jLabelTimer;
    private javax.swing.JPanel jPanel1;
    private com.mycompany.edun.JigsawPuzzle.JigsawPuzzle jigsawPuzzle1;
    private com.mycompany.edun.JigsawPuzzle.JigsawPuzzle jigsawPuzzle2;
    private com.mycompany.edun.JigsawPuzzle.JigsawPuzzle jigsawPuzzle3;
    private javax.swing.JLabel text_timer;
    // End of variables declaration//GEN-END:variables
}
