/*
 * Created by JFormDesigner on Sat Sep 11 11:38:26 CST 2021
 */

package ui;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class Login {
    public Login() {
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        登陆 = new JPanel();
        label1 = new JLabel();
        ID = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        Pwd = new JPasswordField();
        register = new JButton();
        stfLogin = new JButton();
        userLogin = new JButton();

        //======== 登陆 ========
        {

            //---- label1 ----
            label1.setText("\u6b22\u8fce\u6765\u5230\u79df\u8f66\u7ba1\u7406\u7cfb\u7edf");
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("\u7528\u6237\u7f16\u53f7:");

            //---- label3 ----
            label3.setText("\u5bc6\u7801\uff1a");

            //---- register ----
            register.setText("\u6ce8\u518c");

            //---- stfLogin ----
            stfLogin.setText("\u5458\u5de5\u767b\u9646");

            //---- userLogin ----
            userLogin.setText("\u7528\u6237\u767b\u9646");

            GroupLayout 登陆Layout = new GroupLayout(登陆);
            登陆.setLayout(登陆Layout);
            登陆Layout.setHorizontalGroup(
                登陆Layout.createParallelGroup()
                    .addGroup(登陆Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(登陆Layout.createParallelGroup()
                            .addGroup(登陆Layout.createSequentialGroup()
                                .addComponent(register)
                                .addGap(18, 18, 18)
                                .addComponent(stfLogin)
                                .addGap(18, 18, 18)
                                .addComponent(userLogin)
                                .addContainerGap(50, Short.MAX_VALUE))
                            .addGroup(登陆Layout.createSequentialGroup()
                                .addGroup(登陆Layout.createParallelGroup()
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(登陆Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ID, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(Pwd, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                                .addContainerGap(62, Short.MAX_VALUE))))
                    .addComponent(label1, GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
            );
            登陆Layout.setVerticalGroup(
                登陆Layout.createParallelGroup()
                    .addGroup(登陆Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(登陆Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(ID)
                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(登陆Layout.createParallelGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pwd))
                        .addGap(28, 28, 28)
                        .addGroup(登陆Layout.createParallelGroup()
                            .addComponent(register)
                            .addComponent(stfLogin)
                            .addComponent(userLogin))
                        .addContainerGap(63, Short.MAX_VALUE))
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel 登陆;
    private JLabel label1;
    private JTextField ID;
    private JLabel label2;
    private JLabel label3;
    private JPasswordField Pwd;
    private JButton register;
    private JButton stfLogin;
    private JButton userLogin;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
