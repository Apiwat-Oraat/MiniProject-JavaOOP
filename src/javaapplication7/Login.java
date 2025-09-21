/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
        

public class Login extends JFrame implements ActionListener {
    public HomePage test;
    protected DBConnect db;
    protected ResultSet rs;
    protected JButton Login;
    protected JPasswordField Password;
    protected JTextField Username;
    protected JLayeredPane bg;
    protected JLabel jLabel1;
    protected JLabel jLabel2;
    protected JLabel jLabel3;
    protected JLabel jLabel4;
    protected JLabel jLabel5;

    public Login() {

        bg = new javax.swing.JLayeredPane();
        com.component.imagelogin imagelogin1 = new com.component.imagelogin();
        Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมจัดการงานก่อสร้าง");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        Username.addActionListener(this);


        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel3.setText("Welcome to");

        jLabel4.setFont(new Font("Nirmala UI",0,12));
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Thank you for getting back, please login to your account ");

        jLabel5.setFont(new Font("Nirmala UI",0,12));
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("by filling these form:");

        Login.setBackground(new java.awt.Color(29, 38, 45));
        Login.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("L O G I N");
        Login.setActionCommand("");
        Login.setBorder(null);
        Login.addActionListener(this);

        Password.setText("jPasswordField1");
        Password.addActionListener(this);

        bg.setLayer(imagelogin1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(Username, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(Login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        bg.setLayer(Password, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(imagelogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                                                .addComponent(Login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(70, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
                bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(imagelogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(bgLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }


    public boolean loginuser() {
        String name = Username.getText();
        String pass = new String(Password.getPassword());

        try {
             db = new DBConnect();
             rs = null;

            String sql = String.format("SELECT * FROM user WHERE Username = '%s' AND Password = '%s'", name, pass);
            rs = db.getConnect(sql);
            return rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(Login)) {
            if (loginuser()) {
                JOptionPane.showMessageDialog(null, "Login successfully!","login",1);

                test = new HomePage();
                this.dispose();
                test.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "can't login");
            }
        }

    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new  FlatLightLaf() );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }




}