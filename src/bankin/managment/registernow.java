
package bankin.managment;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



public class registernow extends javax.swing.JFrame {

    
    public registernow() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        accnum = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        idnum = new javax.swing.JTextField();
        idtype = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("REGISTER FORM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 14, -1, -1));

        jLabel2.setText("ID type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 72, -1, -1));

        jLabel3.setText("Selected ID number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 180, -1, -1));

        jLabel4.setText("Account Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 225, -1, -1));

        jLabel5.setText("E-mail ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 270, -1, -1));

        jLabel6.setText("Registered Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 314, -1, -1));

        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 358, -1, -1));

        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 402, -1, -1));

        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 447, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 267, 192, -1));
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 311, 192, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 444, 192, -1));
        getContentPane().add(accnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 222, 192, -1));

        dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobActionPerformed(evt);
            }
        });
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 355, 192, -1));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 399, 192, -1));
        getContentPane().add(idnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 177, 192, -1));
        getContentPane().add(idtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 69, 192, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National Identity Card (NIC)", "Passport Number" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 104, -1, -1));

        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 499, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("<Back");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 22, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone/16665828_1033995530039368_1423920180201170402_o.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 530));

        setSize(new java.awt.Dimension(515, 562));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedValue = jComboBox1.getSelectedItem().toString() ;
        idtype.setText (selectedValue) ;
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
                        Class.forName("com.mysql.jdbc.Driver");
              Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
              
              String sql = "insert into registernow values (?,?,?,?,?,?,?,?)";
              String sql1="insert into login values(?,?)";
              PreparedStatement ptstmt = conn.prepareStatement(sql);
              PreparedStatement ptstmt1 = conn.prepareStatement(sql1);
              ptstmt.setString(1, idtype.getText());
              ptstmt.setString(2, idnum.getText());
              ptstmt.setString(3, accnum.getText());
              ptstmt.setString(4, email.getText());
              ptstmt.setString(5, phone.getText());
              ptstmt.setString(6, dob.getText());
              ptstmt.setString(7, user.getText());
              ptstmt.setString(8, pass.getText());
              
              
              ptstmt.executeUpdate();
              
              ptstmt1.setString(1, user.getText());
              ptstmt1.setString(2, pass.getText());
              
              ptstmt1.executeUpdate();
              
              
              
              conn.close();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data has been inserted successfully");
                
                
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        
        loginpage obj = new loginpage ();
        obj. setVisible (true);
        dispose();
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registernow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registernow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accnum;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idnum;
    private javax.swing.JTextField idtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JTextField pass;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
