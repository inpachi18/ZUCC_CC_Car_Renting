/*
 * Created by JFormDesigner on Sun Sep 12 19:48:25 CST 2021
 */

package ui;

import control.UserManager;
import model.BeanUser;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminUserInfo extends JDialog {
    public AdminUserInfo(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void quitActionPerformed() {
        this.setVisible(false);
    }

    private void searchActionPerformed() {
        try {
            String n = this.name.getText();
            BeanUser o = UserManager.SearchInfo(n);
            this.sex.setText(o.getSex());
            this.tel.setText(o.getTelephone());
            this.mail.setText(o.getEmail());
            this.city.setText(o.getCity());
            this.date.setText(String.valueOf(o.getRegisterdate()));
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        sex = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        tel = new JLabel();
        mail = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        city = new JLabel();
        date = new JLabel();
        label6 = new JLabel();
        name = new JTextField();
        quit = new JButton();
        search = new JButton();

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

        //---- quit ----
        quit.setText("\u79bb\u5f00");
        quit.addActionListener(e -> quitActionPerformed());

        //---- search ----
        search.setText("\u67e5\u8be2");
        search.addActionListener(e -> searchActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(37, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addComponent(label3)
                                .addGap(32, 32, 32)
                                .addComponent(tel, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addComponent(label4)
                                .addGap(76, 76, 76)
                                .addComponent(mail, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addGap(32, 32, 32)
                                .addComponent(city, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addComponent(label6)
                                .addGap(32, 32, 32)
                                .addComponent(date, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(label2)
                                .addGap(76, 76, 76)
                                .addComponent(sex, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(quit)
                                .addGap(45, 45, 45)
                                .addComponent(search)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addGap(54, 54, 54)
                            .addComponent(name, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)))
                    .addGap(27, 27, 27))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(sex))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(tel))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(mail))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label5)
                        .addComponent(city))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label6)
                        .addComponent(date))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(quit)
                        .addComponent(search))
                    .addContainerGap(27, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel sex;
    private JLabel label2;
    private JLabel label3;
    private JLabel tel;
    private JLabel mail;
    private JLabel label4;
    private JLabel label5;
    private JLabel city;
    private JLabel date;
    private JLabel label6;
    private JTextField name;
    private JButton quit;
    private JButton search;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
