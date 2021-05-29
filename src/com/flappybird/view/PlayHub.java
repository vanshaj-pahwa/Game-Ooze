package com.flappybird.view;

import com.breakoutball.Gameplay;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vanshaj
 */
public class PlayHub extends javax.swing.JFrame {

    public PlayHub() {
        initComponents();
        this.setBounds(560,200,810,610);
        this.setTitle("Game Ooze");
        this.setResizable(false);  
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Game Ooze");
        jPanel1.setMinimumSize(new java.awt.Dimension(810, 800));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BreakOut Ball");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(550, 380, 149, 45);

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("WELCOME TO GAME OOZE!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(230, 20, 390, 57);

        L3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Flappy_Bird-01-512.png"))); // NOI18N
        L3.setToolTipText("Click to Start");
        L3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L3MouseClicked(evt);
            }
        });
        jPanel1.add(L3);
        L3.setBounds(70, 170, 210, 210);

        jLabel4.setFont(new java.awt.Font("Cambria", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Click the icon to start the game");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 70, 360, 30);

        L1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/breakout.png"))); // NOI18N
        L1.setToolTipText("Click to Start");
        L1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L1MouseClicked(evt);
            }
        });
        jPanel1.add(L1);
        L1.setBounds(530, 200, 180, 180);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Flappy Bird");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 380, 149, 45);

        jLabel6.setBackground(new java.awt.Color(0, 51, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText(" Vanshaj Pahwa");
        jLabel6.setToolTipText("Click to visit github.com/vanshajpahwa07");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 510, 110, 20);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Reach Out:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(600, 540, 80, 21);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/github icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(670, 530, 40, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gmail icon.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(740, 530, 40, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin icon.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(710, 530, 30, 40);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel11.setText("Developed by");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(600, 510, 90, 21);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/flappybird/view/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 800, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L3MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Press Enter to start the game. \nPress 'Space Bar' or 'Arrow UP key' to control the bird jump.");
  
            JFrame frame = new JFrame();
            Game game = new Game();
            frame.add(game);
            frame.pack();
            frame.setVisible(true);
            frame.setTitle("Flappy Bird");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setMaximumSize(new Dimension(810, 610));
            frame.setPreferredSize(new Dimension(820, 610));
            frame.setMinimumSize(new Dimension(810, 610));
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
    }//GEN-LAST:event_L3MouseClicked

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
        JOptionPane.showMessageDialog(this, "Press Enter to start the game");
        JFrame obj=new JFrame();
        Gameplay g = new Gameplay();
        obj.setBounds(600, 190, 710, 610);
        obj.setPreferredSize(new Dimension(710,610));
        obj.setMaximumSize(new Dimension(710,610));
        obj.setMinimumSize(new Dimension(710,610));
        obj.setTitle("Breakout Ball");		
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(g);
        obj.pack();
        obj.setVisible(true);
                                                                                                                              
        //this.dispose()                                                        
    }//GEN-LAST:event_L1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/vanshajpahwa07"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/vanshajpahwa07"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("mailto:vanshajpahwa07@gmail.com"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://linkedin.com/in/vanshaj-pahwa-903324171"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PlayHub.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(PlayHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          Game game = new Game();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayHub().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L3;
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
