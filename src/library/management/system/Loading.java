/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import javax.swing.JOptionPane;

/**
 *
 * @author hamma
 */
public class Loading extends javax.swing.JFrame implements Runnable{
int s=0;

    /**
     * Creates new form Loading
     */
    public Loading() {
        super("Loading");
       initComponents();
        Thread t=new Thread((Runnable)this);
    t.start();
     }
    
   
    public void run()
    {
    try
    {
        int x=jProgressBar1.getMaximum();

        for(int i=0;i<=100;i++)
    {
    
    
    int v=jProgressBar1.getValue();
    if(v<x)
    {
    jProgressBar1.setValue(jProgressBar1.getValue()+1);
     Thread.sleep(10);
    }
    else
    {
    
    setVisible(false);
    Welcome w=new Welcome();
    w.setVisible(true);
    
    }
   
    }
    }
    catch(Exception e)
            {JOptionPane.showMessageDialog(null,"Error in Loading");}
    
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
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hamma\\Desktop\\PNGsss\\f.png")); // NOI18N
        jLabel1.setText("#Hammad Library Management Syetem 1.2");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(79, 28, 465, 54);

        jProgressBar1.setStringPainted(true);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(111, 233, 400, 27);

        jLabel2.setText("Please Wait A Moment.....");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(242, 291, 149, 16);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(267, 404, 25, 12);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hamma\\Desktop\\PNGsss\\loadingit.gif")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 90, 500, 320);

        setSize(new java.awt.Dimension(662, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
