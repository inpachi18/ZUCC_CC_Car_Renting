/*
 * Created by JFormDesigner on Mon Sep 13 00:44:55 CST 2021
 */

package ui;

import control.StfManager;
import control.UserManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminChangeStfInfo extends JDialog {
    public AdminChangeStfInfo(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void button1ActionPerformed() {
        try {
            StfManager a = new StfManager();
            String name = this.name.getText();
            Integer branch = Integer.valueOf(this.branch.getText());
            a.ChangeInfo(name, branch);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        name = new JTextField();
        label2 = new JLabel();
        branch = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d");

        //---- label2 ----
        label2.setText("\u7f51\u70b9\u7f16\u53f7");

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
                                        .addComponent(label1)
                                        .addComponent(label2))
                                .addGap(28, 28, 28)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(button1)
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(name, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                                .addComponent(branch, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)))
                                .addGap(55, 55, 55))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label1)
                                        .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(branch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(button1)
                                .addContainerGap(41, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField name;
    private JLabel label2;
    private JTextField branch;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
