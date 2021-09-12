/*
 * Created by JFormDesigner on Mon Sep 13 00:35:57 CST 2021
 */

package ui;

import control.StfManager;
import model.BeanStaff;
import util.BaseException;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author inpachi
 */
public class AdminStfInfo extends JDialog {
    public AdminStfInfo(Frame f, String s, Boolean b) {
        super(f, s, b);
        initComponents();
    }

    private void quitActionPerformed() {
        this.setVisible(false);
    }

    private void searchActionPerformed() {
        try {
            String name = this.name.getText();
            BeanStaff o = StfManager.SearchInfo(name);
            this.branch.setText(String.valueOf(o.getBranch()));
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
        branch = new JLabel();
        quit = new JButton();
        search = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u7528\u6237\u540d\uff1a");

        //---- label2 ----
        label2.setText("\u6240\u5c5e\u7f51\u70b9\u7f16\u53f7");

        //---- quit ----
        quit.setText("\u79bb\u5f00");
        quit.addActionListener(e -> quitActionPerformed());

        //---- search ----
        search.setText("\u67e5\u8be2");
        search.addActionListener(e -> searchActionPerformed());

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(label2))
                            .addGap(54, 54, 54)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(name, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(branch, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(quit)
                            .addGap(45, 45, 45)
                            .addComponent(search)))
                    .addContainerGap(55, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label1)
                        .addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(branch))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(quit)
                        .addComponent(search))
                    .addGap(54, 54, 54))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField name;
    private JLabel label2;
    private JLabel branch;
    private JButton quit;
    private JButton search;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
