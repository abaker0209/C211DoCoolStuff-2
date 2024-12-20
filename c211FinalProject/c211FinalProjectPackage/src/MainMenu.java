/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.c211docoolstuff.c211finalproject2; 

/**
 * / Contributors: Amber Baker, Scott Nguyen, Samuel Vaughn / Date: 12/19/2024 /
 * Class: C211 Final Project / Description: /
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    static List gamesLibrary = new List();
    Node temp = gamesLibrary.head;

    public MainMenu() {
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

        Header = new java.awt.Label();
        returnGameButton = new javax.swing.JButton();
        rentGameButton = new javax.swing.JButton();
        allGamesLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        gameDetails = new javax.swing.JTextArea();
        imageFrame = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(0, 153, 153));

        Header.setAlignment(java.awt.Label.CENTER);
        Header.setBackground(new java.awt.Color(153, 0, 0));
        Header.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        Header.setForeground(new java.awt.Color(255, 255, 255));
        Header.setText("Game Haven");

        returnGameButton.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        returnGameButton.setText("Return Game");
        returnGameButton.setActionCommand("");
        returnGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnGameButtonActionPerformed(evt);
            }
        });

        rentGameButton.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        rentGameButton.setText("Rent Game");
        rentGameButton.setActionCommand("");
        rentGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentGameButtonActionPerformed(evt);
            }
        });

        allGamesLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        allGamesLabel.setForeground(new java.awt.Color(0, 0, 255));
        allGamesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allGamesLabel.setText("All Games");

        nextButton.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        nextButton.setText("Next");
        nextButton.setActionCommand("");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        gameDetails.setEditable(false);
        gameDetails.setColumns(20);
        gameDetails.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        gameDetails.setLineWrap(true);
        gameDetails.setRows(7);
        gameDetails.setText(temp.game.toString());
        gameDetails.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                gameDetailsComponentShown(evt);
            }
        });

        jLayeredPane1.setLayer(gameDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(imageFrame, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addComponent(gameDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(352, 352, 352)
                    .addComponent(imageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(353, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(gameDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 388, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(imageFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allGamesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(rentGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnGameButton)
                        .addGap(187, 187, 187)
                        .addComponent(nextButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 56, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rentGameButton, returnGameButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allGamesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentGameButton)
                    .addComponent(returnGameButton)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnGameButtonActionPerformed
        // TODO add your handling code here:
        gamesLibrary.returnGame(temp.game.getTitle());
    }//GEN-LAST:event_returnGameButtonActionPerformed

    private void rentGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentGameButtonActionPerformed
        // TODO add your handling code here:
        gamesLibrary.rentGame(temp.game.getTitle());
    }//GEN-LAST:event_rentGameButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        temp = temp.next;
    }//GEN-LAST:event_nextButtonActionPerformed

    private void gameDetailsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_gameDetailsComponentShown
        // TODO add your handling code here:
        temp.game.toString();
    }//GEN-LAST:event_gameDetailsComponentShown

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });

        //creating game objects 
        ImageObject inquisitionImage = new ImageObject("\"C:\\Users\\AMBER\\Documents\\C211DoCoolStuff\\C211DoCoolStuff\\c211FinalProject\\src\\main\\java\\com\\c211docoolstuff\\c211finalproject\\photos\\inquisition.jpg\"");
        Game inquisition = new Game("Dragon Age: Inquisition", "Action role-playing", "XBOX, Playstation, Windows",
                2014, 5, 0, 5.00, inquisitionImage);
        Node inq = new Node(inquisition);
        gamesLibrary.addNode(inq);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Header;
    private javax.swing.JLabel allGamesLabel;
    private javax.swing.JTextArea gameDetails;
    private java.awt.Canvas imageFrame;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton rentGameButton;
    private javax.swing.JButton returnGameButton;
    // End of variables declaration//GEN-END:variables
}
