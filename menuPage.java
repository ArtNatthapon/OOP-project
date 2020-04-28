package testdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class menuPage extends javax.swing.JFrame {

    public menuPage() {
        initComponents();
        
       
    }
    public menuPage(int x,String name){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Car = new javax.swing.ButtonGroup();
        period = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        honda = new javax.swing.JRadioButton();
        mazda = new javax.swing.JRadioButton();
        bmw = new javax.swing.JRadioButton();
        toyota = new javax.swing.JRadioButton();
        jButtonRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonRegister1 = new javax.swing.JButton();
        five = new javax.swing.JRadioButton();
        one1 = new javax.swing.JRadioButton();
        three1 = new javax.swing.JRadioButton();
        seven = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT CAR AND PERIOD");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(796, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(236, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelClose))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        Car.add(honda);
        honda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        honda.setForeground(new java.awt.Color(255, 255, 255));
        honda.setText("HONDA CIVIC");

        Car.add(mazda);
        mazda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mazda.setForeground(new java.awt.Color(255, 255, 255));
        mazda.setText("MAZDA 3");

        Car.add(bmw);
        bmw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bmw.setForeground(new java.awt.Color(255, 255, 255));
        bmw.setText("BMW SERIES 5");

        Car.add(toyota);
        toyota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toyota.setForeground(new java.awt.Color(255, 255, 255));
        toyota.setText("TOYOTA CAMRY");
        toyota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toyotaActionPerformed(evt);
            }
        });

        jButtonRegister.setBackground(new java.awt.Color(34, 167, 240));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setText("BACK");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nsr1999\\Desktop\\OOP\\download-free-png-2018-toyota-camry-auto-l-openroad-auto-group-2018-toyota-camry-png-660_495.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\nsr1999\\Desktop\\OOP\\unnamed.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\nsr1999\\Desktop\\OOP\\BMW-5-Series-Sedan_ModelCard.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\nsr1999\\Desktop\\OOP\\mazda_PNG95.png")); // NOI18N

        jButtonRegister1.setBackground(new java.awt.Color(34, 167, 240));
        jButtonRegister1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegister1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegister1.setText("OK");
        jButtonRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegister1ActionPerformed(evt);
            }
        });

        period.add(five);
        five.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("FIVE DAYS");

        period.add(one1);
        one1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        one1.setForeground(new java.awt.Color(255, 255, 255));
        one1.setText("ONE DAY");

        period.add(three1);
        three1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        three1.setForeground(new java.awt.Color(255, 255, 255));
        three1.setText("THREE DAYS");

        period.add(seven);
        seven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("SEVEN DAYS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(62, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(toyota)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(honda)
                                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(one1)
                                .addGap(63, 63, 63)
                                .addComponent(three1)
                                .addGap(116, 116, 116)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bmw)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mazda)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(five)
                                .addGap(54, 54, 54)
                                .addComponent(seven)))))
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmw)
                    .addComponent(toyota))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(honda)
                    .addComponent(mazda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one1)
                    .addComponent(three1)
                    .addComponent(five)
                    .addComponent(seven))
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
       
        System.exit(0);
        
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        howtoPage htw = new howtoPage();
        htw.setVisible(true);
        htw.pack();
        htw.setLocationRelativeTo(null);
        htw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void toyotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toyotaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_toyotaActionPerformed

    private void jButtonRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegister1ActionPerformed
        // TODO add your handling code here:
        String carname = null;
        int period = 0;
        int billAmount = 0;
 
        if(toyota.isSelected()){
            billAmount += 2000;
            carname = "Toyota";
        }
        else if(honda.isSelected()){
            billAmount += 1900;
            carname = "Honda";
        }
        else if(mazda.isSelected()){
            billAmount += 1700;
            carname = "Mazda";
       }
       else if(bmw.isSelected()){
            billAmount += 8000;
            carname = "BMW Series5";
        }
        if(one1.isSelected()){
            billAmount += 1200;
            period = 1;
        }
        else if(three1.isSelected()){
            billAmount += 4000;
            period = 3;
        }
        else if(five.isSelected()){
            billAmount += 6000;
            period = 5; 
        }
        else if(seven.isSelected()){
            billAmount += 8000;
            period = 7;
        }
        System.out.println(billAmount);
        System.out.println(carname);       
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","")) {
                String sql = "insert into confirm (carName,Period,Totalprice) values (?,?,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, carname);
                pstmt.setInt(2, period);
                pstmt.setInt(3, billAmount);
                    
       
                pstmt.executeUpdate();   
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null, "Your rent a car: "+carname+"\nTotal price: "+billAmount+"\nPeriod: "+period+" "+"Days"+"\nThe system will pay via your credit card!!");
        confirmPage cfm = new confirmPage();
        cfm.setVisible(true);
        cfm.pack();
        cfm.setLocationRelativeTo(null);
        cfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        this.dispose();
    }//GEN-LAST:event_jButtonRegister1ActionPerformed
    
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Car;
    private javax.swing.JRadioButton bmw;
    private javax.swing.JRadioButton five;
    private javax.swing.JRadioButton honda;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonRegister1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton mazda;
    private javax.swing.JRadioButton one1;
    private javax.swing.ButtonGroup period;
    private javax.swing.JRadioButton seven;
    private javax.swing.JRadioButton three1;
    private javax.swing.JRadioButton toyota;
    // End of variables declaration//GEN-END:variables
}
