/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asif siddique
 */
public class tictactoe extends javax.swing.JFrame {

    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
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

        jPanel1 = new javax.swing.JPanel();
        tic = new javax.swing.JLabel();
        tac = new javax.swing.JLabel();
        toe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        start = new javax.swing.JButton();
        about = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        tic.setFont(new java.awt.Font("Chiller", 1, 130)); // NOI18N
        tic.setForeground(new java.awt.Color(255, 255, 255));
        tic.setText("TIC");
        jPanel1.add(tic);
        tic.setBounds(40, 250, 200, 120);

        tac.setFont(new java.awt.Font("Chiller", 1, 130)); // NOI18N
        tac.setForeground(new java.awt.Color(255, 255, 255));
        tac.setText("TAC");
        jPanel1.add(tac);
        tac.setBounds(40, 370, 210, 120);

        toe.setFont(new java.awt.Font("Chiller", 1, 130)); // NOI18N
        toe.setForeground(new java.awt.Color(255, 255, 255));
        toe.setText("TOE");
        jPanel1.add(toe);
        toe.setBounds(40, 490, 210, 110);

        jLabel1.setFont(new java.awt.Font("Chiller", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("L");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 300, 30, 80);

        jLabel2.setFont(new java.awt.Font("Chiller", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("A");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 370, 30, 80);

        jLabel3.setFont(new java.awt.Font("Chiller", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Y");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 440, 30, 80);

        jLabel4.setFont(new java.awt.Font("Chiller", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("P");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(360, 230, 30, 80);

        start.setBackground(new java.awt.Color(0, 3, 0));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start);
        start.setBounds(321, 140, 90, 460);

        about.setBackground(new java.awt.Color(153, 153, 255));
        about.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jPanel1.add(about);
        about.setBounds(310, 80, 110, 40);

        exit.setBackground(new java.awt.Color(30, 0, 0));
        exit.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(204, 204, 204));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(320, 0, 100, 70);

        image.setText("jLabel1");
        jPanel1.add(image);
        image.setBounds(0, 0, 410, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(527, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
         
          Name_Taker obj=new Name_Taker();
          obj.setVisible(true);
          this.setVisible(false);
          


// TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        about obj5=new about();
        obj5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton exit;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton start;
    private javax.swing.JLabel tac;
    private javax.swing.JLabel tic;
    private javax.swing.JLabel toe;
    // End of variables declaration//GEN-END:variables
}