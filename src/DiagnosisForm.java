
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class DiagnosisForm extends javax.swing.JFrame {

     Connection con =null;
     PreparedStatement pst=null;
     ResultSet rs=null;
     
     
     String cid="";
    /**
     * Creates new form M_DiagnosisForm
     */
    public DiagnosisForm() {
        initComponents();
    }
    
     public DiagnosisForm(String msg) {
        initComponents();
        
        
          cid =msg;
        
         try{
         
          
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root","");
             
             pst=con.prepareStatement("select doctor_id,user_name from doctor where doctor_id =?");
             pst.setString(1, msg);
             rs=pst.executeQuery();
             
             if(rs.next())
             {
                 String dName =rs.getString("user_name");
                 did1.setText(dName);
                 
                 did.setText(msg);
             }
             
             
         }
           catch(SQLException ex)
        {
             java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(Level.SEVERE, null, ex);
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

        time = new cambodia.raven.Time();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        des = new javax.swing.JTextField();
        dn = new javax.swing.JTextField();
        com = new javax.swing.JTextField();
        aller = new javax.swing.JTextField();
        tme = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dte = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        did1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        time.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        time.setTextRefernce(tme);

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0,153,204,240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 35)); // NOI18N
        jLabel2.setText(" Diagnosis Form");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, -30, 400, 200));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 1030, 130));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0,153,204));
        jLabel6.setText("Doctor ID :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 333, -1, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 43, -1, 222));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0,153,204));
        jLabel8.setText("Date :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 480, -1, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0,153,204));
        jLabel11.setText("Time :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 537, -1, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0,153,204));
        jLabel7.setText("Description :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 271, 138, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0,153,204));
        jLabel9.setText("Complicatons :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 397, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0,153,204));
        jLabel10.setText("Allergies :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 470, -1, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0,153,204));
        jLabel12.setText("Diagnosis Name :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 334, -1, 40));

        did.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 333, 259, 45));

        des.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(des, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 270, 250, 45));

        dn.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 333, 250, 45));

        com.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(com, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 396, 250, 45));

        aller.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(aller, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 469, 250, 45));

        tme.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(tme, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 536, 222, 45));

        jButton2.setBackground(new java.awt.Color(0,153,204,240));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 720, 140, 50));

        jButton3.setBackground(new java.awt.Color(0,153,204,240));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 720, 140, 50));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/circled-left-2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 60, 40));

        id.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 270, 259, 45));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0,153,204));
        jLabel13.setText("Patient ID :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 271, 127, 40));

        dte.setDateFormatString("yyyy-MM-dd");
        dte.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        getContentPane().add(dte, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 475, 259, 45));

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 539, 31, 45));

        did1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        getContentPane().add(did1, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 406, 259, 45));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0,153,204));
        jLabel14.setText("Doctor Name :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 411, -1, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 43, -1, 222));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/patient-health-record--removebg-preview_1.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 160, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        String p_id=id.getText();
        String d_id =did.getText();
        String d_name =did1.getText();
        String date =((JTextField)dte.getDateEditor().getUiComponent()).getText();
        String time =tme.getText();
        String description =des.getText();
        String diagnosis =dn.getText();
        String complication =com.getText();
        String allergic =aller.getText();
       

        try
        {
           Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root","");
           String q = "INSERT INTO  diagnosis(patient_id,doctor_id,doctor_name,date,time,description,diagnosis,complications,allergies) values ('"+p_id+"','"+d_id+"','"+d_name+"','"+date+"','"+time+"','"+description+"','"+diagnosis+"','"+complication+"','"+allergic+"')";
          
          
           PreparedStatement pst =null;
           
           pst =Con.prepareStatement(q); 
         
           
          
           
           pst.execute(q);
           
              JOptionPane.showMessageDialog(rootPane,"Saved Successfully");
         
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
           id.setText("");
           did.setText("");
           did1.setText("");
           tme.setText("");
           des.setText("");
           dn.setText("");
           com.setText("");
           aller.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       this.hide();
        DoctorPanel dp =new DoctorPanel(cid);
        dp.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        time.showPopup();
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
            java.util.logging.Logger.getLogger(DiagnosisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiagnosisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiagnosisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiagnosisForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiagnosisForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aller;
    private javax.swing.JTextField com;
    private javax.swing.JTextField des;
    private javax.swing.JTextField did;
    private javax.swing.JTextField did1;
    private javax.swing.JTextField dn;
    private com.toedter.calendar.JDateChooser dte;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private cambodia.raven.Time time;
    private javax.swing.JTextField tme;
    // End of variables declaration//GEN-END:variables
}
