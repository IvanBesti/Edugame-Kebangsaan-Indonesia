/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.edun;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author rayas
 */
public class CrosswordPuzzleFrame extends javax.swing.JFrame {

    String newName;
    int newMarks = 0;
    String newGameType = "TTS";
    private int correctAnswers = 0;
    private int totalQuestions = 0;
    private Timer timer;
    private int timeLeft = 300; // 5 minutes in seconds
    private boolean gameEnded = false;

    /**
     * Creates new form choose_game
     */
    public CrosswordPuzzleFrame() {
        initComponents();
    }

    public CrosswordPuzzleFrame(String inputName) {
        this.newName = inputName;
        initComponents();
        crosswordPuzzlePanel1.generateCrosswordPuzzle();
        loadQuestions();
        initializeGame();
        try {
            File fontBlack = new File("src/main/resources/fonts/Nunito-Black.ttf");
            Font font_button = Font.createFont(Font.TRUETYPE_FONT, fontBlack).deriveFont(24f);
            button_Back.setFont(font_button);

            File fontButton = new File("src/main/resources/fonts/Nunito-Bold.ttf");
            Font font_20 = Font.createFont(Font.TRUETYPE_FONT, fontButton).deriveFont(20f);

            Font font_24 = Font.createFont(Font.TRUETYPE_FONT, fontButton).deriveFont(26f);

            setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (timeLeft > 0) {
                    timeLeft--;
                    updateTimerLabel();
                } else {
                    endGame();
                }
            }
        });
        timer.start();
    }

    private void initializeGame() {
        correctAnswers = 0;
        totalQuestions = crosswordPuzzlePanel1.getPlacedWords().size();
        updateTimerLabel();
    }

    private void updateTimerLabel() {
        int minutes = timeLeft / 60;
        int seconds = timeLeft % 60;
        statusLabel.setText("Time left: " + minutes + ":" + (seconds < 10 ? "0" : "") + seconds);
    }

    private void endGame() {
        timer.stop();
        gameEnded = true;
        int newScore = calculateScore();
        SucceedGameFrame s = new SucceedGameFrame(this.newName, this.newMarks, this.newGameType);
        s.setVisible(true);
        this.dispose();
    }

    private int calculateScore() {
        return (int) ((correctAnswers / (double) totalQuestions) * 1000);
    }

    private void loadQuestions() {
        List<String> acrossQuestions = crosswordPuzzlePanel1.getAcrossQuestions();
        List<String> downQuestions = crosswordPuzzlePanel1.getDownQuestions();

        questionPanela1.setAcrossQuestions(acrossQuestions);
        questionPanel2.setDownQuestions(downQuestions);
    }

    public boolean checkWord(String word) {
        if (gameEnded) {
            return false;
        }

        boolean correct = crosswordPuzzlePanel1.checkWord(word);
        if (correct) {
            correctAnswers++;
            statusLabel.setText("Status: Correct! Keep going.");
            if (gridPanel1.isPuzzleCompleted()) {
                endGame();
            }
        }
        return correct;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        crosswordPuzzlePanel1 = new com.mycompany.edun.crosswordpuzzle.CrosswordPuzzlePanel();
        questionPanela1 = new com.mycompany.edun.crosswordpuzzle.AcrossQuestionPanel();
        questionPanel2 = new com.mycompany.edun.crosswordpuzzle.DownQuestionPanel();
        gridPanel1 = new com.mycompany.edun.crosswordpuzzle.GridPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        icon_home = new rojerusan.RSPanelImage();
        button_Home = new rojerusan.RSMaterialButtonRectangle();
        icon_back = new rojerusan.RSPanelImage();
        button_Back = new rojerusan.RSMaterialButtonRectangle();
        bg_pattern = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLabel.setText(" ");
        jPanel1.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 200, 100, 20));
        jPanel1.add(crosswordPuzzlePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, 20));
        jPanel1.add(questionPanela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 290, 320));
        jPanel1.add(questionPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 280, 300, 330));
        jPanel1.add(gridPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 500, 500));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 730, 270, 50));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, 140, 80));

        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 710, 150, 80));

        jButton4.setText("Selesai");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 700, 140, 90));

        icon_home.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        jPanel1.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, 30, 30));

        button_Home.setBackground(new java.awt.Color(2, 132, 199));
        button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomeActionPerformed(evt);
            }
        });
        jPanel1.add(button_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, 90, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String word = jTextField1.getText().trim().toUpperCase();
        if (!word.isEmpty()) {
            crosswordPuzzlePanel1.checkWord(word);
            jTextField1.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a word.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        crosswordPuzzlePanel1.generateCrosswordPuzzle();
        loadQuestions();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        endGame();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(CrosswordPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrosswordPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrosswordPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrosswordPuzzleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrosswordPuzzleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_pattern;
    private rojerusan.RSMaterialButtonRectangle button_Back;
    private rojerusan.RSMaterialButtonRectangle button_Home;
    private com.mycompany.edun.crosswordpuzzle.CrosswordPuzzlePanel crosswordPuzzlePanel1;
    private com.mycompany.edun.crosswordpuzzle.GridPanel gridPanel1;
    private rojerusan.RSPanelImage icon_back;
    private rojerusan.RSPanelImage icon_home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private com.mycompany.edun.crosswordpuzzle.DownQuestionPanel questionPanel2;
    private com.mycompany.edun.crosswordpuzzle.AcrossQuestionPanel questionPanela1;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
