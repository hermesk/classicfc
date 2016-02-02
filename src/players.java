
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class players extends javax.swing.JFrame {
      Connection conn = null;
      ResultSet rs = null;
      PreparedStatement pst = null;
      
    public players() {
         super("Manage Classic Fc Players");
        initComponents();
        conn = dbconnect.connecrDb();
         }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jerseyno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        txt_search = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delet = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign Player", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(102, 102, 0))); // NOI18N

        jLabel1.setText("Jersey No");

        jerseyno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jerseynoKeyTyped(evt);
            }
        });

        jLabel2.setText("First Name");

        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });

        jLabel3.setText("Other Name");

        sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snameKeyTyped(evt);
            }
        });

        jLabel4.setText("Position");

        position.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                positionKeyTyped(evt);
            }
        });

        jLabel5.setText("Nationality");

        jLabel6.setText("Age");

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        jLabel7.setText("Contract Expiry Date");

        save.setBackground(new java.awt.Color(153, 153, 153));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save-icon.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clear-icon.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jDateChooser1.setDateFormatString("yyyy-MM-dd\n");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jerseyno)
                            .addComponent(fname)
                            .addComponent(sname)
                            .addComponent(position)
                            .addComponent(age)
                            .addComponent(nationality, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jerseyno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(clear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_search.setToolTipText("Search");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delet.setBackground(new java.awt.Color(255, 255, 255));
        delet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete-1-icon.png"))); // NOI18N
        delet.setText("Delete");
        delet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletActionPerformed(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button-Close-icon.png"))); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(update)
            .addComponent(delet)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(31, 31, 31)
                .addComponent(update)
                .addGap(40, 40, 40)
                .addComponent(delet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(528, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "insert into players(Jersey_No,First_Name,Other_Name,Position,Nationality,Age,Contract )"
            + " values (?,?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, jerseyno.getText());
            pst.setString(2, fname.getText());
            pst.setString(3, sname.getText());
            pst.setString(4, position.getText());
            pst.setString(5, nationality.getText());
            pst.setString(6, age.getText());
            pst.setString(7, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.execute();
            //conn.close();
            JOptionPane.showMessageDialog(null, "Saved Successfully");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{

            String sql = "UPDATE Players SET Jersey_No =?, First_Name = ?,Other_Name= ?,Position= ?,"
            + "Nationality= ?,age= ?, Contract = ? WHERE Jersey_No =?";
            pst = conn.prepareStatement(sql);

            pst.setString( 1, jerseyno.getText() );
            pst.setString( 2, fname.getText() );
            pst.setString( 3, sname.getText() );
            pst.setString( 4, position.getText() );
            pst.setString( 5, nationality.getText() );
            pst.setString( 6, age.getText() );
            pst.setString(7, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
            pst.setString(8, jerseyno.getText() );
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Successfully Updated");
            
                 }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "select *from players where Jersey_No=?  ";

            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs=pst.executeQuery();

            if(rs.next()){
                String add1 = rs.getString("Jersey_No");
                jerseyno.setText(add1);
                String add2 = rs.getString("First_Name");
                fname.setText(add2);
                String add3 = rs.getString("Other_Name");
                sname.setText(add3);
                String add4 = rs.getString("position");
                position.setText(add4);
                String add5 = rs.getString("nationality");
                nationality.setText(add5);
                String add6 = rs.getString("age");
                age.setText(add6);
                Date add7 = rs.getDate("Contract");
                jDateChooser1.setDate(add7);

                 new SimpleDateFormat("yyyy-MM-dd");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        try{
            String sql = "select *from players where First_Name=?  ";

            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs=pst.executeQuery();

            if(rs.next()){
                String add1 = rs.getString("Jersey_No");
                jerseyno.setText(add1);
                String add2 = rs.getString("First_Name");
                fname.setText(add2);
                String add3 = rs.getString("Other_Name");
                sname.setText(add3);
                String add4 = rs.getString("position");
                position.setText(add4);
                String add5 = rs.getString("nationality");
                nationality.setText(add5);
                String add6 = rs.getString("age");
                age.setText(add6);
                Date add7 = rs.getDate("Contract");
                jDateChooser1.setDate(add7);
 
               // jDateChooser1.setDate(rs.getDate(7));
            }

        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        try{
            String sql = "select *from players where Other_Name=?  ";

            pst=conn.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs=pst.executeQuery();

            if(rs.next()){
                String add1 = rs.getString("Jersey_No");
                jerseyno.setText(add1);
                String add2 = rs.getString("First_Name");
                fname.setText(add2);
                String add3 = rs.getString("Other_Name");
                sname.setText(add3);
                String add4 = rs.getString("position");
                position.setText(add4);
                String add5 = rs.getString("nationality");
                nationality.setText(add5);
                String add6 = rs.getString("age");
                age.setText(add6);
                Date add7 = rs.getDate("Contract");
                jDateChooser1.setDate(add7);
 
                //jDateChooser1.setDate(rs.getDate(7));
            }
           }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_searchActionPerformed

    private void jerseynoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jerseynoKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_jerseynoKeyTyped

    private void positionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_positionKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if((Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_positionKeyTyped

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if((Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_fnameKeyTyped

    private void snameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if((Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_snameKeyTyped

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_ageKeyTyped

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        position.setText("");
        jerseyno.setText("");
        fname.setText("");
        sname.setText("");
        nationality.setText("");
        age.setText("");
        txt_search.setText("");
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");

    }//GEN-LAST:event_clearActionPerformed

    private void deletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletActionPerformed
        // TODO add your handling code here:
        int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
         
        if(d==0){
        String sql = "delete from players where Jersey_No=?";
        
          try {
              pst=conn.prepareStatement(sql);
              pst.setString(1, jerseyno.getText());
              
              pst.execute();
                    JOptionPane.showMessageDialog(null, "deleted");

          } catch (SQLException e) {
                   JOptionPane.showMessageDialog(null, e);

          }}
    }//GEN-LAST:event_deletActionPerformed

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
            java.util.logging.Logger.getLogger(players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(players.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new players().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JButton clear;
    private javax.swing.JButton delet;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fname;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jerseyno;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField position;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField txt_search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
