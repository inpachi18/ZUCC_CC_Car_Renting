/*
 * Created by JFormDesigner on Sat Sep 11 11:45:48 CST 2021
 */

package ui;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class Register extends JPanel {
    public Register() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label3 = new JLabel();
        textField1 = new JTextField();
        label4 = new JLabel();
        passwordField1 = new JPasswordField();
        label5 = new JLabel();
        label6 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label7 = new JLabel();
        textField4 = new JTextField();
        label8 = new JLabel();
        textField5 = new JTextField();
        label9 = new JLabel();
        button1 = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========

        //---- label3 ----
        label3.setText("\u6b22\u8fce\u6ce8\u518c");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

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
        button1.setText("\u6ce8\u518c");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label6, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label7, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(label8, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(label9, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordField1)
                        .addComponent(textField1)
                        .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addComponent(textField5, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addGap(83, 83, 83))
                .addGroup(layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(button1)
                    .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordField1)
                        .addComponent(label5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField4)
                        .addComponent(label8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(textField5)
                        .addComponent(label9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button1)
                    .addContainerGap(17, Short.MAX_VALUE))
        );

        //---- label1 ----
        label1.setText("text");

        //---- label2 ----
        label2.setText("text");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label3;
    private JTextField textField1;
    private JLabel label4;
    private JPasswordField passwordField1;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label7;
    private JTextField textField4;
    private JLabel label8;
    private JTextField textField5;
    private JLabel label9;
    private JButton button1;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
