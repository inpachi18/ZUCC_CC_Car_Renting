/*
 * Created by JFormDesigner on Sun Sep 12 16:52:36 CST 2021
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
public class ChangeUserPassword extends JDialog {
    public ChangeUserPassword(Frame f, String s, boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void confirmActionPerformed() {
        try {
            UserManager a = new UserManager();
            String oldpwd = this.oldpwd.getText();
            String newpwd = this.newpwd.getText();
            String newpwd2 = this.newpwd2.getText();
            a.changePwd(UserManager.currentUser.getName(), oldpwd, newpwd, newpwd2);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        oldpwd = new JTextField();
        newpwd = new JTextField();
        newpwd2 = new JTextField();
        confirm = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u65e7\u5bc6\u7801");

        //---- label2 ----
        label2.setText("\u65b0\u5bc6\u7801");

        //---- label3 ----
        label3.setText("\u91cd\u590d\u4e00\u904d");

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
                                                .addGap(59, 59, 59)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(label1)
                                                        .addComponent(label2)
                                                        .addComponent(label3))
                                                .addGap(45, 45, 45)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(oldpwd)
                                                        .addComponent(newpwd)
                                                        .addComponent(newpwd2, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(confirm)))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label1)
                                        .addComponent(oldpwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(newpwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label3)
                                        .addComponent(newpwd2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(confirm)
                                .addContainerGap(26, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextField oldpwd;
    private JTextField newpwd;
    private JTextField newpwd2;
    private JButton confirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
