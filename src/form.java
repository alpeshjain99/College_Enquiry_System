
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.Date;
public class form extends javax.swing.JFrame {
private static Object m;
    /**
     * Creates new form form
     */
    public form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        c2 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        c4 = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        a5 = new javax.swing.JTextField();
        a6 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        c5 = new javax.swing.JComboBox();
        c6 = new javax.swing.JComboBox();
        c7 = new javax.swing.JComboBox();
        c8 = new javax.swing.JComboBox();
        a9 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        c9 = new javax.swing.JComboBox();
        c10 = new javax.swing.JComboBox();
        c11 = new javax.swing.JComboBox();
        a11 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        c12 = new javax.swing.JComboBox();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        c13 = new javax.swing.JComboBox();
        c14 = new javax.swing.JComboBox();
        c15 = new javax.swing.JComboBox();
        a13 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m6 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Enquiry No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Father's Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        a1.setEditable(false);
        a1.setBackground(new java.awt.Color(204, 204, 255));
        a1.setForeground(new java.awt.Color(51, 51, 51));
        a1.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 123, 35));
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 93, 35));
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 353, 35));
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 352, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("10th..............");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("12th.........");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Graduation......");
        jLabel7.setEnabled(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("State");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setText("Contact no.");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 780, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Admm Consoler Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Branch Consoler Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 870, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel12.setText("city");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 710, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel13.setText("Lab Visited By");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 910, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel14.setText("Ref Mobile");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 970, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel15.setText("Remarks");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1010, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel16.setText("Enquiry Through");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 1020, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel17.setText("Ref. BY");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 980, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setText("Admm, Date");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select-", "B.Tech", "M.tech", "M.B,A", "BCA", "Caddesk" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-select Branch-", "Computer Science", "Civil", "Mechnical", "Electronic & Comm" }));
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel19.setText("Branch 1");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", "Computer Science", "Civil", "Mechnical", "Electronic & Comm" }));
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel20.setText("2");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));

        c4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", "Computer Science", "Civil", "Mechnical", "Electronic & Comm" }));
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel21.setText("3");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel22.setText("Percentage");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 95, 25));

        a6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        getContentPane().add(a6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 100, 25));
        getContentPane().add(a7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 100, 25));
        getContentPane().add(a8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 68, 25));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel23.setText("PCM");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        c5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Board Name-", "CBSE", "RBSE", "Any other" }));
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, -1, -1));

        c6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Board Name-", "CBSE", "RBSE", "Any other" }));
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        c7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL_", "University of Raj", "Rjasthn Technical Universty", "Manipal", "Birla" }));
        getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, -1, -1));

        c8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-State-", "Andra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telagana", "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal", " " }));
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 710, -1, 27));
        getContentPane().add(a9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 122, 25));
        getContentPane().add(a10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 770, 166, 33));

        c9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", "Faculty A", "Faculty B", "Faculty C", "Faculty D", "Faculty E" }));
        getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 830, -1, -1));

        c10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", "Faculty A", "Faculty B", "Faculty C", "Faculty D", "Faculty E" }));
        getContentPane().add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 870, -1, -1));

        c11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", "Faculty A", "Faculty B", "Faculty C", "Faculty D", "Faculty E" }));
        getContentPane().add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 910, -1, -1));
        getContentPane().add(a11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 970, 166, 33));
        getContentPane().add(a12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 970, 166, 33));

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane1.setViewportView(ta1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 1010, -1, 120));

        c12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", "college Visit", "Reap", "Any Other" }));
        getContentPane().add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1020, -1, -1));

        buttonGroup1.add(r1);
        r1.setText("Date Wise");
        getContentPane().add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, -1, -1));

        buttonGroup1.add(r2);
        r2.setText("Month Wise");
        getContentPane().add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 180, -1, -1));

        c13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-NIL-", " " }));
        getContentPane().add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));

        c14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Month-", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        getContentPane().add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, -1));

        c15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2017", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", " " }));
        getContentPane().add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, -1, -1));
        getContentPane().add(a13, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 213, 35));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel24.setText("Student Name");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, -1, -1));

        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 276, 622));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        jLabel25.setText("Enquiry Form");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 630, 97));

        m1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        m1.setText("Admin");
        m1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                m1MouseExited(evt);
            }
        });
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        m3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        m3.setText("Change pass");
        getContentPane().add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, 20));

        m2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        m2.setText("User create & Set pass");
        m2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                m2MouseEntered(evt);
            }
        });
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 20));

        m6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        m6.setText("Enquiry Form");
        m6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m6MouseClicked(evt);
            }
        });
        getContentPane().add(m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 20));

        m4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        m4.setText("Reports");
        m4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m4MouseClicked(evt);
            }
        });
        getContentPane().add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 20));

        m7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        m7.setText("Admission Form");
        m7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m7MouseClicked(evt);
            }
        });
        getContentPane().add(m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 20));

        jButton1.setText("Submit & Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 1170, -1, -1));

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1170, -1, -1));

        jButton4.setText("Updare");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 1170, -1, -1));

        jButton5.setText("Print");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1170, -1, -1));

        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        m2.setVisible(false);
        m3.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void m1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseClicked
m2.setVisible(true);
m3.setVisible(true);
    }//GEN-LAST:event_m1MouseClicked

    private void m1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_m1MouseExited

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
        m2.setVisible(false);
        m3.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified

        m2.setVisible(false);
        m3.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String Sname,Fname;
Date ds=new Date();
m=ds;

a2.setText((String) m);
Sname=a3.getText();
Fname=a4.getText();
String cours=(String)c1.getSelectedItem();
if(cours=="B.tech")
{
    System.out.println("course; \t B.tech");
}

else
{
    c2.setVisible(false);
    c3.setVisible(false);
    c4.setVisible(false);
    jLabel19.setVisible(false);
    jLabel20.setVisible(false);
    jLabel21.setVisible(false);
}
/*else if(cours=="M.tech")
{
    System.out.println("course; \t M.tech");
    
}
else if(cours=="M.B.A")
{
    System.out.println("course; \t M.B.A");
    
}
else if(cours=="BCA")
{
    System.out.println("course; \t BCA");
    
}
else if(cours=="caddesk")
{
//    ta1.append(cours;  cadddesk);
    
}
else
{
    System.out.println("select couse");
}
*/

    int ten,twel,grad,pcm;
    ten=Integer.parseInt(a5.getText());
    twel=Integer.parseInt(a7.getText());
    grad=Integer.parseInt(a6.getText());
    pcm=Integer.parseInt(a8.getText());
    String state=(String)c8.getSelectedItem();
    System.out.println(state);
    String city;
    city=a9.getText();
    int mob=Integer.parseInt(a10.getText());
    String admcon=(String)c9.getSelectedItem();
    String branchcons=(String)c10.getSelectedItem();
    String labvisi=(String)c11.getSelectedItem();
        System.out.println(admcon);
        System.out.println(branchcons);
        System.out.println(labvisi);
        
        String ref=a11.getText();
        int refby=Integer.parseInt(a12.getText());
        String enqthr=(String)c12.getSelectedItem();
        String rem=ta1.getText();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        JOptionPane.showMessageDialog(null,"Your Enquiry form is submitted "+"now straight away going to print");
a1.setText(" ");
a2.setText(" ");
a3.setText(" ");
a4.setText(" ");
a5.setText(" ");
a6.setText(" ");
a7.setText(" ");
a8.setText(" ");
a9.setText(" ");
a10.setText(" ");
a11.setText(" ");
a12.setText(" ");
a13.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
a1.setText(" ");
a2.setText(" ");
a3.setText(" ");
a4.setText(" ");
a5.setText(" ");
a6.setText(" ");
a7.setText(" ");
a8.setText(" ");
a9.setText(" ");
a10.setText(" ");
a11.setText(" ");
a12.setText(" ");
a13.setText(" ");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void m4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m4MouseClicked
        this.setVisible(false);
        report we=new report();
        we.setVisible(true);
    }//GEN-LAST:event_m4MouseClicked

    private void m6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m6MouseClicked

    }//GEN-LAST:event_m6MouseClicked

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

        String cours=(String)c1.getSelectedItem();
        if(cours=="B.tech")
        {
            System.out.println("course; \t B.tech");
        }

        else
        {
            c2.setVisible(false);
            c3.setVisible(false);
            c4.setVisible(false);
            jLabel19.setVisible(false);
            jLabel20.setVisible(false);
            jLabel21.setVisible(false);
        }

    }//GEN-LAST:event_c1ActionPerformed

    private void m7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m7MouseClicked
        this.setVisible(false);
        addmission wq=new addmission();
        wq.setVisible(true);
    }//GEN-LAST:event_m7MouseClicked

    private void m2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseClicked
        this.setVisible(false);
        login2 qw=new login2();
        qw.setVisible(true);
    }//GEN-LAST:event_m2MouseClicked

    private void m2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_m2MouseEntered

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a8;
    private javax.swing.JTextField a9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c10;
    private javax.swing.JComboBox c11;
    private javax.swing.JComboBox c12;
    private javax.swing.JComboBox c13;
    private javax.swing.JComboBox c14;
    private javax.swing.JComboBox c15;
    private javax.swing.JComboBox c2;
    private javax.swing.JComboBox c3;
    private javax.swing.JComboBox c4;
    private javax.swing.JComboBox c5;
    private javax.swing.JComboBox c6;
    private javax.swing.JComboBox c7;
    private javax.swing.JComboBox c8;
    private javax.swing.JComboBox c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m6;
    private javax.swing.JLabel m7;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    // End of variables declaration//GEN-END:variables
}
