/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymgtsystem.ui.addLibrarian;

import java.awt.Color;
import javax.swing.JOptionPane;
import librarymgtsystem.app.admin.Admin;
/**
 *
 * @author Omicron
 */
public class addLibrarian extends javax.swing.JFrame {

    /**
     * Creates new form addLibrarian
     */
    public addLibrarian() {
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

        formAddLibrarian = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblfirstName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        tfPassword = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        lbllastName = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        formHeader = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        bgImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formAddLibrarian.setBackground(new java.awt.Color(204, 204, 204));
        formAddLibrarian.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 102, 0));
        lblPassword.setText("Password");
        formAddLibrarian.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        lblfirstName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblfirstName.setForeground(new java.awt.Color(153, 102, 0));
        lblfirstName.setText("First Name :");
        formAddLibrarian.add(lblfirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 102, 0));
        lblUsername.setText("Username :");
        formAddLibrarian.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        btnClear.setBackground(new java.awt.Color(255, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        formAddLibrarian.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 130, 40));

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        formAddLibrarian.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 130, 40));

        tfPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddLibrarian.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 280, 40));

        tfFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfFirstName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFirstNameActionPerformed(evt);
            }
        });
        formAddLibrarian.add(tfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 280, 40));

        tfUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfUsername.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddLibrarian.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 280, 40));

        lbllastName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbllastName.setForeground(new java.awt.Color(153, 102, 0));
        lbllastName.setText("Last Name :");
        formAddLibrarian.add(lbllastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        tfLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfLastName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddLibrarian.add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 280, 40));

        formHeader.setBackground(new java.awt.Color(153, 102, 0));

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   Add a New Librarian");

        javax.swing.GroupLayout formHeaderLayout = new javax.swing.GroupLayout(formHeader);
        formHeader.setLayout(formHeaderLayout);
        formHeaderLayout.setHorizontalGroup(
            formHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        formHeaderLayout.setVerticalGroup(
            formHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        formAddLibrarian.add(formHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        getContentPane().add(formAddLibrarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 570, 720));

        bgImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymgtsystem/assets/home_bg.jpg"))); // NOI18N
        bgImg.setText("jLabel1");
        getContentPane().add(bgImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfFirstName.setText("");
        tfLastName.setText("");
        tfUsername.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String firstName = tfFirstName.getText();
        String lastName = tfLastName.getText();
        String username = tfUsername.getText();
        String password = tfPassword.getText();

        if(firstName.equals("") || lastName.equals("") || username.equals("") || password.equals("")){
            JOptionPane.showMessageDialog(null, "Member details are required!", "Alert", JOptionPane.WARNING_MESSAGE);
        } else if(password.length() != 8) {
            JOptionPane.showMessageDialog(null, "Password should include 8 characters!", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Admin librarian = new Admin(firstName, lastName, username, password);

            if(!librarian.isValidLibrarian()){
                JOptionPane.showMessageDialog(null, "Librarian already exists!" ,"Alert", JOptionPane.WARNING_MESSAGE);
            }
            else{
                librarian.addLibrarian();
                JOptionPane.showMessageDialog(null, "Librarian added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tfFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFirstNameActionPerformed

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
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addLibrarian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImg;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JPanel formAddLibrarian;
    private javax.swing.JPanel formHeader;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblfirstName;
    private javax.swing.JLabel lbllastName;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
