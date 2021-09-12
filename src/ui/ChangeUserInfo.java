/*
 * Created by JFormDesigner on Sun Sep 12 18:42:45 CST 2021
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
public class ChangeUserInfo extends JDialog {
    public ChangeUserInfo(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
        this.name.setText(UserManager.currentUser.getName());
    }

    private void button1ActionPerformed() {
        try {
            UserManager a = new UserManager();
            String name = UserManager.currentUser.getName();
            String tel = this.UsrTel.getText();
            String email = this.UsrMail.getText();
            String city = this.UsrCity.getText();
            a.ChangeInfo(name, tel, email, city);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        UsrTel = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        UsrMail = new JTextField();
        UsrCity = new JTextField();
        label9 = new JLabel();
        label1 = new JLabel();
        name = new JLabel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label7 ----
        label7.setText("\u624b\u673a\u53f7\u7801");

        //---- label8 ----
        label8.setText("\u90ae\u7bb1");

        //---- label9 ----
        label9.setText("\u6240\u5728\u57ce\u5e02");

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d");

        //---- name ----
        name.setText("text");

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> button1ActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                                .addContainerGap(63, Short.MAX_VALUE)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(UsrTel, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(UsrMail, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(label1)
                                                .addGap(50, 50, 50)
                                                .addComponent(name))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(button1)
                                                        .addComponent(UsrCity, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label1)
                                        .addComponent(name))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
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
                                .addGap(26, 26, 26)
                                .addComponent(button1)
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField UsrTel;
    private JLabel label7;
    private JLabel label8;
    private JTextField UsrMail;
    private JTextField UsrCity;
    private JLabel label9;
    private JLabel label1;
    private JLabel name;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
