
package javaapplication7;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class EmployeePage extends JPanel implements ActionListener{
    private DefaultTableModel model;
    private JTable EmployeeTable;
    private JTextField ID_Emaployee;
    private JTextField Phonenum;
    private JTextField Salary;
    private JButton btnDateStart;
    private JButton btn_ALL;
    private javax.swing.JButton btn_addproject;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_search;
    private com.raven.datechooser.DateChooser date;
    private javax.swing.JTextField emyloyeename;
    private javax.swing.JCheckBox female;
    private javax.swing.JTextField idcard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jsearch;
    private javax.swing.JCheckBox male;
    private javax.swing.JTextField position;
    private javax.swing.JTextField txDateStart;
    private javax.swing.JTextField wage;
    private DBConnect db;


    public EmployeePage() {

        date = new com.raven.datechooser.DateChooser();
        jLabel1 = new javax.swing.JLabel();
        ID_Emaployee = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emyloyeename = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        idcard = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Phonenum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        txDateStart = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnDateStart = new javax.swing.JButton();
        Salary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        wage = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_addproject = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_ALL = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        date.setForeground(new java.awt.Color(29, 38, 45));
        date.setDateFormat("dd-MMMM-yyyy");
        date.setTextRefernce(txDateStart);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 570));

        jLabel1.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 18)); // NOI18N
        jLabel1.setText("จักการพนักงาน");

        ID_Emaployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ID_Emaployee.setText("กรอกรหัส");
        ID_Emaployee.addActionListener(this);

        jLabel3.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel3.setText("รหัสพนักงาน");

        emyloyeename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emyloyeename.setText("กรอกชื่อพนักงาน");
        emyloyeename.addActionListener(this);

        jLabel4.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel4.setText("ชื่อพนักงาน");

        position.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        position.setText("กรอกตำแหน่ง");
        position.addActionListener(this);

        jLabel5.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel5.setText("ตำแหน่ง");

        jLabel6.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel6.setText("เพศ");

        male.setText("ชาย");
        male.addActionListener(this);

        female.setText("หญิง");

        idcard.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        idcard.setText("กรอกเลขบัตรประชาชน");
        idcard.addActionListener(this);

        jLabel7.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel7.setText("เลขบัตรประชาชน");

        jLabel8.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel8.setText("ที่อยู่");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Phonenum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Phonenum.setText("xxx-xxx-xxxx");
        Phonenum.setToolTipText("");
        Phonenum.addActionListener(this);

        jLabel9.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel9.setText("โทรศัพ");
// สร้าง JTable ก่อน แล้วกำหนดให้ JScrollPane
        EmployeeTable = new JTable();
        jScrollPane2.setViewportView(EmployeeTable);

// เรียกใช้งาน setTable หลังจากกำหนด JTable
        String sql = "SELECT employee_id, employee_name, position, gender, id_card, address, employment_date, salary, phone_number FROM Employees;";
        setTable(sql);

// ตั้งค่าตาราง
        EmployeeTable.setAutoCreateRowSorter(true);
        EmployeeTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        EmployeeTable.setFont(new java.awt.Font("Tahoma", 0, 12));
        EmployeeTable.setForeground(new java.awt.Color(0, 51, 51));
        EmployeeTable.setGridColor(new java.awt.Color(255, 255, 255));
        EmployeeTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        EmployeeTable.setSelectionForeground(new java.awt.Color(255, 255, 255));

        txDateStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txDateStart.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDateStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txDateStart.addActionListener(this);

        jLabel10.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel10.setText("วันที่เป็นพนักงาน");

        btnDateStart.setBackground(new java.awt.Color(29, 38, 45));
        btnDateStart.setForeground(new java.awt.Color(255, 255, 255));
        btnDateStart.setText("...");
        btnDateStart.addActionListener(this);

        Salary.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Salary.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Salary.setText("0");
        Salary.addActionListener(this);

        jLabel11.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel11.setText("เงินเดือน / บาท");

        wage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        wage.setText("0");
        wage.addActionListener(this);

        jLabel12.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel12.setText("ค่าแรง / 1วัน");

        btn_addproject.setBackground(new java.awt.Color(29, 38, 45));
        btn_addproject.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_addproject.setForeground(new java.awt.Color(255, 255, 255));
        btn_addproject.setText("เพิ่ม");
        btn_addproject.addActionListener(this);

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

        btn_ALL.setBackground(new java.awt.Color(29, 38, 45));
        btn_ALL.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_ALL.setForeground(new java.awt.Color(255, 255, 255));
        btn_ALL.setText("ALL");
        btn_ALL.addActionListener(this);

        btn_search.setBackground(new java.awt.Color(29, 38, 45));
        btn_search.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("ค้นหา");
        btn_search.addActionListener(this);

        jsearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jsearch.setForeground(new java.awt.Color(153, 153, 153));
        jsearch.setText("กรอกรหัสโครงการ");

        jLabel2.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel2.setText("ค้นหาโครงการ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(281, 281, 281)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btn_ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(78, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel4)
                                                                                                .addComponent(jLabel5)
                                                                                                .addComponent(jLabel6))
                                                                                        .addGap(32, 32, 32))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addComponent(jLabel7)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addGap(68, 68, 68)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(male)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(female))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(position)
                                                                                .addComponent(emyloyeename)
                                                                                .addComponent(ID_Emaployee, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(idcard, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel11)
                                                                                                .addComponent(jLabel10))
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel12)
                                                                                        .addGap(32, 32, 32)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel9)
                                                                                .addGap(60, 60, 60)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(btn_addproject, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(txDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(btnDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(wage, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Salary, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Phonenum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel3))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(ID_Emaployee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(btnDateStart)
                                        .addComponent(txDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emyloyeename, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(wage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(male)
                                                        .addComponent(female)
                                                        .addComponent(jLabel6))
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(idcard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Phonenum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btn_addproject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(btn_ALL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(86, Short.MAX_VALUE))



        );

    }
       public void setTable(String sql) {
        String[] colname = {"รหัสพนักงาน", "ชื่อพนักงาน", "ตำแหน่ง", "เพศ", "เลขบัตรปชช", "ที่อยู่", "วันที่เป็นพนักงาน", "เงินเดือน", "โทรศัพท์"};
        model = new DefaultTableModel(colname, 0);
        EmployeeTable.setModel(model); // ตั้งค่า Model ให้ JTable

        try {
            db = new DBConnect();
            ResultSet rs = db.getConnect(sql);

            while (rs.next()) {
                // ดึงค่าจากฐานข้อมูล
                String empID = rs.getString("employee_id"); // ตรวจสอบชื่อจริง
                String empName = rs.getString("employee_name");
                String position = rs.getString("position");
                String gender = rs.getString("gender"); // ใช้ค่า gender จากฐานข้อมูล
                String idCard = rs.getString("id_card");
                String address = rs.getString("address");
                String hireDate = rs.getString("employment_date");
                String salary = rs.getString("salary");
//                String wage_day = rs.getString("wage_per_day");
                String phone = rs.getString("phone_number");
                String[] row = {empID, empName, position, gender, idCard, address, hireDate, salary, phone};
                model.addRow(row);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        EmployeeTable.setModel(model);
    }

    private  void DeleteEmployee(){
        int rowIndex = EmployeeTable.getSelectedRow();
        String ID = model.getValueAt(rowIndex,0).toString();

        String sql = String.format("DELETE FROM Employees WHERE employee_id = '%s' ",ID);
        db.getUpdate(sql);
        model.removeRow(rowIndex);
        JOptionPane.showMessageDialog(null, "Delete Successfully!" , "message", JOptionPane.INFORMATION_MESSAGE);
    }

    //EditEmployeeTable
    private  void EditEmployee(){
        int rowIndex = EmployeeTable.getSelectedRow();
        String ID = model.getValueAt(rowIndex,0).toString();

        String empID = ID_Emaployee.getText();
        String empName = emyloyeename.getText();
        String Position = position.getText();

        String IDCard = idcard.getText();
        String address = jTextArea1.getText();
        String hireDate = txDateStart.getText();
        String salary =Salary.getText();
        String phone = Phonenum.getText();
        String wage_per_day = wage.getText();

        boolean isMale = male.isSelected();   // true ถ้าเลือก
        boolean isFemale = female.isSelected(); // true ถ้าเลือก
        String gender = isMale ? "ชาย" : isFemale ? "หญิง" : "ไม่ระบุ";
        String sql = String.format(
                "UPDATE Employees SET employee_name = '%s', position = '%s', gender = '%s', id_card = '%s', address = '%s', employment_date = '%s', salary = '%s', wage_per_day = '%s', phone_number = '%s' WHERE employee_id = '%s'",
                empName, Position, gender, IDCard, address, hireDate, salary, wage_per_day, phone, ID
        );
        db.getUpdate(sql);
        String sql2 = String.format("SELECT employee_id, employee_name, position, gender, id_card, address, employment_date, salary, phone_number FROM Employees ;");
        setTable(sql2);
        JOptionPane.showMessageDialog(null, "edit Successfully!" , "message", JOptionPane.INFORMATION_MESSAGE);

    }
    //EditEmployeeTable


    //insertEmployeeTable
    private void insertEmployee() {

        // ดึงค่าจาก JTextField
        String empID = ID_Emaployee.getText();
        String empName = emyloyeename.getText();
        String Position = position.getText();

        String IDCard = idcard.getText();
        String address = jTextArea1.getText();
        String hireDate = txDateStart.getText();
        String salary =Salary.getText();
        String phone = Phonenum.getText();
        String wage_per_day = wage.getText();

        boolean isMale = male.isSelected();   // true ถ้าเลือก
        boolean isFemale = female.isSelected(); // true ถ้าเลือก
        String gender = isMale ? "ชาย" : isFemale ? "หญิง" : "ไม่ระบุ";

        String sql = String.format("INSERT INTO Employees (employee_id,employee_name,position,gender,id_card,address,employment_date,salary,wage_per_day,phone_number) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",empID,empName,Position,gender,IDCard,address,hireDate,salary,wage_per_day,phone);
        db.getUpdate(sql);
        String sql2 = String.format("SELECT employee_id, employee_name, position, gender, id_card, address, employment_date, salary, phone_number FROM Employees ");
        setTable(sql2);
        // ตรวจสอบว่ากรอกข้อมูลครบหรือไม่
        if (empID.isEmpty() || empName.isEmpty() || Position.isEmpty() || IDCard.isEmpty() || address.isEmpty() || hireDate.isEmpty() || salary.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ครบถ้วน", "แจ้งเตือน", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(null, "insert Successfully!" , "message", JOptionPane.INFORMATION_MESSAGE);
    }
    //EditEmployeeTable


    private void clearFields() {
        ID_Emaployee.setText("");
        emyloyeename.setText("");
        position.setText("");
        idcard.setText("");
        jTextArea1.setText("");
        txDateStart.setText("");
        Salary.setText("");
        Phonenum.setText("");
        wage.setText("");

        male.setSelected(false);
        female.setSelected(false);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(btnDateStart)){
                date.showPopup();
            }
            if (e.getSource().equals(btn_addproject)){

                insertEmployee();
                clearFields();
            }
            if (e.getSource().equals(btn_search)){
                String kw = jsearch.getText();
                String sql = String.format("SELECT * FROM Employees WHERE employee_id = '%s' OR employee_name = '%s'",kw,kw  );
                setTable(sql);
            }
            if (e.getSource().equals(btn_ALL)){
                String sql = "SELECT employee_id, employee_name, position, gender, id_card, address, employment_date, salary, phone_number FROM Employees ";
                setTable(sql);
            }
            if (e.getSource().equals(btn_edit)){
                EditEmployee();
            }
            if (e.getSource().equals(btn_delete)){
                DeleteEmployee();
            }


    }



    }

