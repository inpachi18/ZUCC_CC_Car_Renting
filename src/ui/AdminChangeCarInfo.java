/*
 * Created by JFormDesigner on Mon Sep 13 03:39:30 CST 2021
 */

package ui;

import control.CarManager;
import control.UserManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminChangeCarInfo extends JDialog {
    public AdminChangeCarInfo(Frame f,String s,Boolean b) {
        super(f,s,b);
        initComponents();
    }

    private void button1ActionPerformed() {
        try {
            CarManager a = new CarManager();
            String plate = this.plate.getText();
            Integer type = Integer.valueOf(this.type.getText());
            Integer branch = Integer.valueOf(this.branch.getText());
            String state = this.state.getText();
            a.ChangeInfo(plate, type, branch, state);
            this.setVisible(false);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label2 = new JLabel();
        plate = new JTextField();
        label7 = new JLabel();
        type = new JTextField();
        label8 = new JLabel();
        branch = new JTextField();
        label9 = new JLabel();
        state = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label2 ----
        label2.setText("\u8f66\u724c\u53f7");

        //---- label7 ----
        label7.setText("\u8f66\u578b\u7f16\u53f7");

        //---- label8 ----
        label8.setText("\u7f51\u70b9\u7f16\u53f7");

        //---- label9 ----
        label9.setText("\u5f53\u524d\u72b6\u6001");

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> button1ActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(branch, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(state, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(button1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(plate, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
                                .addComponent(type, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(65, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(plate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                        .addComponent(type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(branch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label9, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addComponent(state, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(button1)
                    .addContainerGap(41, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label2;
    private JTextField plate;
    private JLabel label7;
    private JTextField type;
    private JLabel label8;
    private JTextField branch;
    private JLabel label9;
    private JTextField state;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
