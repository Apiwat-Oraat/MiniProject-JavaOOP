/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaapplication7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ProjectPage extends JPanel implements ActionListener {
        private DefaultTableModel model;
        private DBConnect db;
    public ProjectPage() {

        date = new com.raven.datechooser.DateChooser();
        jProgressBar1 = new javax.swing.JProgressBar();
        date1 = new com.raven.datechooser.DateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProjectTable = new javax.swing.JTable();
        jsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_all = new javax.swing.JButton();
        btn_addproject = new javax.swing.JButton();
        btnDateStart = new javax.swing.JButton();
        txDateStart = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jnameproject = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IDproject = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jnamecustomer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        typeproject = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jnameEngineer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Statusproject1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        projectdetails = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        budget = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        txDateEnd = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnDateEnd = new javax.swing.JButton();

        date.setForeground(new java.awt.Color(29, 38, 45));
        date.setDateFormat("dd-MMMM-yyyy");
        date.setTextRefernce(txDateStart);

        date1.setForeground(new java.awt.Color(29, 38, 45));
        date1.setDateFormat("dd-MMMM-yyyy");
        date1.setTextRefernce(txDateEnd);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 570));


        ProjectTable = new JTable();
        jScrollPane1.setViewportView(ProjectTable);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        String sql3 = """
    SELECT
        p.project_id,
        p.project_name,
        p.customer_name,
        p.project_type,
        e.employee_id AS engineer_id,
        p.budget,
        p.project_status
    FROM
        Projects p
    LEFT JOIN
        ProjectAssignments pa ON p.project_id = pa.project_id
    LEFT JOIN
        Employees e ON pa.employee_id = e.employee_id;
    """;

        setTable(sql3);
        ProjectTable.setAutoCreateRowSorter(true);
        ProjectTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ProjectTable.setFont(new java.awt.Font("Tahoma", 0, 12));
        ProjectTable.setForeground(new java.awt.Color(0, 51, 51));
        ProjectTable.setGridColor(new java.awt.Color(255, 255, 255));
        ProjectTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        ProjectTable.setSelectionForeground(new java.awt.Color(255, 255, 255));

        jsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jsearch.setForeground(new java.awt.Color(153, 153, 153));
        jsearch.setText("กรอกรหัสโครงการ");
        jsearch.addActionListener(this);

        jLabel1.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel1.setText("ค้นหาโครงการ");

        jLabel2.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 18)); // NOI18N
        jLabel2.setText("จัดการโครงการ");

        btn_search.setBackground(new java.awt.Color(29, 38, 45));
        btn_search.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("ค้นหา");
        btn_search.addActionListener(this);

        btn_all.setBackground(new java.awt.Color(29, 38, 45));
        btn_all.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_all.setForeground(new java.awt.Color(255, 255, 255));
        btn_all.setText("ทั้งหทด");
        btn_all.addActionListener(this);

        btn_addproject.setBackground(new java.awt.Color(29, 38, 45));
        btn_addproject.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_addproject.setForeground(new java.awt.Color(255, 255, 255));
        btn_addproject.setText("เพิ่ม");
        btn_addproject.addActionListener(this);

        btnDateStart.setBackground(new java.awt.Color(29, 38, 45));
        btnDateStart.setForeground(new java.awt.Color(255, 255, 255));
        btnDateStart.setText("...");
        btnDateStart.addActionListener(this);

        txDateStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txDateStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDateStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txDateStart.addActionListener(this);

        jLabel7.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel7.setText("วันที่เริ่มต้น");

        jnameproject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jnameproject.setText("กรอกชื่อโครงการ");
        jnameproject.addActionListener(this);

        jLabel3.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel3.setText("ชื่อโครงการ");

        IDproject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        IDproject.setText("กรอกรหัส");
        IDproject.addActionListener(this);

        jLabel8.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel8.setText("รหัสโครงการ");

        jnamecustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jnamecustomer.setText("กรอกชื่อลูกค้า");
        jnamecustomer.addActionListener(this);

        jLabel4.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel4.setText("ชื่อลูกค้า");

        typeproject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        typeproject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "โครงการขนาดเล็ก", "โครงการขนาดกลาง", "โครงการขนาดใหญ่", "โครงการต่อเติม" }));

        jLabel11.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel11.setText("ประเภทโครงการ");

        jnameEngineer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jnameEngineer.setText("กรอกรหัสวิศวกร");
        jnameEngineer.addActionListener(this);

        jLabel10.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel10.setText("รหัสวิศวกร");

        Statusproject1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Statusproject1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "รอดำเนินการ", "กำลังดำเนินการ", "เสร็จสมบูณ์" }));

        jLabel5.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel5.setText("สถานะ");

        projectdetails.setColumns(20);
        projectdetails.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        projectdetails.setRows(5);
        jScrollPane2.setViewportView(projectdetails);

        jLabel6.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel6.setText("รายละเอียด");

        budget.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        budget.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        budget.setText("0");
        budget.addActionListener(this);

        jLabel9.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel9.setText("งบประมาณ / บาท");

        btn_delete.setBackground(new java.awt.Color(29, 38, 45));
        btn_delete.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("ลบ");
        btn_delete.addActionListener(this);

        btn_edit.setBackground(new java.awt.Color(29, 38, 45));
        btn_edit.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("แก้ไข");
        btn_edit.addActionListener(this);

        txDateEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txDateEnd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDateEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txDateEnd.addActionListener(this);

        jLabel13.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel13.setText("วันที่สิ้นสุด");

        btnDateEnd.setBackground(new java.awt.Color(29, 38, 45));
        btnDateEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnDateEnd.setText("...");
        btnDateEnd.addActionListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn_all))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(16, 16, 16)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabel3)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(jLabel10)
                                                                                                        .addComponent(jLabel6)
                                                                                                        .addComponent(jLabel4)))
                                                                                        .addGap(18, 18, 18)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(jnamecustomer, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jnameEngineer, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jnameproject, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(2, 2, 2)
                                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(budget, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel2))
                                                                        .addGap(82, 82, 82)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(jLabel11)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                        .addComponent(typeproject, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                        .addComponent(jLabel5)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(Statusproject1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(txDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(IDproject, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel13)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(107, 107, 107)
                                                                        .addComponent(btn_addproject)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btn_delete)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btn_edit)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jnameproject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(txDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDateStart)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(IDproject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(typeproject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Statusproject1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel5))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(budget, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btn_addproject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(5, 5, 5)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btn_all, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jnameEngineer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel10))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(43, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnDateEnd)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jnamecustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btn_addproject)){
                insertProject();
        }
            if (e.getSource().equals(btn_delete)){
                DeleteProject();;
            }
        if (e.getSource().equals(btn_search)) {
            String kw = jsearch.getText();
            String sql = String.format(
                    "SELECT " +
                            "p.project_id, " +
                            "p.project_name, " +
                            "p.customer_name, " +
                            "p.project_type, " +
                            "e.employee_id AS engineer_id, " + // แก้ไขชื่อคอลัมน์
                            "p.budget, " +
                            "p.project_status " +
                            "FROM Projects p " +
                            "LEFT JOIN ProjectAssignments pa ON p.project_id = pa.project_id " +
                            "LEFT JOIN Employees e ON pa.employee_id = e.employee_id " +
                            "WHERE p.project_id = '%s' OR p.project_name = '%s'",
                    kw, kw
            );

            setTable(sql);
        }
        if (e.getSource().equals(btn_all)){
            String sql3 = """
    SELECT
        p.project_id,
        p.project_name,
        p.customer_name,
        p.project_type,
        e.employee_id AS engineer_id,
        p.budget,
        p.project_status
    FROM
        Projects p
    LEFT JOIN
        ProjectAssignments pa ON p.project_id = pa.project_id
    LEFT JOIN
        Employees e ON pa.employee_id = e.employee_id;
    """;

            setTable(sql3);
        }
        if (e.getSource().equals(btn_edit)){
            EditProject();
        }
        if (e.getSource().equals(btnDateStart)){
            date.showPopup();;
        }
        if (e.getSource().equals(btnDateEnd)){
            date.showPopup();
        }

    }


    private void EditProject(){
        int rowIndex = ProjectTable.getSelectedRow();
        String ID = model.getValueAt(rowIndex,0).toString();
        String P_id = IDproject.getText();
        String P_name = jnameproject.getText();
        String Cus_name = jnamecustomer.getText();
        String P_details = projectdetails.getText();
        String P_type = (String) typeproject.getSelectedItem();
        String Budget = budget.getText();
        String Engineer_name = jnameEngineer.getText();
//        String Material_cost =
        String Project_status = (String) Statusproject1.getSelectedItem();
        String Date_start = txDateStart.getText();
        String Date_End = txDateEnd.getText();
        String sql = String.format(
                "UPDATE Projects SET project_name = '%s', customer_name = '%s', project_details = '%s', project_type = '%s', budget = '%s', project_status = '%s', date_start = '%s', date_end = '%s' WHERE project_id = '%s'",
                P_name,Cus_name, P_details, P_type, Budget, Project_status, Date_start, Date_End, ID
        );
        db.getUpdate(sql);
        String sql2 = String.format(
                "UPDATE ProjectAssignments SET employee_id = '%s', start_date = '%s', end_date = '%s'  WHERE project_id = '%s'",
                Engineer_name, Date_start, Date_End,  ID
        );
        db.getUpdate(sql2);
        String sql3 = """
    SELECT
        p.project_id,
        p.project_name,
        p.customer_name,
        p.project_type,
        e.employee_id AS engineer_id,
        p.budget,
        p.project_status
    FROM
        Projects p
    LEFT JOIN
        ProjectAssignments pa ON p.project_id = pa.project_id
    LEFT JOIN
        Employees e ON pa.employee_id = e.employee_id;
    """;

        setTable(sql3);
        JOptionPane.showMessageDialog(null, "edit Successfully!" , "message", JOptionPane.INFORMATION_MESSAGE);

    }
    private void insertProject(){
        String P_id = IDproject.getText();
        String P_name = jnameproject.getText();
        String Cus_name = jnamecustomer.getText();
        String P_details = projectdetails.getText();
        String P_type = (String) typeproject.getSelectedItem();
        String Budget = budget.getText();
        String Engineer_name = jnameEngineer.getText();
//        String Material_cost =
        String Project_status = (String) Statusproject1.getSelectedItem();
        String Date_start = txDateStart.getText();
        String Date_End = txDateEnd.getText();

        String sql = String.format("INSERT INTO Projects (project_id,project_name,customer_name,project_details,project_type,budget,project_status,date_start,date_end) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s','%s')",P_id,P_name,Cus_name,P_details,P_type,Budget,Project_status,Date_start,Date_End);
        db.getUpdate(sql);
        String text = "Engineer";
        String sql2 = String.format("INSERT INTO ProjectAssignments (project_id,employee_id,role,start_date,end_date) VALUES ('%s','%s','%s','%s','%s')",P_id,Engineer_name,text,Date_start,Date_End);
        db.getUpdate(sql2);
        String sql3 = """
    SELECT
        p.project_id,
        p.project_name,
        p.customer_name,
        p.project_type,
        e.employee_id AS engineer_id,
        p.budget,
        p.project_status
    FROM
        Projects p
    LEFT JOIN
        ProjectAssignments pa ON p.project_id = pa.project_id
    LEFT JOIN
        Employees e ON pa.employee_id = e.employee_id;
    """;

        setTable(sql3);
    }


    public void setTable(String sql) {
        String[] colname = {"รหัสโครงการ", "ชื่อโครงการ", "ชื่อลูกค้า", "ประเภทโครงการ", "วิศวกร", "งบประมาณ", "สถานะ"};
        model = new DefaultTableModel(colname, 0);
        ProjectTable.setModel(model); // ตั้งค่า Model ให้ JTable

        try {
            db = new DBConnect();
            ResultSet rs = db.getConnect(sql);

            while (rs.next()) {
                // ดึงค่าจากฐานข้อมูล
                String P_id = rs.getString("project_id");
                String P_name = rs.getString("project_name");
                String Cus_name = rs.getString("customer_name");
//                String P_details = rs.getString("project_details");
                String P_type = rs.getString("project_type");
                String Budget = rs.getString("budget");
                String Engineer_name = rs.getString("engineer_id");
//                String Material_cost = rs.getString("material_cost");
                String Project_status = rs.getString("project_status");
//                String Date_start = rs.getString("date_start");
//                String Date_End = rs.getString("date_end");
                String[] row = {P_id, P_name, Cus_name, P_type, Engineer_name, Budget, Project_status};
                model.addRow(row);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        ProjectTable.setModel(model);
    }
    private  void DeleteProject(){
        int rowIndex = ProjectTable.getSelectedRow();
        String ID = model.getValueAt(rowIndex,0).toString();

        String sql = String.format("DELETE FROM Projects WHERE project_id = '%s' ",ID);
        db.getUpdate(sql);
        model.removeRow(rowIndex);
        JOptionPane.showMessageDialog(null, "Delete Successfully!" , "message", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField IDproject;
    private javax.swing.JComboBox<String> Statusproject1;
    private javax.swing.JButton btnDateEnd;
    private javax.swing.JButton btnDateStart;
    private javax.swing.JButton btn_addproject;
    private javax.swing.JButton btn_all;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_search;
    private javax.swing.JTextField budget;
    private com.raven.datechooser.DateChooser date;
    private com.raven.datechooser.DateChooser date1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ProjectTable;
    private javax.swing.JTextField jnameEngineer;
    private javax.swing.JTextField jnamecustomer;
    private javax.swing.JTextField jnameproject;
    private javax.swing.JTextField jsearch;
    private javax.swing.JTextArea projectdetails;
    private javax.swing.JTextField txDateEnd;
    private javax.swing.JTextField txDateStart;
    private javax.swing.JComboBox<String> typeproject;




    // End of variables declaration
}
