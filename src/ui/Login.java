/*
 * Created by JFormDesigner on Sat Sep 11 14:42:01 CST 2021
 */

package ui;

import control.StfManager;
import util.BaseException;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class Login extends JFrame {
    public Login(Frame f, String s, boolean b) {
        super(f, s, b);
        initComponents();
    }


    private void registerActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void stfLoginActionPerformed(ActionEvent e) {
        String ID = this.ID.getText();
        String pwd = new String(this.Pwd.getPassword());
        try {
            StfManager a = new StfManager();
            StfManager.currentStf = a.login(ID, pwd);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage());
            return;
        }
        this.setVisible(false);
    }

    private void userLoginActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        登陆 = new JFrame();
        label2 = new JLabel();
        ID = new JTextField();
        label3 = new JLabel();
        Pwd = new JPasswordField();
        register = new JButton();
        stfLogin = new JButton();
        userLogin = new JButton();
        label1 = new JLabel();

        //======== 登陆 ========
        {
            var 登陆ContentPane = 登陆.getContentPane();

            //---- label2 ----
            label2.setText("\u7528\u6237\u7f16\u53f7:");

            //---- label3 ----
            label3.setText("\u5bc6\u7801\uff1a");

            //---- register ----
            register.setText("\u6ce8\u518c");
            register.addActionListener(e -> {
			button1ActionPerformed(e);
			registerActionPerformed(e);
		});

            //---- stfLogin ----
            stfLogin.setText("\u5458\u5de5\u767b\u9646");
            stfLogin.addActionListener(e -> stfLoginActionPerformed(e));

            //---- userLogin ----
            userLogin.setText("\u7528\u6237\u767b\u9646");
            userLogin.addActionListener(e -> userLoginActionPerformed(e));

            //---- label1 ----
            label1.setText("\u6b22\u8fce\u6765\u5230\u79df\u8f66\u7ba1\u7406\u7cfb\u7edf");
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout 登陆ContentPaneLayout = new GroupLayout(登陆ContentPane);
            登陆ContentPane.setLayout(登陆ContentPaneLayout);
            登陆ContentPaneLayout.setHorizontalGroup(
                登陆ContentPaneLayout.createParallelGroup()
                    .addGroup(登陆ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(登陆ContentPaneLayout.createParallelGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 535, GroupLayout.PREFERRED_SIZE)
                            .addGroup(登陆ContentPaneLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(登陆ContentPaneLayout.createParallelGroup()
                                    .addGroup(登陆ContentPaneLayout.createSequentialGroup()
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ID, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(登陆ContentPaneLayout.createSequentialGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Pwd, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(登陆ContentPaneLayout.createSequentialGroup()
                                        .addComponent(register)
                                        .addGap(18, 18, 18)
                                        .addComponent(stfLogin)
                                        .addGap(18, 18, 18)
                                        .addComponent(userLogin)))))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            登陆ContentPaneLayout.setVerticalGroup(
                登陆ContentPaneLayout.createParallelGroup()
                    .addGroup(登陆ContentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(登陆ContentPaneLayout.createParallelGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(登陆ContentPaneLayout.createParallelGroup()
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(登陆ContentPaneLayout.createParallelGroup()
                            .addComponent(register)
                            .addGroup(登陆ContentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(stfLogin)
                                .addComponent(userLogin)))
                        .addContainerGap(40, Short.MAX_VALUE))
            );
            登陆.pack();
            登陆.setLocationRelativeTo(登陆.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame 登陆;
    private JLabel label2;
    private JTextField ID;
    private JLabel label3;
    private JPasswordField Pwd;
    private JButton register;
    private JButton stfLogin;
    private JButton userLogin;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
