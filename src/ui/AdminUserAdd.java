/*
 * Created by JFormDesigner on Sun Sep 12 19:40:05 CST 2021
 */

package ui;

import control.UserManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminUserAdd extends JDialog {
    public AdminUserAdd(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void button1ActionPerformed() {
        String name = this.UsrName.getText();
        String pwd = new String(this.UsrPwd.getPassword());
        String sex = this.UsrSex.getText();
        String tel = this.UsrTel.getText();
        String email = this.UsrMail.getText();
        String city = this.UsrCity.getText();
        try {
            UserManager a = new UserManager();
            a.AddUsers(name, sex, pwd, tel, email, city);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label4 = new JLabel();
        UsrName = new JTextField();
        UsrPwd = new JPasswordField();
        label5 = new JLabel();
        label6 = new JLabel();
        UsrSex = new JTextField();
        UsrTel = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        UsrMail = new JTextField();
        UsrCity = new JTextField();
        label9 = new JLabel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label4 ----
        label4.setText("\u7528\u6237\u540d");

        //---- label5 ----
        label5.setText("\u5bc6\u7801");

        //---- label6 ----
        label6.setText("\u6027\u522b");

        //---- label7 ----
        label7.setText("\u624b\u673a\u53f7\u7801");

        //---- label8 ----
        label8.setText("\u90ae\u7bb1");

        //---- label9 ----
        label9.setText("\u6240\u5728\u57ce\u5e02");

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> button1ActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(69, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsrName, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsrPwd, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsrSex, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsrTel, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsrMail, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(UsrCity, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)))
                    .addGap(64, 64, 64))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(198, 198, 198)
                    .addComponent(button1)
                    .addContainerGap(215, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addComponent(UsrName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(UsrPwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addComponent(UsrSex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addComponent(UsrTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(UsrMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(UsrCity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addContainerGap(46, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label4;
    private JTextField UsrName;
    private JPasswordField UsrPwd;
    private JLabel label5;
    private JLabel label6;
    private JTextField UsrSex;
    private JTextField UsrTel;
    private JLabel label7;
    private JLabel label8;
    private JTextField UsrMail;
    private JTextField UsrCity;
    private JLabel label9;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
