/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hamma
 */
//Start of User Cass


public class AdvancedUser extends javax.swing.JFrame {
Connection c;
PreparedStatement ps;
ResultSet rs;
    /**
     * Creates new form AdvancedUser
     */
    public AdvancedUser() {
        c=DatabaseConnection.databaseconnection();
        
       
        initComponents();
        setTable("SELECT * FROM ISSUE");
    }
   //getList method to return a filled ArrayList of User type 
   public ArrayList<User> getList(String s)
   {
   try{
       ArrayList<User> list=new ArrayList();
       
   ps=c.prepareStatement(s);
   rs=ps.executeQuery();
   while(rs.next())
   {
   User user=new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13));
   list.add(user);
   
   }
   rs.close();
   ps.close();
   
   
   return list;
   }
   catch(Exception e){JOptionPane.showMessageDialog(null, "Error 1"+e);}
   return null;
   
   }
   
   
    //end of getList method
    
    
    
    public void setTable(String sss)
    {
        
        
        
    ArrayList<User> list=getList(sss);
   
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    
    Object[] row=new Object[14];
    for(int i=0;i<list.size();i++)
    {
    row[0]=list.get(i).getID();
    row[1]=list.get(i).getBookID();
    row[2]=list.get(i).getName();
    row[3]=list.get(i).getEdition();
    row[4]=list.get(i).getPublisher();
    row[5]=list.get(i).getPrice();
    row[6]=list.get(i).getPages();
    row[7]=list.get(i).getStudentID();
    row[8]=list.get(i).getSName();
    row[9]=list.get(i).getRollNo();
    row[10]=list.get(i).getSemester();
    row[11]=list.get(i).getCourse();
    row[12]=list.get(i).getDateofIssue();
    
    model.addRow(row);
    
    }
    
    }
   
    
    public void setTable1(String sss)
    {
        
        
        
    ArrayList<User> list=getList(sss);
   
    DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
    
    Object[] row=new Object[14];
    for(int i=0;i<list.size();i++)
    {
    row[0]=list.get(i).getID();
    row[1]=list.get(i).getBookID();
    row[2]=list.get(i).getName();
    row[3]=list.get(i).getEdition();
    row[4]=list.get(i).getPublisher();
    row[5]=list.get(i).getPrice();
    row[6]=list.get(i).getPages();
    row[7]=list.get(i).getStudentID();
    row[8]=list.get(i).getSName();
    row[9]=list.get(i).getRollNo();
    row[10]=list.get(i).getSemester();
    row[11]=list.get(i).getCourse();
    row[12]=list.get(i).getDateofIssue();
    
    model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BookID", "Name", "Edition", "Publisher", "Price", "Pages", "StudentID", "SName", "RollNo", "Semester", "Course", "Title 13"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 1259, 339));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hamma\\Desktop\\PNGsss\\notebook.png")); // NOI18N
        jLabel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel1MouseWheelMoved(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 140));

        jLabel2.setFont(new java.awt.Font("Terminator Two", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("ADVANCED USER SEARCH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 56, 780, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Search similar to Name");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1081, 545, 188, 60));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 540, 343, 70));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "BookID", "Name", "Edition", "Publisher", "Price", "Pages", "StudentID", "SName", "RollNo", "Semester", "Course", "Title 13"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 1259, 221));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hamma\\Downloads\\1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 940));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 543, 343, 70));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 543, 343, 70));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 543, 343, 70));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        jTextField5.setText("jTextField5");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 532, 370, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s=jTextField1.getText();
        
        setTable1("Select DISTINCT * from issue where SName Like '"+s+"%' ");
    
    
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel1MouseWheelMoved
        // TODO add your handling code here:
        setVisible(false);
        Welcome wel=new Welcome();
        wel.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseWheelMoved

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
            java.util.logging.Logger.getLogger(AdvancedUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvancedUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
