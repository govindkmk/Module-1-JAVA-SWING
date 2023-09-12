/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Govind Kumar
 */
public class MenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MenuFrame
     */
    public MenuFrame() {
        initComponents();
        backgroundImage();
    }

    public void backgroundImage(){
        ImageIcon icon = new ImageIcon("C:\\Users\\bhara\\OneDrive\\Desktop\\JAVA\\JAVA Swing\\StudentManagementSystem\\src\\Images\\homepage.jpg");
        //Scalling image to fit in label
        Image image = icon.getImage();
        Image imageScale = image.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imageScale);
        
        jLabel1.setIcon(scaledIcon);
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
        welcomeLabel = new javax.swing.JLabel();
        departmentCrudButton = new javax.swing.JButton();
        courseCrudButton = new javax.swing.JButton();
        studentCrudButton = new javax.swing.JButton();
        studentCourseButton = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(153, 153, 255));
        welcomeLabel.setText("Welcome to Student Management System");
        jPanel1.add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 73, -1, -1));

        departmentCrudButton.setBackground(new java.awt.Color(153, 102, 255));
        departmentCrudButton.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        departmentCrudButton.setText("Department CRUD");
        departmentCrudButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentCrudButtonActionPerformed(evt);
            }
        });
        jPanel1.add(departmentCrudButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 350, -1));

        courseCrudButton.setBackground(new java.awt.Color(153, 102, 255));
        courseCrudButton.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        courseCrudButton.setText("Course CRUD");
        courseCrudButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCrudButtonActionPerformed(evt);
            }
        });
        jPanel1.add(courseCrudButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 350, -1));

        studentCrudButton.setBackground(new java.awt.Color(153, 102, 255));
        studentCrudButton.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        studentCrudButton.setText("Student CRUD");
        studentCrudButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCrudButtonActionPerformed(evt);
            }
        });
        jPanel1.add(studentCrudButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 350, -1));

        studentCourseButton.setBackground(new java.awt.Color(153, 102, 255));
        studentCourseButton.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        studentCourseButton.setText("Student Course CRUD");
        studentCourseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCourseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(studentCourseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 350, -1));

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jButton5.setText("Logout");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 140, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 850, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void departmentCrudButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentCrudButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        DepartmentFrame departmentFrame = new DepartmentFrame();
        departmentFrame.setVisible(true);
    }//GEN-LAST:event_departmentCrudButtonActionPerformed

    private void courseCrudButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCrudButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        CourseFrame courseFrame = new CourseFrame();
        courseFrame.setVisible(true);
    }//GEN-LAST:event_courseCrudButtonActionPerformed

    private void studentCrudButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCrudButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentFrame studentFrame = new StudentFrame();
        studentFrame.setVisible(true);
    }//GEN-LAST:event_studentCrudButtonActionPerformed

    private void studentCourseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCourseButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        StudentCourseFrame studentCourseFrame = new StudentCourseFrame();
        studentCourseFrame.setVisible(true);
    }//GEN-LAST:event_studentCourseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton courseCrudButton;
    private javax.swing.JButton departmentCrudButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton studentCourseButton;
    private javax.swing.JButton studentCrudButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
