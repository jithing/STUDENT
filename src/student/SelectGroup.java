/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dummy
 */
public class SelectGroup extends javax.swing.JFrame {

    /**
     * Creates new form SelectGroup
     */
    public SelectGroup() {
        initComponents();
         ImageIcon X = new ImageIcon (AdminPanel.class.getResource("images/pec.jpg"));
        pec.setIcon(X);
        ImageIcon Y = new ImageIcon (AdminPanel.class.getResource("images/au.png"));
        au.setIcon(Y);
         try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:"+datasource,"","");
        } 
           catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found");
        } catch (SQLException ex) {
            System.out.println("connection not established");
        }
    }
    
    public static String datasource;
    public Connection con;
    public Statement s;
    public String query;
    public ResultSet rs;
    
    public String semester="SEMALL", subject="ALL", section="ALL" ,arrearcount="NA";

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sem = new javax.swing.JComboBox();
        sec = new javax.swing.JComboBox();
        arr = new javax.swing.JComboBox();
        sub = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        au = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SEMESTER");

        jLabel2.setText("SECTION");

        jLabel3.setText("ARREAR");

        jLabel4.setText("SUBJECT");

        sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "1", "2", "3", "4", "5", "6", "7", "8" }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });

        sec.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL", "A", "B", "C", "D", "E", "F", "G" }));
        sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secActionPerformed(evt);
            }
        });

        arr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NA", "0", "1", "2", "3", ">=3" }));
        arr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrActionPerformed(evt);
            }
        });

        sub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ALL" }));
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        jButton1.setText("GET RESULTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("PANIMALAR ENGINEERING COLLEGE");

        au.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        au.setMaximumSize(new java.awt.Dimension(64, 64));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("RESULT MAINTAINENCE PORTAL");

        pec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pec.setMaximumSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pec, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sec, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(arr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(au, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pec, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(arr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public String CurrentSem , a ="ALL";
    
    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
       sub.setEnabled(true);
        a = (String)sem.getSelectedItem();
        if( "ALL".equals(a)){
            sub.setEnabled(false);
            subject = "ALL";
            CurrentSem = "SEM"+JOptionPane.showInputDialog("ENTER CURRENT SEMESTER");  
            System.out.println(CurrentSem);
            semester = "SEMALL";
        }
        else{
        semester = "SEM"+a;
        sub.removeAllItems();
        sub.addItem("ALL");
        try {
            s = con.createStatement();
            query = " select SUBJECT from SUBJECT where SEMESTER = "+a;
            s.execute(query);
            rs = s.getResultSet();
            while(rs.next())
                sub.addItem( rs.getString("SUBJECT"));
        a = null;
    }//GEN-LAST:event_semActionPerformed
    catch( SQLException e)
    { e.printStackTrace(); }   
    }
    }
    private void secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secActionPerformed
        
        section = (String)sec.getSelectedItem();
    }//GEN-LAST:event_secActionPerformed

    private void arrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrActionPerformed
        arrearcount = (String)arr.getSelectedItem();
        if( ("0".equals(arrearcount) ) ||( "NA".equals(arrearcount)) || ("1".equals(arrearcount)) )
        { if( !semester.equals("SEMALL") )
            sub.setEnabled(true);
        }
        else{
            sub.setEnabled(false);
        }
         subject = "notselected";   
    }//GEN-LAST:event_arrActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        subject = (String)sub.getSelectedItem();
        if(! "ALL".equals(subject)){
        query = "SELECT CODE FROM SUBJECT WHERE SUBJECT = '"+subject+"'";
        try {
            s = con.createStatement();
        s.execute(query);
        rs = s.getResultSet();
        while( rs.next() )
            subject = rs.getString("CODE");
        }
        catch( SQLException e ){
            System.out.println(e);
        }
        } 
    }//GEN-LAST:event_subActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String arrearflag;
        
        //SELECTING SEMESTER
        if ( "SEMALL".equals(semester)){
            query = "SELECT * FROM "+CurrentSem;
            arrearflag = "TOTALARR";
        }
        else{
            query = "SELECT * FROM "+semester;
            arrearflag = "CURRENTARR";
        }
        
        //SELECTING SECTION
        if ("ALL".equals(section)) 
        {}
        else
            query += " WHERE SEC = '"+section+"'";
        
       //SELECTING ARREAR
        if("NA".equals(arrearcount)){}
        else if (">=3".equals(arrearcount)){
            if ("ALL".equals(section)){
                query += " WHERE "+arrearflag+" >=3 ";
            }
            else{
                query += " AND "+arrearflag+" >=3 ";
            }
        }
        else if ("1".equals(arrearcount)){}
        else {
            if (!"ALL".equals(section)){
                query += " AND "+arrearflag+" = "+arrearcount+"";
            }
            else{
                query += " WHERE "+arrearflag+" = "+arrearcount+"";
            }
        }
        
       
        
        
        if("ALL".equals(subject)){}
        else{
            if( ("ALL".equals(semester)) && ( "ALL".equals(section)) ){
                
                if ( "1".equals(arrearcount) )
                   query += " WHERE "+ subject + " = 'U'" ; 
                else if ( "0".equals(arrearcount))
                   query += " WHERE "+ subject + " != 'U'" ;  
            }
                
            else {
                if ( "1".equals(arrearcount) ){
                    if(  ( "ALL".equals(section)  ) )
                        query += " WHERE "+ subject + " = 'U'" ; 
                    else
                        query += " AND "+ subject + " = 'U'" ; 
                }
                if ( "0".equals(arrearcount)){
                    if(  ( "ALL".equals(section)  ) )
                        query += " WHERE "+ subject + " = 'U'" ; 
                    else
                        query += " AND "+ subject + " = 'U'" ; 
                }       
            }
        }
        System.out.println(query);
        sub.setEnabled(true);
        
        try {
            s = con.createStatement();
            s.execute(query);
            rs = s.getResultSet();
            
            String result,sno;
            
            if( !( (subject.equals("notselected")) || (subject.equals("all") ) ) )
                result = "<html> <body> <table border=\"1\" style=\"width:100%\"> <tr bgcolor = red > <td> SNO </td> <td> REGISTER NO </td> <td> ROLL NO </td> <td> NAME </td>  <td> GRADE </td>  <td> CGPA </td> </tr> "; 
            else
                result = "<html> <body> <table border=\"1\" style=\"width:100%\"> <tr bgcolor = red > <td> SNO </td> <td> REGISTER NO </td> <td> ROLL NO </td> <td> NAME </td> <td> ARREARS </td> <td> CGPA </td> </tr> "; 
            
            int count=0; String dd = null;
            
            while ( rs.next() ){
                count++;
                sno = "<tr> <td> "+ count + "</td>";
                String a = " <td> " + rs.getString("REGISTERNO") + "</td>";
                String b = " <td> " + rs.getString("ROLLNO") + "</td>";
                String c = " <td> " + rs.getString("NAME") + "</td>";
                dd = " <td> " + rs.getInt("TOTALARR") + "</td>" ;
                String d = null;
                if( !( (subject.equals("notselected")) || (subject.equals("all") ) ) )
                    { d = " <td> " + rs.getString(subject) + "</td>"; 
                      
                        }
                String x = rs.getString("CGPA");
                System.out.println(x);
                String e;
                if ( x != null )
                    e = " <td> " + String.format( "%.3f", Double.parseDouble(x)) + "</td></tr>";
                else
                    e = " <td> null </td></tr>";
                if( !( (subject.equals("notselected")) || (subject.equals("all") ) ) )
                    result  = result + sno + a + b + c + d  + e;
                else
                    result = result + sno+  a + b + c + dd + e;
            }
            
            DisplayResults d = new DisplayResults();
        this.setVisible(false);
        d.setVisible(true);
         d.results.setText(result);
         d.flag = 1;
        
        } 
        catch( SQLException e ){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        AdminPanel a = new AdminPanel();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox arr;
    private javax.swing.JLabel au;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel pec;
    private javax.swing.JComboBox sec;
    private javax.swing.JComboBox sem;
    private javax.swing.JComboBox sub;
    // End of variables declaration//GEN-END:variables
}
