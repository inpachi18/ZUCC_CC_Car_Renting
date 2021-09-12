/*
 * Created by JFormDesigner on Mon Sep 13 00:53:56 CST 2021
 */

package ui;

import control.StfManager;
import control.UserManager;
import util.BaseException;
import util.BusinessException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminStfDelete extends JDialog {
    public AdminStfDelete(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void button1ActionPerformed() {
        try {
            String n1 = this.name1.getText();
            String n2 = this.name2.getText();
            if (!n1.equals(n2)) throw new BusinessException("两次输入的用户名不一致");
            StfManager a = new StfManager();
            a.DelStf(n1);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        name1 = new JTextField();
        label2 = new JLabel();
        name2 = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d");

        //---- label2 ----
        label2.setText("\u91cd\u590d\u7528\u6237\u540d");

        //---- button1 ----
        button1.setText("\u5220\u9664");
        button1.addActionListener(e -> button1ActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1)
                            .addGap(85, 85, 85)
                            .addComponent(name1, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addGap(41, 41, 41)
                            .addComponent(name2, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(77, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(name1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(name2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(45, 45, 45)
                    .addComponent(button1)
                    .addContainerGap(55, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField name1;
    private JLabel label2;
    private JTextField name2;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
