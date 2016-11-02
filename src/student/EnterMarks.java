/**
 * @Project RESULT MAINTENANCE PORTAL 
 * @module  INSERT MARKS
 * @author  JITHIN GANGADHARAN
 * @version 1.0.0.0
 */

package student;

import java.awt.Color;
import static java.lang.Double.isNaN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class EnterMarks extends javax.swing.JFrame {

    public Connection con;
    public Statement s;
    public ResultSet rs;
    public String m1,m2,m3,m4,m5,m6,m7,m8,m9;
    public int g1,g2,g3,g4,g5,g6,g7,g8,g9;
    public int gc1,gc2,gc3,gc4,gc5,gc6,gc7,gc8,gc9,cre,total = 0,arr=0,totalarr=0;
    double gpa =0, cgpa =0;
    public String registerno;
    public static String datasource;
    
    public static int GradePoint ( String a ){
        if (a.equals("S")) return 10;
        if (a.equals("A")) return 9;
        if (a.equals("B")) return 8;
        if (a.equals("C")) return 7;
        if (a.equals("D")) return 6;
        if (a.equals("E")) return 5;
        else return 0; 
    }
    
    public static int validate ( String b ){
        if( (b.equals("S")) || (b.equals("A")) || (b.equals("B")) || (b.equals("C")) || (b.equals("D")) || (b.equals("E")) || (b.equals("U")) )
            return 1;
        else
            return 0;
    }
    
    public EnterMarks() {
        initComponents();
         ImageIcon X = new ImageIcon (AdminPanel.class.getResource("images/pec.jpg"));
        pec.setIcon(X);
        ImageIcon Y = new ImageIcon (AdminPanel.class.getResource("images/au.png"));
        au.setIcon(Y);
        copyright.setText("\u00A9 Jithin");
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:"+datasource,"","");
            //JScrollPane scroller = new JScrollPane(details, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        } 
           catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found");
        } catch (SQLException ex) {
            System.out.println("connection not established");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        regno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        mark1 = new javax.swing.JTextField();
        mark2 = new javax.swing.JTextField();
        mark3 = new javax.swing.JTextField();
        mark4 = new javax.swing.JTextField();
        mark5 = new javax.swing.JTextField();
        mark6 = new javax.swing.JTextField();
        mark7 = new javax.swing.JTextField();
        mark8 = new javax.swing.JTextField();
        mark9 = new javax.swing.JTextField();
        sem = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        au = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pec = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("REGISTER NO");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NAME");

        s1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s1.setText("SUBJECT 1");

        s2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s2.setText("SUBJECT 2");

        s3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s3.setText("SUBJECT 3");

        s4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s4.setText("SUBJECT 4");

        s5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s5.setText("SUBJECT 5");

        s6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s6.setText("SUBJECT 6");

        s7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s7.setText("SUBJECT 7");

        s8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s8.setText("SUBJECT 8");

        s9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        s9.setText("SUBJECT 9");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("SEMESTER");

        jButton1.setText("UPDATE");
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

        regno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        regno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regnoFocusLost(evt);
            }
        });

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark2.setColumns(54);
        mark2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mark9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        sem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("PANIMALAR ENGINEERING COLLEGE");

        au.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        au.setMaximumSize(new java.awt.Dimension(64, 64));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("RESULT MAINTAINENCE PORTAL");

        pec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pec.setMaximumSize(new java.awt.Dimension(64, 64));

        copyright.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        copyright.setText("Jithin");
        copyright.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pec, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(s9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mark9)
                                    .addComponent(mark8)
                                    .addComponent(mark7)
                                    .addComponent(mark6)
                                    .addComponent(mark5)
                                    .addComponent(mark4)
                                    .addComponent(mark3)
                                    .addComponent(mark2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(mark1)
                                    .addComponent(name)
                                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(copyright)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(au, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1)
                    .addComponent(mark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2)
                    .addComponent(mark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s3)
                    .addComponent(mark3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s4)
                    .addComponent(mark4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s5)
                    .addComponent(mark5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s6)
                    .addComponent(mark6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s7)
                    .addComponent(mark7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s8)
                    .addComponent(mark8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s9)
                    .addComponent(mark9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(19, 19, 19)
                .addComponent(copyright))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        AdminPanel a = new AdminPanel();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void regnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regnoFocusLost
        try{
        registerno = regno.getText();
        
        String query = "select name from SEM1 where REGISTERNO = '" + registerno +"'" ;
        s = con.createStatement();
        s.execute(query);
        rs = s.getResultSet();
       
        if (rs.next()){
            Border border = BorderFactory.createLineBorder(new Color(0,200,0), 2);
            regno.setBorder(border);
            name.setText( rs.getString("name") );
        }
        else {
            JOptionPane.showMessageDialog(null, "REGISTER NO NOT FOUND");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            regno.setBorder(border);
            regno.requestFocus();
        }}
        
        catch(SQLException e){ System.out.println(e);}
    }//GEN-LAST:event_regnoFocusLost

    public String semester;
    public String colnames;
    public String colvalues;
    public String query;
    
    private void semActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semActionPerformed
        semester = (String) sem.getSelectedItem();
        
        s1.setEnabled(true); mark1.setEnabled(true);
        s2.setEnabled(true); mark2.setEnabled(true);
        s3.setEnabled(true); mark3.setEnabled(true);
        s4.setEnabled(true); mark4.setEnabled(true);
        s5.setEnabled(true); mark5.setEnabled(true);
        s6.setEnabled(true); mark6.setEnabled(true);
        s7.setEnabled(true); mark7.setEnabled(true);
        s8.setEnabled(true); mark8.setEnabled(true);
        s9.setEnabled(true); mark9.setEnabled(true);
        
        if(semester.equals("1")){
            s1.setText("TECH ENG I"); s2.setText("MATHEMATICS I"); s3.setText("ENGG PHY I"); s4.setText("ENGG CHEM I");
            s5.setText("COMP PROG"); s6.setText("ENGG GRAPHICS"); s7.setText("ENGG PRACTICES LAB"); s8.setText("COMP PROG LAB");
            s9.setText("PHY CHEM LAB");s9.setEnabled(true); mark9.setEnabled(true);
            colnames = "HS6151,MA6151,PH6151,CY6151,GE6151,GE6152,GE6161,GE6162,GE6163";
        }
        
        if(semester.equals("2")){
            s1.setText("TECH ENG II"); s2.setText("MATHEMATICS II"); s3.setText("ENGG PHY II"); s4.setText("ENGG CHEM II");
            s5.setText("DPSD"); s6.setText("PDS I"); s7.setText("PHY CHEM LAB"); s8.setText("DPSD LAB");
            s9.setText("PDS I LAB");s9.setEnabled(true); mark9.setEnabled(true);
            colnames = "HS6251,MA6251,PH6251,CY6251,CS6201,CS6202,GE6262,CS6211,CS6212";
        }
        
        if(semester.equals("3")){
            s1.setText("TPDE"); s2.setText("PDS II"); s3.setText("DBMS"); s4.setText("CA");
            s5.setText("ADC"); s6.setText("EVS"); s7.setText("PDS II LAB"); s8.setText("DBMS LAB");
            s9.setText("SUBJECT 9"); s9.setEnabled(false); mark9.setEnabled(false);
            colnames = "MA6351,CS6301,CS6302,CS6303,CS6304,GE6351,CS6311,CS6312";
        }
        
        if(semester.equals("4")){
            s1.setText("PQT"); s2.setText("CN"); s3.setText("OS"); s4.setText("DAA");
            s5.setText("SE"); s6.setText("MP"); s7.setText("CN LAB"); s8.setText("MP LAB");
            s9.setText("OS LAB"); s9.setEnabled(true); mark9.setEnabled(true);
            colnames = "MA6453,CS6551,CS6401,CS6402,CS6403,EC6504,CS6411,CS6412,CS6413";
        }
        
        if(semester.equals("5")){
            s1.setText("DM"); s2.setText("IP"); s3.setText("OOAD"); s4.setText("TOC");
            s5.setText("CG"); s6.setText("CASE TOOLS LAB"); s7.setText("IP LAB"); s8.setText("CG LAB");
            s9.setText("SUBJECT 9"); s9.setEnabled(false); mark9.setEnabled(false);
            colnames = "MA6566,CS6501,CS6502,CS6503,CS6504,CS6511,CS6512,CS6513";
        }
        
        if(semester.equals("6")){
            s1.setText("DS"); s2.setText("MC"); s3.setText("CD"); s4.setText("DSP");
            s5.setText("AI"); s6.setText("C# and .NET / ST"); s7.setText("MAD LAB"); s8.setText("COMPILER LAB");
            s9.setText("COMM LAB");s9.setEnabled(true); mark9.setEnabled(true);
        }
        
        if(semester.equals("7")){
            s1.setText("CNS"); s2.setText("GTA"); s3.setText("GCC"); s4.setText("RMT");
            s5.setText("SOA"); s6.setText("IR"); s7.setText("SECURITY LAB"); s8.setText("GCC LAB");
            s9.setText("SUBJECT 9");s9.setEnabled(false); mark9.setEnabled(false);
        }
        
        if(semester.equals("8")){
            s1.setText("MCA AND PROG"); s2.setText("ELECTIVE 4"); s3.setText("ELECTIVE 5"); s4.setText("PROJECT WORK");
            s5.setText("SUBJECT 5"); s6.setText("SUBJECT 6"); s7.setText("SUBJECT 7"); s8.setText("SUBJECT 8");
            s9.setText("SUBJECT 9"); s5.setEnabled(false); mark5.setEnabled(false); s6.setEnabled(false); mark6.setEnabled(false); s7.setEnabled(false); 
            mark7.setEnabled(false); s8.setEnabled(false); mark8.setEnabled(false);s9.setEnabled(false); mark9.setEnabled(false);
        }
        
        Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
        mark1.setBorder(border);    mark2.setBorder(border);    mark3.setBorder(border);
        mark4.setBorder(border);    mark5.setBorder(border);    mark6.setBorder(border);
        mark7.setBorder(border);    mark8.setBorder(border);    mark9.setBorder(border);
    }//GEN-LAST:event_semActionPerformed

    public String gpaquery = null;
    public ResultSet qrs;
    public Double p1,p2,p3,p4,p5,p6,p7,q1,q2,q3,q4,q5,q6,q7;
    public int a1,a2,a3,a4,a5,a6,a7;
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int m1f=0,m2f=0,m3f=0,m4f=0,m5f=0,m6f=0,m7f=0,m8f=0,m9f=0;
        
        try {
            
        // VALIDATION OF MARK 1
        if( mark1.isEnabled()){
        if ( validate((mark1.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark1.setBorder(border);
            m1f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark1.setBorder(border);
            m1f=1;
        }}
        
        //VALIDATION OF MARK 2
        if( mark2.isEnabled()){
        if ( validate((mark2.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark2.setBorder(border);
            m2f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark2.setBorder(border);
            m2f=1;
        }}
        
        //VALIDATION OF MARK 3
         if( mark3.isEnabled()){
        if ( validate((mark3.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark3.setBorder(border);
            m3f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark3.setBorder(border);
            m3f=1;
        }}
        
        //VALIDATION OF MARK 4
          if( mark4.isEnabled()){
        if ( validate((mark4.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark4.setBorder(border);
            m4f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark4.setBorder(border);
            m4f=1;
        }}
        
        //VALIDATION OF MARK 5
           if( mark5.isEnabled()){
        if ( validate((mark5.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark5.setBorder(border);
            m5f=0;
            
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark5.setBorder(border);
            m5f=1;
        }}
        
        //VALIDATION OF MARK 6
          if( mark6.isEnabled()){
        if ( validate((mark6.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark6.setBorder(border);
            m6f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark6.setBorder(border);
            m6f=1;
        }}
        
        //VALIDATION OF MARK 7
           if( mark7.isEnabled()){
        if ( validate((mark7.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark7.setBorder(border);
            m7f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark7.setBorder(border);
            m7f=1;
        }}
        
        //VALIDATION OF MARK 8
            if( mark8.isEnabled()){
         if ( validate((mark8.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark8.setBorder(border);
            m8f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark8.setBorder(border);
            m8f=1;
        }}
        
         //VALIDATION OF MARK 9
             if( mark9.isEnabled()){
         if ( validate((mark9.getText()).trim()) == 1){
            Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
            mark9.setBorder(border);
            m9f=0;
        }
        else{
            JOptionPane.showMessageDialog(null, "ENTER VALID GRADE");
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            mark9.setBorder(border);
            m9f=1;
        }}
           
             if( (m1f==1) || (m2f==1) || (m3f==1) || (m4f==1) || (m5f==1) || (m6f==1) || (m7f==1) || (m8f==1) || (m9f==1) )
                 return;
             
            m1 = (mark1.getText()).trim(); g1 = GradePoint(m1);
            m2 = (mark2.getText()).trim(); g2 = GradePoint(m2);
            m3 = (mark3.getText()).trim(); g3 = GradePoint(m3);
            m4 = (mark4.getText()).trim(); g4 = GradePoint(m4);
            m5 = (mark5.getText()).trim(); g5 = GradePoint(m5);
            m6 = (mark6.getText()).trim(); g6 = GradePoint(m6);
            m7 = (mark7.getText()).trim(); g7 = GradePoint(m7);
            m8 = (mark8.getText()).trim(); g8 = GradePoint(m8);
            m9 = (mark9.getText()).trim(); g9 = GradePoint(m9);
            
            String table = "SEM"+semester;
            
            cre = 0; total=0; totalarr=0; arr=0;
            
            if( semester.equals("1")){

           // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 HS6151 TECHNICAL ENGLISH I CREDITS:4
                if(g1!=0){
                    gc1 = g1 * 4; cre += 4; 
                }
                else{
                    gc1 = g1 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 MA6151 MATHEMATICS I CREDITS:4
                 if(g2!=0){
                    gc2 = g2 * 4; cre += 4; 
                }
                else{
                    gc2 = g2 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 PH6151 ENGG PHYSICS I CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CY6151 ENGG CHEMISTRY I CREDITS:3
                if(g4!=0){
                    gc4 = g4 * 3; cre += 3; 
                }
                else{
                    gc4 = g4 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 GE6151 COMP PROG CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 GE6152 ENGG GRAPHICS CREDITS:3
                if(g6!=0){
                    gc6 = g6 * 4; cre += 4; 
                }
                else{
                    gc6 = g6 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 GE6161 ENGG PRACTICES LAB CREDITS:2
                   if(g7!=0){
                    gc7 = g7 * 2; cre += 2; 
                }
                else{
                    gc7 = g7 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 GE6162 COMP PROG LAB CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT9 GE6163 PHY CHEM LAB CREDITS:1
                if(g9!=0){
                    gc9 = g9 * 1; cre += 1; 
                }
                else{
                    gc9 = g9 * 1; arr++;
                }
            //CALCULATE GPA AND CGPA FOR SEM 1    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 + gc9 ;
                gpa = (total / (double)cre);
                
                if( isNaN(gpa)) gpa=0;
                
                cgpa = gpa;
                totalarr = arr;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
                        
                query = "UPDATE "+table+" SET HS6151 = '"+m1+"', MA6151 = '"+m2+"', PH6151 = '"+m3+"', CY6151 = '"+m4+ "', GE6151 = '"+m5+ "', GE6152 = '"+m6+ "', GE6161 = '"+m7+"', GE6162 = '"+m8+"', GE6163 = '"+m9+"', CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=26, GPA="+gpa+",CGPA="+cgpa+" WHERE REGISTERNO = '"+registerno + "'";
            }
            
            if( semester.equals("2")){
                

                // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 HS6251 TECHNICAL ENGLISH II CREDITS:4
                if(g1!=0){
                    gc1 = g1 * 4; cre += 4; 
                }
                else{
                    gc1 = g1 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 MA6251 MATHEMATICS II CREDITS:4
                 if(g2!=0){
                    gc2 = g2 * 4; cre += 4; 
                }
                else{
                    gc2 = g2 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 PH6251 ENGG PHYSICS II CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CY6251 ENGG CHEMISTRY II CREDITS:3
                if(g4!=0){
                    gc4 = g4 * 3; cre += 3; 
                }
                else{
                    gc4 = g4 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 CS6201 DPSD CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 CS6202 PDS I CREDITS:3
                if(g6!=0){
                    gc6 = g6 * 3; cre += 3; 
                }
                else{
                    gc6 = g6 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 GE6262 PHYSICS CHEM LAB CREDITS:1
                   if(g7!=0){
                    gc7 = g7 * 1; cre += 1; 
                }
                else{
                    gc7 = g7 * 1; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6211 DIGITAL LAB CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT9 CS6212 PDS LAB I CREDITS:2
                if(g9!=0){
                    gc9 = g9 * 2; cre += 2; 
                }
                else{
                    gc9 = g9 * 2; arr++;
                }
            //CALCULATE GPA AND CGPA FOR SEM 2    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 + gc9 ;
                gpa = (total / (double)cre);
                if( isNaN(gpa)) gpa=0;
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR");
                }
                
                System.out.println("\n\n GPA: "+p1);
                
                cgpa = ((p1*q1)+(gpa*cre)) / (double) (cre+q1);
                if ( isNaN (cgpa)) cgpa = 0;
                totalarr = arr + a1;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
                
                query = "UPDATE "+table+" SET HS6251 = '"+m1+"', MA6251 = '"+m2+"', PH6251 = '"+m3+"', CY6251 = '"+m4+ "', CS6201 = '"+m5+ "', CS6202 = '"+m6+ "', GE6262 = '"+m7+"', CS6211 = '"+m8+"', CS6212 = '"+m9 +"', CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=25, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";
            
                }
                
            
            if( semester.equals("3")){
                
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 HS6251 TECHNICAL ENGLISH II CREDITS:4
                if(g1!=0){
                    gc1 = g1 * 4; cre += 4; 
                }
                else{
                    gc1 = g1 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 MA6251 MATHEMATICS II CREDITS:4
                 if(g2!=0){
                    gc2 = g2 * 3; cre += 3; 
                }
                else{
                    gc2 = g2 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 PH6251 ENGG PHYSICS II CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CY6251 ENGG CHEMISTRY II CREDITS:3
                if(g4!=0){
                    gc4 = g4 * 3; cre += 3; 
                }
                else{
                    gc4 = g4 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 CS6201 DPSD CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 CS6202 PDS I CREDITS:3
                if(g6!=0){
                    gc6 = g6 * 3; cre += 3; 
                }
                else{
                    gc6 = g6 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 GE6262 PHYSICS CHEM LAB CREDITS:1
                   if(g7!=0){
                    gc7 = g7 * 2; cre += 2; 
                }
                else{
                    gc7 = g7 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6211 DIGITAL LAB CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
            
            //CALCULATE GPA AND CGPA FOR SEM 2    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 ;
                gpa = total / (double)cre;
                 if( isNaN(gpa)) gpa=0;
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR") ;  
                }
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM2 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p2 = qrs.getDouble("GPA"); q2 = qrs.getDouble("CREDITSEARNED"); a2 = qrs.getInt("TOTALARR") ;
                }
                
                cgpa = ((p1*q1) + (p2*q2) + (gpa*cre)) / (double) (cre+q1+q2);
                 if( isNaN(cgpa)) cgpa=0;
                totalarr = arr + a2;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
  
                query = "UPDATE "+table+" SET MA6351 = '"+m1+"', CS6301 = '"+m2+"', CS6302 = '"+m3+"', CS6303 = '"+m4+ "', CS6304 = '"+m5+ "', GE6351 = '"+m6+ "', CS6311 = '"+m7+"', CS6312 = '"+m8+"', CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=23, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";
            }
            
            if( semester.equals("4")){
                
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 MA6453 PQT CREDITS:4
                if(g1!=0){
                    gc1 = g1 * 4; cre += 4; 
                }
                else{
                    gc1 = g1 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 CS6551 COMPUTER NETWORKS CREDITS:3
                 if(g2!=0){
                    gc2 = g2 * 3; cre += 3; 
                }
                else{
                    gc2 = g2 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 CS6401 OPERATING SYSTEMS CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CS6402 DESIGN AND ANALYSIS OF ALGORITHMS CREDITS:3
                if(g4!=0){
                    gc4 = g4 * 3; cre += 3; 
                }
                else{
                    gc4 = g4 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 CS6403 SOFTWARE ENGG CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 EC6504 MP AND MC CREDITS:3
                if(g6!=0){
                    gc6 = g6 * 3; cre += 3; 
                }
                else{
                    gc6 = g6 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 CS6411 CN LAB CREDITS:2
                   if(g7!=0){
                    gc7 = g7 * 2; cre += 2; 
                }
                else{
                    gc7 = g7 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6412 MP AND MC LAB CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
             // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6413 OS LAB CREDITS:2
                if(g9!=0){
                    gc9 = g9 * 2; cre += 2; 
                }
                else{
                    gc9 = g9 * 2; arr++;
                }
            
            //CALCULATE GPA AND CGPA FOR SEM 4    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 + gc9 ;
                gpa = total / (double)cre;
                 if( isNaN(gpa)) gpa=0;
                
                //SEMESTER 1 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 2
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM2 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p2 = qrs.getDouble("GPA"); q2 = qrs.getDouble("CREDITSEARNED"); a2 = qrs.getInt("TOTALARR") ;
                }
                
                //SEMESTER 3
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM3 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p3 = qrs.getDouble("GPA"); q3 = qrs.getDouble("CREDITSEARNED"); a3 = qrs.getInt("TOTALARR") ;  
                }
                
                cgpa = ((p1*q1) + (p2*q2) + (p3*q3)+ (gpa*cre)) / (double) (cre+q1+q2+q3);
                 if( isNaN(cgpa)) cgpa=0;
                totalarr = arr + a3;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
  
             query = "UPDATE "+table+" SET MA6453 = '"+m1+"', CS6551 = '"+m2+"', CS6401 = '"+m3+"', CS6402 = '"+m4+ "', CS6403 = '"+m5+ "', EC6504 = '"+m6+ "', CS6411 = '"+m7+"', CS6412 = '"+m8+"', CS6413 = '"+m9+"' , CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=25, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";   
            
            }
                
            if( semester.equals("5")){
                
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 MA6566 DISCRETE MATHEMATICS CREDITS:4
                if(g1!=0){
                    gc1 = g1 * 4; cre += 4; 
                }
                else{
                    gc1 = g1 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 CS6501 INTERNET PROGRAMMING CREDITS:4
                 if(g2!=0){
                    gc2 = g2 * 4; cre += 4; 
                }
                else{
                    gc2 = g2 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 CS6502 OOAD CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CS6502 THEORY OF COMPUTATION CREDITS:3
                if(g4!=0){
                    gc4 = g4 * 3; cre += 3; 
                }
                else{
                    gc4 = g4 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 CS6504 COMPUTER GRAPHICS CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 CS6511 CASE TOOLS LAB CREDITS:2
                if(g6!=0){
                    gc6 = g6 * 2; cre += 2; 
                }
                else{
                    gc6 = g6 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 CS6512 INTERNET PROG LAB CREDITS:2
                   if(g7!=0){
                    gc7 = g7 * 2; cre += 2; 
                }
                else{
                    gc7 = g7 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6513 COMPUTER GRAPHICS CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
             
            //CALCULATE GPA AND CGPA FOR SEM 4    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 ;
                gpa = total / (double)cre;
                 if( isNaN(gpa)) gpa=0;
                
                //SEMESTER 1 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 2
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM2 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p2 = qrs.getDouble("GPA"); q2 = qrs.getDouble("CREDITSEARNED"); a2 = qrs.getInt("TOTALARR") ;
                }
                
                //SEMESTER 3
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM3 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p3 = qrs.getDouble("GPA"); q3 = qrs.getDouble("CREDITSEARNED"); a3 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 4 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM4 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p4 = qrs.getDouble("GPA"); q4 = qrs.getDouble("CREDITSEARNED"); a4 = qrs.getInt("TOTALARR") ;  
                }
                
                
                cgpa = ((p1*q1) + (p2*q2) + (p3*q3)+ (p4*q4) + (gpa*cre)) / (double) (cre+q1+q2+q3+q4);
                 if( isNaN(cgpa)) cgpa=0;
                totalarr = arr + a4;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
  
             query = "UPDATE "+table+" SET MA6566 = '"+m1+"', CS6501 = '"+m2+"', CS6502 = '"+m3+"', CS6503 = '"+m4+ "', CS6504 = '"+m5+ "', CS6511 = '"+m6+ "', CS6512 = '"+m7+"', CS6513 = '"+m8+"', CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=23, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";   
            
            }    
            
            if( semester.equals("6")){
                
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 CS6601 DISTRIBUTED SYSTEMS CREDITS:3
                if(g1!=0){
                    gc1 = g1 * 3; cre += 3; 
                }
                else{
                    gc1 = g1 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 IT6601 MOBILE COMPUTING CREDITS:3
                 if(g2!=0){
                    gc2 = g2 * 3; cre += 3; 
                }
                else{
                    gc2 = g2 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 CS6660 COMPILER DESIGN CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 IT6502 DIGITAL SIGNAL PROCESSING CREDITS:4
                if(g4!=0){
                    gc4 = g4 * 4; cre += 4; 
                }
                else{
                    gc4 = g4 * 4; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 CS6659 ARTIFICIAL INTELLIGENCE CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 ELECTIVE1 C# AND .NET / SOFTWARE TESTING CREDITS:3
                if(g6!=0){
                    gc6 = g6 * 3; cre += 3; 
                }
                else{
                    gc6 = g6 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 CS6611 MOBILE APP DEVELOPMENT LAB CREDITS:2
                   if(g7!=0){
                    gc7 = g7 * 2; cre += 2; 
                }
                else{
                    gc7 = g7 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6612 COMPILER LAB CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT9 GE6674 COMM AND SOFT SKILLS LAB CREDITS:2
                if(g9!=0){
                    gc9 = g9 * 2; cre += 2; 
                }
                else{
                    gc9 = g9 * 2; arr++;
                }
             
            //CALCULATE GPA AND CGPA FOR SEM 4    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 +gc9 ;
                gpa = total / (double)cre;
                 if( isNaN(gpa)) gpa=0;
                
                //SEMESTER 1 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 2
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM2 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p2 = qrs.getDouble("GPA"); q2 = qrs.getDouble("CREDITSEARNED"); a2 = qrs.getInt("TOTALARR") ;
                }
                
                //SEMESTER 3
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM3 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p3 = qrs.getDouble("GPA"); q3 = qrs.getDouble("CREDITSEARNED"); a3 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 4 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM4 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p4 = qrs.getDouble("GPA"); q4 = qrs.getDouble("CREDITSEARNED"); a4 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 5 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM5 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p5 = qrs.getDouble("GPA"); q5 = qrs.getDouble("CREDITSEARNED"); a5 = qrs.getInt("TOTALARR") ;  
                }
                
                
                cgpa = ((p1*q1) + (p2*q2) + (p3*q3)+ (p4*q4) + (p5*q5) +(gpa*cre)) / (double) (cre+q1+q2+q3+q4+q5);
                 if( isNaN(cgpa)) cgpa=0;
                totalarr = arr + a5;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
  
             query = "UPDATE "+table+" SET CS6601 = '"+m1+"', IT6601 = '"+m2+"', CS6660 = '"+m3+"', IT6502 = '"+m4+ "', CS6659 = '"+m5+ "', ELE1 = '"+m6+ "', CS6611 = '"+m7+"', CS6612 = '"+m8+"', GE6674 = '" + m9 +"', CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=25, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";   
            
            }
                
            if( semester.equals("7")){    
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 CS6701 CRYTOGRAPHY AND NETWORK SECURITY CREDITS:3
                if(g1!=0){
                    gc1 = g1 * 3; cre += 3; 
                }
                else{
                    gc1 = g1 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 CS6702 GRAPH THEORY CREDITS:3
                 if(g2!=0){
                    gc2 = g2 * 3; cre += 3; 
                }
                else{
                    gc2 = g2 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 CS6703 GRID AND CLOUD COMPUTING CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CS6704 RESOURCE MGMT TECHNIQUES CREDITS:3
                if(g4!=0){
                    gc4 = g4 * 3; cre += 3; 
                }
                else{
                    gc4 = g4 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT5 ELECTIVE2 SERVICE ORIENTED ARCHITECTURE CREDITS:3
                if(g5!=0){
                    gc5 = g5 * 3; cre += 3; 
                }
                else{
                    gc5 = g5 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT6 ELECTIVE3 INFORMATION RETRIVAL CREDITS:3
                if(g6!=0){
                    gc6 = g6 * 3; cre += 3; 
                }
                else{
                    gc6 = g6 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT7 CS6711 SECURITY LAB CREDITS:2
                   if(g7!=0){
                    gc7 = g7 * 2; cre += 2; 
                }
                else{
                    gc7 = g7 * 2; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT8 CS6712 GRID AND CLOUD COMPUTING LAB CREDITS:2
                if(g8!=0){
                    gc8 = g8 * 2; cre += 2; 
                }
                else{
                    gc8 = g8 * 2; arr++;
                }
                
             
            //CALCULATE GPA AND CGPA FOR SEM 7    
                total = gc1 + gc2 + gc3 + gc4 + gc5 + gc6+ gc7 + gc8 ;
                gpa = total / (double)cre;
                 if( isNaN(gpa)) gpa=0;
                
                //SEMESTER 1 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 2
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM2 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p2 = qrs.getDouble("GPA"); q2 = qrs.getDouble("CREDITSEARNED"); a2 = qrs.getInt("TOTALARR") ;
                }
                
                //SEMESTER 3
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM3 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p3 = qrs.getDouble("GPA"); q3 = qrs.getDouble("CREDITSEARNED"); a3 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 4 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM4 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p4 = qrs.getDouble("GPA"); q4 = qrs.getDouble("CREDITSEARNED"); a4 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 5 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM5 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p5 = qrs.getDouble("GPA"); q5 = qrs.getDouble("CREDITSEARNED"); a5 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 6 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM6 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p6 = qrs.getDouble("GPA"); q6 = qrs.getDouble("CREDITSEARNED"); a6 = qrs.getInt("TOTALARR") ;  
                }
                
                
                cgpa = ((p1*q1) + (p2*q2) + (p3*q3)+ (p4*q4) + (p5*q5) + (p6*q6) + (gpa*cre)) / (double) (cre+q1+q2+q3+q4+q5+q6);
                 if( isNaN(cgpa)) cgpa=0;
                totalarr = arr + a6;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
  
             query = "UPDATE "+table+" SET CS6701 = '"+m1+"', CS6702 = '"+m2+"', CS6703 = '"+m3+"', CS6704 = '"+m4+ "', ELE2 = '"+m5+ "', ELE3 = '"+m6+ "', CS6711 = '"+m7+"', CS6712 = '"+m8+"', CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=22, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";   
             
            }  
            
            if( semester.equals("8")){    
                
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT1 CS6801 MULTI CORE ARCH AND PROG CREDITS:3
                if(g1!=0){
                    gc1 = g1 * 3; cre += 3; 
                }
                else{
                    gc1 = g1 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT2 ELE4 --to be updated-- CREDITS:3
                 if(g2!=0){
                    gc2 = g2 * 3; cre += 3; 
                }
                else{
                    gc2 = g2 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT3 --to be updated-- CREDITS:3
                  if(g3!=0){
                    gc3 = g3 * 3; cre += 3; 
                }
                else{
                    gc3 = g3 * 3; arr++;
                }
            // CREDIT AND GRADE POINT CALCULATION FOR SUBJECT4 CS6811 PROJECT WORK CREDITS:6
                if(g4!=0){
                    gc4 = g4 * 6; cre += 6; 
                }
                else{
                    gc4 = g4 * 6; arr++;
                }
             
            //CALCULATE GPA AND CGPA FOR SEM 8    
                total = gc1 + gc2 + gc3 + gc4 ;
                gpa = total / (double)cre;
                 if( isNaN(gpa)) gpa=0;
                
                //SEMESTER 1 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM1 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p1 = qrs.getDouble("GPA"); q1 = qrs.getDouble("CREDITSEARNED"); a1 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 2
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM2 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p2 = qrs.getDouble("GPA"); q2 = qrs.getDouble("CREDITSEARNED"); a2 = qrs.getInt("TOTALARR") ;
                }
                
                //SEMESTER 3
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM3 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p3 = qrs.getDouble("GPA"); q3 = qrs.getDouble("CREDITSEARNED"); a3 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 4 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM4 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p4 = qrs.getDouble("GPA"); q4 = qrs.getDouble("CREDITSEARNED"); a4 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 5 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM5 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p5 = qrs.getDouble("GPA"); q5 = qrs.getDouble("CREDITSEARNED"); a5 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 6 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM6 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p6 = qrs.getDouble("GPA"); q6 = qrs.getDouble("CREDITSEARNED"); a6 = qrs.getInt("TOTALARR") ;  
                }
                
                //SEMESTER 7 
                
                query = "SELECT GPA, CREDITSEARNED, TOTALARR FROM SEM7 WHERE REGISTERNO = '"+registerno+"'";
                
                s.execute(query);
                
                qrs = s.getResultSet();
                while(qrs.next()){
                    p7 = qrs.getDouble("GPA"); q7 = qrs.getDouble("CREDITSEARNED"); a7 = qrs.getInt("TOTALARR") ;  
                }
                
                
                cgpa = ((p1*q1) + (p2*q2) + (p3*q3)+ (p4*q4) + (p5*q5) + (p6*q6) + (p7*q7) + (gpa*cre)) / (double) (cre+q1+q2+q3+q4+q5+q6+q7);
                 if( isNaN(cgpa)) cgpa=0;
                totalarr = arr + a7;
                
                System.out.println( " GPA: "+gpa+ " CREDITS: "+cre);
  
             query = "UPDATE "+table+" SET CS6801 = '"+m1+"', ELE4 = '"+m2+"', ELE5 = '"+m3+"', CS6811 = '"+m4+ "',CURRENTARR ="+arr+ ",TOTALARR ="+totalarr+",CREDITSEARNED="+cre+",CREDITS=22, GPA="+gpa+",CGPA="+cgpa +" WHERE REGISTERNO = '"+registerno + "'";   
             
            }            
           
                 
            System.out.println(query);
            s.execute(query);
            con.commit();
            JOptionPane.showMessageDialog(null, " UPDATION SUCCESSFUL\n\nGPA = "+String.format( "%.3f", Double.parseDouble( String.valueOf(gpa) ) )+" \nCGPA = "+String.format( "%.3f", Double.parseDouble( String.valueOf(cgpa) ) )+"\nTOTAL ARREAR = "+totalarr);
            
            mark1.setText("");  mark2.setText("");  mark3.setText("");
            mark4.setText("");  mark5.setText("");  mark6.setText("");
            mark7.setText("");  mark8.setText("");  mark9.setText("");

            
            
        }
        catch ( SQLException e){ e.printStackTrace();
        JOptionPane.showMessageDialog(null, "UPDATION NOT SUCCESSFUL \n\n" + e);}
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(EnterMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel au;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField mark1;
    private javax.swing.JTextField mark2;
    private javax.swing.JTextField mark3;
    private javax.swing.JTextField mark4;
    private javax.swing.JTextField mark5;
    private javax.swing.JTextField mark6;
    private javax.swing.JTextField mark7;
    private javax.swing.JTextField mark8;
    private javax.swing.JTextField mark9;
    private javax.swing.JTextField name;
    private javax.swing.JLabel pec;
    private javax.swing.JTextField regno;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    private javax.swing.JComboBox sem;
    // End of variables declaration//GEN-END:variables
}
