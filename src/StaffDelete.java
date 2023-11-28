
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class StaffDelete extends javax.swing.JFrame {

    public StaffDelete() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        s_id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(50, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 140, 210));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Staff Delete");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(310, 20, 220, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(270, 110, 850, 90);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel5.setText("Staff ID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 320, 130, 50);

        s_id.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(s_id);
        s_id.setBounds(490, 320, 360, 50);

        jButton1.setBackground(new java.awt.Color(0, 142, 209));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Detete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(550, 440, 160, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/circled-left-2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 570, 60, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/imageedit_22_2982924433.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 50, 190, 210);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1179, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         AdminPanel ap =new  AdminPanel();
          ap.setVisible(true);
          this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         String id =s_id.getText();
        
        try{
            Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root","");
            String a="Delete from staff where staff_id ='"+id+"' ";
            
             PreparedStatement pst =null;
             pst =Con.prepareStatement(a);
            
             
               pst.execute(a);
             
               
               JOptionPane.showMessageDialog(rootPane,"Delete Successfully");
               
               s_id.setText("");
                
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane,ex);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StaffDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StaffDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField s_id;
    // End of variables declaration//GEN-END:variables
}
