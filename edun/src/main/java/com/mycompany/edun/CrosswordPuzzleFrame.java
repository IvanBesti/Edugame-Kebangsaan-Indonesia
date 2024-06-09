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
        //cek parsing data
        //JOptionPane.showMessageDialog(null, inputName); 
        initComponents();
        crosswordPuzzlePanel1.generateCrosswordPuzzle();
        loadQuestions();
        initializeGame();
        try {
            File fontBlack = new File("src/main/resources/fonts/Nunito-Black.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontBlack).deriveFont(24f);
            button_Back.setFont(font);
            button_restart.setFont(font);
            button_submit.setFont(font);
            button_selesai.setFont(font);

            Font font_20 = Font.createFont(Font.TRUETYPE_FONT, fontBlack).deriveFont(18f);
            text_jawaban.setFont(font_20);
            jTextField1.setFont(font_20);

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
        statusLabel.setText("Waktu: " + minutes + ":" + (seconds < 10 ? "0" : "") + seconds);
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
        return (int) ((correctAnswers / (double) totalQuestions) * 100);
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
        gridPanel1 = new com.mycompany.edun.crosswordpuzzle.GridPanel();
        icon_home = new rojerusan.RSPanelImage();
        button_Home = new rojerusan.RSMaterialButtonRectangle();
        icon_back = new rojerusan.RSPanelImage();
        button_Back = new rojerusan.RSMaterialButtonRectangle();
        bg_tts1 = new rojerusan.RSPanelImage();
        questionPanela1 = new com.mycompany.edun.crosswordpuzzle.AcrossQuestionPanel();
        bg_tts2 = new rojerusan.RSPanelImage();
        questionPanel2 = new com.mycompany.edun.crosswordpuzzle.DownQuestionPanel();
        icon_tts = new rojerusan.RSPanelImage();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        icon_restart = new javax.swing.JLabel();
        button_restart = new rojerusan.RSMaterialButtonRectangle();
        icon_submit = new javax.swing.JLabel();
        button_submit = new rojerusan.RSMaterialButtonRectangle();
        button_selesai = new rojerusan.RSMaterialButtonRectangle();
        rSPanelImage2 = new rojerusan.RSPanelImage();
        jTextField1 = new javax.swing.JTextField();
        text_jawaban = new javax.swing.JLabel();
        bg_pattern = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statusLabel.setText(" ");
        jPanel1.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 200, 100, 20));
        jPanel1.add(crosswordPuzzlePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 165, -1, 20));
        jPanel1.add(gridPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 500, 500));

        icon_home.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        jPanel1.add(icon_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1325, 110, 30, 30));

        button_Home.setBackground(new java.awt.Color(2, 132, 199));
        button_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icon-Home.png"))); // NOI18N
        button_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_HomeActionPerformed(evt);
            }
        });
        jPanel1.add(button_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1295, 90, 90, -1));

        icon_back.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Back-Arrow.png"))); // NOI18N
        jPanel1.add(icon_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 30, 30));

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
        jPanel1.add(button_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 90, 230, -1));

        bg_tts1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_tts1.png"))); // NOI18N
        bg_tts1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg_tts1.add(questionPanela1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 45, 290, 320));

        jPanel1.add(bg_tts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 250, 350, 400));

        bg_tts2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/bg_tts1.png"))); // NOI18N
        bg_tts2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bg_tts2.add(questionPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 45, 300, 330));

        jPanel1.add(bg_tts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 365, 400));

        icon_tts.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Crossword.png"))); // NOI18N
        icon_tts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(icon_tts, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 720, 60, 60));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/Apple.png"))); // NOI18N
        rSPanelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 740, 40, 40));

        icon_restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon restart.png"))); // NOI18N
        jPanel1.add(icon_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 782, -1, 30));

        button_restart.setBackground(new java.awt.Color(0, 153, 102));
        button_restart.setText("RESTART");
        button_restart.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        button_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_restartActionPerformed(evt);
            }
        });
        jPanel1.add(button_restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 770, 170, 60));

        icon_submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-save-20.png"))); // NOI18N
        jPanel1.add(icon_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 730, -1, 30));

        button_submit.setBackground(new java.awt.Color(244, 63, 94));
        button_submit.setText("SUBMIT");
        button_submit.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        button_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_submitActionPerformed(evt);
            }
        });
        jPanel1.add(button_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 715, 170, 60));

        button_selesai.setBackground(new java.awt.Color(124, 58, 237));
        button_selesai.setText("SELESAI");
        button_selesai.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        button_selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_selesaiActionPerformed(evt);
            }
        });
        jPanel1.add(button_selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 770, 170, 60));

        rSPanelImage2.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/BG-Name.png"))); // NOI18N
        rSPanelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        rSPanelImage2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 290, 50));

        text_jawaban.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        text_jawaban.setText("JAWABAN");
        rSPanelImage2.add(text_jawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel1.add(rSPanelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 720, 370, 110));

        bg_pattern.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BG.png"))); // NOI18N
        jPanel1.add(bg_pattern, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1440, 1024));

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
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
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void button_selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_selesaiActionPerformed
        // TODO add your handling code here:
        endGame();
    }//GEN-LAST:event_button_selesaiActionPerformed

    private void button_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_restartActionPerformed
        // TODO add your handling code here:
        crosswordPuzzlePanel1.generateCrosswordPuzzle();
        loadQuestions();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_button_restartActionPerformed

    private void button_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_submitActionPerformed
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
    }//GEN-LAST:event_button_submitActionPerformed

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
    private rojerusan.RSPanelImage bg_tts1;
    private rojerusan.RSPanelImage bg_tts2;
    private rojerusan.RSMaterialButtonRectangle button_Back;
    private rojerusan.RSMaterialButtonRectangle button_Home;
    private rojerusan.RSMaterialButtonRectangle button_restart;
    private rojerusan.RSMaterialButtonRectangle button_selesai;
    private rojerusan.RSMaterialButtonRectangle button_submit;
    private com.mycompany.edun.crosswordpuzzle.CrosswordPuzzlePanel crosswordPuzzlePanel1;
    private com.mycompany.edun.crosswordpuzzle.GridPanel gridPanel1;
    private rojerusan.RSPanelImage icon_back;
    private rojerusan.RSPanelImage icon_home;
    private javax.swing.JLabel icon_restart;
    private javax.swing.JLabel icon_submit;
    private rojerusan.RSPanelImage icon_tts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private com.mycompany.edun.crosswordpuzzle.DownQuestionPanel questionPanel2;
    private com.mycompany.edun.crosswordpuzzle.AcrossQuestionPanel questionPanela1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelImage rSPanelImage2;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel text_jawaban;
    // End of variables declaration//GEN-END:variables
}
