/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irvina
 */
public class Kantin extends javax.swing.JFrame {

    /**
     * Creates new form Kantin
     */
    public Kantin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Daftar Kantin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 150, 40);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("SMK TELKOM MALANG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 40, 180, 40);

        b1.setText("Kantin 1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(30, 100, 110, 23);

        b2.setText("Kantin 2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(30, 140, 110, 23);

        b3.setText("Kantin 3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(30, 180, 110, 23);

        b4.setText("Kantin 4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(30, 220, 110, 23);

        b5.setText("Kantin 5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5);
        b5.setBounds(30, 260, 110, 23);

        b6.setText("Kantin 6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6);
        b6.setBounds(30, 300, 110, 23);

        b7.setText("Kantin 7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7);
        b7.setBounds(30, 340, 110, 23);

        b8.setText("Kantin 8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8);
        b8.setBounds(30, 380, 110, 23);

        b9.setText("Kantin 9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9);
        b9.setBounds(30, 420, 110, 23);

        TA.setBackground(new java.awt.Color(255, 204, 204));
        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 100, 250, 340);

        jPanel1.setBackground(new java.awt.Color(204, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 490);

        setBounds(0, 0, 494, 523);
    }// </editor-fold>//GEN-END:initComponents

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        TA.setText("\n Daftar Menu Kantin 9 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t BFC \n\n"
        +   "\t Nasi Bakar \n\n"
        +   "\t Tomyum \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es Teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        TA.setText("\n Daftar Menu Kantin 1 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Soto Ayam \n\n"
        +   "\t Mie Instan \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es Kopyor \n\n"
        +   "\t Es Teh \n\n"
        +   "\t Minuman Perasa  \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        TA.setText("\n Daftar Menu Kantin 5 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Soto Daging \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Mie Instant \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        TA.setText("\n Daftar Menu Kantin 2 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Nasi Rawon \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Capcay \n\n"
        +   "\t Sayur Sop \n\n"
        +   "\t Sayur Bayam \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es Ijo \n\n"
        +   "\t Es Teh \n\n"
        +   "\t Es Jeruk \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        TA.setText("\n Daftar Menu Kantin 3 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Bakso \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Mie Instant \n\n"
        +   "\t Nasi Goreng \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        TA.setText("\n Daftar Menu Kantin 4 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Soto Ayam \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Mie Instant \n\n"
        +   "\t Tahu Bulat \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        TA.setText("\n Daftar Menu Kantin 6 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Gado-gado \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Mie Instant \n\n"
        +   "\t Bakso \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n"
        +   "\t Es Blewah \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        TA.setText("\n Daftar Menu Kantin 7 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Mie Ayam \n\n"
        +   "\t Nasi Campur \n\n"
        +   "\t Mie Instant \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n");// TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
       TA.setText("\n Daftar Menu Kantin 8 \n\n"
        +   "\t\n Makanan : \n\n"
        +   "\t Snack (Makanan Ringan \n\n"
        +   "\t Samyang \n\n"
        +   "\t Mie Instant \n\n"
        +   "\t\n Minuman : \n\n"
        +   "\t Es teh \n\n"
        +   "\t Es Jeruk \n\n"
        +   "\t Minuman Perasa \n\n"
        +   "\t Berbagai macam minuman susu \n\n"); // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

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
            java.util.logging.Logger.getLogger(Kantin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kantin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kantin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kantin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kantin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
