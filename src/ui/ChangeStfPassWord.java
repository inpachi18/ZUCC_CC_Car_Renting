/*
 * Created by JFormDesigner on Sun Sep 12 19:25:04 CST 2021
 */

package ui;

import control.StfManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class ChangeStfPassWord extends JDialog {
    public ChangeStfPassWord(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void confirmActionPerformed() {
        try {
            StfManager a=new StfManager();
            String oldpwd = this.oldpwd.getText();
            String newpwd = this.newpwd.getText();
            String newpwd2 = this.newpwd2.getText();
            a.changePwd(StfManager.currentStf.getName(),oldpwd,newpwd,newpwd2);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        newpwd2 = new JTextField();
        confirm = new JButton();
        label3 = new JLabel();
        label2 = new JLabel();
        newpwd = new JTextField();
        oldpwd = new JTextField();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();

        //---- confirm ----
        confirm.setText("\u786e\u8ba4");
        confirm.addActionListener(e -> confirmActionPerformed());

        //---- label3 ----
        label3.setText("\u91cd\u590d\u4e00\u904d");

        //---- label2 ----
        label2.setText("\u65b0\u5bc6\u7801");

        //---- label1 ----
        label1.setText("\u65e7\u5bc6\u7801");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(label1)
                                                        .addGap(67, 67, 67)
                                                        .addComponent(oldpwd, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(label2)
                                                        .addGap(67, 67, 67)
                                                        .addComponent(newpwd, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addComponent(label3)
                                                        .addGap(45, 45, 45)
                                                        .addComponent(newpwd2, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(contentPaneLayout.createSequentialGroup()
                                                        .addGap(104, 104, 104)
                                                        .addComponent(confirm)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 491, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
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
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 346, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JTextField newpwd2;
    private JButton confirm;
    private JLabel label3;
    private JLabel label2;
    private JTextField newpwd;
    private JTextField oldpwd;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
