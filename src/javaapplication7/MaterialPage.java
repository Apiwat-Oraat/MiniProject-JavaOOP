
package javaapplication7;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTable;

public class MaterialPage extends JPanel implements ActionListener{
    private double totalPrice2 = 0.0;
    private DBConnect db;
    private DefaultTableModel model;
    private javax.swing.JTextField Priceunit;
    private javax.swing.JTextField Totalprice;
    private javax.swing.JButton btn_addproject;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search2;
    private javax.swing.JTextField jIDmaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jM_quantity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable MaterialTable;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jmaterialType;
    private javax.swing.JTextField jmaterialname;
    private javax.swing.JTextField jsearch;
    private javax.swing.JTextField unit;

    public MaterialPage() {

        jLabel1 = new javax.swing.JLabel();
        jmaterialType = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jM_quantity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jmaterialname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Priceunit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        jsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MaterialTable = new javax.swing.JTable();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_addproject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jIDmaterial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_search2 = new javax.swing.JButton();
        Totalprice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 570));
        setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 18)); // NOI18N
        jLabel1.setText("จัดการวัสดุ");

        jmaterialType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jmaterialType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "วัสดุก่อสร้างพื้นฐาน", "วัสดุโครงสร้าง", "วัสดุตกแต่งและปูพื้น", "วัสดุระบบไฟฟ้าและประปา", "วัสดุฉนวนและกันซึม", "วัสดุเฉพาะทาง" }));

        jLabel11.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel11.setText("ประเภทวัสดุ");

        jM_quantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jM_quantity.setText("กรอกจำนวนวัสดุ");
        jM_quantity.addActionListener(this);

        jLabel9.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel9.setText("จำนวน");

        jmaterialname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jmaterialname.setText("กรอกชื่อวัสดุ");
        jmaterialname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jmaterialname.addActionListener(this);

        jLabel4.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel4.setText("ชื่อวัดุ");

        Priceunit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Priceunit.setText("กรอกจำนวนราคา");
        Priceunit.addActionListener(this);

        jLabel10.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel10.setText("ราคาต่อหน่วย");

        unit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        unit.setText("กรอกประเภทหน่อย");
        unit.addActionListener(this);

        jLabel12.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel12.setText("หน่วย");

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

        jLabel3.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel3.setText("รายละเอียดโครงการ");

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        MaterialTable = new JTable();
        jScrollPane1.setViewportView(MaterialTable);

        String sql = "SELECT pm.project_id, pm.material_id, m.material_name, m.material_type, pm.quantity, m.unit_price, m.unit, pm.total_price FROM ProjectMaterials pm JOIN Materials m ON pm.material_id = m.material_id"; // ลบ WHERE clause

// ดึงข้อมูลจากฐานข้อมูลและแสดงใน MaterialTable
        try {
            DBConnect db = new DBConnect();
            ResultSet rs = db.getConnect(sql);

            String[] colname = {"รหัสโครงการ", "รหัสวัสดุ", "ชื่อวัสดุ", "ประเภทวัสดุ", "จำนวน", "ราคาต่อหน่วย", "หน่วย", "ราคารวม"};
            DefaultTableModel model = new DefaultTableModel(colname, 0);
            MaterialTable.setModel(model);

            while (rs.next()) {
                String projectId = rs.getString("project_id");
                String materialId = rs.getString("material_id");
                String materialName = rs.getString("material_name");
                String materialType = rs.getString("material_type");
                int quantity = rs.getInt("quantity");
                double unitPrice = rs.getDouble("unit_price");
                String unit = rs.getString("unit");
                double totalPrice = rs.getDouble("total_price");

                String[] row = {projectId, materialId, materialName, materialType, String.valueOf(quantity), String.valueOf(unitPrice), unit, String.valueOf(totalPrice)};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        MaterialTable.setAutoCreateRowSorter(true);
        MaterialTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        MaterialTable.setFont(new java.awt.Font("Tahoma", 0, 12));
        MaterialTable.setForeground(new java.awt.Color(0, 51, 51));
        MaterialTable.setGridColor(new java.awt.Color(255, 255, 255));
        MaterialTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        MaterialTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
//
        btn_edit.setBackground(new java.awt.Color(29, 38, 45));
        btn_edit.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("แก้ไข");
        btn_edit.addActionListener(this);

        btn_delete.setBackground(new java.awt.Color(29, 38, 45));
        btn_delete.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("ลบ");
        btn_delete.addActionListener(this);

        btn_addproject.setBackground(new java.awt.Color(29, 38, 45));
        btn_addproject.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_addproject.setForeground(new java.awt.Color(255, 255, 255));
        btn_addproject.setText("เพิ่ม");
        btn_addproject.addActionListener(this);


        jTextArea1 = new JTextArea();
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFont(new Font("FCVision-HeavyCondensedNoncml", Font.BOLD, 14));
        jTextArea1.setBackground(new Color(240, 240, 240));
        jTextArea1.setForeground(Color.DARK_GRAY);

        jTextArea1.setEditable(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        jIDmaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jIDmaterial.setText("กรอกรหัสวัสดุ");
        jIDmaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jIDmaterial.addActionListener(this);

        jLabel5.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("รหัสวัดุ");

        btn_search2.setBackground(new java.awt.Color(29, 38, 45));
        btn_search2.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_search2.setForeground(new java.awt.Color(255, 255, 255));
        btn_search2.setText("Clear");
        btn_search2.addActionListener(this);

        Totalprice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Totalprice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Totalprice.setText("0");
        Totalprice.addActionListener(this);

        jLabel13.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel13.setText("ราคารวม / บาท");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_search2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel13)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(Totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel3)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(27, 27, 27)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(btn_addproject)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btn_edit)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel10)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(Priceunit, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel9)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jM_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel12)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jmaterialname, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jIDmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel11)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jmaterialType, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_search2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jIDmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jmaterialname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jmaterialType, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jM_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Priceunit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel12)
                                                        .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_addproject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Totalprice, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(75, Short.MAX_VALUE))
        );
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btn_search)){
                String projectId = jsearch.getText();
                displayProjectDetails(projectId, jTextArea1, MaterialTable); // เรียกใช้เมธอด displayProjectDetails()
            }
            if (e.getSource().equals(btn_addproject)){
                String projectId = jsearch.getText();
                addMaterial(projectId, jIDmaterial, jmaterialname, jM_quantity, Priceunit, unit,MaterialTable); // เรียกใช้เมธอด addMaterial()
            }
        if (e.getSource().equals(btn_edit)) {
            // ดึงข้อมูลวัสดุจาก JTextField และ JTable
            String projectId = jsearch.getText();
            String materialId = jIDmaterial.getText();
            int quantity = Integer.parseInt(jM_quantity.getText());
            double unitPrice = Double.parseDouble(Priceunit.getText());
            String unitText = unit.getText();

            // เรียกใช้เมธอด editMaterial()
            editMaterial(projectId, materialId, quantity, unitPrice, unitText);
        }
        if (e.getSource().equals(btn_delete)) {
            // ดึง projectId และ materialId จาก JTextField หรือ JTable
            String projectId = jsearch.getText();
            String materialId = jIDmaterial.getText();

            // เรียกใช้เมธอด deleteMaterial()
            deleteMaterial(projectId, materialId);
        }
        if (e.getSource().equals(btn_search2)) { // btn_search2 คือปุ่ม "Clear"
            clearFields();
        }



    }
    public void clearFields() {
        jIDmaterial.setText("");
        jmaterialname.setText("");
        jM_quantity.setText("");
        Priceunit.setText("");
        unit.setText("");
        Totalprice.setText("0");
        jTextArea1.setText("");
    }
    public void displayProjectDetails(String projectId, JTextArea jTextArea1, JTable MaterialTable) {
        try {
            DBConnect db = new DBConnect();
            String sql = "SELECT * FROM Projects WHERE project_id = ?";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, projectId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String projectName = rs.getString("project_name");
                String customerName = rs.getString("customer_name");
                String projectType = rs.getString("project_type");
                String budget = rs.getString("budget");
                String projectStatus = rs.getString("project_status");

                jTextArea1.setText(
                        "ชื่อโครงการ :   " + projectName + "\n\n" +
                                "ชื่อลูกค้า :   " + customerName + "\n\n" +
                                "ประเภทโครงการ :   " + projectType + "\n\n" +
                                "งบประมาณ :   " + budget + "\n\n" +
                                "สถานะโครงการ :   " + projectStatus
                );

                // เรียกใช้เมธอด setTable() เพื่อแสดงข้อมูลวัสดุ
                setTable(projectId, MaterialTable);
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลโครงการ", "Error", JOptionPane.ERROR_MESSAGE);
                jTextArea1.setText("");
                DefaultTableModel model = (DefaultTableModel) MaterialTable.getModel();
                model.setRowCount(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setTable(String projectId, JTable MaterialTable) {
        String[] colname = {"รหัสโครงการ", "รหัสวัสดุ", "ชื่อวัสดุ", "ประเภทวัสดุ", "จำนวน", "ราคาต่อหน่วย", "หน่วย", "ราคารวม"};
        DefaultTableModel model = new DefaultTableModel(colname, 0);
        MaterialTable.setModel(model);

        try {
            DBConnect db = new DBConnect();
            String sql = "SELECT pm.project_id, pm.material_id, m.material_name, m.material_type, pm.quantity, m.unit_price, pm.unit, pm.total_price FROM ProjectMaterials pm JOIN Materials m ON pm.material_id = m.material_id WHERE pm.project_id = ?";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, projectId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String projectIdRs = rs.getString("project_id");
                String materialId = rs.getString("material_id");
                String materialName = rs.getString("material_name");
                String materialType = rs.getString("material_type");
                int quantity = rs.getInt("quantity");
                double unitPrice = rs.getDouble("unit_price");
                String unit = rs.getString("unit"); // ดึง unit จากฐานข้อมูล
                double totalPrice = rs.getDouble("total_price");

                String[] row = {projectIdRs, materialId, materialName, materialType, String.valueOf(quantity), String.valueOf(unitPrice), unit, String.valueOf(totalPrice)};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addMaterial(String projectId, JTextField jIDmaterial, JTextField jmaterialname, JTextField jM_quantity, JTextField Priceunit, JTextField unit, JTable MaterialTable) {
        try {
            String materialId = jIDmaterial.getText();

            int quantity = Integer.parseInt(jM_quantity.getText());
            double unitPrice = Double.parseDouble(Priceunit.getText());
            double totalPrice = quantity * unitPrice;
            totalPrice2 += totalPrice;
            Totalprice.setText(String.valueOf(totalPrice2));

            DBConnect db = new DBConnect();
            String sql = "INSERT INTO ProjectMaterials (project_id, material_id, quantity, total_price, unit) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, projectId);
            pstmt.setString(2, materialId);
            pstmt.setInt(3, quantity);
            pstmt.setDouble(4, totalPrice2);
            pstmt.setString(5, unit.getText());
            pstmt.executeUpdate();

            // อัปเดต material_cost ในตาราง Projects
            updateMaterialCost(projectId);

            // อัปเดตตาราง MaterialTable
            setTable(projectId, MaterialTable);
            JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลวัสดุสำเร็จ", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลจำนวนและราคาให้ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาดในการเพิ่มข้อมูล: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void updateMaterialCost(String projectId) throws SQLException {
        DBConnect db = new DBConnect();
        String sql = "UPDATE Projects SET material_cost = (SELECT SUM(total_price) FROM ProjectMaterials WHERE project_id = ?) WHERE project_id = ?";
        PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
        pstmt.setString(1, projectId);
        pstmt.setString(2, projectId);
        pstmt.executeUpdate();
    }
    public void editMaterial(String projectId, String materialId, int quantity, double unitPrice, String unit) {
        try {
            DBConnect db = new DBConnect();
            String sql = "UPDATE projectmaterials SET quantity = ?, total_price = ?, unit = ? WHERE project_id = ? AND material_id = ?";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setInt(1, quantity);
            pstmt.setDouble(2, quantity * unitPrice);
            pstmt.setString(3, unit);
            pstmt.setString(4, projectId);
            pstmt.setString(5, materialId);
            pstmt.executeUpdate();

            // อัปเดตตาราง MaterialTable
            setTable(projectId, MaterialTable);

            JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลวัสดุสำเร็จ", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาดในการแก้ไขข้อมูล: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteMaterial(String projectId, String materialId) {
        try {
            DBConnect db = new DBConnect();
            String sql = "DELETE FROM projectmaterials WHERE project_id = ? AND material_id = ?";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, projectId);
            pstmt.setString(2, materialId);
            pstmt.executeUpdate();

            // อัปเดตตาราง MaterialTable
            setTable(projectId, MaterialTable);

            JOptionPane.showMessageDialog(null, "ลบข้อมูลวัสดุสำเร็จ", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาดในการลบข้อมูล: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    }


    // End of variables declaration

