



 /**
  *
  * @author HP
  */

 
 import javax.swing.JOptionPane;
 
 import javax.swing.JOptionPane;
 
 /**
  *
  * @author HP
  */
 public class CurrencyConverter extends javax.swing.JFrame {
 
     
     public CurrencyConverter() {
         initComponents();
     }

     @SuppressWarnings("unchecked")
                            
     private void initComponents() {
 
         jPanel1 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         txtAmount = new javax.swing.JTextField();
         txtFrom = new javax.swing.JComboBox<>();
         txtTo = new javax.swing.JComboBox<>();
         jButton1 = new javax.swing.JButton();
         jButton2 = new javax.swing.JButton();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
         jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
         jPanel1.setForeground(new java.awt.Color(204, 204, 204));
 
         jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
         jLabel1.setText("Enter the Amount: ");
 
         jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
         jLabel2.setText("From");
 
         jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
         jLabel3.setText("To");
 
         txtAmount.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 txtAmountActionPerformed(evt);
             }
         });
 
         txtFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD" }));
         txtFrom.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 txtFromActionPerformed(evt);
             }
         });
 
         txtTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BD Money", "Indian Rupees" }));
 
         jButton1.setBackground(new java.awt.Color(255, 153, 153));
         jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
         jButton1.setText("Convert");
         jButton1.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jButton1ActionPerformed(evt);
             }
         });
 
         jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
         jButton2.setText("Currency Converter");
 
         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(23, 23, 23)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                         .addGap(57, 57, 57)
                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                             .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(txtTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                             .addComponent(txtAmount)
                             .addComponent(txtFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                         .addGap(114, 114, 114)
                         .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                 .addContainerGap(99, Short.MAX_VALUE))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(18, 18, 18)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(37, 37, 37)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(50, 50, 50)
                 .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                 .addGap(27, 27, 27)
                 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(60, Short.MAX_VALUE))
         );
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addContainerGap())
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addContainerGap())
         );
 
         pack();
         setLocationRelativeTo(null);
     }// </editor-fold>                        
 
     private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {                                          
         
     }                                         
 
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         
         Double Convert;
         Double amount = Double.parseDouble(txtAmount.getText());
         if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString() == "BD Money"){
             Convert = amount * 85.23;
             JOptionPane.showMessageDialog(this,"The Amount is: "+Convert.toString());
         }
         else if(txtFrom.getSelectedItem().toString()=="USD" && txtTo.getSelectedItem().toString() == "Indian Rupees"){
             Convert = amount * 73.64;
             JOptionPane.showMessageDialog(this,"The Amount is: "+ Convert.toString());
         }
     }                                        
 
     private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
     }                                       
 
     /**
      * @HP args the command line arguments
      */
     public static void main(String args[]) {
        
         try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
       
 
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new CurrencyConverter().setVisible(true);
             }
         });
     }
 
                     
     private javax.swing.JButton jButton1;
     private javax.swing.JButton jButton2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JTextField txtAmount;
     private javax.swing.JComboBox<String> txtFrom;
     private javax.swing.JComboBox<String> txtTo;
     // End of variables declaration                   
 }
 
