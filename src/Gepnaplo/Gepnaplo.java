package Gepnaplo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Fábián Tamás 1.0
 */
public class Gepnaplo extends javax.swing.JFrame {

    /**
     * Creates new form Gepnaplo
     */
    
    private Timer idozito = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            setLocationRelativeTo(null);
        }
    });
    
    public Gepnaplo() {
        initComponents();
        txtOsztaly.requestFocus();
        idozito.start();
    }
    
    private String levag(String s, int h) {
        if (s.length() > h)
            return s.substring(0, h);
        else
            return s;
    }
    
    private void kesz() {
        String iskola = levag(txtIskola.getText().trim(), 40);
        String osztaly = levag(txtOsztaly.getText().trim(), 8);
        String nev = levag(txtNev.getText().trim(), 50);
        String allapot = levag(txtAllapot.getText().trim(), 50);
        if (iskola.equals("") || osztaly.equals("") ||
                nev.equals("") || allapot.equals("")) {
            JOptionPane.showMessageDialog(this, "Adj meg minden adatot!",
                    "Hiba!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        DB ab = new DB();
        ab.beir(iskola, osztaly, nev, allapot);
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Iskola = new javax.swing.JLabel();
        Osztaly = new javax.swing.JLabel();
        Nev = new javax.swing.JLabel();
        Gep = new javax.swing.JLabel();
        txtIskola = new javax.swing.JTextField();
        txtOsztaly = new javax.swing.JTextField();
        txtNev = new javax.swing.JTextField();
        txtAllapot = new javax.swing.JTextField();
        btnKesz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gépnapló");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        Iskola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Iskola.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Iskola.setText("Iskola:");

        Osztaly.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Osztaly.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Osztaly.setText("Osztály:");

        Nev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Nev.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nev.setText("Név:");

        Gep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Gep.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Gep.setText("Gép állapota:");

        txtIskola.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIskola.setText("BKSZC Pogány Frigyes Szakgimnáziuma");
        txtIskola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIskolaActionPerformed(evt);
            }
        });

        txtOsztaly.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtOsztaly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOsztalyActionPerformed(evt);
            }
        });
        txtOsztaly.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOsztalyKeyPressed(evt);
            }
        });

        txtNev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNevActionPerformed(evt);
            }
        });

        txtAllapot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAllapot.setText("Rendben");

        btnKesz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKesz.setMnemonic('K');
        btnKesz.setText("Kész");
        btnKesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Iskola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Osztaly, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nev, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Gep, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKesz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIskola, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(txtOsztaly)
                    .addComponent(txtNev)
                    .addComponent(txtAllapot))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Gep, Iskola, Nev, Osztaly});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIskola)
                    .addComponent(Iskola, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOsztaly)
                    .addComponent(Osztaly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNev)
                    .addComponent(Nev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Gep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAllapot))
                .addGap(18, 18, 18)
                .addComponent(btnKesz, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Gep, Iskola, Nev, Osztaly});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtOsztalyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOsztalyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOsztalyActionPerformed

    private void txtNevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNevActionPerformed

    private void txtIskolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIskolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIskolaActionPerformed

    private void btnKeszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeszActionPerformed
        kesz();
    }//GEN-LAST:event_btnKeszActionPerformed

    private void txtOsztalyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOsztalyKeyPressed
        if (evt.isAltDown() && evt.getKeyChar() == 'y')
            System.exit(0);
    }//GEN-LAST:event_txtOsztalyKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kesz();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        setState(JFrame.NORMAL);
    }//GEN-LAST:event_formWindowIconified

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
            java.util.logging.Logger.getLogger(Gepnaplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gepnaplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gepnaplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gepnaplo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gepnaplo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gep;
    private javax.swing.JLabel Iskola;
    private javax.swing.JLabel Nev;
    private javax.swing.JLabel Osztaly;
    private javax.swing.JButton btnKesz;
    private javax.swing.JTextField txtAllapot;
    private javax.swing.JTextField txtIskola;
    private javax.swing.JTextField txtNev;
    private javax.swing.JTextField txtOsztaly;
    // End of variables declaration//GEN-END:variables
}
