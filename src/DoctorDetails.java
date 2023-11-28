
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DoctorDetails extends javax.swing.JFrame {
    
     
       
     Connection con =null;
     PreparedStatement pst=null;
     ResultSet rs=null;
     boolean showPassword =false;
     
      private String originalPassword;
     
    public DoctorDetails() {
       
          
        try{
          initComponents();
          
          //Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root","");
             
             pst=con.prepareStatement("select * from doctor");
             rs=pst.executeQuery();
             ResultSetMetaData rsmd=rs.getMetaData();
             int n=rsmd.getColumnCount();
             DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
             dtm.setRowCount (0);
             while(rs.next())
             {
                 Vector<String> v = new Vector<>();
                 for(int i=1; i<=n;i++)
                 {
                    
                         
                    
                     v.add(rs.getString("doctor_id"));
                     v.add(rs.getString("user_name"));
                     v.add(rs.getString("address"));
                     v.add(rs.getString("contact_no"));
                     v.add(rs.getString("email"));
                     v.add(rs.getString("department"));
                     v.add(rs.getString("speciality"));
                     v.add(rs.getString("designation"));
                     //v.add(rs.getString("password"));
                     
                     
                    if(rsmd.getColumnName(n).equals("password")){
                         v.add("********");
                     }else{
                         v.add(rs.getString(i));
                     }
                      
                      
                     
                    
                     
                 }
                 
                 
                 dtm.addRow(v);
             }
             jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
             
             int[] columnWidths ={75,100,280,120,230,200,200,200};
             int k =columnWidths.length;
             
             for(int i=0;i < k; i++){
                 jTable1.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
             }
        }
        
        catch(SQLException ex)
        {
             java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
          @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        cno = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Doctor_id", "user_name", "Address", "Contact_no", "Email", "Department", "Speciality", "Designation", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1430, 400));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/circled-left-2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 60, 40));

        jButton2.setBackground(new java.awt.Color(0,153,204,240));
        jButton2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 740, 130, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel2.setText("Contact No :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 130, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel3.setText("Email  Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 170, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        jLabel4.setText("Address :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 110, -1));

        add.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 360, 40));

        cno.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnoActionPerformed(evt);
            }
        });
        jPanel1.add(cno, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 360, 40));

        mail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 360, 40));

        jPanel2.setBackground(new java.awt.Color(0,153,204,220));

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Doctors Details");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(523, 523, 523))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1430, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
      
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       
        String address = model.getValueAt(jTable1.getSelectedRow(),2).toString();
        String number = model.getValueAt(jTable1.getSelectedRow(),3).toString();
        String Email = model.getValueAt(jTable1.getSelectedRow(),4).toString();
        
        
      // id.setText(model.getValueAt(selectedRow, 0).toString());
        add.setText(address);
        cno.setText(number);
        mail.setText(Email);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          
         DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
         
        if(jTable1.getSelectedRowCount()== 1){
            String name =add.getText();
            String number =cno.getText();
            String email =mail.getText();
           
           

            dtm.setValueAt(name, jTable1.getSelectedRow(),2);
            dtm.setValueAt(number, jTable1.getSelectedRow(),3);
            dtm.setValueAt(email, jTable1.getSelectedRow(),4);
            
           
        //update button
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/trojan_squad","root","");
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
           // String q ="UPDATE doctor SET address=?, contact_no=?, email=? where doctor_id="+value;
            String q = "UPDATE doctor SET address=?, contact_no=?, email=?  WHERE doctor_id='" + value + "'";
            PreparedStatement pst =con.prepareStatement(q);
            
            pst.setString(1,add.getText());
            pst.setString(2,cno.getText());
            pst.setString(3,mail.getText());
            
              
            int result =pst.executeUpdate();
             if (result > 0) {
                JOptionPane.showMessageDialog(this, "Record updated successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Unable to update record");
            }
            }
            catch(SQLException ex)
            {
                 JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                Logger.getLogger(DoctorDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         else{

            if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"Table is Empty..");
            }
            else{
                JOptionPane.showMessageDialog(this,"Please select Single Row For Update..");
            }

        }  
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        AdminPanel dp = new  AdminPanel();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnoActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add;
    private javax.swing.JTextField cno;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mail;
    // End of variables declaration//GEN-END:variables
}
