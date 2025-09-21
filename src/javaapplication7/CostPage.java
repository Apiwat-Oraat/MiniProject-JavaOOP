
package javaapplication7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CostPage extends JPanel implements ActionListener{


    public CostPage() {

        jPanel1 = new javax.swing.JPanel();
        btn_Clear = new javax.swing.JButton();
        btn_search = new javax.swing.JButton();
        jsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jdateStart = new javax.swing.JTextField();
        jdateEnd = new javax.swing.JTextField();
        buged = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jsearch9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        totalwage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jemployee = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jwage = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPWork = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtotalcost = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jsearch15 = new javax.swing.JTextField();
        jBudgetvariance = new javax.swing.JLabel();
        btn_cal = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btnDateStart = new javax.swing.JButton();
        btnDateEnd = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(780, 570));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_Clear.setBackground(new java.awt.Color(29, 38, 45));
        btn_Clear.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_Clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(this);

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

        jLabel1.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 18)); // NOI18N
        jLabel1.setText("คำนวณต้นทุนโครงการ ");

        jLabel3.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel3.setText("คำนวณค่าแรง");

        jLabel4.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel4.setText("รายละเอียดโครงการ");

        jpname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpname.setForeground(new java.awt.Color(153, 153, 153));
        jpname.setText("ชื่อโครงการ");

        jLabel9.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel9.setText("ชื่อโครงการ  ");

        jLabel10.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel10.setText("วันที่เริ่มต้น  ");

        jdateStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jdateStart.setForeground(new java.awt.Color(153, 153, 153));
        jdateStart.setText("วันที่เริ่มโครงการ");

        jdateEnd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jdateEnd.setForeground(new java.awt.Color(153, 153, 153));
        jdateEnd.setText("วันที่สิ้นสุดโครงการ");

        buged.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buged.setForeground(new java.awt.Color(153, 153, 153));
        buged.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        buged.setText("กรอกรหัสโครงการ");

        jLabel11.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel11.setText("งบประมาณ / บาท ");

        jLabel12.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel12.setText("วันที่สิ้นสุด  ");

        jsearch9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jsearch9.setForeground(new java.awt.Color(153, 153, 153));
        jsearch9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jsearch9.setText("กรอกรหัสโครงการ");
        jsearch9.addActionListener(this);

        jLabel13.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel13.setText("ราคาวัสดุรวม / บาท ");

        totalwage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalwage.setForeground(new java.awt.Color(153, 153, 153));
        totalwage.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalwage.setText("รวมค่าแรง");
        totalwage.addActionListener(this);

        jLabel14.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel14.setText("ค่าแรงทั้งหมด / บาท ");

        jemployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jemployee.setForeground(new java.awt.Color(153, 153, 153));
        jemployee.setText("จำนวนพนักงาน");
        jemployee.addActionListener(this);

        jLabel16.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel16.setText("จำนวนคน");

        jwage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jwage.setForeground(new java.awt.Color(153, 153, 153));
        jwage.setText("ค่าแรงต่อวัน");
        jwage.addActionListener(this);

        jLabel17.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel17.setText("ค่าแรง / คน");

        jPWork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPWork.setForeground(new java.awt.Color(153, 153, 153));
        jPWork.setText("ระยะการทำงาน");
        jPWork.addActionListener(this);

        jLabel18.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel18.setText("ระยะเวลาทำงาน");

        jtotalcost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtotalcost.setForeground(new java.awt.Color(153, 153, 153));
        jtotalcost.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtotalcost.setText("ต้นทุนรวม");
        jtotalcost.addActionListener(this);

        jLabel15.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jLabel15.setText("ต้นทุนรวม / บาท ");

        jsearch15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jsearch15.setForeground(new java.awt.Color(153, 153, 153));
        jsearch15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jsearch15.setText("ผลต่างงบประมาณ");
        jsearch15.addActionListener(this);

        jBudgetvariance.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 14)); // NOI18N
        jBudgetvariance.setText("ผลต่างงบประมาณ / บาท ");

        btn_cal.setBackground(new java.awt.Color(29, 38, 45));
        btn_cal.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_cal.setForeground(new java.awt.Color(255, 255, 255));
        btn_cal.setText("คำนวณ");
        btn_cal.addActionListener(this);

        btn_save.setBackground(new java.awt.Color(29, 38, 45));
        btn_save.setFont(new java.awt.Font("FCVision-HeavyCondensedNoncml", 0, 12)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("บันทึก");
        btn_save.addActionListener(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn_cal)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_save))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtotalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jBudgetvariance)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jsearch15, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtotalcost, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jsearch15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jBudgetvariance))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_cal)
                                        .addComponent(btn_save))
                                .addContainerGap(77, Short.MAX_VALUE))
        );

        btnDateStart.setBackground(new java.awt.Color(29, 38, 45));
        btnDateStart.setForeground(new java.awt.Color(255, 255, 255));
        btnDateStart.setText("...");

        btnDateEnd.setBackground(new java.awt.Color(29, 38, 45));
        btnDateEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnDateEnd.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn_Clear)))
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel9)
                                                                                        .addComponent(jLabel10)
                                                                                        .addComponent(jLabel12))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jdateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jpname, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jdateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel13)
                                                                                        .addComponent(jLabel11))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(buged)
                                                                                        .addComponent(jsearch9))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(185, 185, 185)
                                                                .addComponent(jLabel18)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPWork, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(totalwage, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(147, 147, 147))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jemployee, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                                                        .addComponent(jwage))))))
                                                .addGap(44, 44, 44))))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jwage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jPWork, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel18))
                                                .addGap(55, 55, 55)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel14)
                                                        .addComponent(totalwage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jpname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jdateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jdateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel12)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnDateStart)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnDateEnd)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(buged, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jsearch9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    public void displayProjectDetails(String projectId, JTextField projectNameField, JTextField startDateField, JTextField endDateField, JTextField budgetField, JTextField materialCostField) {
        try {
            DBConnect db = new DBConnect();
            String sql = "SELECT * FROM Projects WHERE project_id = ?";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, projectId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String projectName = rs.getString("project_name");
                String startDate = rs.getString("date_start");
                String endDate = rs.getString("date_end");
                double budget = rs.getDouble("budget");
                double materialCost = rs.getDouble("material_cost");

                projectNameField.setText(projectName);
                startDateField.setText(startDate);
                endDateField.setText(endDate);
                budgetField.setText(String.valueOf(budget));
                materialCostField.setText(String.valueOf(materialCost));
            } else {
                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลโครงการ", "Error", JOptionPane.ERROR_MESSAGE);
                projectNameField.setText("");
                startDateField.setText("");
                endDateField.setText("");
                budgetField.setText("");
                materialCostField.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาด: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void calculateCost() {
        try {
            // ดึงข้อมูลจาก JTextField
            int numWorkers = Integer.parseInt(jemployee.getText());
            double wagePerPerson = Double.parseDouble(jwage.getText());
            int workDuration = Integer.parseInt(jPWork.getText());
            double materialCost = Double.parseDouble(jsearch9.getText());
            double budget = Double.parseDouble(buged.getText());

            // คำนวณค่าต่างๆ
            double laborCost = numWorkers * wagePerPerson * workDuration;
            double totalCost = laborCost + materialCost;
            double budgetDifference = budget - totalCost;

            // แสดงผลลัพธ์ใน JTextField
            totalwage.setText(String.valueOf(laborCost));
            jtotalcost.setText(String.valueOf(totalCost));
            jsearch15.setText(String.valueOf(budgetDifference));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลให้ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void saveCost() {
        // ดึงข้อมูลจาก JTextField
        String projectId = jsearch.getText();
        int numWorkers = Integer.parseInt(jemployee.getText());
        double wagePerPerson = Double.parseDouble(jwage.getText());
        int workDuration = Integer.parseInt(jPWork.getText());
        double materialCost = Double.parseDouble(jsearch9.getText());
        double budget = Double.parseDouble(buged.getText());

        // เรียกใช้เมธอด calculateAndSave()
        calculateAndSave(projectId, numWorkers, wagePerPerson, workDuration, materialCost, budget);
    }
    public void calculateAndSave(String projectId, int numWorkers, double wagePerPerson, int workDuration, double materialCost, double budget) {
        try {
            // คำนวณค่าต่างๆ
            double laborCost = numWorkers * wagePerPerson * workDuration;
            double totalCost = laborCost + materialCost;
            double budgetDifference = budget - totalCost;

            // บันทึกข้อมูลลงในฐานข้อมูล
            DBConnect db = new DBConnect();
            String sql = "INSERT INTO ProjectCost (project_id, num_workers, wage_per_person, work_duration, labor_cost, material_cost, total_cost, budget_difference) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = db.getConnection().prepareStatement(sql);
            pstmt.setString(1, projectId);
            pstmt.setInt(2, numWorkers);
            pstmt.setDouble(3, wagePerPerson);
            pstmt.setInt(4, workDuration);
            pstmt.setDouble(5, laborCost);
            pstmt.setDouble(6, materialCost);
            pstmt.setDouble(7, totalCost);
            pstmt.setDouble(8, budgetDifference);
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "บันทึกข้อมูลค่าใช้จ่ายโครงการสำเร็จ", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "เกิดข้อผิดพลาดในการบันทึกข้อมูล: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void clearFields() {
        jsearch.setText("");
        jpname.setText("");
        jdateStart.setText("");
        jdateEnd.setText("");
        buged.setText("");
        jsearch9.setText("");
        jemployee.setText("");
        jwage.setText("");
        jPWork.setText("");
        totalwage.setText("");
        jtotalcost.setText("");
        jsearch15.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn_search)) {
            String projectId = jsearch.getText();
            displayProjectDetails(projectId, jpname, jdateStart, jdateEnd, buged, jsearch9); // เรียกใช้เมธอด displayProjectDetails()
        }
        if (e.getSource().equals(btn_cal)) { // btn_calculate คือปุ่ม "คำนวณ"
            calculateCost();
        } else if (e.getSource().equals(btn_save)) { // btn_save คือปุ่ม "บันทึก"
            saveCost();
        }

        if (e.getSource().equals(btn_Clear)) { // btnClear คือปุ่ม "Clear"
            clearFields();
        }
    }





    // Variables declaration - do not modify
    private javax.swing.JButton btnDateEnd;
    private javax.swing.JButton btnDateStart;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_cal;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JTextField buged;
    private javax.swing.JLabel jBudgetvariance;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPWork;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jdateEnd;
    private javax.swing.JTextField jdateStart;
    private javax.swing.JTextField jemployee;
    private javax.swing.JTextField jpname;
    private javax.swing.JTextField jsearch;
    private javax.swing.JTextField jsearch15;
    private javax.swing.JTextField jsearch9;
    private javax.swing.JTextField jtotalcost;
    private javax.swing.JTextField jwage;
    private javax.swing.JTextField totalwage;


    // End of variables declaration
}
