/*
 * Created by JFormDesigner on Sun Sep 12 16:04:09 CST 2021
 */

package ui;

import control.UserManager;
import model.BeanUser;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class UserInfo extends JDialog {
    public UserInfo(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
        this.name.setText(UserManager.currentUser.getName());
        this.sex.setText(UserManager.currentUser.getSex());
        this.tel.setText(UserManager.currentUser.getTelephone());
        this.mail.setText(UserManager.currentUser.getEmail());
        this.city.setText(UserManager.currentUser.getCity());
        this.date.setText(String.valueOf(UserManager.currentUser.getRegisterdate()));
    }

    private void confirmActionPerformed() {
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        name = new JLabel();
        sex = new JLabel();
        tel = new JLabel();
        mail = new JLabel();
        city = new JLabel();
        date = new JLabel();
        confirm = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d\uff1a");

        //---- label2 ----
        label2.setText("\u6027\u522b\uff1a");

        //---- label3 ----
        label3.setText("\u7535\u8bdd\u53f7\u7801\uff1a");

        //---- label4 ----
        label4.setText("\u90ae\u7bb1\uff1a");

        //---- label5 ----
        label5.setText("\u6240\u5728\u57ce\u5e02\uff1a");

        //---- label6 ----
        label6.setText("\u6ce8\u518c\u65e5\u671f\uff1a");

        //---- name ----
        name.setText("text");

        //---- sex ----
        sex.setText("text");

        //---- tel ----
        tel.setText("text");

        //---- mail ----
        mail.setText("text");

        //---- city ----
        city.setText("text");

        //---- date ----
        date.setText("text");

        //---- confirm ----
        confirm.setText("\u786e\u8ba4");
        confirm.addActionListener(e -> confirmActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(label2)
                                .addComponent(label3)
                                .addComponent(label4)
                                .addComponent(label5)
                                .addComponent(label6))
                            .addGap(32, 32, 32)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(date, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addComponent(city, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addComponent(mail, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addComponent(tel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addComponent(name, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                                .addComponent(sex, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(confirm)))
                    .addContainerGap(29, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(sex))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(tel))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(mail))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(city))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(date))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(confirm)
                    .addContainerGap(28, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel name;
    private JLabel sex;
    private JLabel tel;
    private JLabel mail;
    private JLabel city;
    private JLabel date;
    private JButton confirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
