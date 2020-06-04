

public class adminpage extends javax.swing.JFrame {
String user;
   
    public adminpage(String user) {
        this.user=user;
        
        initComponents();
        lb1.setText(user);
        setSize(500,500);
        setLocation(100,100);
        setTitle("Admin Page");
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bt1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gupta's\\Documents\\NetBeansProjects\\cabbooking 2\\cabbooking 2\\src\\photos\\cp.png")); // NOI18N
        bt1.setText("Change Password");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(100, 80, 200, 40);

        bt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt2.setIcon(new javax.swing.ImageIcon("C:\\Users\\gupta's\\Documents\\NetBeansProjects\\cabbooking 2\\cabbooking 2\\src\\photos\\add.png")); // NOI18N
        bt2.setText("Add Cars");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(100, 220, 200, 40);

        bt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt3.setIcon(new javax.swing.ImageIcon("C:\\Users\\gupta's\\Documents\\NetBeansProjects\\cabbooking 2\\cabbooking 2\\src\\photos\\manage.png")); // NOI18N
        bt3.setText("Manage Cars");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(100, 150, 200, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("WELCOME :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 100, 30);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(lb1);
        lb1.setBounds(190, 10, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       changepassword obj=new changepassword(user);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        addcars obj1=new addcars();
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
      
        managecars obj2=new managecars();
        
    }//GEN-LAST:event_bt3ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    // End of variables declaration//GEN-END:variables






}
