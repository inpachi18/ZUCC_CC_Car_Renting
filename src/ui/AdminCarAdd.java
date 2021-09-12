/*
 * Created by JFormDesigner on Mon Sep 13 02:04:41 CST 2021
 */

package ui;

import control.CarManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminCarAdd extends JDialog {
    public AdminCarAdd(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void confirmActionPerformed() {
        try{
            String plate=this.plate.getText();
            Integer type,branch;
            if ("".equals(this.type.getText()))
                type=-1;
            else
                type = Integer.valueOf(this.type.getText());
            if ("".equals(this.branch.getText()))
                branch=-1;
            else
                branch = Integer.valueOf(this.branch.getText());
            String state=this.state.getText();
            CarManager c=new CarManager();
            c.AddCar(plate,type,branch,state);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        plate = new JTextField();
        label2 = new JLabel();
        type = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        branch = new JTextField();
        state = new JTextField();
        confirm = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u8f66\u724c\u53f7");

        //---- label2 ----
        label2.setText("\u6240\u5c5e\u8f66\u578b\u7f16\u53f7");

        //---- label3 ----
        label3.setText("\u6240\u5728\u7f51\u70b9\u7f16\u53f7");

        //---- label4 ----
        label4.setText("\u5f53\u524d\u72b6\u6001");

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
                            .addGap(60, 60, 60)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(label2)
                                .addComponent(label3)
                                .addComponent(label4))
                            .addGap(72, 72, 72)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(plate, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(type, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(branch, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(state, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(confirm)))
                    .addContainerGap(57, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(plate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(branch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(state, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(confirm)
                    .addContainerGap(28, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField plate;
    private JLabel label2;
    private JTextField type;
    private JLabel label3;
    private JLabel label4;
    private JTextField branch;
    private JTextField state;
    private JButton confirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
