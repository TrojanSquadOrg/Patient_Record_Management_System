
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class C_StaffRegForm extends javax.swing.JFrame {

    /**
     * Creates new form E_StaffRegForm
     */
    public C_StaffRegForm() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        add = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        number = new javax.swing.JTextField();
        depart = new javax.swing.JTextField();
        job = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\UI Images\\nurse-icon-7n.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 200, 220);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(70, 50, 200, 220);

        jPanel3.setBackground(new java.awt.Color(0,153,204,240));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 107, 140), 2));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Castellar", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Staff Registration");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(350, -30, 450, 190);
        jPanel3.add(jLabel1);
        jLabel1.setBounds(1010, 30, 0, 70);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(300, 50, 1120, 130);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0,153,204));
        jLabel5.setText("Designation :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(730, 500, 140, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0,153,204));
        jLabel6.setText("Staff ID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 340, 100, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0,153,204));
        jLabel7.setText("User Name :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 430, 120, 40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0,153,204));
        jLabel10.setText("Addres :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 500, 80, 40);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0,153,204));
        jLabel11.setText("Contact No :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(170, 580, 130, 40);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0,153,204));
        jLabel12.setText("Email :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(770, 320, 70, 40);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0,153,204));
        jLabel13.setText("Password :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(760, 580, 100, 40);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0,153,204));
        jLabel14.setText("Department :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(720, 400, 150, 40);

        id.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(300, 340, 250, 40);

        fname.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname);
        fname.setBounds(310, 420, 250, 40);

        add.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(310, 500, 390, 40);

        email.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(900, 320, 290, 40);

        pass.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(pass);
        pass.setBounds(900, 580, 300, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(950, 220, 180, 50);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1230, 220, 140, 50);

        number.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jPanel1.add(number);
        number.setBounds(310, 580, 250, 40);

        depart.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        depart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departActionPerformed(evt);
            }
        });
        jPanel1.add(depart);
        depart.setBounds(900, 400, 300, 40);

        job.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobActionPerformed(evt);
            }
        });
        jPanel1.add(job);
        job.setBounds(900, 500, 300, 40);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\UI Images\\circled-left-2.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 650, 70, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        id.setText("");
        fname.setText("");
        add.setText("");
        number.setText("");
        email.setText("");
        depart.setText("");
     
        job.setText("");
       pass.setText("");
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void departActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departActionPerformed

    private void jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           
        String user_Id=id.getText();
        String f_name =fname.getText();
       
        String address =add.getText();
        String department =depart.getText();
        String designation =job.getText();
       
        String contact =number.getText();
        String Email =email.getText();
        String password =String.valueOf(pass.getPassword());

        try
        {
           Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root"," ");
           String q = "INSERT INTO  staff(staff_id,first_name,last_name,address,contact_no,email,department,designation,password) values ('"+user_Id+"','"+f_name+"','"+address+"','"+contact+"','"+Email+"','"+department+"','"+designation+"','"+password+"')";
           String l ="INSERT INTO  staff_login(user_id,user_name,designation,password) values ('"+user_Id+"','"+f_name+"','"+designation+"','"+password+"')";
           PreparedStatement pst =null;
           pst =Con.prepareStatement(l);
           pst =Con.prepareStatement(q);
          
           pst.execute(l);
           pst.execute(q);
           
           JOptionPane.showMessageDialog(rootPane,"Registered Successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
            
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
            java.util.logging.Logger.getLogger(C_StaffRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_StaffRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_StaffRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_StaffRegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_StaffRegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField depart;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField job;
    private javax.swing.JTextField number;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
