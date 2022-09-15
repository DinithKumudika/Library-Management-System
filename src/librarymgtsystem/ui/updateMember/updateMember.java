/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymgtsystem.ui.updateMember;

import librarymgtsystem.app.member.Member;

/**
 *
 * @author Dinith
 */
public class updateMember extends javax.swing.JFrame {

    /**
     * Creates new form updateMember
     */
    public updateMember() {
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

        formAddMember = new javax.swing.JPanel();
        lblPhone = new javax.swing.JLabel();
        lblMemberId = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        tfPhone = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfAddress = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        formHeader = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblIdNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formAddMember.setBackground(new java.awt.Color(204, 204, 204));
        formAddMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPhone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(153, 102, 0));
        lblPhone.setText("Phone No :");
        formAddMember.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        lblMemberId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMemberId.setForeground(new java.awt.Color(153, 102, 0));
        lblMemberId.setText("Member ID :");
        formAddMember.add(lblMemberId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(153, 102, 0));
        lblAddress.setText("Address :");
        formAddMember.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        btnClear.setBackground(new java.awt.Color(255, 204, 0));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 0, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        formAddMember.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 130, 40));

        btnUpdate.setBackground(new java.awt.Color(0, 204, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        formAddMember.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 130, 40));

        tfPhone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfPhone.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 280, 40));

        tfName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfName.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        formAddMember.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 280, 40));

        tfAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAddress.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 280, 40));

        lblAge.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(153, 102, 0));
        lblAge.setText("Age :");
        formAddMember.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        tfAge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfAge.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 102, 0)), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        formAddMember.add(tfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 280, 40));

        formHeader.setBackground(new java.awt.Color(153, 102, 0));

        jLabel5.setBackground(new java.awt.Color(153, 102, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   Update Member");

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

        formAddMember.add(formHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 70));

        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(153, 102, 0));
        lblName1.setText("Full Name :");
        formAddMember.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        lblIdNo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIdNo.setForeground(new java.awt.Color(153, 102, 0));
        formAddMember.add(lblIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        getContentPane().add(formAddMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfName.setText("");
        tfAge.setText("");
        tfAddress.setText("");
        tfPhone.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int id = Integer.parseInt(lblIdNo.getText());
        String name = tfName.getText();
        int age = Integer.parseInt(tfAge.getText());
        String address = tfAddress.getText();
        String phoneNo = tfPhone.getText();
        
        Member member = new Member();
        member.updateMember(id, name, age, address, phoneNo);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

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
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new updateMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel formAddMember;
    private javax.swing.JPanel formHeader;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    public static javax.swing.JLabel lblIdNo;
    private javax.swing.JLabel lblMemberId;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPhone;
    public static javax.swing.JTextField tfAddress;
    public static javax.swing.JTextField tfAge;
    public static javax.swing.JTextField tfName;
    public static javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables
}
