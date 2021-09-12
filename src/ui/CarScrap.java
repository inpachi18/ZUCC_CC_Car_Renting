/*
 * Created by JFormDesigner on Mon Sep 13 04:44:35 CST 2021
 */

package ui;

import control.CarScrapManager;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class CarScrap extends JDialog {
    public CarScrap(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void button1ActionPerformed() {
        try {
            Integer id = Integer.valueOf(this.id.getText());
            String info = this.info.getText();
            CarScrapManager a = new CarScrapManager();
            a.createScrap(id, info);
        } catch (BaseException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        id = new JTextField();
        label2 = new JLabel();
        info = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u8f66\u8f86\u7f16\u53f7");

        //---- label2 ----
        label2.setText("\u62a5\u5e9f\u7406\u7531");

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> button1ActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addGroup(contentPaneLayout.createParallelGroup()
                                                        .addComponent(label1)
                                                        .addComponent(label2))
                                                .addGap(36, 36, 36)
                                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(info, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                                        .addComponent(id, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addComponent(button1)))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
                contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label1)
                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(label2)
                                        .addComponent(info, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addComponent(button1)
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField id;
    private JLabel label2;
    private JTextField info;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
