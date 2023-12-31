/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dbmanager.CourseDbManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Course;

/**
 *
 * @author Govind Kumar
 */
public class CourseFrame extends javax.swing.JFrame {

    /**
     * Creates new form CourseFrame
     */
    public CourseFrame() {
        initComponents();
        getAllCoursesIntoTable();
        clearFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        courseCrudLabel = new javax.swing.JLabel();
        homeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        codeLabel = new javax.swing.JLabel();
        idTextLabel = new javax.swing.JTextField();
        nameTextLabel = new javax.swing.JTextField();
        codeTextLabel = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        courseCrudLabel.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        courseCrudLabel.setText("Course CRUD");

        homeButton.setBackground(new java.awt.Color(255, 204, 204));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(255, 204, 204));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        idLabel.setText("Id");

        nameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nameLabel.setText("Name");

        codeLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        codeLabel.setText("Code");

        idTextLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextLabelActionPerformed(evt);
            }
        });

        nameTextLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextLabelActionPerformed(evt);
            }
        });

        codeTextLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTextLabelActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(204, 204, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(204, 204, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(204, 204, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        courseTable.setBackground(new java.awt.Color(204, 153, 255));
        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(courseTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(idTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(nameTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(codeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(codeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(197, 197, 197)
                            .addComponent(courseCrudLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(225, 225, 225)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(idTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(codeLabel))
                    .addComponent(codeTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 45, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseCrudLabel)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(273, 273, 273)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 46, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    CourseDbManager courseDbManager = new CourseDbManager();
    String columns[] = {"Id", "Name", "Code"};
    DefaultTableModel courseDefaultTableModel;
    Integer courseId = 0;

    private void getAllCoursesIntoTable() {
        courseDefaultTableModel = new DefaultTableModel(columns, 0);

        try {
            List<Course> courses = courseDbManager.getAllCourses();
            for (Course course : courses) {
                Object row[] = {course.getCourseId(), course.getCourseName(), course.getCourseCode()};
                courseDefaultTableModel.addRow(row);
                courseTable.setModel(courseDefaultTableModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void clearFields() {
        idTextLabel.setText("");
        nameTextLabel.setText("");
        codeTextLabel.setText("");
    }

    private Course getCourse() {
        int id = Integer.parseInt(idTextLabel.getText().toString());
        String name = nameTextLabel.getText().toString();
        String code = codeTextLabel.getText().toString();

        Course course = new Course();
        course.setCourseId(id);
        course.setCourseName(name);
        course.setCourseCode(code);

        return course;
    }

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void nameTextLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextLabelActionPerformed

    private void idTextLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextLabelActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        
        try {
            boolean success = courseDbManager.deleteCourse(courseId);
            if (success) {
                JOptionPane.showMessageDialog(this, "Department Deleted Successfully...");
                getAllCoursesIntoTable();
                clearFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            // TODO add your handling code here:
            boolean success = courseDbManager.addCourse(getCourse());
            if (success) {
                JOptionPane.showMessageDialog(this, "Course Added Successfully...");
                getAllCoursesIntoTable();
                clearFields();

            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Course course = this.getCourse();
        course.setCourseId(courseId);
        try {
            boolean success = courseDbManager.updateCourse(course);
            if (success) {
                JOptionPane.showMessageDialog(this, "Course Updated Successfully...");
                getAllCoursesIntoTable();
                clearFields();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_updateButtonActionPerformed

    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseTableMouseClicked
        // TODO add your handling code here:
        courseId = Integer.parseInt(courseTable.getValueAt(courseTable.getSelectedRow(), 0).toString());
        try {
            Course course = courseDbManager.getCourseById(courseId);
            idTextLabel.setText(String.valueOf(course.getCourseId()));
            nameTextLabel.setText(String.valueOf(course.getCourseName()));
            codeTextLabel.setText(String.valueOf(course.getCourseCode()));

        } catch (SQLException ex) {
            Logger.getLogger(CourseFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_courseTableMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setVisible(true);
        
    }//GEN-LAST:event_homeButtonActionPerformed

    private void codeTextLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTextLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTextLabelActionPerformed

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
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JTextField codeTextLabel;
    private javax.swing.JLabel courseCrudLabel;
    private javax.swing.JTable courseTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
