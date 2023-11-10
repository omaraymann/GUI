/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;
import Backend.AdminRole;
/**
 *
 * @author 20127
 */
public class AdminRoleWindow extends javax.swing.JFrame implements Node{

    /**
     * Creates new form AdminRoleWindow
     */
    private Node parent;
    private AdminRole admin;
    private RemoveEmployeeWindow removeemployee;
    private AddEmployeeWindow addemployee;
    private ViewEmployeesWindow viewemployees;
    
    public AdminRoleWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        admin = new AdminRole();
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
        addEmployee_btn = new javax.swing.JButton();
        removeEmployee_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        viewEmployees_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin Role");

        addEmployee_btn.setBackground(new java.awt.Color(0, 0, 0));
        addEmployee_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addEmployee_btn.setForeground(new java.awt.Color(255, 255, 255));
        addEmployee_btn.setText("Add Employee");
        addEmployee_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addEmployee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployee_btnActionPerformed(evt);
            }
        });

        removeEmployee_btn.setBackground(new java.awt.Color(0, 0, 0));
        removeEmployee_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeEmployee_btn.setForeground(new java.awt.Color(255, 255, 255));
        removeEmployee_btn.setText("Remove Employee");
        removeEmployee_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        removeEmployee_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployee_btnActionPerformed(evt);
            }
        });

        logout_btn.setBackground(new java.awt.Color(0, 0, 0));
        logout_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout_btn.setForeground(new java.awt.Color(255, 255, 255));
        logout_btn.setText("Logout");
        logout_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        viewEmployees_btn.setBackground(new java.awt.Color(0, 0, 0));
        viewEmployees_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewEmployees_btn.setForeground(new java.awt.Color(255, 255, 255));
        viewEmployees_btn.setText("View Employees");
        viewEmployees_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        viewEmployees_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEmployees_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmployee_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewEmployees_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeEmployee_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addEmployee_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewEmployees_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeEmployee_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        admin.logout();
        ((InventorySystemWindow)parent).setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_logout_btnActionPerformed

    private void removeEmployee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmployee_btnActionPerformed
        if(removeemployee == null)
            removeemployee = new RemoveEmployeeWindow(admin);
        removeemployee.setParent(this);
        removeemployee.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_removeEmployee_btnActionPerformed

    private void addEmployee_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployee_btnActionPerformed
        if(addemployee == null)
            addemployee = new AddEmployeeWindow(admin);
        addemployee.setParent(this);
        addemployee.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addEmployee_btnActionPerformed

    private void viewEmployees_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmployees_btnActionPerformed
        if(viewemployees == null)
            viewemployees = new ViewEmployeesWindow(admin);
        viewemployees.setParent(this);
        viewemployees.setData();
        viewemployees.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewEmployees_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRoleWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployee_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton removeEmployee_btn;
    private javax.swing.JButton viewEmployees_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setParent(Node parent) {
        this.parent = parent;
    }

    @Override
    public Node getParents() {
        return parent;
    }
}
